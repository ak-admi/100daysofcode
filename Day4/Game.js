var gameState = {
    _score: 0,
    _enemies: 99,
    _lives: 3,
    get score() {
      return this._score;
    },
    set score(value) {
      this._score += value;
    },get enemies() {
        return this._enemies;
      },
      get killEnemies() {
        this._enemies--;
      },
      set killEnemies(num) {
        this._enemies -= num;
      },
      get lives() {
        return this._lives;
      },
      get killPlayer() {
        if (this.enemies <= 0) {
          this._lives = 3;
        } else {
          this._lives--;
        }
      }
    }

    console.log(gameState.score);
    gameState.score = 100;
gameState.score = 99;
console.log(gameState.score);
console.log(gameState.enemies);
gameState.killEnemies = 3;
console.log(gameState.enemies);
gameState.killEnemies;
console.log(gameState.enemies);
console.log(gameState.lives);
gameState.killPlayer;
console.log(gameState.lives);
gameState.killEnemies = 99;
gameState.killPlayer;
console.log(gameState.lives);