import React from "react";
import {Bottoni} from './Bottoni';
import {Schermo} from './Schermo';

class Calcolatrice extends React.Component {

    constructor(){

        super();

        this.state = {
            operazione: '',
            risposta: ''
        }

    }


    render()
    {
    return (
    <div className="container">
    
    <Schermo/>
    <div className="riga-bottoni">
      <Bottoni label={'Clear'}/>
      <Bottoni label={'Cancella'}/>
      <Bottoni label={'.'}/>
      <Bottoni label={'/'}/>
    </div>
    <div className="riga-bottoni">
      <Bottoni label={'7'}/>
      <Bottoni label={'8'}/>
      <Bottoni label={'9'}/>
      <Bottoni label={'*'}/>
    </div>
    <div className="riga-bottoni">
      <Bottoni label={'4'}/>
      <Bottoni label={'5'}/>
      <Bottoni label={'6'}/>
      <Bottoni label={'-'}/>
    </div>
    <div className="riga-bottoni">
      <Bottoni label={'1'}/>
      <Bottoni label={'2'}/>
      <Bottoni label={'3'}/>
      <Bottoni label={'+'}/>
    </div>
    <div className="riga-bottoni">
      <Bottoni label={'0'}/>
      <Bottoni label={'='}/>
    </div>
    </div>
    
    );
  }


}
  
// Export Calculator Component.
export default Calcolatrice;


//maneggiamo tutti gli eventi click dei nostri bottoni