package kr.pe.kingori.constraintexample

import android.os.Build
import android.os.Bundle
import android.support.constraint.ConstraintSet
import android.support.v7.app.AppCompatActivity
import android.transition.TransitionManager
import android.util.TypedValue
import kotlinx.android.synthetic.main.activity_constraintset_test.*

class ConstraintSetTestActivity : AppCompatActivity() {
    private lateinit var constraintSet1: ConstraintSet
    private lateinit var constraintSet2: ConstraintSet

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraintset_test)

        constraintSet1 = ConstraintSet()
        constraintSet1.clone(content)

        constraintSet2 = ConstraintSet().apply {
            clone(content)
            connect(R.id.icon_2, ConstraintSet.TOP, R.id.btn_layout1, ConstraintSet.BOTTOM)
            constrainWidth(R.id.icon_2, TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 120f, resources.displayMetrics).toInt())
            constrainHeight(R.id.icon_2, TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 120f, resources.displayMetrics).toInt())
            connect(R.id.icon_1, ConstraintSet.TOP, R.id.icon_2, ConstraintSet.BOTTOM)
            connect(R.id.icon_3, ConstraintSet.TOP, R.id.icon_2, ConstraintSet.BOTTOM)
        }

        btn_layout1.setOnClickListener {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                TransitionManager.beginDelayedTransition(content)
            }
            constraintSet1.applyTo(content)
        }
        btn_layout2.setOnClickListener {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                TransitionManager.beginDelayedTransition(content)
            }
            constraintSet2.applyTo(content)
        }
    }
}
