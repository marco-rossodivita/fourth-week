import React from "react";

export const Bottoni = (props) => {
    return (
        <input type= "button" value={props.label} />
    );
    //restituisco un input di tipo button con il valore inviato dal genitore
}

export default Bottoni;