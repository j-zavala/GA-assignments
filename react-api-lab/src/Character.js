import React from 'react';
function Character(props) {
    return (
        <div className="characters">
            <h1 className="section-title">GAME OF THRONES : Characters</h1>
            {/* <h2>{props.name}</h2>
            <h2>{props.aliases}</h2> */}
            <ul>
                {props.characters.map((character, key) => (
                    <li className="box" key={key}>
                        <h2>{character.name}</h2>
                        <h2>{character.aliases}</h2>
                    </li>
                ))}
            </ul>
        </div>
    )
}
export default Character;