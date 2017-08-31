package com.hyt.servlet;

import java.io.IOException;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

@WebServlet(name = "Kaptcha", urlPatterns = { "/servlet/kaptcha" }, initParams = {
		@WebInitParam(name = "kaptcha.image.width", value = "150"),
		@WebInitParam(name = "kaptcha.image.height", value = "34"),
		@WebInitParam(name = "kaptcha.textproducer.char.length", value = "4"),
		@WebInitParam(name = "kaptcha.noise.impl", value = "com.google.code.kaptcha.impl.DefaultNoise"), })
public class HYTkaptcha extends com.google.code.kaptcha.servlet.KaptchaServlet {

}

