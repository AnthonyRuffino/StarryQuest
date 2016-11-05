package com.blocktyper.starryquest;

import com.blocktyper.blocktyper2d.BlockTyper2dEngine;

public class StarryQuestClient {
	
	private BlockTyper2dEngine blockTyper2dEngine;
	
	public static void main(String[] args){
		StarryQuestClient starryQuestClient = new StarryQuestClient();
		
		
		BlockTyper2dEngine blockTyper2dEngine = new BlockTyper2dEngine("Starry Quest");
		
		starryQuestClient.setBlockTyper2dEngine(blockTyper2dEngine);
		starryQuestClient.startGame();
	}
	
	
	
	
	public void startGame(){
		blockTyper2dEngine.startEngine();
	}

	
	
	//BEGIN GETTERS AND SETTERS
	public BlockTyper2dEngine getBlockTyper2dEngine() {
		return blockTyper2dEngine;
	}

	public void setBlockTyper2dEngine(BlockTyper2dEngine blockTyper2dEngine) {
		this.blockTyper2dEngine = blockTyper2dEngine;
	}
	//END GETTERS AND SETTERS
}