package com.strnet.game

import com.badlogic.gdx.graphics.g2d.{BitmapFont, SpriteBatch}
import com.badlogic.gdx.graphics.{GL20, Texture}
import com.badlogic.gdx.math.MathUtils
import com.badlogic.gdx.{Game, Gdx}

class Libgdxsandbox extends Game {

    lazy val sprite = new Texture("libgdxlogo.png")
    lazy val batch = new SpriteBatch
    var font:BitmapFont = null

    override def create(): Unit = {
        font = new BitmapFont()
    }

    override def render(): Unit = {
        Gdx.gl.glClearColor(0.4f + MathUtils.random()*0.2f,0.4f + MathUtils.random()*0.2f,0.4f + MathUtils.random()*0.2f,1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
        batch.begin()
        batch.draw(sprite, (Gdx.graphics.getWidth - sprite.getWidth) / 2f, (Gdx.graphics.getHeight - sprite.getHeight) / 2f)
        font.draw(batch, "Hello World!", 50, 100)
        batch.end()
    }
}
