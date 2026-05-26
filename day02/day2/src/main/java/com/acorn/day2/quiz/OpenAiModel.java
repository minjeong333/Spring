package com.acorn.day2.quiz;
public class OpenAiModel {

    String name;
    String personality;

    int inputPrice;
    int cachedInputPrice;
    int outputPrice;

    public OpenAiModel(String name, String personality,
                       int inputPrice, int cachedInputPrice, int outputPrice) {

        this.name = name;
        this.personality = personality;
        this.inputPrice = inputPrice;
        this.cachedInputPrice = cachedInputPrice;
        this.outputPrice = outputPrice;
    }

    
    public String getName() {
		return name;
	}


	public String getPersonality() {
		return personality;
	}


	public int getInputPrice() {
		return inputPrice;
	}


	public int getCachedInputPrice() {
		return cachedInputPrice;
	}


	public int getOutputPrice() {
		return outputPrice;
	}


	@Override
    public String toString() {

        return name + " / " + personality
                + " / input: $" + inputPrice
                + " / cached: $" + cachedInputPrice
                + " / output: $" + outputPrice;
    }
}