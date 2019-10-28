import React, { Component } from 'react';
import './App.css';
import Character from './Character';
class App extends Component {
  constructor() {
    super();
    this.state = {
      characters: [],
      isLoaded: false
    }
  }
  componentDidMount() {
    fetch('https://www.anapioficeandfire.com/api/characters')
      .then(response => {
        return response.json();
      })
      .then(response => {
        // console.log(response)
        this.setState({
          isLoaded: true,
          characters: response
        })
      })
  }

  // retrieveCharacter = () => {
  //   fetch('https://www.anapioficeandfire.com/api/characters')
  //     .then(response => {
  //       return response.json()
  //         .then(response => {
  //           console.log(response)
  //         })
  //     })
  // }
  render() {
    return (
      <div className="App">
        <Character characters={this.state.characters} />
      </div>
    )
  }
}

export default App;