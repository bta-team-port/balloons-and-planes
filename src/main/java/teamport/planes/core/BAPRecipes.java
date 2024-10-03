package teamport.planes.core;

import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.util.RecipeEntrypoint;

import static teamport.planes.BalloonsAndPlanes.*;

public class BAPRecipes implements RecipeEntrypoint {
	@Override
	public void onRecipesReady() {

	}

	@Override
	public void initNamespaces() {
		RecipeBuilder.initNameSpace(MOD_ID);
	}
}
