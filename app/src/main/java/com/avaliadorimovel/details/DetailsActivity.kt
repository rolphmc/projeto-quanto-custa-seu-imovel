package com.avaliadorimovel.details

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.avaliadorimovel.R
import com.avaliadorimovel.details.interfaces.InterfaceDetailsInteractor
import com.avaliadorimovel.details.interfaces.InterfaceDetailsPresenter
import com.avaliadorimovel.details.interfaces.InterfaceDetailsView
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity(), InterfaceDetailsView {

    private val interfaceDetailsPresenter = InterfaceDetailsPresenter(InterfaceDetailsInteractor())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        setControls()
        calculate_result.setOnClickListener{createSamples()}
    }

    override fun setControls() {
        interfaceDetailsPresenter.carregarSpinnersParkingSpace(this, space_parking_input)
     }

    override fun createSamples() {
        TODO("Not yet implemented")
    }

//    override fun createSamples() {
        //        var list = listOf(
//            House(
//                paradigm = true,
//                costImmobile = null,
//                areaImmobile = paradigm_area_input.pegarValorInt(),
//                parkingSpaces = space_parking_input.pegarValorInt(),
//                finishStandart = finishing_pattern_input.pegarValorFloat(),
//                conservationState = conservation_state_input.pegarValorFloat())
//            )

        /*sampleParadgm = presenter.createSamples(true,null, paradigm_area_input, space_parking_input, finishing_pattern_input, conservation_state_input)
            sampleParadgm = presenter.createSamples(true,null, paradigm_area_input, space_parking_input, finishing_pattern_input, conservation_state_input)
            sample1 = presenter.createSamples(false, sample1_value_input, sample1_area_input, sample1_Parking_space_input, sample1_finishing_pattern_input, sample1_conservation_state_input)
            sample2 = presenter.createSamples(false, sample2_value_input, sample2_area_input, sample2_parking_space_input, sample2_finishing_pattern_input, sample2_conservation_state_input)
            sample3 = presenter.createSamples(false, sample3_value_input, sample3_area_input, sample3_parking_space_input, sample3_finishing_pattern_input, sample3_conservation_state_input)
            Transmite amostras para o interactor através de uma array, passando pelo presenter*/
//    }

    override fun setErrors() {
        TODO("Not yet implemented")
    }
}