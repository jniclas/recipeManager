package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'furnace'", "'stovetop'", "'rolling pin'", "'Vegan'", "'Vegetaric'", "'Carnivorous'", "'ml'", "'l'", "'g'", "'kg'", "'tsp'", "'mg'", "'tbsp'", "'pcs'", "'authors'", "':'", "'recipes'", "'{'", "'}'", "','", "'email'", "'calls'", "'['", "']'", "'Stars'", "'Author'", "'Comment'", "'VeganismLevel'", "'Duration'", "'Difficulty'", "'Ingredients'", "'KitchenUtensils'", "'foodCategory'", "'Ratings'", "'Name'", "'Amount'", "'Unit'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleRecipeManager"
    // InternalMyDsl.g:53:1: entryRuleRecipeManager : ruleRecipeManager EOF ;
    public final void entryRuleRecipeManager() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleRecipeManager EOF )
            // InternalMyDsl.g:55:1: ruleRecipeManager EOF
            {
             before(grammarAccess.getRecipeManagerRule()); 
            pushFollow(FOLLOW_1);
            ruleRecipeManager();

            state._fsp--;

             after(grammarAccess.getRecipeManagerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRecipeManager"


    // $ANTLR start "ruleRecipeManager"
    // InternalMyDsl.g:62:1: ruleRecipeManager : ( ( rule__RecipeManager__Group__0 ) ) ;
    public final void ruleRecipeManager() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__RecipeManager__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__RecipeManager__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__RecipeManager__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__RecipeManager__Group__0 )
            {
             before(grammarAccess.getRecipeManagerAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__RecipeManager__Group__0 )
            // InternalMyDsl.g:69:4: rule__RecipeManager__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RecipeManager__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRecipeManagerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRecipeManager"


    // $ANTLR start "entryRuleAuthorblock"
    // InternalMyDsl.g:78:1: entryRuleAuthorblock : ruleAuthorblock EOF ;
    public final void entryRuleAuthorblock() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleAuthorblock EOF )
            // InternalMyDsl.g:80:1: ruleAuthorblock EOF
            {
             before(grammarAccess.getAuthorblockRule()); 
            pushFollow(FOLLOW_1);
            ruleAuthorblock();

            state._fsp--;

             after(grammarAccess.getAuthorblockRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAuthorblock"


    // $ANTLR start "ruleAuthorblock"
    // InternalMyDsl.g:87:1: ruleAuthorblock : ( ( rule__Authorblock__Group__0 ) ) ;
    public final void ruleAuthorblock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Authorblock__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Authorblock__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Authorblock__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Authorblock__Group__0 )
            {
             before(grammarAccess.getAuthorblockAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Authorblock__Group__0 )
            // InternalMyDsl.g:94:4: rule__Authorblock__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Authorblock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAuthorblockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAuthorblock"


    // $ANTLR start "entryRuleAuthor"
    // InternalMyDsl.g:103:1: entryRuleAuthor : ruleAuthor EOF ;
    public final void entryRuleAuthor() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleAuthor EOF )
            // InternalMyDsl.g:105:1: ruleAuthor EOF
            {
             before(grammarAccess.getAuthorRule()); 
            pushFollow(FOLLOW_1);
            ruleAuthor();

            state._fsp--;

             after(grammarAccess.getAuthorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAuthor"


    // $ANTLR start "ruleAuthor"
    // InternalMyDsl.g:112:1: ruleAuthor : ( ( rule__Author__Group__0 ) ) ;
    public final void ruleAuthor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Author__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Author__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Author__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Author__Group__0 )
            {
             before(grammarAccess.getAuthorAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Author__Group__0 )
            // InternalMyDsl.g:119:4: rule__Author__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Author__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAuthorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAuthor"


    // $ANTLR start "entryRuleRecipeblock"
    // InternalMyDsl.g:128:1: entryRuleRecipeblock : ruleRecipeblock EOF ;
    public final void entryRuleRecipeblock() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleRecipeblock EOF )
            // InternalMyDsl.g:130:1: ruleRecipeblock EOF
            {
             before(grammarAccess.getRecipeblockRule()); 
            pushFollow(FOLLOW_1);
            ruleRecipeblock();

            state._fsp--;

             after(grammarAccess.getRecipeblockRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRecipeblock"


    // $ANTLR start "ruleRecipeblock"
    // InternalMyDsl.g:137:1: ruleRecipeblock : ( ( rule__Recipeblock__Group__0 ) ) ;
    public final void ruleRecipeblock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Recipeblock__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Recipeblock__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Recipeblock__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Recipeblock__Group__0 )
            {
             before(grammarAccess.getRecipeblockAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Recipeblock__Group__0 )
            // InternalMyDsl.g:144:4: rule__Recipeblock__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Recipeblock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRecipeblockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRecipeblock"


    // $ANTLR start "entryRuleRating"
    // InternalMyDsl.g:153:1: entryRuleRating : ruleRating EOF ;
    public final void entryRuleRating() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleRating EOF )
            // InternalMyDsl.g:155:1: ruleRating EOF
            {
             before(grammarAccess.getRatingRule()); 
            pushFollow(FOLLOW_1);
            ruleRating();

            state._fsp--;

             after(grammarAccess.getRatingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRating"


    // $ANTLR start "ruleRating"
    // InternalMyDsl.g:162:1: ruleRating : ( ( rule__Rating__Group__0 ) ) ;
    public final void ruleRating() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Rating__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Rating__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Rating__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Rating__Group__0 )
            {
             before(grammarAccess.getRatingAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Rating__Group__0 )
            // InternalMyDsl.g:169:4: rule__Rating__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rating__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRatingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRating"


    // $ANTLR start "entryRuleRecipe"
    // InternalMyDsl.g:178:1: entryRuleRecipe : ruleRecipe EOF ;
    public final void entryRuleRecipe() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleRecipe EOF )
            // InternalMyDsl.g:180:1: ruleRecipe EOF
            {
             before(grammarAccess.getRecipeRule()); 
            pushFollow(FOLLOW_1);
            ruleRecipe();

            state._fsp--;

             after(grammarAccess.getRecipeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRecipe"


    // $ANTLR start "ruleRecipe"
    // InternalMyDsl.g:187:1: ruleRecipe : ( ( rule__Recipe__Group__0 ) ) ;
    public final void ruleRecipe() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Recipe__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Recipe__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Recipe__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__Recipe__Group__0 )
            {
             before(grammarAccess.getRecipeAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__Recipe__Group__0 )
            // InternalMyDsl.g:194:4: rule__Recipe__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRecipe"


    // $ANTLR start "entryRuleKitchenUtensil"
    // InternalMyDsl.g:203:1: entryRuleKitchenUtensil : ruleKitchenUtensil EOF ;
    public final void entryRuleKitchenUtensil() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleKitchenUtensil EOF )
            // InternalMyDsl.g:205:1: ruleKitchenUtensil EOF
            {
             before(grammarAccess.getKitchenUtensilRule()); 
            pushFollow(FOLLOW_1);
            ruleKitchenUtensil();

            state._fsp--;

             after(grammarAccess.getKitchenUtensilRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleKitchenUtensil"


    // $ANTLR start "ruleKitchenUtensil"
    // InternalMyDsl.g:212:1: ruleKitchenUtensil : ( ( rule__KitchenUtensil__NameAssignment ) ) ;
    public final void ruleKitchenUtensil() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__KitchenUtensil__NameAssignment ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__KitchenUtensil__NameAssignment ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__KitchenUtensil__NameAssignment ) )
            // InternalMyDsl.g:218:3: ( rule__KitchenUtensil__NameAssignment )
            {
             before(grammarAccess.getKitchenUtensilAccess().getNameAssignment()); 
            // InternalMyDsl.g:219:3: ( rule__KitchenUtensil__NameAssignment )
            // InternalMyDsl.g:219:4: rule__KitchenUtensil__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__KitchenUtensil__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getKitchenUtensilAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKitchenUtensil"


    // $ANTLR start "entryRuleFoodCategory"
    // InternalMyDsl.g:228:1: entryRuleFoodCategory : ruleFoodCategory EOF ;
    public final void entryRuleFoodCategory() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleFoodCategory EOF )
            // InternalMyDsl.g:230:1: ruleFoodCategory EOF
            {
             before(grammarAccess.getFoodCategoryRule()); 
            pushFollow(FOLLOW_1);
            ruleFoodCategory();

            state._fsp--;

             after(grammarAccess.getFoodCategoryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFoodCategory"


    // $ANTLR start "ruleFoodCategory"
    // InternalMyDsl.g:237:1: ruleFoodCategory : ( ( rule__FoodCategory__NameAssignment ) ) ;
    public final void ruleFoodCategory() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__FoodCategory__NameAssignment ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__FoodCategory__NameAssignment ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__FoodCategory__NameAssignment ) )
            // InternalMyDsl.g:243:3: ( rule__FoodCategory__NameAssignment )
            {
             before(grammarAccess.getFoodCategoryAccess().getNameAssignment()); 
            // InternalMyDsl.g:244:3: ( rule__FoodCategory__NameAssignment )
            // InternalMyDsl.g:244:4: rule__FoodCategory__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__FoodCategory__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFoodCategoryAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFoodCategory"


    // $ANTLR start "entryRuleIngredient"
    // InternalMyDsl.g:253:1: entryRuleIngredient : ruleIngredient EOF ;
    public final void entryRuleIngredient() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleIngredient EOF )
            // InternalMyDsl.g:255:1: ruleIngredient EOF
            {
             before(grammarAccess.getIngredientRule()); 
            pushFollow(FOLLOW_1);
            ruleIngredient();

            state._fsp--;

             after(grammarAccess.getIngredientRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIngredient"


    // $ANTLR start "ruleIngredient"
    // InternalMyDsl.g:262:1: ruleIngredient : ( ( rule__Ingredient__Alternatives ) ) ;
    public final void ruleIngredient() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__Ingredient__Alternatives ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__Ingredient__Alternatives ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__Ingredient__Alternatives ) )
            // InternalMyDsl.g:268:3: ( rule__Ingredient__Alternatives )
            {
             before(grammarAccess.getIngredientAccess().getAlternatives()); 
            // InternalMyDsl.g:269:3: ( rule__Ingredient__Alternatives )
            // InternalMyDsl.g:269:4: rule__Ingredient__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getIngredientAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIngredient"


    // $ANTLR start "entryRuleVeganismLevel"
    // InternalMyDsl.g:278:1: entryRuleVeganismLevel : ruleVeganismLevel EOF ;
    public final void entryRuleVeganismLevel() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleVeganismLevel EOF )
            // InternalMyDsl.g:280:1: ruleVeganismLevel EOF
            {
             before(grammarAccess.getVeganismLevelRule()); 
            pushFollow(FOLLOW_1);
            ruleVeganismLevel();

            state._fsp--;

             after(grammarAccess.getVeganismLevelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVeganismLevel"


    // $ANTLR start "ruleVeganismLevel"
    // InternalMyDsl.g:287:1: ruleVeganismLevel : ( ( rule__VeganismLevel__Alternatives ) ) ;
    public final void ruleVeganismLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__VeganismLevel__Alternatives ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__VeganismLevel__Alternatives ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__VeganismLevel__Alternatives ) )
            // InternalMyDsl.g:293:3: ( rule__VeganismLevel__Alternatives )
            {
             before(grammarAccess.getVeganismLevelAccess().getAlternatives()); 
            // InternalMyDsl.g:294:3: ( rule__VeganismLevel__Alternatives )
            // InternalMyDsl.g:294:4: rule__VeganismLevel__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VeganismLevel__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVeganismLevelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVeganismLevel"


    // $ANTLR start "entryRuleUnit"
    // InternalMyDsl.g:303:1: entryRuleUnit : ruleUnit EOF ;
    public final void entryRuleUnit() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleUnit EOF )
            // InternalMyDsl.g:305:1: ruleUnit EOF
            {
             before(grammarAccess.getUnitRule()); 
            pushFollow(FOLLOW_1);
            ruleUnit();

            state._fsp--;

             after(grammarAccess.getUnitRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnit"


    // $ANTLR start "ruleUnit"
    // InternalMyDsl.g:312:1: ruleUnit : ( ( rule__Unit__Alternatives ) ) ;
    public final void ruleUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__Unit__Alternatives ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__Unit__Alternatives ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__Unit__Alternatives ) )
            // InternalMyDsl.g:318:3: ( rule__Unit__Alternatives )
            {
             before(grammarAccess.getUnitAccess().getAlternatives()); 
            // InternalMyDsl.g:319:3: ( rule__Unit__Alternatives )
            // InternalMyDsl.g:319:4: rule__Unit__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Unit__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnitAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnit"


    // $ANTLR start "rule__KitchenUtensil__NameAlternatives_0"
    // InternalMyDsl.g:327:1: rule__KitchenUtensil__NameAlternatives_0 : ( ( RULE_STRING ) | ( 'furnace' ) | ( 'stovetop' ) | ( 'rolling pin' ) );
    public final void rule__KitchenUtensil__NameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:331:1: ( ( RULE_STRING ) | ( 'furnace' ) | ( 'stovetop' ) | ( 'rolling pin' ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt1=1;
                }
                break;
            case 11:
                {
                alt1=2;
                }
                break;
            case 12:
                {
                alt1=3;
                }
                break;
            case 13:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:332:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:332:2: ( RULE_STRING )
                    // InternalMyDsl.g:333:3: RULE_STRING
                    {
                     before(grammarAccess.getKitchenUtensilAccess().getNameSTRINGTerminalRuleCall_0_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getKitchenUtensilAccess().getNameSTRINGTerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:338:2: ( 'furnace' )
                    {
                    // InternalMyDsl.g:338:2: ( 'furnace' )
                    // InternalMyDsl.g:339:3: 'furnace'
                    {
                     before(grammarAccess.getKitchenUtensilAccess().getNameFurnaceKeyword_0_1()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getKitchenUtensilAccess().getNameFurnaceKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:344:2: ( 'stovetop' )
                    {
                    // InternalMyDsl.g:344:2: ( 'stovetop' )
                    // InternalMyDsl.g:345:3: 'stovetop'
                    {
                     before(grammarAccess.getKitchenUtensilAccess().getNameStovetopKeyword_0_2()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getKitchenUtensilAccess().getNameStovetopKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:350:2: ( 'rolling pin' )
                    {
                    // InternalMyDsl.g:350:2: ( 'rolling pin' )
                    // InternalMyDsl.g:351:3: 'rolling pin'
                    {
                     before(grammarAccess.getKitchenUtensilAccess().getNameRollingPinKeyword_0_3()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getKitchenUtensilAccess().getNameRollingPinKeyword_0_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KitchenUtensil__NameAlternatives_0"


    // $ANTLR start "rule__Ingredient__Alternatives"
    // InternalMyDsl.g:360:1: rule__Ingredient__Alternatives : ( ( ( rule__Ingredient__Group_0__0 ) ) | ( ( rule__Ingredient__RecipeAssignment_1 ) ) );
    public final void rule__Ingredient__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:364:1: ( ( ( rule__Ingredient__Group_0__0 ) ) | ( ( rule__Ingredient__RecipeAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==28) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:365:2: ( ( rule__Ingredient__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:365:2: ( ( rule__Ingredient__Group_0__0 ) )
                    // InternalMyDsl.g:366:3: ( rule__Ingredient__Group_0__0 )
                    {
                     before(grammarAccess.getIngredientAccess().getGroup_0()); 
                    // InternalMyDsl.g:367:3: ( rule__Ingredient__Group_0__0 )
                    // InternalMyDsl.g:367:4: rule__Ingredient__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Ingredient__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIngredientAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:371:2: ( ( rule__Ingredient__RecipeAssignment_1 ) )
                    {
                    // InternalMyDsl.g:371:2: ( ( rule__Ingredient__RecipeAssignment_1 ) )
                    // InternalMyDsl.g:372:3: ( rule__Ingredient__RecipeAssignment_1 )
                    {
                     before(grammarAccess.getIngredientAccess().getRecipeAssignment_1()); 
                    // InternalMyDsl.g:373:3: ( rule__Ingredient__RecipeAssignment_1 )
                    // InternalMyDsl.g:373:4: rule__Ingredient__RecipeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Ingredient__RecipeAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getIngredientAccess().getRecipeAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Alternatives"


    // $ANTLR start "rule__VeganismLevel__Alternatives"
    // InternalMyDsl.g:381:1: rule__VeganismLevel__Alternatives : ( ( 'Vegan' ) | ( 'Vegetaric' ) | ( 'Carnivorous' ) );
    public final void rule__VeganismLevel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:385:1: ( ( 'Vegan' ) | ( 'Vegetaric' ) | ( 'Carnivorous' ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case 16:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:386:2: ( 'Vegan' )
                    {
                    // InternalMyDsl.g:386:2: ( 'Vegan' )
                    // InternalMyDsl.g:387:3: 'Vegan'
                    {
                     before(grammarAccess.getVeganismLevelAccess().getVeganKeyword_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getVeganismLevelAccess().getVeganKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:392:2: ( 'Vegetaric' )
                    {
                    // InternalMyDsl.g:392:2: ( 'Vegetaric' )
                    // InternalMyDsl.g:393:3: 'Vegetaric'
                    {
                     before(grammarAccess.getVeganismLevelAccess().getVegetaricKeyword_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getVeganismLevelAccess().getVegetaricKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:398:2: ( 'Carnivorous' )
                    {
                    // InternalMyDsl.g:398:2: ( 'Carnivorous' )
                    // InternalMyDsl.g:399:3: 'Carnivorous'
                    {
                     before(grammarAccess.getVeganismLevelAccess().getCarnivorousKeyword_2()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getVeganismLevelAccess().getCarnivorousKeyword_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VeganismLevel__Alternatives"


    // $ANTLR start "rule__Unit__Alternatives"
    // InternalMyDsl.g:408:1: rule__Unit__Alternatives : ( ( 'ml' ) | ( 'l' ) | ( 'g' ) | ( 'kg' ) | ( 'tsp' ) | ( 'mg' ) | ( 'tbsp' ) | ( 'pcs' ) );
    public final void rule__Unit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:412:1: ( ( 'ml' ) | ( 'l' ) | ( 'g' ) | ( 'kg' ) | ( 'tsp' ) | ( 'mg' ) | ( 'tbsp' ) | ( 'pcs' ) )
            int alt4=8;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt4=1;
                }
                break;
            case 18:
                {
                alt4=2;
                }
                break;
            case 19:
                {
                alt4=3;
                }
                break;
            case 20:
                {
                alt4=4;
                }
                break;
            case 21:
                {
                alt4=5;
                }
                break;
            case 22:
                {
                alt4=6;
                }
                break;
            case 23:
                {
                alt4=7;
                }
                break;
            case 24:
                {
                alt4=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:413:2: ( 'ml' )
                    {
                    // InternalMyDsl.g:413:2: ( 'ml' )
                    // InternalMyDsl.g:414:3: 'ml'
                    {
                     before(grammarAccess.getUnitAccess().getMlKeyword_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getUnitAccess().getMlKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:419:2: ( 'l' )
                    {
                    // InternalMyDsl.g:419:2: ( 'l' )
                    // InternalMyDsl.g:420:3: 'l'
                    {
                     before(grammarAccess.getUnitAccess().getLKeyword_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getUnitAccess().getLKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:425:2: ( 'g' )
                    {
                    // InternalMyDsl.g:425:2: ( 'g' )
                    // InternalMyDsl.g:426:3: 'g'
                    {
                     before(grammarAccess.getUnitAccess().getGKeyword_2()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getUnitAccess().getGKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:431:2: ( 'kg' )
                    {
                    // InternalMyDsl.g:431:2: ( 'kg' )
                    // InternalMyDsl.g:432:3: 'kg'
                    {
                     before(grammarAccess.getUnitAccess().getKgKeyword_3()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getUnitAccess().getKgKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:437:2: ( 'tsp' )
                    {
                    // InternalMyDsl.g:437:2: ( 'tsp' )
                    // InternalMyDsl.g:438:3: 'tsp'
                    {
                     before(grammarAccess.getUnitAccess().getTspKeyword_4()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getUnitAccess().getTspKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:443:2: ( 'mg' )
                    {
                    // InternalMyDsl.g:443:2: ( 'mg' )
                    // InternalMyDsl.g:444:3: 'mg'
                    {
                     before(grammarAccess.getUnitAccess().getMgKeyword_5()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getUnitAccess().getMgKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:449:2: ( 'tbsp' )
                    {
                    // InternalMyDsl.g:449:2: ( 'tbsp' )
                    // InternalMyDsl.g:450:3: 'tbsp'
                    {
                     before(grammarAccess.getUnitAccess().getTbspKeyword_6()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getUnitAccess().getTbspKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:455:2: ( 'pcs' )
                    {
                    // InternalMyDsl.g:455:2: ( 'pcs' )
                    // InternalMyDsl.g:456:3: 'pcs'
                    {
                     before(grammarAccess.getUnitAccess().getPcsKeyword_7()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getUnitAccess().getPcsKeyword_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unit__Alternatives"


    // $ANTLR start "rule__RecipeManager__Group__0"
    // InternalMyDsl.g:465:1: rule__RecipeManager__Group__0 : rule__RecipeManager__Group__0__Impl rule__RecipeManager__Group__1 ;
    public final void rule__RecipeManager__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:469:1: ( rule__RecipeManager__Group__0__Impl rule__RecipeManager__Group__1 )
            // InternalMyDsl.g:470:2: rule__RecipeManager__Group__0__Impl rule__RecipeManager__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__RecipeManager__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecipeManager__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecipeManager__Group__0"


    // $ANTLR start "rule__RecipeManager__Group__0__Impl"
    // InternalMyDsl.g:477:1: rule__RecipeManager__Group__0__Impl : ( 'authors' ) ;
    public final void rule__RecipeManager__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:481:1: ( ( 'authors' ) )
            // InternalMyDsl.g:482:1: ( 'authors' )
            {
            // InternalMyDsl.g:482:1: ( 'authors' )
            // InternalMyDsl.g:483:2: 'authors'
            {
             before(grammarAccess.getRecipeManagerAccess().getAuthorsKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRecipeManagerAccess().getAuthorsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecipeManager__Group__0__Impl"


    // $ANTLR start "rule__RecipeManager__Group__1"
    // InternalMyDsl.g:492:1: rule__RecipeManager__Group__1 : rule__RecipeManager__Group__1__Impl rule__RecipeManager__Group__2 ;
    public final void rule__RecipeManager__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:496:1: ( rule__RecipeManager__Group__1__Impl rule__RecipeManager__Group__2 )
            // InternalMyDsl.g:497:2: rule__RecipeManager__Group__1__Impl rule__RecipeManager__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__RecipeManager__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecipeManager__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecipeManager__Group__1"


    // $ANTLR start "rule__RecipeManager__Group__1__Impl"
    // InternalMyDsl.g:504:1: rule__RecipeManager__Group__1__Impl : ( ':' ) ;
    public final void rule__RecipeManager__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:508:1: ( ( ':' ) )
            // InternalMyDsl.g:509:1: ( ':' )
            {
            // InternalMyDsl.g:509:1: ( ':' )
            // InternalMyDsl.g:510:2: ':'
            {
             before(grammarAccess.getRecipeManagerAccess().getColonKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRecipeManagerAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecipeManager__Group__1__Impl"


    // $ANTLR start "rule__RecipeManager__Group__2"
    // InternalMyDsl.g:519:1: rule__RecipeManager__Group__2 : rule__RecipeManager__Group__2__Impl rule__RecipeManager__Group__3 ;
    public final void rule__RecipeManager__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:523:1: ( rule__RecipeManager__Group__2__Impl rule__RecipeManager__Group__3 )
            // InternalMyDsl.g:524:2: rule__RecipeManager__Group__2__Impl rule__RecipeManager__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__RecipeManager__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecipeManager__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecipeManager__Group__2"


    // $ANTLR start "rule__RecipeManager__Group__2__Impl"
    // InternalMyDsl.g:531:1: rule__RecipeManager__Group__2__Impl : ( ( rule__RecipeManager__AuthorblockAssignment_2 ) ) ;
    public final void rule__RecipeManager__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:535:1: ( ( ( rule__RecipeManager__AuthorblockAssignment_2 ) ) )
            // InternalMyDsl.g:536:1: ( ( rule__RecipeManager__AuthorblockAssignment_2 ) )
            {
            // InternalMyDsl.g:536:1: ( ( rule__RecipeManager__AuthorblockAssignment_2 ) )
            // InternalMyDsl.g:537:2: ( rule__RecipeManager__AuthorblockAssignment_2 )
            {
             before(grammarAccess.getRecipeManagerAccess().getAuthorblockAssignment_2()); 
            // InternalMyDsl.g:538:2: ( rule__RecipeManager__AuthorblockAssignment_2 )
            // InternalMyDsl.g:538:3: rule__RecipeManager__AuthorblockAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RecipeManager__AuthorblockAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRecipeManagerAccess().getAuthorblockAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecipeManager__Group__2__Impl"


    // $ANTLR start "rule__RecipeManager__Group__3"
    // InternalMyDsl.g:546:1: rule__RecipeManager__Group__3 : rule__RecipeManager__Group__3__Impl rule__RecipeManager__Group__4 ;
    public final void rule__RecipeManager__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:550:1: ( rule__RecipeManager__Group__3__Impl rule__RecipeManager__Group__4 )
            // InternalMyDsl.g:551:2: rule__RecipeManager__Group__3__Impl rule__RecipeManager__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__RecipeManager__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecipeManager__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecipeManager__Group__3"


    // $ANTLR start "rule__RecipeManager__Group__3__Impl"
    // InternalMyDsl.g:558:1: rule__RecipeManager__Group__3__Impl : ( 'recipes' ) ;
    public final void rule__RecipeManager__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:562:1: ( ( 'recipes' ) )
            // InternalMyDsl.g:563:1: ( 'recipes' )
            {
            // InternalMyDsl.g:563:1: ( 'recipes' )
            // InternalMyDsl.g:564:2: 'recipes'
            {
             before(grammarAccess.getRecipeManagerAccess().getRecipesKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRecipeManagerAccess().getRecipesKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecipeManager__Group__3__Impl"


    // $ANTLR start "rule__RecipeManager__Group__4"
    // InternalMyDsl.g:573:1: rule__RecipeManager__Group__4 : rule__RecipeManager__Group__4__Impl rule__RecipeManager__Group__5 ;
    public final void rule__RecipeManager__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:577:1: ( rule__RecipeManager__Group__4__Impl rule__RecipeManager__Group__5 )
            // InternalMyDsl.g:578:2: rule__RecipeManager__Group__4__Impl rule__RecipeManager__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__RecipeManager__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecipeManager__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecipeManager__Group__4"


    // $ANTLR start "rule__RecipeManager__Group__4__Impl"
    // InternalMyDsl.g:585:1: rule__RecipeManager__Group__4__Impl : ( ':' ) ;
    public final void rule__RecipeManager__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:589:1: ( ( ':' ) )
            // InternalMyDsl.g:590:1: ( ':' )
            {
            // InternalMyDsl.g:590:1: ( ':' )
            // InternalMyDsl.g:591:2: ':'
            {
             before(grammarAccess.getRecipeManagerAccess().getColonKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRecipeManagerAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecipeManager__Group__4__Impl"


    // $ANTLR start "rule__RecipeManager__Group__5"
    // InternalMyDsl.g:600:1: rule__RecipeManager__Group__5 : rule__RecipeManager__Group__5__Impl ;
    public final void rule__RecipeManager__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:604:1: ( rule__RecipeManager__Group__5__Impl )
            // InternalMyDsl.g:605:2: rule__RecipeManager__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RecipeManager__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecipeManager__Group__5"


    // $ANTLR start "rule__RecipeManager__Group__5__Impl"
    // InternalMyDsl.g:611:1: rule__RecipeManager__Group__5__Impl : ( ( rule__RecipeManager__RecipeblockAssignment_5 ) ) ;
    public final void rule__RecipeManager__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:615:1: ( ( ( rule__RecipeManager__RecipeblockAssignment_5 ) ) )
            // InternalMyDsl.g:616:1: ( ( rule__RecipeManager__RecipeblockAssignment_5 ) )
            {
            // InternalMyDsl.g:616:1: ( ( rule__RecipeManager__RecipeblockAssignment_5 ) )
            // InternalMyDsl.g:617:2: ( rule__RecipeManager__RecipeblockAssignment_5 )
            {
             before(grammarAccess.getRecipeManagerAccess().getRecipeblockAssignment_5()); 
            // InternalMyDsl.g:618:2: ( rule__RecipeManager__RecipeblockAssignment_5 )
            // InternalMyDsl.g:618:3: rule__RecipeManager__RecipeblockAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__RecipeManager__RecipeblockAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRecipeManagerAccess().getRecipeblockAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecipeManager__Group__5__Impl"


    // $ANTLR start "rule__Authorblock__Group__0"
    // InternalMyDsl.g:627:1: rule__Authorblock__Group__0 : rule__Authorblock__Group__0__Impl rule__Authorblock__Group__1 ;
    public final void rule__Authorblock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:631:1: ( rule__Authorblock__Group__0__Impl rule__Authorblock__Group__1 )
            // InternalMyDsl.g:632:2: rule__Authorblock__Group__0__Impl rule__Authorblock__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Authorblock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Authorblock__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authorblock__Group__0"


    // $ANTLR start "rule__Authorblock__Group__0__Impl"
    // InternalMyDsl.g:639:1: rule__Authorblock__Group__0__Impl : ( '{' ) ;
    public final void rule__Authorblock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:643:1: ( ( '{' ) )
            // InternalMyDsl.g:644:1: ( '{' )
            {
            // InternalMyDsl.g:644:1: ( '{' )
            // InternalMyDsl.g:645:2: '{'
            {
             before(grammarAccess.getAuthorblockAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAuthorblockAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authorblock__Group__0__Impl"


    // $ANTLR start "rule__Authorblock__Group__1"
    // InternalMyDsl.g:654:1: rule__Authorblock__Group__1 : rule__Authorblock__Group__1__Impl rule__Authorblock__Group__2 ;
    public final void rule__Authorblock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:658:1: ( rule__Authorblock__Group__1__Impl rule__Authorblock__Group__2 )
            // InternalMyDsl.g:659:2: rule__Authorblock__Group__1__Impl rule__Authorblock__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Authorblock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Authorblock__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authorblock__Group__1"


    // $ANTLR start "rule__Authorblock__Group__1__Impl"
    // InternalMyDsl.g:666:1: rule__Authorblock__Group__1__Impl : ( ( rule__Authorblock__AuthorsAssignment_1 ) ) ;
    public final void rule__Authorblock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:670:1: ( ( ( rule__Authorblock__AuthorsAssignment_1 ) ) )
            // InternalMyDsl.g:671:1: ( ( rule__Authorblock__AuthorsAssignment_1 ) )
            {
            // InternalMyDsl.g:671:1: ( ( rule__Authorblock__AuthorsAssignment_1 ) )
            // InternalMyDsl.g:672:2: ( rule__Authorblock__AuthorsAssignment_1 )
            {
             before(grammarAccess.getAuthorblockAccess().getAuthorsAssignment_1()); 
            // InternalMyDsl.g:673:2: ( rule__Authorblock__AuthorsAssignment_1 )
            // InternalMyDsl.g:673:3: rule__Authorblock__AuthorsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Authorblock__AuthorsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAuthorblockAccess().getAuthorsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authorblock__Group__1__Impl"


    // $ANTLR start "rule__Authorblock__Group__2"
    // InternalMyDsl.g:681:1: rule__Authorblock__Group__2 : rule__Authorblock__Group__2__Impl rule__Authorblock__Group__3 ;
    public final void rule__Authorblock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:685:1: ( rule__Authorblock__Group__2__Impl rule__Authorblock__Group__3 )
            // InternalMyDsl.g:686:2: rule__Authorblock__Group__2__Impl rule__Authorblock__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Authorblock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Authorblock__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authorblock__Group__2"


    // $ANTLR start "rule__Authorblock__Group__2__Impl"
    // InternalMyDsl.g:693:1: rule__Authorblock__Group__2__Impl : ( ( rule__Authorblock__Group_2__0 )* ) ;
    public final void rule__Authorblock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:697:1: ( ( ( rule__Authorblock__Group_2__0 )* ) )
            // InternalMyDsl.g:698:1: ( ( rule__Authorblock__Group_2__0 )* )
            {
            // InternalMyDsl.g:698:1: ( ( rule__Authorblock__Group_2__0 )* )
            // InternalMyDsl.g:699:2: ( rule__Authorblock__Group_2__0 )*
            {
             before(grammarAccess.getAuthorblockAccess().getGroup_2()); 
            // InternalMyDsl.g:700:2: ( rule__Authorblock__Group_2__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==30) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:700:3: rule__Authorblock__Group_2__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Authorblock__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getAuthorblockAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authorblock__Group__2__Impl"


    // $ANTLR start "rule__Authorblock__Group__3"
    // InternalMyDsl.g:708:1: rule__Authorblock__Group__3 : rule__Authorblock__Group__3__Impl ;
    public final void rule__Authorblock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:712:1: ( rule__Authorblock__Group__3__Impl )
            // InternalMyDsl.g:713:2: rule__Authorblock__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Authorblock__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authorblock__Group__3"


    // $ANTLR start "rule__Authorblock__Group__3__Impl"
    // InternalMyDsl.g:719:1: rule__Authorblock__Group__3__Impl : ( '}' ) ;
    public final void rule__Authorblock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:723:1: ( ( '}' ) )
            // InternalMyDsl.g:724:1: ( '}' )
            {
            // InternalMyDsl.g:724:1: ( '}' )
            // InternalMyDsl.g:725:2: '}'
            {
             before(grammarAccess.getAuthorblockAccess().getRightCurlyBracketKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getAuthorblockAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authorblock__Group__3__Impl"


    // $ANTLR start "rule__Authorblock__Group_2__0"
    // InternalMyDsl.g:735:1: rule__Authorblock__Group_2__0 : rule__Authorblock__Group_2__0__Impl rule__Authorblock__Group_2__1 ;
    public final void rule__Authorblock__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:739:1: ( rule__Authorblock__Group_2__0__Impl rule__Authorblock__Group_2__1 )
            // InternalMyDsl.g:740:2: rule__Authorblock__Group_2__0__Impl rule__Authorblock__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__Authorblock__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Authorblock__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authorblock__Group_2__0"


    // $ANTLR start "rule__Authorblock__Group_2__0__Impl"
    // InternalMyDsl.g:747:1: rule__Authorblock__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Authorblock__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:751:1: ( ( ',' ) )
            // InternalMyDsl.g:752:1: ( ',' )
            {
            // InternalMyDsl.g:752:1: ( ',' )
            // InternalMyDsl.g:753:2: ','
            {
             before(grammarAccess.getAuthorblockAccess().getCommaKeyword_2_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAuthorblockAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authorblock__Group_2__0__Impl"


    // $ANTLR start "rule__Authorblock__Group_2__1"
    // InternalMyDsl.g:762:1: rule__Authorblock__Group_2__1 : rule__Authorblock__Group_2__1__Impl ;
    public final void rule__Authorblock__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:766:1: ( rule__Authorblock__Group_2__1__Impl )
            // InternalMyDsl.g:767:2: rule__Authorblock__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Authorblock__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authorblock__Group_2__1"


    // $ANTLR start "rule__Authorblock__Group_2__1__Impl"
    // InternalMyDsl.g:773:1: rule__Authorblock__Group_2__1__Impl : ( ( rule__Authorblock__AuthorsAssignment_2_1 ) ) ;
    public final void rule__Authorblock__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:777:1: ( ( ( rule__Authorblock__AuthorsAssignment_2_1 ) ) )
            // InternalMyDsl.g:778:1: ( ( rule__Authorblock__AuthorsAssignment_2_1 ) )
            {
            // InternalMyDsl.g:778:1: ( ( rule__Authorblock__AuthorsAssignment_2_1 ) )
            // InternalMyDsl.g:779:2: ( rule__Authorblock__AuthorsAssignment_2_1 )
            {
             before(grammarAccess.getAuthorblockAccess().getAuthorsAssignment_2_1()); 
            // InternalMyDsl.g:780:2: ( rule__Authorblock__AuthorsAssignment_2_1 )
            // InternalMyDsl.g:780:3: rule__Authorblock__AuthorsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Authorblock__AuthorsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAuthorblockAccess().getAuthorsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authorblock__Group_2__1__Impl"


    // $ANTLR start "rule__Author__Group__0"
    // InternalMyDsl.g:789:1: rule__Author__Group__0 : rule__Author__Group__0__Impl rule__Author__Group__1 ;
    public final void rule__Author__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:793:1: ( rule__Author__Group__0__Impl rule__Author__Group__1 )
            // InternalMyDsl.g:794:2: rule__Author__Group__0__Impl rule__Author__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Author__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Author__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Author__Group__0"


    // $ANTLR start "rule__Author__Group__0__Impl"
    // InternalMyDsl.g:801:1: rule__Author__Group__0__Impl : ( ( rule__Author__NameAssignment_0 ) ) ;
    public final void rule__Author__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:805:1: ( ( ( rule__Author__NameAssignment_0 ) ) )
            // InternalMyDsl.g:806:1: ( ( rule__Author__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:806:1: ( ( rule__Author__NameAssignment_0 ) )
            // InternalMyDsl.g:807:2: ( rule__Author__NameAssignment_0 )
            {
             before(grammarAccess.getAuthorAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:808:2: ( rule__Author__NameAssignment_0 )
            // InternalMyDsl.g:808:3: rule__Author__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Author__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAuthorAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Author__Group__0__Impl"


    // $ANTLR start "rule__Author__Group__1"
    // InternalMyDsl.g:816:1: rule__Author__Group__1 : rule__Author__Group__1__Impl rule__Author__Group__2 ;
    public final void rule__Author__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:820:1: ( rule__Author__Group__1__Impl rule__Author__Group__2 )
            // InternalMyDsl.g:821:2: rule__Author__Group__1__Impl rule__Author__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Author__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Author__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Author__Group__1"


    // $ANTLR start "rule__Author__Group__1__Impl"
    // InternalMyDsl.g:828:1: rule__Author__Group__1__Impl : ( ':' ) ;
    public final void rule__Author__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:832:1: ( ( ':' ) )
            // InternalMyDsl.g:833:1: ( ':' )
            {
            // InternalMyDsl.g:833:1: ( ':' )
            // InternalMyDsl.g:834:2: ':'
            {
             before(grammarAccess.getAuthorAccess().getColonKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAuthorAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Author__Group__1__Impl"


    // $ANTLR start "rule__Author__Group__2"
    // InternalMyDsl.g:843:1: rule__Author__Group__2 : rule__Author__Group__2__Impl rule__Author__Group__3 ;
    public final void rule__Author__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:847:1: ( rule__Author__Group__2__Impl rule__Author__Group__3 )
            // InternalMyDsl.g:848:2: rule__Author__Group__2__Impl rule__Author__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Author__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Author__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Author__Group__2"


    // $ANTLR start "rule__Author__Group__2__Impl"
    // InternalMyDsl.g:855:1: rule__Author__Group__2__Impl : ( '{' ) ;
    public final void rule__Author__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:859:1: ( ( '{' ) )
            // InternalMyDsl.g:860:1: ( '{' )
            {
            // InternalMyDsl.g:860:1: ( '{' )
            // InternalMyDsl.g:861:2: '{'
            {
             before(grammarAccess.getAuthorAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAuthorAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Author__Group__2__Impl"


    // $ANTLR start "rule__Author__Group__3"
    // InternalMyDsl.g:870:1: rule__Author__Group__3 : rule__Author__Group__3__Impl rule__Author__Group__4 ;
    public final void rule__Author__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:874:1: ( rule__Author__Group__3__Impl rule__Author__Group__4 )
            // InternalMyDsl.g:875:2: rule__Author__Group__3__Impl rule__Author__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Author__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Author__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Author__Group__3"


    // $ANTLR start "rule__Author__Group__3__Impl"
    // InternalMyDsl.g:882:1: rule__Author__Group__3__Impl : ( 'email' ) ;
    public final void rule__Author__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:886:1: ( ( 'email' ) )
            // InternalMyDsl.g:887:1: ( 'email' )
            {
            // InternalMyDsl.g:887:1: ( 'email' )
            // InternalMyDsl.g:888:2: 'email'
            {
             before(grammarAccess.getAuthorAccess().getEmailKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAuthorAccess().getEmailKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Author__Group__3__Impl"


    // $ANTLR start "rule__Author__Group__4"
    // InternalMyDsl.g:897:1: rule__Author__Group__4 : rule__Author__Group__4__Impl rule__Author__Group__5 ;
    public final void rule__Author__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:901:1: ( rule__Author__Group__4__Impl rule__Author__Group__5 )
            // InternalMyDsl.g:902:2: rule__Author__Group__4__Impl rule__Author__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Author__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Author__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Author__Group__4"


    // $ANTLR start "rule__Author__Group__4__Impl"
    // InternalMyDsl.g:909:1: rule__Author__Group__4__Impl : ( ':' ) ;
    public final void rule__Author__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:913:1: ( ( ':' ) )
            // InternalMyDsl.g:914:1: ( ':' )
            {
            // InternalMyDsl.g:914:1: ( ':' )
            // InternalMyDsl.g:915:2: ':'
            {
             before(grammarAccess.getAuthorAccess().getColonKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAuthorAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Author__Group__4__Impl"


    // $ANTLR start "rule__Author__Group__5"
    // InternalMyDsl.g:924:1: rule__Author__Group__5 : rule__Author__Group__5__Impl rule__Author__Group__6 ;
    public final void rule__Author__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:928:1: ( rule__Author__Group__5__Impl rule__Author__Group__6 )
            // InternalMyDsl.g:929:2: rule__Author__Group__5__Impl rule__Author__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Author__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Author__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Author__Group__5"


    // $ANTLR start "rule__Author__Group__5__Impl"
    // InternalMyDsl.g:936:1: rule__Author__Group__5__Impl : ( ( rule__Author__EmailAssignment_5 ) ) ;
    public final void rule__Author__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:940:1: ( ( ( rule__Author__EmailAssignment_5 ) ) )
            // InternalMyDsl.g:941:1: ( ( rule__Author__EmailAssignment_5 ) )
            {
            // InternalMyDsl.g:941:1: ( ( rule__Author__EmailAssignment_5 ) )
            // InternalMyDsl.g:942:2: ( rule__Author__EmailAssignment_5 )
            {
             before(grammarAccess.getAuthorAccess().getEmailAssignment_5()); 
            // InternalMyDsl.g:943:2: ( rule__Author__EmailAssignment_5 )
            // InternalMyDsl.g:943:3: rule__Author__EmailAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Author__EmailAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAuthorAccess().getEmailAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Author__Group__5__Impl"


    // $ANTLR start "rule__Author__Group__6"
    // InternalMyDsl.g:951:1: rule__Author__Group__6 : rule__Author__Group__6__Impl rule__Author__Group__7 ;
    public final void rule__Author__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:955:1: ( rule__Author__Group__6__Impl rule__Author__Group__7 )
            // InternalMyDsl.g:956:2: rule__Author__Group__6__Impl rule__Author__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Author__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Author__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Author__Group__6"


    // $ANTLR start "rule__Author__Group__6__Impl"
    // InternalMyDsl.g:963:1: rule__Author__Group__6__Impl : ( ( rule__Author__Group_6__0 )? ) ;
    public final void rule__Author__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:967:1: ( ( ( rule__Author__Group_6__0 )? ) )
            // InternalMyDsl.g:968:1: ( ( rule__Author__Group_6__0 )? )
            {
            // InternalMyDsl.g:968:1: ( ( rule__Author__Group_6__0 )? )
            // InternalMyDsl.g:969:2: ( rule__Author__Group_6__0 )?
            {
             before(grammarAccess.getAuthorAccess().getGroup_6()); 
            // InternalMyDsl.g:970:2: ( rule__Author__Group_6__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==30) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:970:3: rule__Author__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Author__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAuthorAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Author__Group__6__Impl"


    // $ANTLR start "rule__Author__Group__7"
    // InternalMyDsl.g:978:1: rule__Author__Group__7 : rule__Author__Group__7__Impl ;
    public final void rule__Author__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:982:1: ( rule__Author__Group__7__Impl )
            // InternalMyDsl.g:983:2: rule__Author__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Author__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Author__Group__7"


    // $ANTLR start "rule__Author__Group__7__Impl"
    // InternalMyDsl.g:989:1: rule__Author__Group__7__Impl : ( '}' ) ;
    public final void rule__Author__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:993:1: ( ( '}' ) )
            // InternalMyDsl.g:994:1: ( '}' )
            {
            // InternalMyDsl.g:994:1: ( '}' )
            // InternalMyDsl.g:995:2: '}'
            {
             before(grammarAccess.getAuthorAccess().getRightCurlyBracketKeyword_7()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getAuthorAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Author__Group__7__Impl"


    // $ANTLR start "rule__Author__Group_6__0"
    // InternalMyDsl.g:1005:1: rule__Author__Group_6__0 : rule__Author__Group_6__0__Impl rule__Author__Group_6__1 ;
    public final void rule__Author__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1009:1: ( rule__Author__Group_6__0__Impl rule__Author__Group_6__1 )
            // InternalMyDsl.g:1010:2: rule__Author__Group_6__0__Impl rule__Author__Group_6__1
            {
            pushFollow(FOLLOW_11);
            rule__Author__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Author__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Author__Group_6__0"


    // $ANTLR start "rule__Author__Group_6__0__Impl"
    // InternalMyDsl.g:1017:1: rule__Author__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Author__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1021:1: ( ( ',' ) )
            // InternalMyDsl.g:1022:1: ( ',' )
            {
            // InternalMyDsl.g:1022:1: ( ',' )
            // InternalMyDsl.g:1023:2: ','
            {
             before(grammarAccess.getAuthorAccess().getCommaKeyword_6_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAuthorAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Author__Group_6__0__Impl"


    // $ANTLR start "rule__Author__Group_6__1"
    // InternalMyDsl.g:1032:1: rule__Author__Group_6__1 : rule__Author__Group_6__1__Impl rule__Author__Group_6__2 ;
    public final void rule__Author__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1036:1: ( rule__Author__Group_6__1__Impl rule__Author__Group_6__2 )
            // InternalMyDsl.g:1037:2: rule__Author__Group_6__1__Impl rule__Author__Group_6__2
            {
            pushFollow(FOLLOW_3);
            rule__Author__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Author__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Author__Group_6__1"


    // $ANTLR start "rule__Author__Group_6__1__Impl"
    // InternalMyDsl.g:1044:1: rule__Author__Group_6__1__Impl : ( 'calls' ) ;
    public final void rule__Author__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1048:1: ( ( 'calls' ) )
            // InternalMyDsl.g:1049:1: ( 'calls' )
            {
            // InternalMyDsl.g:1049:1: ( 'calls' )
            // InternalMyDsl.g:1050:2: 'calls'
            {
             before(grammarAccess.getAuthorAccess().getCallsKeyword_6_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAuthorAccess().getCallsKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Author__Group_6__1__Impl"


    // $ANTLR start "rule__Author__Group_6__2"
    // InternalMyDsl.g:1059:1: rule__Author__Group_6__2 : rule__Author__Group_6__2__Impl rule__Author__Group_6__3 ;
    public final void rule__Author__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1063:1: ( rule__Author__Group_6__2__Impl rule__Author__Group_6__3 )
            // InternalMyDsl.g:1064:2: rule__Author__Group_6__2__Impl rule__Author__Group_6__3
            {
            pushFollow(FOLLOW_12);
            rule__Author__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Author__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Author__Group_6__2"


    // $ANTLR start "rule__Author__Group_6__2__Impl"
    // InternalMyDsl.g:1071:1: rule__Author__Group_6__2__Impl : ( ':' ) ;
    public final void rule__Author__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1075:1: ( ( ':' ) )
            // InternalMyDsl.g:1076:1: ( ':' )
            {
            // InternalMyDsl.g:1076:1: ( ':' )
            // InternalMyDsl.g:1077:2: ':'
            {
             before(grammarAccess.getAuthorAccess().getColonKeyword_6_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAuthorAccess().getColonKeyword_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Author__Group_6__2__Impl"


    // $ANTLR start "rule__Author__Group_6__3"
    // InternalMyDsl.g:1086:1: rule__Author__Group_6__3 : rule__Author__Group_6__3__Impl rule__Author__Group_6__4 ;
    public final void rule__Author__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1090:1: ( rule__Author__Group_6__3__Impl rule__Author__Group_6__4 )
            // InternalMyDsl.g:1091:2: rule__Author__Group_6__3__Impl rule__Author__Group_6__4
            {
            pushFollow(FOLLOW_6);
            rule__Author__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Author__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Author__Group_6__3"


    // $ANTLR start "rule__Author__Group_6__3__Impl"
    // InternalMyDsl.g:1098:1: rule__Author__Group_6__3__Impl : ( '[' ) ;
    public final void rule__Author__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1102:1: ( ( '[' ) )
            // InternalMyDsl.g:1103:1: ( '[' )
            {
            // InternalMyDsl.g:1103:1: ( '[' )
            // InternalMyDsl.g:1104:2: '['
            {
             before(grammarAccess.getAuthorAccess().getLeftSquareBracketKeyword_6_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAuthorAccess().getLeftSquareBracketKeyword_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Author__Group_6__3__Impl"


    // $ANTLR start "rule__Author__Group_6__4"
    // InternalMyDsl.g:1113:1: rule__Author__Group_6__4 : rule__Author__Group_6__4__Impl rule__Author__Group_6__5 ;
    public final void rule__Author__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1117:1: ( rule__Author__Group_6__4__Impl rule__Author__Group_6__5 )
            // InternalMyDsl.g:1118:2: rule__Author__Group_6__4__Impl rule__Author__Group_6__5
            {
            pushFollow(FOLLOW_13);
            rule__Author__Group_6__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Author__Group_6__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Author__Group_6__4"


    // $ANTLR start "rule__Author__Group_6__4__Impl"
    // InternalMyDsl.g:1125:1: rule__Author__Group_6__4__Impl : ( ( rule__Author__CallsAssignment_6_4 ) ) ;
    public final void rule__Author__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1129:1: ( ( ( rule__Author__CallsAssignment_6_4 ) ) )
            // InternalMyDsl.g:1130:1: ( ( rule__Author__CallsAssignment_6_4 ) )
            {
            // InternalMyDsl.g:1130:1: ( ( rule__Author__CallsAssignment_6_4 ) )
            // InternalMyDsl.g:1131:2: ( rule__Author__CallsAssignment_6_4 )
            {
             before(grammarAccess.getAuthorAccess().getCallsAssignment_6_4()); 
            // InternalMyDsl.g:1132:2: ( rule__Author__CallsAssignment_6_4 )
            // InternalMyDsl.g:1132:3: rule__Author__CallsAssignment_6_4
            {
            pushFollow(FOLLOW_2);
            rule__Author__CallsAssignment_6_4();

            state._fsp--;


            }

             after(grammarAccess.getAuthorAccess().getCallsAssignment_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Author__Group_6__4__Impl"


    // $ANTLR start "rule__Author__Group_6__5"
    // InternalMyDsl.g:1140:1: rule__Author__Group_6__5 : rule__Author__Group_6__5__Impl rule__Author__Group_6__6 ;
    public final void rule__Author__Group_6__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1144:1: ( rule__Author__Group_6__5__Impl rule__Author__Group_6__6 )
            // InternalMyDsl.g:1145:2: rule__Author__Group_6__5__Impl rule__Author__Group_6__6
            {
            pushFollow(FOLLOW_13);
            rule__Author__Group_6__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Author__Group_6__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Author__Group_6__5"


    // $ANTLR start "rule__Author__Group_6__5__Impl"
    // InternalMyDsl.g:1152:1: rule__Author__Group_6__5__Impl : ( ( rule__Author__Group_6_5__0 )* ) ;
    public final void rule__Author__Group_6__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1156:1: ( ( ( rule__Author__Group_6_5__0 )* ) )
            // InternalMyDsl.g:1157:1: ( ( rule__Author__Group_6_5__0 )* )
            {
            // InternalMyDsl.g:1157:1: ( ( rule__Author__Group_6_5__0 )* )
            // InternalMyDsl.g:1158:2: ( rule__Author__Group_6_5__0 )*
            {
             before(grammarAccess.getAuthorAccess().getGroup_6_5()); 
            // InternalMyDsl.g:1159:2: ( rule__Author__Group_6_5__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==30) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:1159:3: rule__Author__Group_6_5__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Author__Group_6_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getAuthorAccess().getGroup_6_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Author__Group_6__5__Impl"


    // $ANTLR start "rule__Author__Group_6__6"
    // InternalMyDsl.g:1167:1: rule__Author__Group_6__6 : rule__Author__Group_6__6__Impl ;
    public final void rule__Author__Group_6__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1171:1: ( rule__Author__Group_6__6__Impl )
            // InternalMyDsl.g:1172:2: rule__Author__Group_6__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Author__Group_6__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Author__Group_6__6"


    // $ANTLR start "rule__Author__Group_6__6__Impl"
    // InternalMyDsl.g:1178:1: rule__Author__Group_6__6__Impl : ( ']' ) ;
    public final void rule__Author__Group_6__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1182:1: ( ( ']' ) )
            // InternalMyDsl.g:1183:1: ( ']' )
            {
            // InternalMyDsl.g:1183:1: ( ']' )
            // InternalMyDsl.g:1184:2: ']'
            {
             before(grammarAccess.getAuthorAccess().getRightSquareBracketKeyword_6_6()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAuthorAccess().getRightSquareBracketKeyword_6_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Author__Group_6__6__Impl"


    // $ANTLR start "rule__Author__Group_6_5__0"
    // InternalMyDsl.g:1194:1: rule__Author__Group_6_5__0 : rule__Author__Group_6_5__0__Impl rule__Author__Group_6_5__1 ;
    public final void rule__Author__Group_6_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1198:1: ( rule__Author__Group_6_5__0__Impl rule__Author__Group_6_5__1 )
            // InternalMyDsl.g:1199:2: rule__Author__Group_6_5__0__Impl rule__Author__Group_6_5__1
            {
            pushFollow(FOLLOW_6);
            rule__Author__Group_6_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Author__Group_6_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Author__Group_6_5__0"


    // $ANTLR start "rule__Author__Group_6_5__0__Impl"
    // InternalMyDsl.g:1206:1: rule__Author__Group_6_5__0__Impl : ( ',' ) ;
    public final void rule__Author__Group_6_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1210:1: ( ( ',' ) )
            // InternalMyDsl.g:1211:1: ( ',' )
            {
            // InternalMyDsl.g:1211:1: ( ',' )
            // InternalMyDsl.g:1212:2: ','
            {
             before(grammarAccess.getAuthorAccess().getCommaKeyword_6_5_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAuthorAccess().getCommaKeyword_6_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Author__Group_6_5__0__Impl"


    // $ANTLR start "rule__Author__Group_6_5__1"
    // InternalMyDsl.g:1221:1: rule__Author__Group_6_5__1 : rule__Author__Group_6_5__1__Impl ;
    public final void rule__Author__Group_6_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1225:1: ( rule__Author__Group_6_5__1__Impl )
            // InternalMyDsl.g:1226:2: rule__Author__Group_6_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Author__Group_6_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Author__Group_6_5__1"


    // $ANTLR start "rule__Author__Group_6_5__1__Impl"
    // InternalMyDsl.g:1232:1: rule__Author__Group_6_5__1__Impl : ( ( rule__Author__CallsAssignment_6_5_1 ) ) ;
    public final void rule__Author__Group_6_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1236:1: ( ( ( rule__Author__CallsAssignment_6_5_1 ) ) )
            // InternalMyDsl.g:1237:1: ( ( rule__Author__CallsAssignment_6_5_1 ) )
            {
            // InternalMyDsl.g:1237:1: ( ( rule__Author__CallsAssignment_6_5_1 ) )
            // InternalMyDsl.g:1238:2: ( rule__Author__CallsAssignment_6_5_1 )
            {
             before(grammarAccess.getAuthorAccess().getCallsAssignment_6_5_1()); 
            // InternalMyDsl.g:1239:2: ( rule__Author__CallsAssignment_6_5_1 )
            // InternalMyDsl.g:1239:3: rule__Author__CallsAssignment_6_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Author__CallsAssignment_6_5_1();

            state._fsp--;


            }

             after(grammarAccess.getAuthorAccess().getCallsAssignment_6_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Author__Group_6_5__1__Impl"


    // $ANTLR start "rule__Recipeblock__Group__0"
    // InternalMyDsl.g:1248:1: rule__Recipeblock__Group__0 : rule__Recipeblock__Group__0__Impl rule__Recipeblock__Group__1 ;
    public final void rule__Recipeblock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1252:1: ( rule__Recipeblock__Group__0__Impl rule__Recipeblock__Group__1 )
            // InternalMyDsl.g:1253:2: rule__Recipeblock__Group__0__Impl rule__Recipeblock__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Recipeblock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipeblock__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipeblock__Group__0"


    // $ANTLR start "rule__Recipeblock__Group__0__Impl"
    // InternalMyDsl.g:1260:1: rule__Recipeblock__Group__0__Impl : ( '{' ) ;
    public final void rule__Recipeblock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1264:1: ( ( '{' ) )
            // InternalMyDsl.g:1265:1: ( '{' )
            {
            // InternalMyDsl.g:1265:1: ( '{' )
            // InternalMyDsl.g:1266:2: '{'
            {
             before(grammarAccess.getRecipeblockAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRecipeblockAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipeblock__Group__0__Impl"


    // $ANTLR start "rule__Recipeblock__Group__1"
    // InternalMyDsl.g:1275:1: rule__Recipeblock__Group__1 : rule__Recipeblock__Group__1__Impl rule__Recipeblock__Group__2 ;
    public final void rule__Recipeblock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1279:1: ( rule__Recipeblock__Group__1__Impl rule__Recipeblock__Group__2 )
            // InternalMyDsl.g:1280:2: rule__Recipeblock__Group__1__Impl rule__Recipeblock__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Recipeblock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipeblock__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipeblock__Group__1"


    // $ANTLR start "rule__Recipeblock__Group__1__Impl"
    // InternalMyDsl.g:1287:1: rule__Recipeblock__Group__1__Impl : ( ( rule__Recipeblock__RecipesAssignment_1 ) ) ;
    public final void rule__Recipeblock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1291:1: ( ( ( rule__Recipeblock__RecipesAssignment_1 ) ) )
            // InternalMyDsl.g:1292:1: ( ( rule__Recipeblock__RecipesAssignment_1 ) )
            {
            // InternalMyDsl.g:1292:1: ( ( rule__Recipeblock__RecipesAssignment_1 ) )
            // InternalMyDsl.g:1293:2: ( rule__Recipeblock__RecipesAssignment_1 )
            {
             before(grammarAccess.getRecipeblockAccess().getRecipesAssignment_1()); 
            // InternalMyDsl.g:1294:2: ( rule__Recipeblock__RecipesAssignment_1 )
            // InternalMyDsl.g:1294:3: rule__Recipeblock__RecipesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Recipeblock__RecipesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRecipeblockAccess().getRecipesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipeblock__Group__1__Impl"


    // $ANTLR start "rule__Recipeblock__Group__2"
    // InternalMyDsl.g:1302:1: rule__Recipeblock__Group__2 : rule__Recipeblock__Group__2__Impl rule__Recipeblock__Group__3 ;
    public final void rule__Recipeblock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1306:1: ( rule__Recipeblock__Group__2__Impl rule__Recipeblock__Group__3 )
            // InternalMyDsl.g:1307:2: rule__Recipeblock__Group__2__Impl rule__Recipeblock__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Recipeblock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipeblock__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipeblock__Group__2"


    // $ANTLR start "rule__Recipeblock__Group__2__Impl"
    // InternalMyDsl.g:1314:1: rule__Recipeblock__Group__2__Impl : ( ( rule__Recipeblock__Group_2__0 )* ) ;
    public final void rule__Recipeblock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1318:1: ( ( ( rule__Recipeblock__Group_2__0 )* ) )
            // InternalMyDsl.g:1319:1: ( ( rule__Recipeblock__Group_2__0 )* )
            {
            // InternalMyDsl.g:1319:1: ( ( rule__Recipeblock__Group_2__0 )* )
            // InternalMyDsl.g:1320:2: ( rule__Recipeblock__Group_2__0 )*
            {
             before(grammarAccess.getRecipeblockAccess().getGroup_2()); 
            // InternalMyDsl.g:1321:2: ( rule__Recipeblock__Group_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==30) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:1321:3: rule__Recipeblock__Group_2__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Recipeblock__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getRecipeblockAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipeblock__Group__2__Impl"


    // $ANTLR start "rule__Recipeblock__Group__3"
    // InternalMyDsl.g:1329:1: rule__Recipeblock__Group__3 : rule__Recipeblock__Group__3__Impl ;
    public final void rule__Recipeblock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1333:1: ( rule__Recipeblock__Group__3__Impl )
            // InternalMyDsl.g:1334:2: rule__Recipeblock__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Recipeblock__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipeblock__Group__3"


    // $ANTLR start "rule__Recipeblock__Group__3__Impl"
    // InternalMyDsl.g:1340:1: rule__Recipeblock__Group__3__Impl : ( '}' ) ;
    public final void rule__Recipeblock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1344:1: ( ( '}' ) )
            // InternalMyDsl.g:1345:1: ( '}' )
            {
            // InternalMyDsl.g:1345:1: ( '}' )
            // InternalMyDsl.g:1346:2: '}'
            {
             before(grammarAccess.getRecipeblockAccess().getRightCurlyBracketKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getRecipeblockAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipeblock__Group__3__Impl"


    // $ANTLR start "rule__Recipeblock__Group_2__0"
    // InternalMyDsl.g:1356:1: rule__Recipeblock__Group_2__0 : rule__Recipeblock__Group_2__0__Impl rule__Recipeblock__Group_2__1 ;
    public final void rule__Recipeblock__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1360:1: ( rule__Recipeblock__Group_2__0__Impl rule__Recipeblock__Group_2__1 )
            // InternalMyDsl.g:1361:2: rule__Recipeblock__Group_2__0__Impl rule__Recipeblock__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__Recipeblock__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipeblock__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipeblock__Group_2__0"


    // $ANTLR start "rule__Recipeblock__Group_2__0__Impl"
    // InternalMyDsl.g:1368:1: rule__Recipeblock__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Recipeblock__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1372:1: ( ( ',' ) )
            // InternalMyDsl.g:1373:1: ( ',' )
            {
            // InternalMyDsl.g:1373:1: ( ',' )
            // InternalMyDsl.g:1374:2: ','
            {
             before(grammarAccess.getRecipeblockAccess().getCommaKeyword_2_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getRecipeblockAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipeblock__Group_2__0__Impl"


    // $ANTLR start "rule__Recipeblock__Group_2__1"
    // InternalMyDsl.g:1383:1: rule__Recipeblock__Group_2__1 : rule__Recipeblock__Group_2__1__Impl ;
    public final void rule__Recipeblock__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1387:1: ( rule__Recipeblock__Group_2__1__Impl )
            // InternalMyDsl.g:1388:2: rule__Recipeblock__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Recipeblock__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipeblock__Group_2__1"


    // $ANTLR start "rule__Recipeblock__Group_2__1__Impl"
    // InternalMyDsl.g:1394:1: rule__Recipeblock__Group_2__1__Impl : ( ( rule__Recipeblock__RecipesAssignment_2_1 ) ) ;
    public final void rule__Recipeblock__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1398:1: ( ( ( rule__Recipeblock__RecipesAssignment_2_1 ) ) )
            // InternalMyDsl.g:1399:1: ( ( rule__Recipeblock__RecipesAssignment_2_1 ) )
            {
            // InternalMyDsl.g:1399:1: ( ( rule__Recipeblock__RecipesAssignment_2_1 ) )
            // InternalMyDsl.g:1400:2: ( rule__Recipeblock__RecipesAssignment_2_1 )
            {
             before(grammarAccess.getRecipeblockAccess().getRecipesAssignment_2_1()); 
            // InternalMyDsl.g:1401:2: ( rule__Recipeblock__RecipesAssignment_2_1 )
            // InternalMyDsl.g:1401:3: rule__Recipeblock__RecipesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Recipeblock__RecipesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRecipeblockAccess().getRecipesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipeblock__Group_2__1__Impl"


    // $ANTLR start "rule__Rating__Group__0"
    // InternalMyDsl.g:1410:1: rule__Rating__Group__0 : rule__Rating__Group__0__Impl rule__Rating__Group__1 ;
    public final void rule__Rating__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1414:1: ( rule__Rating__Group__0__Impl rule__Rating__Group__1 )
            // InternalMyDsl.g:1415:2: rule__Rating__Group__0__Impl rule__Rating__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Rating__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rating__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating__Group__0"


    // $ANTLR start "rule__Rating__Group__0__Impl"
    // InternalMyDsl.g:1422:1: rule__Rating__Group__0__Impl : ( '{' ) ;
    public final void rule__Rating__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1426:1: ( ( '{' ) )
            // InternalMyDsl.g:1427:1: ( '{' )
            {
            // InternalMyDsl.g:1427:1: ( '{' )
            // InternalMyDsl.g:1428:2: '{'
            {
             before(grammarAccess.getRatingAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRatingAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating__Group__0__Impl"


    // $ANTLR start "rule__Rating__Group__1"
    // InternalMyDsl.g:1437:1: rule__Rating__Group__1 : rule__Rating__Group__1__Impl rule__Rating__Group__2 ;
    public final void rule__Rating__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1441:1: ( rule__Rating__Group__1__Impl rule__Rating__Group__2 )
            // InternalMyDsl.g:1442:2: rule__Rating__Group__1__Impl rule__Rating__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Rating__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rating__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating__Group__1"


    // $ANTLR start "rule__Rating__Group__1__Impl"
    // InternalMyDsl.g:1449:1: rule__Rating__Group__1__Impl : ( 'Stars' ) ;
    public final void rule__Rating__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1453:1: ( ( 'Stars' ) )
            // InternalMyDsl.g:1454:1: ( 'Stars' )
            {
            // InternalMyDsl.g:1454:1: ( 'Stars' )
            // InternalMyDsl.g:1455:2: 'Stars'
            {
             before(grammarAccess.getRatingAccess().getStarsKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getRatingAccess().getStarsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating__Group__1__Impl"


    // $ANTLR start "rule__Rating__Group__2"
    // InternalMyDsl.g:1464:1: rule__Rating__Group__2 : rule__Rating__Group__2__Impl rule__Rating__Group__3 ;
    public final void rule__Rating__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1468:1: ( rule__Rating__Group__2__Impl rule__Rating__Group__3 )
            // InternalMyDsl.g:1469:2: rule__Rating__Group__2__Impl rule__Rating__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Rating__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rating__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating__Group__2"


    // $ANTLR start "rule__Rating__Group__2__Impl"
    // InternalMyDsl.g:1476:1: rule__Rating__Group__2__Impl : ( ':' ) ;
    public final void rule__Rating__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1480:1: ( ( ':' ) )
            // InternalMyDsl.g:1481:1: ( ':' )
            {
            // InternalMyDsl.g:1481:1: ( ':' )
            // InternalMyDsl.g:1482:2: ':'
            {
             before(grammarAccess.getRatingAccess().getColonKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRatingAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating__Group__2__Impl"


    // $ANTLR start "rule__Rating__Group__3"
    // InternalMyDsl.g:1491:1: rule__Rating__Group__3 : rule__Rating__Group__3__Impl rule__Rating__Group__4 ;
    public final void rule__Rating__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1495:1: ( rule__Rating__Group__3__Impl rule__Rating__Group__4 )
            // InternalMyDsl.g:1496:2: rule__Rating__Group__3__Impl rule__Rating__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Rating__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rating__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating__Group__3"


    // $ANTLR start "rule__Rating__Group__3__Impl"
    // InternalMyDsl.g:1503:1: rule__Rating__Group__3__Impl : ( ( rule__Rating__StarsAssignment_3 ) ) ;
    public final void rule__Rating__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1507:1: ( ( ( rule__Rating__StarsAssignment_3 ) ) )
            // InternalMyDsl.g:1508:1: ( ( rule__Rating__StarsAssignment_3 ) )
            {
            // InternalMyDsl.g:1508:1: ( ( rule__Rating__StarsAssignment_3 ) )
            // InternalMyDsl.g:1509:2: ( rule__Rating__StarsAssignment_3 )
            {
             before(grammarAccess.getRatingAccess().getStarsAssignment_3()); 
            // InternalMyDsl.g:1510:2: ( rule__Rating__StarsAssignment_3 )
            // InternalMyDsl.g:1510:3: rule__Rating__StarsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Rating__StarsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRatingAccess().getStarsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating__Group__3__Impl"


    // $ANTLR start "rule__Rating__Group__4"
    // InternalMyDsl.g:1518:1: rule__Rating__Group__4 : rule__Rating__Group__4__Impl rule__Rating__Group__5 ;
    public final void rule__Rating__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1522:1: ( rule__Rating__Group__4__Impl rule__Rating__Group__5 )
            // InternalMyDsl.g:1523:2: rule__Rating__Group__4__Impl rule__Rating__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Rating__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rating__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating__Group__4"


    // $ANTLR start "rule__Rating__Group__4__Impl"
    // InternalMyDsl.g:1530:1: rule__Rating__Group__4__Impl : ( ',' ) ;
    public final void rule__Rating__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1534:1: ( ( ',' ) )
            // InternalMyDsl.g:1535:1: ( ',' )
            {
            // InternalMyDsl.g:1535:1: ( ',' )
            // InternalMyDsl.g:1536:2: ','
            {
             before(grammarAccess.getRatingAccess().getCommaKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getRatingAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating__Group__4__Impl"


    // $ANTLR start "rule__Rating__Group__5"
    // InternalMyDsl.g:1545:1: rule__Rating__Group__5 : rule__Rating__Group__5__Impl rule__Rating__Group__6 ;
    public final void rule__Rating__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1549:1: ( rule__Rating__Group__5__Impl rule__Rating__Group__6 )
            // InternalMyDsl.g:1550:2: rule__Rating__Group__5__Impl rule__Rating__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__Rating__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rating__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating__Group__5"


    // $ANTLR start "rule__Rating__Group__5__Impl"
    // InternalMyDsl.g:1557:1: rule__Rating__Group__5__Impl : ( ( rule__Rating__Group_5__0 )? ) ;
    public final void rule__Rating__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1561:1: ( ( ( rule__Rating__Group_5__0 )? ) )
            // InternalMyDsl.g:1562:1: ( ( rule__Rating__Group_5__0 )? )
            {
            // InternalMyDsl.g:1562:1: ( ( rule__Rating__Group_5__0 )? )
            // InternalMyDsl.g:1563:2: ( rule__Rating__Group_5__0 )?
            {
             before(grammarAccess.getRatingAccess().getGroup_5()); 
            // InternalMyDsl.g:1564:2: ( rule__Rating__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==37) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:1564:3: rule__Rating__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rating__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRatingAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating__Group__5__Impl"


    // $ANTLR start "rule__Rating__Group__6"
    // InternalMyDsl.g:1572:1: rule__Rating__Group__6 : rule__Rating__Group__6__Impl rule__Rating__Group__7 ;
    public final void rule__Rating__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1576:1: ( rule__Rating__Group__6__Impl rule__Rating__Group__7 )
            // InternalMyDsl.g:1577:2: rule__Rating__Group__6__Impl rule__Rating__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__Rating__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rating__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating__Group__6"


    // $ANTLR start "rule__Rating__Group__6__Impl"
    // InternalMyDsl.g:1584:1: rule__Rating__Group__6__Impl : ( 'Author' ) ;
    public final void rule__Rating__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1588:1: ( ( 'Author' ) )
            // InternalMyDsl.g:1589:1: ( 'Author' )
            {
            // InternalMyDsl.g:1589:1: ( 'Author' )
            // InternalMyDsl.g:1590:2: 'Author'
            {
             before(grammarAccess.getRatingAccess().getAuthorKeyword_6()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getRatingAccess().getAuthorKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating__Group__6__Impl"


    // $ANTLR start "rule__Rating__Group__7"
    // InternalMyDsl.g:1599:1: rule__Rating__Group__7 : rule__Rating__Group__7__Impl rule__Rating__Group__8 ;
    public final void rule__Rating__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1603:1: ( rule__Rating__Group__7__Impl rule__Rating__Group__8 )
            // InternalMyDsl.g:1604:2: rule__Rating__Group__7__Impl rule__Rating__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__Rating__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rating__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating__Group__7"


    // $ANTLR start "rule__Rating__Group__7__Impl"
    // InternalMyDsl.g:1611:1: rule__Rating__Group__7__Impl : ( ':' ) ;
    public final void rule__Rating__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1615:1: ( ( ':' ) )
            // InternalMyDsl.g:1616:1: ( ':' )
            {
            // InternalMyDsl.g:1616:1: ( ':' )
            // InternalMyDsl.g:1617:2: ':'
            {
             before(grammarAccess.getRatingAccess().getColonKeyword_7()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRatingAccess().getColonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating__Group__7__Impl"


    // $ANTLR start "rule__Rating__Group__8"
    // InternalMyDsl.g:1626:1: rule__Rating__Group__8 : rule__Rating__Group__8__Impl rule__Rating__Group__9 ;
    public final void rule__Rating__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1630:1: ( rule__Rating__Group__8__Impl rule__Rating__Group__9 )
            // InternalMyDsl.g:1631:2: rule__Rating__Group__8__Impl rule__Rating__Group__9
            {
            pushFollow(FOLLOW_18);
            rule__Rating__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rating__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating__Group__8"


    // $ANTLR start "rule__Rating__Group__8__Impl"
    // InternalMyDsl.g:1638:1: rule__Rating__Group__8__Impl : ( ( rule__Rating__AuthorAssignment_8 ) ) ;
    public final void rule__Rating__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1642:1: ( ( ( rule__Rating__AuthorAssignment_8 ) ) )
            // InternalMyDsl.g:1643:1: ( ( rule__Rating__AuthorAssignment_8 ) )
            {
            // InternalMyDsl.g:1643:1: ( ( rule__Rating__AuthorAssignment_8 ) )
            // InternalMyDsl.g:1644:2: ( rule__Rating__AuthorAssignment_8 )
            {
             before(grammarAccess.getRatingAccess().getAuthorAssignment_8()); 
            // InternalMyDsl.g:1645:2: ( rule__Rating__AuthorAssignment_8 )
            // InternalMyDsl.g:1645:3: rule__Rating__AuthorAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Rating__AuthorAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getRatingAccess().getAuthorAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating__Group__8__Impl"


    // $ANTLR start "rule__Rating__Group__9"
    // InternalMyDsl.g:1653:1: rule__Rating__Group__9 : rule__Rating__Group__9__Impl ;
    public final void rule__Rating__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1657:1: ( rule__Rating__Group__9__Impl )
            // InternalMyDsl.g:1658:2: rule__Rating__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rating__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating__Group__9"


    // $ANTLR start "rule__Rating__Group__9__Impl"
    // InternalMyDsl.g:1664:1: rule__Rating__Group__9__Impl : ( '}' ) ;
    public final void rule__Rating__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1668:1: ( ( '}' ) )
            // InternalMyDsl.g:1669:1: ( '}' )
            {
            // InternalMyDsl.g:1669:1: ( '}' )
            // InternalMyDsl.g:1670:2: '}'
            {
             before(grammarAccess.getRatingAccess().getRightCurlyBracketKeyword_9()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getRatingAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating__Group__9__Impl"


    // $ANTLR start "rule__Rating__Group_5__0"
    // InternalMyDsl.g:1680:1: rule__Rating__Group_5__0 : rule__Rating__Group_5__0__Impl rule__Rating__Group_5__1 ;
    public final void rule__Rating__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1684:1: ( rule__Rating__Group_5__0__Impl rule__Rating__Group_5__1 )
            // InternalMyDsl.g:1685:2: rule__Rating__Group_5__0__Impl rule__Rating__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__Rating__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rating__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating__Group_5__0"


    // $ANTLR start "rule__Rating__Group_5__0__Impl"
    // InternalMyDsl.g:1692:1: rule__Rating__Group_5__0__Impl : ( 'Comment' ) ;
    public final void rule__Rating__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1696:1: ( ( 'Comment' ) )
            // InternalMyDsl.g:1697:1: ( 'Comment' )
            {
            // InternalMyDsl.g:1697:1: ( 'Comment' )
            // InternalMyDsl.g:1698:2: 'Comment'
            {
             before(grammarAccess.getRatingAccess().getCommentKeyword_5_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getRatingAccess().getCommentKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating__Group_5__0__Impl"


    // $ANTLR start "rule__Rating__Group_5__1"
    // InternalMyDsl.g:1707:1: rule__Rating__Group_5__1 : rule__Rating__Group_5__1__Impl rule__Rating__Group_5__2 ;
    public final void rule__Rating__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1711:1: ( rule__Rating__Group_5__1__Impl rule__Rating__Group_5__2 )
            // InternalMyDsl.g:1712:2: rule__Rating__Group_5__1__Impl rule__Rating__Group_5__2
            {
            pushFollow(FOLLOW_10);
            rule__Rating__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rating__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating__Group_5__1"


    // $ANTLR start "rule__Rating__Group_5__1__Impl"
    // InternalMyDsl.g:1719:1: rule__Rating__Group_5__1__Impl : ( ':' ) ;
    public final void rule__Rating__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1723:1: ( ( ':' ) )
            // InternalMyDsl.g:1724:1: ( ':' )
            {
            // InternalMyDsl.g:1724:1: ( ':' )
            // InternalMyDsl.g:1725:2: ':'
            {
             before(grammarAccess.getRatingAccess().getColonKeyword_5_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRatingAccess().getColonKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating__Group_5__1__Impl"


    // $ANTLR start "rule__Rating__Group_5__2"
    // InternalMyDsl.g:1734:1: rule__Rating__Group_5__2 : rule__Rating__Group_5__2__Impl rule__Rating__Group_5__3 ;
    public final void rule__Rating__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1738:1: ( rule__Rating__Group_5__2__Impl rule__Rating__Group_5__3 )
            // InternalMyDsl.g:1739:2: rule__Rating__Group_5__2__Impl rule__Rating__Group_5__3
            {
            pushFollow(FOLLOW_16);
            rule__Rating__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rating__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating__Group_5__2"


    // $ANTLR start "rule__Rating__Group_5__2__Impl"
    // InternalMyDsl.g:1746:1: rule__Rating__Group_5__2__Impl : ( ( rule__Rating__CommentAssignment_5_2 ) ) ;
    public final void rule__Rating__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1750:1: ( ( ( rule__Rating__CommentAssignment_5_2 ) ) )
            // InternalMyDsl.g:1751:1: ( ( rule__Rating__CommentAssignment_5_2 ) )
            {
            // InternalMyDsl.g:1751:1: ( ( rule__Rating__CommentAssignment_5_2 ) )
            // InternalMyDsl.g:1752:2: ( rule__Rating__CommentAssignment_5_2 )
            {
             before(grammarAccess.getRatingAccess().getCommentAssignment_5_2()); 
            // InternalMyDsl.g:1753:2: ( rule__Rating__CommentAssignment_5_2 )
            // InternalMyDsl.g:1753:3: rule__Rating__CommentAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Rating__CommentAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getRatingAccess().getCommentAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating__Group_5__2__Impl"


    // $ANTLR start "rule__Rating__Group_5__3"
    // InternalMyDsl.g:1761:1: rule__Rating__Group_5__3 : rule__Rating__Group_5__3__Impl ;
    public final void rule__Rating__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1765:1: ( rule__Rating__Group_5__3__Impl )
            // InternalMyDsl.g:1766:2: rule__Rating__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rating__Group_5__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating__Group_5__3"


    // $ANTLR start "rule__Rating__Group_5__3__Impl"
    // InternalMyDsl.g:1772:1: rule__Rating__Group_5__3__Impl : ( ',' ) ;
    public final void rule__Rating__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1776:1: ( ( ',' ) )
            // InternalMyDsl.g:1777:1: ( ',' )
            {
            // InternalMyDsl.g:1777:1: ( ',' )
            // InternalMyDsl.g:1778:2: ','
            {
             before(grammarAccess.getRatingAccess().getCommaKeyword_5_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getRatingAccess().getCommaKeyword_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating__Group_5__3__Impl"


    // $ANTLR start "rule__Recipe__Group__0"
    // InternalMyDsl.g:1788:1: rule__Recipe__Group__0 : rule__Recipe__Group__0__Impl rule__Recipe__Group__1 ;
    public final void rule__Recipe__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1792:1: ( rule__Recipe__Group__0__Impl rule__Recipe__Group__1 )
            // InternalMyDsl.g:1793:2: rule__Recipe__Group__0__Impl rule__Recipe__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Recipe__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__0"


    // $ANTLR start "rule__Recipe__Group__0__Impl"
    // InternalMyDsl.g:1800:1: rule__Recipe__Group__0__Impl : ( ( rule__Recipe__NameAssignment_0 ) ) ;
    public final void rule__Recipe__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1804:1: ( ( ( rule__Recipe__NameAssignment_0 ) ) )
            // InternalMyDsl.g:1805:1: ( ( rule__Recipe__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:1805:1: ( ( rule__Recipe__NameAssignment_0 ) )
            // InternalMyDsl.g:1806:2: ( rule__Recipe__NameAssignment_0 )
            {
             before(grammarAccess.getRecipeAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:1807:2: ( rule__Recipe__NameAssignment_0 )
            // InternalMyDsl.g:1807:3: rule__Recipe__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__0__Impl"


    // $ANTLR start "rule__Recipe__Group__1"
    // InternalMyDsl.g:1815:1: rule__Recipe__Group__1 : rule__Recipe__Group__1__Impl rule__Recipe__Group__2 ;
    public final void rule__Recipe__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1819:1: ( rule__Recipe__Group__1__Impl rule__Recipe__Group__2 )
            // InternalMyDsl.g:1820:2: rule__Recipe__Group__1__Impl rule__Recipe__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Recipe__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__1"


    // $ANTLR start "rule__Recipe__Group__1__Impl"
    // InternalMyDsl.g:1827:1: rule__Recipe__Group__1__Impl : ( ':' ) ;
    public final void rule__Recipe__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1831:1: ( ( ':' ) )
            // InternalMyDsl.g:1832:1: ( ':' )
            {
            // InternalMyDsl.g:1832:1: ( ':' )
            // InternalMyDsl.g:1833:2: ':'
            {
             before(grammarAccess.getRecipeAccess().getColonKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__1__Impl"


    // $ANTLR start "rule__Recipe__Group__2"
    // InternalMyDsl.g:1842:1: rule__Recipe__Group__2 : rule__Recipe__Group__2__Impl rule__Recipe__Group__3 ;
    public final void rule__Recipe__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1846:1: ( rule__Recipe__Group__2__Impl rule__Recipe__Group__3 )
            // InternalMyDsl.g:1847:2: rule__Recipe__Group__2__Impl rule__Recipe__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Recipe__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__2"


    // $ANTLR start "rule__Recipe__Group__2__Impl"
    // InternalMyDsl.g:1854:1: rule__Recipe__Group__2__Impl : ( '{' ) ;
    public final void rule__Recipe__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1858:1: ( ( '{' ) )
            // InternalMyDsl.g:1859:1: ( '{' )
            {
            // InternalMyDsl.g:1859:1: ( '{' )
            // InternalMyDsl.g:1860:2: '{'
            {
             before(grammarAccess.getRecipeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__2__Impl"


    // $ANTLR start "rule__Recipe__Group__3"
    // InternalMyDsl.g:1869:1: rule__Recipe__Group__3 : rule__Recipe__Group__3__Impl rule__Recipe__Group__4 ;
    public final void rule__Recipe__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1873:1: ( rule__Recipe__Group__3__Impl rule__Recipe__Group__4 )
            // InternalMyDsl.g:1874:2: rule__Recipe__Group__3__Impl rule__Recipe__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Recipe__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__3"


    // $ANTLR start "rule__Recipe__Group__3__Impl"
    // InternalMyDsl.g:1881:1: rule__Recipe__Group__3__Impl : ( 'Author' ) ;
    public final void rule__Recipe__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1885:1: ( ( 'Author' ) )
            // InternalMyDsl.g:1886:1: ( 'Author' )
            {
            // InternalMyDsl.g:1886:1: ( 'Author' )
            // InternalMyDsl.g:1887:2: 'Author'
            {
             before(grammarAccess.getRecipeAccess().getAuthorKeyword_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getAuthorKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__3__Impl"


    // $ANTLR start "rule__Recipe__Group__4"
    // InternalMyDsl.g:1896:1: rule__Recipe__Group__4 : rule__Recipe__Group__4__Impl rule__Recipe__Group__5 ;
    public final void rule__Recipe__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1900:1: ( rule__Recipe__Group__4__Impl rule__Recipe__Group__5 )
            // InternalMyDsl.g:1901:2: rule__Recipe__Group__4__Impl rule__Recipe__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Recipe__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__4"


    // $ANTLR start "rule__Recipe__Group__4__Impl"
    // InternalMyDsl.g:1908:1: rule__Recipe__Group__4__Impl : ( ':' ) ;
    public final void rule__Recipe__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1912:1: ( ( ':' ) )
            // InternalMyDsl.g:1913:1: ( ':' )
            {
            // InternalMyDsl.g:1913:1: ( ':' )
            // InternalMyDsl.g:1914:2: ':'
            {
             before(grammarAccess.getRecipeAccess().getColonKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__4__Impl"


    // $ANTLR start "rule__Recipe__Group__5"
    // InternalMyDsl.g:1923:1: rule__Recipe__Group__5 : rule__Recipe__Group__5__Impl rule__Recipe__Group__6 ;
    public final void rule__Recipe__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1927:1: ( rule__Recipe__Group__5__Impl rule__Recipe__Group__6 )
            // InternalMyDsl.g:1928:2: rule__Recipe__Group__5__Impl rule__Recipe__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Recipe__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__5"


    // $ANTLR start "rule__Recipe__Group__5__Impl"
    // InternalMyDsl.g:1935:1: rule__Recipe__Group__5__Impl : ( ( rule__Recipe__AuthorAssignment_5 ) ) ;
    public final void rule__Recipe__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1939:1: ( ( ( rule__Recipe__AuthorAssignment_5 ) ) )
            // InternalMyDsl.g:1940:1: ( ( rule__Recipe__AuthorAssignment_5 ) )
            {
            // InternalMyDsl.g:1940:1: ( ( rule__Recipe__AuthorAssignment_5 ) )
            // InternalMyDsl.g:1941:2: ( rule__Recipe__AuthorAssignment_5 )
            {
             before(grammarAccess.getRecipeAccess().getAuthorAssignment_5()); 
            // InternalMyDsl.g:1942:2: ( rule__Recipe__AuthorAssignment_5 )
            // InternalMyDsl.g:1942:3: rule__Recipe__AuthorAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__AuthorAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getAuthorAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__5__Impl"


    // $ANTLR start "rule__Recipe__Group__6"
    // InternalMyDsl.g:1950:1: rule__Recipe__Group__6 : rule__Recipe__Group__6__Impl rule__Recipe__Group__7 ;
    public final void rule__Recipe__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1954:1: ( rule__Recipe__Group__6__Impl rule__Recipe__Group__7 )
            // InternalMyDsl.g:1955:2: rule__Recipe__Group__6__Impl rule__Recipe__Group__7
            {
            pushFollow(FOLLOW_20);
            rule__Recipe__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__6"


    // $ANTLR start "rule__Recipe__Group__6__Impl"
    // InternalMyDsl.g:1962:1: rule__Recipe__Group__6__Impl : ( ',' ) ;
    public final void rule__Recipe__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1966:1: ( ( ',' ) )
            // InternalMyDsl.g:1967:1: ( ',' )
            {
            // InternalMyDsl.g:1967:1: ( ',' )
            // InternalMyDsl.g:1968:2: ','
            {
             before(grammarAccess.getRecipeAccess().getCommaKeyword_6()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getCommaKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__6__Impl"


    // $ANTLR start "rule__Recipe__Group__7"
    // InternalMyDsl.g:1977:1: rule__Recipe__Group__7 : rule__Recipe__Group__7__Impl rule__Recipe__Group__8 ;
    public final void rule__Recipe__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1981:1: ( rule__Recipe__Group__7__Impl rule__Recipe__Group__8 )
            // InternalMyDsl.g:1982:2: rule__Recipe__Group__7__Impl rule__Recipe__Group__8
            {
            pushFollow(FOLLOW_3);
            rule__Recipe__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__7"


    // $ANTLR start "rule__Recipe__Group__7__Impl"
    // InternalMyDsl.g:1989:1: rule__Recipe__Group__7__Impl : ( 'VeganismLevel' ) ;
    public final void rule__Recipe__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1993:1: ( ( 'VeganismLevel' ) )
            // InternalMyDsl.g:1994:1: ( 'VeganismLevel' )
            {
            // InternalMyDsl.g:1994:1: ( 'VeganismLevel' )
            // InternalMyDsl.g:1995:2: 'VeganismLevel'
            {
             before(grammarAccess.getRecipeAccess().getVeganismLevelKeyword_7()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getVeganismLevelKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__7__Impl"


    // $ANTLR start "rule__Recipe__Group__8"
    // InternalMyDsl.g:2004:1: rule__Recipe__Group__8 : rule__Recipe__Group__8__Impl rule__Recipe__Group__9 ;
    public final void rule__Recipe__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2008:1: ( rule__Recipe__Group__8__Impl rule__Recipe__Group__9 )
            // InternalMyDsl.g:2009:2: rule__Recipe__Group__8__Impl rule__Recipe__Group__9
            {
            pushFollow(FOLLOW_21);
            rule__Recipe__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__8"


    // $ANTLR start "rule__Recipe__Group__8__Impl"
    // InternalMyDsl.g:2016:1: rule__Recipe__Group__8__Impl : ( ':' ) ;
    public final void rule__Recipe__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2020:1: ( ( ':' ) )
            // InternalMyDsl.g:2021:1: ( ':' )
            {
            // InternalMyDsl.g:2021:1: ( ':' )
            // InternalMyDsl.g:2022:2: ':'
            {
             before(grammarAccess.getRecipeAccess().getColonKeyword_8()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getColonKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__8__Impl"


    // $ANTLR start "rule__Recipe__Group__9"
    // InternalMyDsl.g:2031:1: rule__Recipe__Group__9 : rule__Recipe__Group__9__Impl rule__Recipe__Group__10 ;
    public final void rule__Recipe__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2035:1: ( rule__Recipe__Group__9__Impl rule__Recipe__Group__10 )
            // InternalMyDsl.g:2036:2: rule__Recipe__Group__9__Impl rule__Recipe__Group__10
            {
            pushFollow(FOLLOW_16);
            rule__Recipe__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__9"


    // $ANTLR start "rule__Recipe__Group__9__Impl"
    // InternalMyDsl.g:2043:1: rule__Recipe__Group__9__Impl : ( ( rule__Recipe__VeganAssignment_9 ) ) ;
    public final void rule__Recipe__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2047:1: ( ( ( rule__Recipe__VeganAssignment_9 ) ) )
            // InternalMyDsl.g:2048:1: ( ( rule__Recipe__VeganAssignment_9 ) )
            {
            // InternalMyDsl.g:2048:1: ( ( rule__Recipe__VeganAssignment_9 ) )
            // InternalMyDsl.g:2049:2: ( rule__Recipe__VeganAssignment_9 )
            {
             before(grammarAccess.getRecipeAccess().getVeganAssignment_9()); 
            // InternalMyDsl.g:2050:2: ( rule__Recipe__VeganAssignment_9 )
            // InternalMyDsl.g:2050:3: rule__Recipe__VeganAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__VeganAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getVeganAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__9__Impl"


    // $ANTLR start "rule__Recipe__Group__10"
    // InternalMyDsl.g:2058:1: rule__Recipe__Group__10 : rule__Recipe__Group__10__Impl rule__Recipe__Group__11 ;
    public final void rule__Recipe__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2062:1: ( rule__Recipe__Group__10__Impl rule__Recipe__Group__11 )
            // InternalMyDsl.g:2063:2: rule__Recipe__Group__10__Impl rule__Recipe__Group__11
            {
            pushFollow(FOLLOW_22);
            rule__Recipe__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__10"


    // $ANTLR start "rule__Recipe__Group__10__Impl"
    // InternalMyDsl.g:2070:1: rule__Recipe__Group__10__Impl : ( ',' ) ;
    public final void rule__Recipe__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2074:1: ( ( ',' ) )
            // InternalMyDsl.g:2075:1: ( ',' )
            {
            // InternalMyDsl.g:2075:1: ( ',' )
            // InternalMyDsl.g:2076:2: ','
            {
             before(grammarAccess.getRecipeAccess().getCommaKeyword_10()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getCommaKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__10__Impl"


    // $ANTLR start "rule__Recipe__Group__11"
    // InternalMyDsl.g:2085:1: rule__Recipe__Group__11 : rule__Recipe__Group__11__Impl rule__Recipe__Group__12 ;
    public final void rule__Recipe__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2089:1: ( rule__Recipe__Group__11__Impl rule__Recipe__Group__12 )
            // InternalMyDsl.g:2090:2: rule__Recipe__Group__11__Impl rule__Recipe__Group__12
            {
            pushFollow(FOLLOW_3);
            rule__Recipe__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__11"


    // $ANTLR start "rule__Recipe__Group__11__Impl"
    // InternalMyDsl.g:2097:1: rule__Recipe__Group__11__Impl : ( 'Duration' ) ;
    public final void rule__Recipe__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2101:1: ( ( 'Duration' ) )
            // InternalMyDsl.g:2102:1: ( 'Duration' )
            {
            // InternalMyDsl.g:2102:1: ( 'Duration' )
            // InternalMyDsl.g:2103:2: 'Duration'
            {
             before(grammarAccess.getRecipeAccess().getDurationKeyword_11()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getDurationKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__11__Impl"


    // $ANTLR start "rule__Recipe__Group__12"
    // InternalMyDsl.g:2112:1: rule__Recipe__Group__12 : rule__Recipe__Group__12__Impl rule__Recipe__Group__13 ;
    public final void rule__Recipe__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2116:1: ( rule__Recipe__Group__12__Impl rule__Recipe__Group__13 )
            // InternalMyDsl.g:2117:2: rule__Recipe__Group__12__Impl rule__Recipe__Group__13
            {
            pushFollow(FOLLOW_15);
            rule__Recipe__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__12"


    // $ANTLR start "rule__Recipe__Group__12__Impl"
    // InternalMyDsl.g:2124:1: rule__Recipe__Group__12__Impl : ( ':' ) ;
    public final void rule__Recipe__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2128:1: ( ( ':' ) )
            // InternalMyDsl.g:2129:1: ( ':' )
            {
            // InternalMyDsl.g:2129:1: ( ':' )
            // InternalMyDsl.g:2130:2: ':'
            {
             before(grammarAccess.getRecipeAccess().getColonKeyword_12()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getColonKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__12__Impl"


    // $ANTLR start "rule__Recipe__Group__13"
    // InternalMyDsl.g:2139:1: rule__Recipe__Group__13 : rule__Recipe__Group__13__Impl rule__Recipe__Group__14 ;
    public final void rule__Recipe__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2143:1: ( rule__Recipe__Group__13__Impl rule__Recipe__Group__14 )
            // InternalMyDsl.g:2144:2: rule__Recipe__Group__13__Impl rule__Recipe__Group__14
            {
            pushFollow(FOLLOW_16);
            rule__Recipe__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__13"


    // $ANTLR start "rule__Recipe__Group__13__Impl"
    // InternalMyDsl.g:2151:1: rule__Recipe__Group__13__Impl : ( ( rule__Recipe__DurationAssignment_13 ) ) ;
    public final void rule__Recipe__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2155:1: ( ( ( rule__Recipe__DurationAssignment_13 ) ) )
            // InternalMyDsl.g:2156:1: ( ( rule__Recipe__DurationAssignment_13 ) )
            {
            // InternalMyDsl.g:2156:1: ( ( rule__Recipe__DurationAssignment_13 ) )
            // InternalMyDsl.g:2157:2: ( rule__Recipe__DurationAssignment_13 )
            {
             before(grammarAccess.getRecipeAccess().getDurationAssignment_13()); 
            // InternalMyDsl.g:2158:2: ( rule__Recipe__DurationAssignment_13 )
            // InternalMyDsl.g:2158:3: rule__Recipe__DurationAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__DurationAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getDurationAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__13__Impl"


    // $ANTLR start "rule__Recipe__Group__14"
    // InternalMyDsl.g:2166:1: rule__Recipe__Group__14 : rule__Recipe__Group__14__Impl rule__Recipe__Group__15 ;
    public final void rule__Recipe__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2170:1: ( rule__Recipe__Group__14__Impl rule__Recipe__Group__15 )
            // InternalMyDsl.g:2171:2: rule__Recipe__Group__14__Impl rule__Recipe__Group__15
            {
            pushFollow(FOLLOW_23);
            rule__Recipe__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__14"


    // $ANTLR start "rule__Recipe__Group__14__Impl"
    // InternalMyDsl.g:2178:1: rule__Recipe__Group__14__Impl : ( ',' ) ;
    public final void rule__Recipe__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2182:1: ( ( ',' ) )
            // InternalMyDsl.g:2183:1: ( ',' )
            {
            // InternalMyDsl.g:2183:1: ( ',' )
            // InternalMyDsl.g:2184:2: ','
            {
             before(grammarAccess.getRecipeAccess().getCommaKeyword_14()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getCommaKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__14__Impl"


    // $ANTLR start "rule__Recipe__Group__15"
    // InternalMyDsl.g:2193:1: rule__Recipe__Group__15 : rule__Recipe__Group__15__Impl rule__Recipe__Group__16 ;
    public final void rule__Recipe__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2197:1: ( rule__Recipe__Group__15__Impl rule__Recipe__Group__16 )
            // InternalMyDsl.g:2198:2: rule__Recipe__Group__15__Impl rule__Recipe__Group__16
            {
            pushFollow(FOLLOW_3);
            rule__Recipe__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__15"


    // $ANTLR start "rule__Recipe__Group__15__Impl"
    // InternalMyDsl.g:2205:1: rule__Recipe__Group__15__Impl : ( 'Difficulty' ) ;
    public final void rule__Recipe__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2209:1: ( ( 'Difficulty' ) )
            // InternalMyDsl.g:2210:1: ( 'Difficulty' )
            {
            // InternalMyDsl.g:2210:1: ( 'Difficulty' )
            // InternalMyDsl.g:2211:2: 'Difficulty'
            {
             before(grammarAccess.getRecipeAccess().getDifficultyKeyword_15()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getDifficultyKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__15__Impl"


    // $ANTLR start "rule__Recipe__Group__16"
    // InternalMyDsl.g:2220:1: rule__Recipe__Group__16 : rule__Recipe__Group__16__Impl rule__Recipe__Group__17 ;
    public final void rule__Recipe__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2224:1: ( rule__Recipe__Group__16__Impl rule__Recipe__Group__17 )
            // InternalMyDsl.g:2225:2: rule__Recipe__Group__16__Impl rule__Recipe__Group__17
            {
            pushFollow(FOLLOW_15);
            rule__Recipe__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__16"


    // $ANTLR start "rule__Recipe__Group__16__Impl"
    // InternalMyDsl.g:2232:1: rule__Recipe__Group__16__Impl : ( ':' ) ;
    public final void rule__Recipe__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2236:1: ( ( ':' ) )
            // InternalMyDsl.g:2237:1: ( ':' )
            {
            // InternalMyDsl.g:2237:1: ( ':' )
            // InternalMyDsl.g:2238:2: ':'
            {
             before(grammarAccess.getRecipeAccess().getColonKeyword_16()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getColonKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__16__Impl"


    // $ANTLR start "rule__Recipe__Group__17"
    // InternalMyDsl.g:2247:1: rule__Recipe__Group__17 : rule__Recipe__Group__17__Impl rule__Recipe__Group__18 ;
    public final void rule__Recipe__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2251:1: ( rule__Recipe__Group__17__Impl rule__Recipe__Group__18 )
            // InternalMyDsl.g:2252:2: rule__Recipe__Group__17__Impl rule__Recipe__Group__18
            {
            pushFollow(FOLLOW_16);
            rule__Recipe__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__17"


    // $ANTLR start "rule__Recipe__Group__17__Impl"
    // InternalMyDsl.g:2259:1: rule__Recipe__Group__17__Impl : ( ( rule__Recipe__DifficultyAssignment_17 ) ) ;
    public final void rule__Recipe__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2263:1: ( ( ( rule__Recipe__DifficultyAssignment_17 ) ) )
            // InternalMyDsl.g:2264:1: ( ( rule__Recipe__DifficultyAssignment_17 ) )
            {
            // InternalMyDsl.g:2264:1: ( ( rule__Recipe__DifficultyAssignment_17 ) )
            // InternalMyDsl.g:2265:2: ( rule__Recipe__DifficultyAssignment_17 )
            {
             before(grammarAccess.getRecipeAccess().getDifficultyAssignment_17()); 
            // InternalMyDsl.g:2266:2: ( rule__Recipe__DifficultyAssignment_17 )
            // InternalMyDsl.g:2266:3: rule__Recipe__DifficultyAssignment_17
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__DifficultyAssignment_17();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getDifficultyAssignment_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__17__Impl"


    // $ANTLR start "rule__Recipe__Group__18"
    // InternalMyDsl.g:2274:1: rule__Recipe__Group__18 : rule__Recipe__Group__18__Impl rule__Recipe__Group__19 ;
    public final void rule__Recipe__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2278:1: ( rule__Recipe__Group__18__Impl rule__Recipe__Group__19 )
            // InternalMyDsl.g:2279:2: rule__Recipe__Group__18__Impl rule__Recipe__Group__19
            {
            pushFollow(FOLLOW_24);
            rule__Recipe__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__18"


    // $ANTLR start "rule__Recipe__Group__18__Impl"
    // InternalMyDsl.g:2286:1: rule__Recipe__Group__18__Impl : ( ',' ) ;
    public final void rule__Recipe__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2290:1: ( ( ',' ) )
            // InternalMyDsl.g:2291:1: ( ',' )
            {
            // InternalMyDsl.g:2291:1: ( ',' )
            // InternalMyDsl.g:2292:2: ','
            {
             before(grammarAccess.getRecipeAccess().getCommaKeyword_18()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getCommaKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__18__Impl"


    // $ANTLR start "rule__Recipe__Group__19"
    // InternalMyDsl.g:2301:1: rule__Recipe__Group__19 : rule__Recipe__Group__19__Impl rule__Recipe__Group__20 ;
    public final void rule__Recipe__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2305:1: ( rule__Recipe__Group__19__Impl rule__Recipe__Group__20 )
            // InternalMyDsl.g:2306:2: rule__Recipe__Group__19__Impl rule__Recipe__Group__20
            {
            pushFollow(FOLLOW_24);
            rule__Recipe__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__19"


    // $ANTLR start "rule__Recipe__Group__19__Impl"
    // InternalMyDsl.g:2313:1: rule__Recipe__Group__19__Impl : ( ( rule__Recipe__Group_19__0 )? ) ;
    public final void rule__Recipe__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2317:1: ( ( ( rule__Recipe__Group_19__0 )? ) )
            // InternalMyDsl.g:2318:1: ( ( rule__Recipe__Group_19__0 )? )
            {
            // InternalMyDsl.g:2318:1: ( ( rule__Recipe__Group_19__0 )? )
            // InternalMyDsl.g:2319:2: ( rule__Recipe__Group_19__0 )?
            {
             before(grammarAccess.getRecipeAccess().getGroup_19()); 
            // InternalMyDsl.g:2320:2: ( rule__Recipe__Group_19__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==42) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:2320:3: rule__Recipe__Group_19__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Recipe__Group_19__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRecipeAccess().getGroup_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__19__Impl"


    // $ANTLR start "rule__Recipe__Group__20"
    // InternalMyDsl.g:2328:1: rule__Recipe__Group__20 : rule__Recipe__Group__20__Impl rule__Recipe__Group__21 ;
    public final void rule__Recipe__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2332:1: ( rule__Recipe__Group__20__Impl rule__Recipe__Group__21 )
            // InternalMyDsl.g:2333:2: rule__Recipe__Group__20__Impl rule__Recipe__Group__21
            {
            pushFollow(FOLLOW_24);
            rule__Recipe__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__21();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__20"


    // $ANTLR start "rule__Recipe__Group__20__Impl"
    // InternalMyDsl.g:2340:1: rule__Recipe__Group__20__Impl : ( ( rule__Recipe__Group_20__0 )? ) ;
    public final void rule__Recipe__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2344:1: ( ( ( rule__Recipe__Group_20__0 )? ) )
            // InternalMyDsl.g:2345:1: ( ( rule__Recipe__Group_20__0 )? )
            {
            // InternalMyDsl.g:2345:1: ( ( rule__Recipe__Group_20__0 )? )
            // InternalMyDsl.g:2346:2: ( rule__Recipe__Group_20__0 )?
            {
             before(grammarAccess.getRecipeAccess().getGroup_20()); 
            // InternalMyDsl.g:2347:2: ( rule__Recipe__Group_20__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==43) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:2347:3: rule__Recipe__Group_20__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Recipe__Group_20__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRecipeAccess().getGroup_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__20__Impl"


    // $ANTLR start "rule__Recipe__Group__21"
    // InternalMyDsl.g:2355:1: rule__Recipe__Group__21 : rule__Recipe__Group__21__Impl rule__Recipe__Group__22 ;
    public final void rule__Recipe__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2359:1: ( rule__Recipe__Group__21__Impl rule__Recipe__Group__22 )
            // InternalMyDsl.g:2360:2: rule__Recipe__Group__21__Impl rule__Recipe__Group__22
            {
            pushFollow(FOLLOW_3);
            rule__Recipe__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__22();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__21"


    // $ANTLR start "rule__Recipe__Group__21__Impl"
    // InternalMyDsl.g:2367:1: rule__Recipe__Group__21__Impl : ( 'Ingredients' ) ;
    public final void rule__Recipe__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2371:1: ( ( 'Ingredients' ) )
            // InternalMyDsl.g:2372:1: ( 'Ingredients' )
            {
            // InternalMyDsl.g:2372:1: ( 'Ingredients' )
            // InternalMyDsl.g:2373:2: 'Ingredients'
            {
             before(grammarAccess.getRecipeAccess().getIngredientsKeyword_21()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getIngredientsKeyword_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__21__Impl"


    // $ANTLR start "rule__Recipe__Group__22"
    // InternalMyDsl.g:2382:1: rule__Recipe__Group__22 : rule__Recipe__Group__22__Impl rule__Recipe__Group__23 ;
    public final void rule__Recipe__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2386:1: ( rule__Recipe__Group__22__Impl rule__Recipe__Group__23 )
            // InternalMyDsl.g:2387:2: rule__Recipe__Group__22__Impl rule__Recipe__Group__23
            {
            pushFollow(FOLLOW_12);
            rule__Recipe__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__23();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__22"


    // $ANTLR start "rule__Recipe__Group__22__Impl"
    // InternalMyDsl.g:2394:1: rule__Recipe__Group__22__Impl : ( ':' ) ;
    public final void rule__Recipe__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2398:1: ( ( ':' ) )
            // InternalMyDsl.g:2399:1: ( ':' )
            {
            // InternalMyDsl.g:2399:1: ( ':' )
            // InternalMyDsl.g:2400:2: ':'
            {
             before(grammarAccess.getRecipeAccess().getColonKeyword_22()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getColonKeyword_22()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__22__Impl"


    // $ANTLR start "rule__Recipe__Group__23"
    // InternalMyDsl.g:2409:1: rule__Recipe__Group__23 : rule__Recipe__Group__23__Impl rule__Recipe__Group__24 ;
    public final void rule__Recipe__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2413:1: ( rule__Recipe__Group__23__Impl rule__Recipe__Group__24 )
            // InternalMyDsl.g:2414:2: rule__Recipe__Group__23__Impl rule__Recipe__Group__24
            {
            pushFollow(FOLLOW_25);
            rule__Recipe__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__24();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__23"


    // $ANTLR start "rule__Recipe__Group__23__Impl"
    // InternalMyDsl.g:2421:1: rule__Recipe__Group__23__Impl : ( '[' ) ;
    public final void rule__Recipe__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2425:1: ( ( '[' ) )
            // InternalMyDsl.g:2426:1: ( '[' )
            {
            // InternalMyDsl.g:2426:1: ( '[' )
            // InternalMyDsl.g:2427:2: '['
            {
             before(grammarAccess.getRecipeAccess().getLeftSquareBracketKeyword_23()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getLeftSquareBracketKeyword_23()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__23__Impl"


    // $ANTLR start "rule__Recipe__Group__24"
    // InternalMyDsl.g:2436:1: rule__Recipe__Group__24 : rule__Recipe__Group__24__Impl rule__Recipe__Group__25 ;
    public final void rule__Recipe__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2440:1: ( rule__Recipe__Group__24__Impl rule__Recipe__Group__25 )
            // InternalMyDsl.g:2441:2: rule__Recipe__Group__24__Impl rule__Recipe__Group__25
            {
            pushFollow(FOLLOW_13);
            rule__Recipe__Group__24__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__25();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__24"


    // $ANTLR start "rule__Recipe__Group__24__Impl"
    // InternalMyDsl.g:2448:1: rule__Recipe__Group__24__Impl : ( ( rule__Recipe__IngredientAssignment_24 ) ) ;
    public final void rule__Recipe__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2452:1: ( ( ( rule__Recipe__IngredientAssignment_24 ) ) )
            // InternalMyDsl.g:2453:1: ( ( rule__Recipe__IngredientAssignment_24 ) )
            {
            // InternalMyDsl.g:2453:1: ( ( rule__Recipe__IngredientAssignment_24 ) )
            // InternalMyDsl.g:2454:2: ( rule__Recipe__IngredientAssignment_24 )
            {
             before(grammarAccess.getRecipeAccess().getIngredientAssignment_24()); 
            // InternalMyDsl.g:2455:2: ( rule__Recipe__IngredientAssignment_24 )
            // InternalMyDsl.g:2455:3: rule__Recipe__IngredientAssignment_24
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__IngredientAssignment_24();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getIngredientAssignment_24()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__24__Impl"


    // $ANTLR start "rule__Recipe__Group__25"
    // InternalMyDsl.g:2463:1: rule__Recipe__Group__25 : rule__Recipe__Group__25__Impl rule__Recipe__Group__26 ;
    public final void rule__Recipe__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2467:1: ( rule__Recipe__Group__25__Impl rule__Recipe__Group__26 )
            // InternalMyDsl.g:2468:2: rule__Recipe__Group__25__Impl rule__Recipe__Group__26
            {
            pushFollow(FOLLOW_13);
            rule__Recipe__Group__25__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__26();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__25"


    // $ANTLR start "rule__Recipe__Group__25__Impl"
    // InternalMyDsl.g:2475:1: rule__Recipe__Group__25__Impl : ( ( rule__Recipe__Group_25__0 )* ) ;
    public final void rule__Recipe__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2479:1: ( ( ( rule__Recipe__Group_25__0 )* ) )
            // InternalMyDsl.g:2480:1: ( ( rule__Recipe__Group_25__0 )* )
            {
            // InternalMyDsl.g:2480:1: ( ( rule__Recipe__Group_25__0 )* )
            // InternalMyDsl.g:2481:2: ( rule__Recipe__Group_25__0 )*
            {
             before(grammarAccess.getRecipeAccess().getGroup_25()); 
            // InternalMyDsl.g:2482:2: ( rule__Recipe__Group_25__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==30) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:2482:3: rule__Recipe__Group_25__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Recipe__Group_25__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getRecipeAccess().getGroup_25()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__25__Impl"


    // $ANTLR start "rule__Recipe__Group__26"
    // InternalMyDsl.g:2490:1: rule__Recipe__Group__26 : rule__Recipe__Group__26__Impl rule__Recipe__Group__27 ;
    public final void rule__Recipe__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2494:1: ( rule__Recipe__Group__26__Impl rule__Recipe__Group__27 )
            // InternalMyDsl.g:2495:2: rule__Recipe__Group__26__Impl rule__Recipe__Group__27
            {
            pushFollow(FOLLOW_7);
            rule__Recipe__Group__26__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__27();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__26"


    // $ANTLR start "rule__Recipe__Group__26__Impl"
    // InternalMyDsl.g:2502:1: rule__Recipe__Group__26__Impl : ( ']' ) ;
    public final void rule__Recipe__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2506:1: ( ( ']' ) )
            // InternalMyDsl.g:2507:1: ( ']' )
            {
            // InternalMyDsl.g:2507:1: ( ']' )
            // InternalMyDsl.g:2508:2: ']'
            {
             before(grammarAccess.getRecipeAccess().getRightSquareBracketKeyword_26()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getRightSquareBracketKeyword_26()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__26__Impl"


    // $ANTLR start "rule__Recipe__Group__27"
    // InternalMyDsl.g:2517:1: rule__Recipe__Group__27 : rule__Recipe__Group__27__Impl rule__Recipe__Group__28 ;
    public final void rule__Recipe__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2521:1: ( rule__Recipe__Group__27__Impl rule__Recipe__Group__28 )
            // InternalMyDsl.g:2522:2: rule__Recipe__Group__27__Impl rule__Recipe__Group__28
            {
            pushFollow(FOLLOW_7);
            rule__Recipe__Group__27__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__28();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__27"


    // $ANTLR start "rule__Recipe__Group__27__Impl"
    // InternalMyDsl.g:2529:1: rule__Recipe__Group__27__Impl : ( ( rule__Recipe__Group_27__0 )? ) ;
    public final void rule__Recipe__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2533:1: ( ( ( rule__Recipe__Group_27__0 )? ) )
            // InternalMyDsl.g:2534:1: ( ( rule__Recipe__Group_27__0 )? )
            {
            // InternalMyDsl.g:2534:1: ( ( rule__Recipe__Group_27__0 )? )
            // InternalMyDsl.g:2535:2: ( rule__Recipe__Group_27__0 )?
            {
             before(grammarAccess.getRecipeAccess().getGroup_27()); 
            // InternalMyDsl.g:2536:2: ( rule__Recipe__Group_27__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:2536:3: rule__Recipe__Group_27__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Recipe__Group_27__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRecipeAccess().getGroup_27()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__27__Impl"


    // $ANTLR start "rule__Recipe__Group__28"
    // InternalMyDsl.g:2544:1: rule__Recipe__Group__28 : rule__Recipe__Group__28__Impl ;
    public final void rule__Recipe__Group__28() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2548:1: ( rule__Recipe__Group__28__Impl )
            // InternalMyDsl.g:2549:2: rule__Recipe__Group__28__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__Group__28__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__28"


    // $ANTLR start "rule__Recipe__Group__28__Impl"
    // InternalMyDsl.g:2555:1: rule__Recipe__Group__28__Impl : ( '}' ) ;
    public final void rule__Recipe__Group__28__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2559:1: ( ( '}' ) )
            // InternalMyDsl.g:2560:1: ( '}' )
            {
            // InternalMyDsl.g:2560:1: ( '}' )
            // InternalMyDsl.g:2561:2: '}'
            {
             before(grammarAccess.getRecipeAccess().getRightCurlyBracketKeyword_28()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getRightCurlyBracketKeyword_28()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__28__Impl"


    // $ANTLR start "rule__Recipe__Group_19__0"
    // InternalMyDsl.g:2571:1: rule__Recipe__Group_19__0 : rule__Recipe__Group_19__0__Impl rule__Recipe__Group_19__1 ;
    public final void rule__Recipe__Group_19__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2575:1: ( rule__Recipe__Group_19__0__Impl rule__Recipe__Group_19__1 )
            // InternalMyDsl.g:2576:2: rule__Recipe__Group_19__0__Impl rule__Recipe__Group_19__1
            {
            pushFollow(FOLLOW_3);
            rule__Recipe__Group_19__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group_19__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_19__0"


    // $ANTLR start "rule__Recipe__Group_19__0__Impl"
    // InternalMyDsl.g:2583:1: rule__Recipe__Group_19__0__Impl : ( 'KitchenUtensils' ) ;
    public final void rule__Recipe__Group_19__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2587:1: ( ( 'KitchenUtensils' ) )
            // InternalMyDsl.g:2588:1: ( 'KitchenUtensils' )
            {
            // InternalMyDsl.g:2588:1: ( 'KitchenUtensils' )
            // InternalMyDsl.g:2589:2: 'KitchenUtensils'
            {
             before(grammarAccess.getRecipeAccess().getKitchenUtensilsKeyword_19_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getKitchenUtensilsKeyword_19_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_19__0__Impl"


    // $ANTLR start "rule__Recipe__Group_19__1"
    // InternalMyDsl.g:2598:1: rule__Recipe__Group_19__1 : rule__Recipe__Group_19__1__Impl rule__Recipe__Group_19__2 ;
    public final void rule__Recipe__Group_19__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2602:1: ( rule__Recipe__Group_19__1__Impl rule__Recipe__Group_19__2 )
            // InternalMyDsl.g:2603:2: rule__Recipe__Group_19__1__Impl rule__Recipe__Group_19__2
            {
            pushFollow(FOLLOW_12);
            rule__Recipe__Group_19__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group_19__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_19__1"


    // $ANTLR start "rule__Recipe__Group_19__1__Impl"
    // InternalMyDsl.g:2610:1: rule__Recipe__Group_19__1__Impl : ( ':' ) ;
    public final void rule__Recipe__Group_19__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2614:1: ( ( ':' ) )
            // InternalMyDsl.g:2615:1: ( ':' )
            {
            // InternalMyDsl.g:2615:1: ( ':' )
            // InternalMyDsl.g:2616:2: ':'
            {
             before(grammarAccess.getRecipeAccess().getColonKeyword_19_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getColonKeyword_19_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_19__1__Impl"


    // $ANTLR start "rule__Recipe__Group_19__2"
    // InternalMyDsl.g:2625:1: rule__Recipe__Group_19__2 : rule__Recipe__Group_19__2__Impl rule__Recipe__Group_19__3 ;
    public final void rule__Recipe__Group_19__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2629:1: ( rule__Recipe__Group_19__2__Impl rule__Recipe__Group_19__3 )
            // InternalMyDsl.g:2630:2: rule__Recipe__Group_19__2__Impl rule__Recipe__Group_19__3
            {
            pushFollow(FOLLOW_26);
            rule__Recipe__Group_19__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group_19__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_19__2"


    // $ANTLR start "rule__Recipe__Group_19__2__Impl"
    // InternalMyDsl.g:2637:1: rule__Recipe__Group_19__2__Impl : ( '[' ) ;
    public final void rule__Recipe__Group_19__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2641:1: ( ( '[' ) )
            // InternalMyDsl.g:2642:1: ( '[' )
            {
            // InternalMyDsl.g:2642:1: ( '[' )
            // InternalMyDsl.g:2643:2: '['
            {
             before(grammarAccess.getRecipeAccess().getLeftSquareBracketKeyword_19_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getLeftSquareBracketKeyword_19_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_19__2__Impl"


    // $ANTLR start "rule__Recipe__Group_19__3"
    // InternalMyDsl.g:2652:1: rule__Recipe__Group_19__3 : rule__Recipe__Group_19__3__Impl rule__Recipe__Group_19__4 ;
    public final void rule__Recipe__Group_19__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2656:1: ( rule__Recipe__Group_19__3__Impl rule__Recipe__Group_19__4 )
            // InternalMyDsl.g:2657:2: rule__Recipe__Group_19__3__Impl rule__Recipe__Group_19__4
            {
            pushFollow(FOLLOW_13);
            rule__Recipe__Group_19__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group_19__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_19__3"


    // $ANTLR start "rule__Recipe__Group_19__3__Impl"
    // InternalMyDsl.g:2664:1: rule__Recipe__Group_19__3__Impl : ( ( rule__Recipe__KitchenUtensilsAssignment_19_3 ) ) ;
    public final void rule__Recipe__Group_19__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2668:1: ( ( ( rule__Recipe__KitchenUtensilsAssignment_19_3 ) ) )
            // InternalMyDsl.g:2669:1: ( ( rule__Recipe__KitchenUtensilsAssignment_19_3 ) )
            {
            // InternalMyDsl.g:2669:1: ( ( rule__Recipe__KitchenUtensilsAssignment_19_3 ) )
            // InternalMyDsl.g:2670:2: ( rule__Recipe__KitchenUtensilsAssignment_19_3 )
            {
             before(grammarAccess.getRecipeAccess().getKitchenUtensilsAssignment_19_3()); 
            // InternalMyDsl.g:2671:2: ( rule__Recipe__KitchenUtensilsAssignment_19_3 )
            // InternalMyDsl.g:2671:3: rule__Recipe__KitchenUtensilsAssignment_19_3
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__KitchenUtensilsAssignment_19_3();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getKitchenUtensilsAssignment_19_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_19__3__Impl"


    // $ANTLR start "rule__Recipe__Group_19__4"
    // InternalMyDsl.g:2679:1: rule__Recipe__Group_19__4 : rule__Recipe__Group_19__4__Impl rule__Recipe__Group_19__5 ;
    public final void rule__Recipe__Group_19__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2683:1: ( rule__Recipe__Group_19__4__Impl rule__Recipe__Group_19__5 )
            // InternalMyDsl.g:2684:2: rule__Recipe__Group_19__4__Impl rule__Recipe__Group_19__5
            {
            pushFollow(FOLLOW_13);
            rule__Recipe__Group_19__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group_19__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_19__4"


    // $ANTLR start "rule__Recipe__Group_19__4__Impl"
    // InternalMyDsl.g:2691:1: rule__Recipe__Group_19__4__Impl : ( ( rule__Recipe__Group_19_4__0 )* ) ;
    public final void rule__Recipe__Group_19__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2695:1: ( ( ( rule__Recipe__Group_19_4__0 )* ) )
            // InternalMyDsl.g:2696:1: ( ( rule__Recipe__Group_19_4__0 )* )
            {
            // InternalMyDsl.g:2696:1: ( ( rule__Recipe__Group_19_4__0 )* )
            // InternalMyDsl.g:2697:2: ( rule__Recipe__Group_19_4__0 )*
            {
             before(grammarAccess.getRecipeAccess().getGroup_19_4()); 
            // InternalMyDsl.g:2698:2: ( rule__Recipe__Group_19_4__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==30) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:2698:3: rule__Recipe__Group_19_4__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Recipe__Group_19_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getRecipeAccess().getGroup_19_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_19__4__Impl"


    // $ANTLR start "rule__Recipe__Group_19__5"
    // InternalMyDsl.g:2706:1: rule__Recipe__Group_19__5 : rule__Recipe__Group_19__5__Impl rule__Recipe__Group_19__6 ;
    public final void rule__Recipe__Group_19__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2710:1: ( rule__Recipe__Group_19__5__Impl rule__Recipe__Group_19__6 )
            // InternalMyDsl.g:2711:2: rule__Recipe__Group_19__5__Impl rule__Recipe__Group_19__6
            {
            pushFollow(FOLLOW_16);
            rule__Recipe__Group_19__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group_19__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_19__5"


    // $ANTLR start "rule__Recipe__Group_19__5__Impl"
    // InternalMyDsl.g:2718:1: rule__Recipe__Group_19__5__Impl : ( ']' ) ;
    public final void rule__Recipe__Group_19__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2722:1: ( ( ']' ) )
            // InternalMyDsl.g:2723:1: ( ']' )
            {
            // InternalMyDsl.g:2723:1: ( ']' )
            // InternalMyDsl.g:2724:2: ']'
            {
             before(grammarAccess.getRecipeAccess().getRightSquareBracketKeyword_19_5()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getRightSquareBracketKeyword_19_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_19__5__Impl"


    // $ANTLR start "rule__Recipe__Group_19__6"
    // InternalMyDsl.g:2733:1: rule__Recipe__Group_19__6 : rule__Recipe__Group_19__6__Impl ;
    public final void rule__Recipe__Group_19__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2737:1: ( rule__Recipe__Group_19__6__Impl )
            // InternalMyDsl.g:2738:2: rule__Recipe__Group_19__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__Group_19__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_19__6"


    // $ANTLR start "rule__Recipe__Group_19__6__Impl"
    // InternalMyDsl.g:2744:1: rule__Recipe__Group_19__6__Impl : ( ',' ) ;
    public final void rule__Recipe__Group_19__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2748:1: ( ( ',' ) )
            // InternalMyDsl.g:2749:1: ( ',' )
            {
            // InternalMyDsl.g:2749:1: ( ',' )
            // InternalMyDsl.g:2750:2: ','
            {
             before(grammarAccess.getRecipeAccess().getCommaKeyword_19_6()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getCommaKeyword_19_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_19__6__Impl"


    // $ANTLR start "rule__Recipe__Group_19_4__0"
    // InternalMyDsl.g:2760:1: rule__Recipe__Group_19_4__0 : rule__Recipe__Group_19_4__0__Impl rule__Recipe__Group_19_4__1 ;
    public final void rule__Recipe__Group_19_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2764:1: ( rule__Recipe__Group_19_4__0__Impl rule__Recipe__Group_19_4__1 )
            // InternalMyDsl.g:2765:2: rule__Recipe__Group_19_4__0__Impl rule__Recipe__Group_19_4__1
            {
            pushFollow(FOLLOW_26);
            rule__Recipe__Group_19_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group_19_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_19_4__0"


    // $ANTLR start "rule__Recipe__Group_19_4__0__Impl"
    // InternalMyDsl.g:2772:1: rule__Recipe__Group_19_4__0__Impl : ( ',' ) ;
    public final void rule__Recipe__Group_19_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2776:1: ( ( ',' ) )
            // InternalMyDsl.g:2777:1: ( ',' )
            {
            // InternalMyDsl.g:2777:1: ( ',' )
            // InternalMyDsl.g:2778:2: ','
            {
             before(grammarAccess.getRecipeAccess().getCommaKeyword_19_4_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getCommaKeyword_19_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_19_4__0__Impl"


    // $ANTLR start "rule__Recipe__Group_19_4__1"
    // InternalMyDsl.g:2787:1: rule__Recipe__Group_19_4__1 : rule__Recipe__Group_19_4__1__Impl ;
    public final void rule__Recipe__Group_19_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2791:1: ( rule__Recipe__Group_19_4__1__Impl )
            // InternalMyDsl.g:2792:2: rule__Recipe__Group_19_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__Group_19_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_19_4__1"


    // $ANTLR start "rule__Recipe__Group_19_4__1__Impl"
    // InternalMyDsl.g:2798:1: rule__Recipe__Group_19_4__1__Impl : ( ( rule__Recipe__KitchenUtensilsAssignment_19_4_1 ) ) ;
    public final void rule__Recipe__Group_19_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2802:1: ( ( ( rule__Recipe__KitchenUtensilsAssignment_19_4_1 ) ) )
            // InternalMyDsl.g:2803:1: ( ( rule__Recipe__KitchenUtensilsAssignment_19_4_1 ) )
            {
            // InternalMyDsl.g:2803:1: ( ( rule__Recipe__KitchenUtensilsAssignment_19_4_1 ) )
            // InternalMyDsl.g:2804:2: ( rule__Recipe__KitchenUtensilsAssignment_19_4_1 )
            {
             before(grammarAccess.getRecipeAccess().getKitchenUtensilsAssignment_19_4_1()); 
            // InternalMyDsl.g:2805:2: ( rule__Recipe__KitchenUtensilsAssignment_19_4_1 )
            // InternalMyDsl.g:2805:3: rule__Recipe__KitchenUtensilsAssignment_19_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__KitchenUtensilsAssignment_19_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getKitchenUtensilsAssignment_19_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_19_4__1__Impl"


    // $ANTLR start "rule__Recipe__Group_20__0"
    // InternalMyDsl.g:2814:1: rule__Recipe__Group_20__0 : rule__Recipe__Group_20__0__Impl rule__Recipe__Group_20__1 ;
    public final void rule__Recipe__Group_20__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2818:1: ( rule__Recipe__Group_20__0__Impl rule__Recipe__Group_20__1 )
            // InternalMyDsl.g:2819:2: rule__Recipe__Group_20__0__Impl rule__Recipe__Group_20__1
            {
            pushFollow(FOLLOW_3);
            rule__Recipe__Group_20__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group_20__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_20__0"


    // $ANTLR start "rule__Recipe__Group_20__0__Impl"
    // InternalMyDsl.g:2826:1: rule__Recipe__Group_20__0__Impl : ( 'foodCategory' ) ;
    public final void rule__Recipe__Group_20__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2830:1: ( ( 'foodCategory' ) )
            // InternalMyDsl.g:2831:1: ( 'foodCategory' )
            {
            // InternalMyDsl.g:2831:1: ( 'foodCategory' )
            // InternalMyDsl.g:2832:2: 'foodCategory'
            {
             before(grammarAccess.getRecipeAccess().getFoodCategoryKeyword_20_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getFoodCategoryKeyword_20_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_20__0__Impl"


    // $ANTLR start "rule__Recipe__Group_20__1"
    // InternalMyDsl.g:2841:1: rule__Recipe__Group_20__1 : rule__Recipe__Group_20__1__Impl rule__Recipe__Group_20__2 ;
    public final void rule__Recipe__Group_20__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2845:1: ( rule__Recipe__Group_20__1__Impl rule__Recipe__Group_20__2 )
            // InternalMyDsl.g:2846:2: rule__Recipe__Group_20__1__Impl rule__Recipe__Group_20__2
            {
            pushFollow(FOLLOW_12);
            rule__Recipe__Group_20__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group_20__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_20__1"


    // $ANTLR start "rule__Recipe__Group_20__1__Impl"
    // InternalMyDsl.g:2853:1: rule__Recipe__Group_20__1__Impl : ( ':' ) ;
    public final void rule__Recipe__Group_20__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2857:1: ( ( ':' ) )
            // InternalMyDsl.g:2858:1: ( ':' )
            {
            // InternalMyDsl.g:2858:1: ( ':' )
            // InternalMyDsl.g:2859:2: ':'
            {
             before(grammarAccess.getRecipeAccess().getColonKeyword_20_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getColonKeyword_20_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_20__1__Impl"


    // $ANTLR start "rule__Recipe__Group_20__2"
    // InternalMyDsl.g:2868:1: rule__Recipe__Group_20__2 : rule__Recipe__Group_20__2__Impl rule__Recipe__Group_20__3 ;
    public final void rule__Recipe__Group_20__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2872:1: ( rule__Recipe__Group_20__2__Impl rule__Recipe__Group_20__3 )
            // InternalMyDsl.g:2873:2: rule__Recipe__Group_20__2__Impl rule__Recipe__Group_20__3
            {
            pushFollow(FOLLOW_10);
            rule__Recipe__Group_20__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group_20__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_20__2"


    // $ANTLR start "rule__Recipe__Group_20__2__Impl"
    // InternalMyDsl.g:2880:1: rule__Recipe__Group_20__2__Impl : ( '[' ) ;
    public final void rule__Recipe__Group_20__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2884:1: ( ( '[' ) )
            // InternalMyDsl.g:2885:1: ( '[' )
            {
            // InternalMyDsl.g:2885:1: ( '[' )
            // InternalMyDsl.g:2886:2: '['
            {
             before(grammarAccess.getRecipeAccess().getLeftSquareBracketKeyword_20_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getLeftSquareBracketKeyword_20_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_20__2__Impl"


    // $ANTLR start "rule__Recipe__Group_20__3"
    // InternalMyDsl.g:2895:1: rule__Recipe__Group_20__3 : rule__Recipe__Group_20__3__Impl rule__Recipe__Group_20__4 ;
    public final void rule__Recipe__Group_20__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2899:1: ( rule__Recipe__Group_20__3__Impl rule__Recipe__Group_20__4 )
            // InternalMyDsl.g:2900:2: rule__Recipe__Group_20__3__Impl rule__Recipe__Group_20__4
            {
            pushFollow(FOLLOW_13);
            rule__Recipe__Group_20__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group_20__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_20__3"


    // $ANTLR start "rule__Recipe__Group_20__3__Impl"
    // InternalMyDsl.g:2907:1: rule__Recipe__Group_20__3__Impl : ( ( rule__Recipe__FoodCategoryAssignment_20_3 ) ) ;
    public final void rule__Recipe__Group_20__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2911:1: ( ( ( rule__Recipe__FoodCategoryAssignment_20_3 ) ) )
            // InternalMyDsl.g:2912:1: ( ( rule__Recipe__FoodCategoryAssignment_20_3 ) )
            {
            // InternalMyDsl.g:2912:1: ( ( rule__Recipe__FoodCategoryAssignment_20_3 ) )
            // InternalMyDsl.g:2913:2: ( rule__Recipe__FoodCategoryAssignment_20_3 )
            {
             before(grammarAccess.getRecipeAccess().getFoodCategoryAssignment_20_3()); 
            // InternalMyDsl.g:2914:2: ( rule__Recipe__FoodCategoryAssignment_20_3 )
            // InternalMyDsl.g:2914:3: rule__Recipe__FoodCategoryAssignment_20_3
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__FoodCategoryAssignment_20_3();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getFoodCategoryAssignment_20_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_20__3__Impl"


    // $ANTLR start "rule__Recipe__Group_20__4"
    // InternalMyDsl.g:2922:1: rule__Recipe__Group_20__4 : rule__Recipe__Group_20__4__Impl rule__Recipe__Group_20__5 ;
    public final void rule__Recipe__Group_20__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2926:1: ( rule__Recipe__Group_20__4__Impl rule__Recipe__Group_20__5 )
            // InternalMyDsl.g:2927:2: rule__Recipe__Group_20__4__Impl rule__Recipe__Group_20__5
            {
            pushFollow(FOLLOW_13);
            rule__Recipe__Group_20__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group_20__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_20__4"


    // $ANTLR start "rule__Recipe__Group_20__4__Impl"
    // InternalMyDsl.g:2934:1: rule__Recipe__Group_20__4__Impl : ( ( rule__Recipe__Group_20_4__0 )* ) ;
    public final void rule__Recipe__Group_20__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2938:1: ( ( ( rule__Recipe__Group_20_4__0 )* ) )
            // InternalMyDsl.g:2939:1: ( ( rule__Recipe__Group_20_4__0 )* )
            {
            // InternalMyDsl.g:2939:1: ( ( rule__Recipe__Group_20_4__0 )* )
            // InternalMyDsl.g:2940:2: ( rule__Recipe__Group_20_4__0 )*
            {
             before(grammarAccess.getRecipeAccess().getGroup_20_4()); 
            // InternalMyDsl.g:2941:2: ( rule__Recipe__Group_20_4__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==30) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:2941:3: rule__Recipe__Group_20_4__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Recipe__Group_20_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getRecipeAccess().getGroup_20_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_20__4__Impl"


    // $ANTLR start "rule__Recipe__Group_20__5"
    // InternalMyDsl.g:2949:1: rule__Recipe__Group_20__5 : rule__Recipe__Group_20__5__Impl rule__Recipe__Group_20__6 ;
    public final void rule__Recipe__Group_20__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2953:1: ( rule__Recipe__Group_20__5__Impl rule__Recipe__Group_20__6 )
            // InternalMyDsl.g:2954:2: rule__Recipe__Group_20__5__Impl rule__Recipe__Group_20__6
            {
            pushFollow(FOLLOW_16);
            rule__Recipe__Group_20__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group_20__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_20__5"


    // $ANTLR start "rule__Recipe__Group_20__5__Impl"
    // InternalMyDsl.g:2961:1: rule__Recipe__Group_20__5__Impl : ( ']' ) ;
    public final void rule__Recipe__Group_20__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2965:1: ( ( ']' ) )
            // InternalMyDsl.g:2966:1: ( ']' )
            {
            // InternalMyDsl.g:2966:1: ( ']' )
            // InternalMyDsl.g:2967:2: ']'
            {
             before(grammarAccess.getRecipeAccess().getRightSquareBracketKeyword_20_5()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getRightSquareBracketKeyword_20_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_20__5__Impl"


    // $ANTLR start "rule__Recipe__Group_20__6"
    // InternalMyDsl.g:2976:1: rule__Recipe__Group_20__6 : rule__Recipe__Group_20__6__Impl ;
    public final void rule__Recipe__Group_20__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2980:1: ( rule__Recipe__Group_20__6__Impl )
            // InternalMyDsl.g:2981:2: rule__Recipe__Group_20__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__Group_20__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_20__6"


    // $ANTLR start "rule__Recipe__Group_20__6__Impl"
    // InternalMyDsl.g:2987:1: rule__Recipe__Group_20__6__Impl : ( ',' ) ;
    public final void rule__Recipe__Group_20__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2991:1: ( ( ',' ) )
            // InternalMyDsl.g:2992:1: ( ',' )
            {
            // InternalMyDsl.g:2992:1: ( ',' )
            // InternalMyDsl.g:2993:2: ','
            {
             before(grammarAccess.getRecipeAccess().getCommaKeyword_20_6()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getCommaKeyword_20_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_20__6__Impl"


    // $ANTLR start "rule__Recipe__Group_20_4__0"
    // InternalMyDsl.g:3003:1: rule__Recipe__Group_20_4__0 : rule__Recipe__Group_20_4__0__Impl rule__Recipe__Group_20_4__1 ;
    public final void rule__Recipe__Group_20_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3007:1: ( rule__Recipe__Group_20_4__0__Impl rule__Recipe__Group_20_4__1 )
            // InternalMyDsl.g:3008:2: rule__Recipe__Group_20_4__0__Impl rule__Recipe__Group_20_4__1
            {
            pushFollow(FOLLOW_10);
            rule__Recipe__Group_20_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group_20_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_20_4__0"


    // $ANTLR start "rule__Recipe__Group_20_4__0__Impl"
    // InternalMyDsl.g:3015:1: rule__Recipe__Group_20_4__0__Impl : ( ',' ) ;
    public final void rule__Recipe__Group_20_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3019:1: ( ( ',' ) )
            // InternalMyDsl.g:3020:1: ( ',' )
            {
            // InternalMyDsl.g:3020:1: ( ',' )
            // InternalMyDsl.g:3021:2: ','
            {
             before(grammarAccess.getRecipeAccess().getCommaKeyword_20_4_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getCommaKeyword_20_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_20_4__0__Impl"


    // $ANTLR start "rule__Recipe__Group_20_4__1"
    // InternalMyDsl.g:3030:1: rule__Recipe__Group_20_4__1 : rule__Recipe__Group_20_4__1__Impl ;
    public final void rule__Recipe__Group_20_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3034:1: ( rule__Recipe__Group_20_4__1__Impl )
            // InternalMyDsl.g:3035:2: rule__Recipe__Group_20_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__Group_20_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_20_4__1"


    // $ANTLR start "rule__Recipe__Group_20_4__1__Impl"
    // InternalMyDsl.g:3041:1: rule__Recipe__Group_20_4__1__Impl : ( ( rule__Recipe__FoodCategoryAssignment_20_4_1 ) ) ;
    public final void rule__Recipe__Group_20_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3045:1: ( ( ( rule__Recipe__FoodCategoryAssignment_20_4_1 ) ) )
            // InternalMyDsl.g:3046:1: ( ( rule__Recipe__FoodCategoryAssignment_20_4_1 ) )
            {
            // InternalMyDsl.g:3046:1: ( ( rule__Recipe__FoodCategoryAssignment_20_4_1 ) )
            // InternalMyDsl.g:3047:2: ( rule__Recipe__FoodCategoryAssignment_20_4_1 )
            {
             before(grammarAccess.getRecipeAccess().getFoodCategoryAssignment_20_4_1()); 
            // InternalMyDsl.g:3048:2: ( rule__Recipe__FoodCategoryAssignment_20_4_1 )
            // InternalMyDsl.g:3048:3: rule__Recipe__FoodCategoryAssignment_20_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__FoodCategoryAssignment_20_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getFoodCategoryAssignment_20_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_20_4__1__Impl"


    // $ANTLR start "rule__Recipe__Group_25__0"
    // InternalMyDsl.g:3057:1: rule__Recipe__Group_25__0 : rule__Recipe__Group_25__0__Impl rule__Recipe__Group_25__1 ;
    public final void rule__Recipe__Group_25__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3061:1: ( rule__Recipe__Group_25__0__Impl rule__Recipe__Group_25__1 )
            // InternalMyDsl.g:3062:2: rule__Recipe__Group_25__0__Impl rule__Recipe__Group_25__1
            {
            pushFollow(FOLLOW_25);
            rule__Recipe__Group_25__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group_25__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_25__0"


    // $ANTLR start "rule__Recipe__Group_25__0__Impl"
    // InternalMyDsl.g:3069:1: rule__Recipe__Group_25__0__Impl : ( ',' ) ;
    public final void rule__Recipe__Group_25__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3073:1: ( ( ',' ) )
            // InternalMyDsl.g:3074:1: ( ',' )
            {
            // InternalMyDsl.g:3074:1: ( ',' )
            // InternalMyDsl.g:3075:2: ','
            {
             before(grammarAccess.getRecipeAccess().getCommaKeyword_25_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getCommaKeyword_25_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_25__0__Impl"


    // $ANTLR start "rule__Recipe__Group_25__1"
    // InternalMyDsl.g:3084:1: rule__Recipe__Group_25__1 : rule__Recipe__Group_25__1__Impl ;
    public final void rule__Recipe__Group_25__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3088:1: ( rule__Recipe__Group_25__1__Impl )
            // InternalMyDsl.g:3089:2: rule__Recipe__Group_25__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__Group_25__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_25__1"


    // $ANTLR start "rule__Recipe__Group_25__1__Impl"
    // InternalMyDsl.g:3095:1: rule__Recipe__Group_25__1__Impl : ( ( rule__Recipe__IngredientAssignment_25_1 ) ) ;
    public final void rule__Recipe__Group_25__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3099:1: ( ( ( rule__Recipe__IngredientAssignment_25_1 ) ) )
            // InternalMyDsl.g:3100:1: ( ( rule__Recipe__IngredientAssignment_25_1 ) )
            {
            // InternalMyDsl.g:3100:1: ( ( rule__Recipe__IngredientAssignment_25_1 ) )
            // InternalMyDsl.g:3101:2: ( rule__Recipe__IngredientAssignment_25_1 )
            {
             before(grammarAccess.getRecipeAccess().getIngredientAssignment_25_1()); 
            // InternalMyDsl.g:3102:2: ( rule__Recipe__IngredientAssignment_25_1 )
            // InternalMyDsl.g:3102:3: rule__Recipe__IngredientAssignment_25_1
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__IngredientAssignment_25_1();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getIngredientAssignment_25_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_25__1__Impl"


    // $ANTLR start "rule__Recipe__Group_27__0"
    // InternalMyDsl.g:3111:1: rule__Recipe__Group_27__0 : rule__Recipe__Group_27__0__Impl rule__Recipe__Group_27__1 ;
    public final void rule__Recipe__Group_27__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3115:1: ( rule__Recipe__Group_27__0__Impl rule__Recipe__Group_27__1 )
            // InternalMyDsl.g:3116:2: rule__Recipe__Group_27__0__Impl rule__Recipe__Group_27__1
            {
            pushFollow(FOLLOW_27);
            rule__Recipe__Group_27__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group_27__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_27__0"


    // $ANTLR start "rule__Recipe__Group_27__0__Impl"
    // InternalMyDsl.g:3123:1: rule__Recipe__Group_27__0__Impl : ( ',' ) ;
    public final void rule__Recipe__Group_27__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3127:1: ( ( ',' ) )
            // InternalMyDsl.g:3128:1: ( ',' )
            {
            // InternalMyDsl.g:3128:1: ( ',' )
            // InternalMyDsl.g:3129:2: ','
            {
             before(grammarAccess.getRecipeAccess().getCommaKeyword_27_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getCommaKeyword_27_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_27__0__Impl"


    // $ANTLR start "rule__Recipe__Group_27__1"
    // InternalMyDsl.g:3138:1: rule__Recipe__Group_27__1 : rule__Recipe__Group_27__1__Impl rule__Recipe__Group_27__2 ;
    public final void rule__Recipe__Group_27__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3142:1: ( rule__Recipe__Group_27__1__Impl rule__Recipe__Group_27__2 )
            // InternalMyDsl.g:3143:2: rule__Recipe__Group_27__1__Impl rule__Recipe__Group_27__2
            {
            pushFollow(FOLLOW_3);
            rule__Recipe__Group_27__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group_27__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_27__1"


    // $ANTLR start "rule__Recipe__Group_27__1__Impl"
    // InternalMyDsl.g:3150:1: rule__Recipe__Group_27__1__Impl : ( 'Ratings' ) ;
    public final void rule__Recipe__Group_27__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3154:1: ( ( 'Ratings' ) )
            // InternalMyDsl.g:3155:1: ( 'Ratings' )
            {
            // InternalMyDsl.g:3155:1: ( 'Ratings' )
            // InternalMyDsl.g:3156:2: 'Ratings'
            {
             before(grammarAccess.getRecipeAccess().getRatingsKeyword_27_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getRatingsKeyword_27_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_27__1__Impl"


    // $ANTLR start "rule__Recipe__Group_27__2"
    // InternalMyDsl.g:3165:1: rule__Recipe__Group_27__2 : rule__Recipe__Group_27__2__Impl rule__Recipe__Group_27__3 ;
    public final void rule__Recipe__Group_27__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3169:1: ( rule__Recipe__Group_27__2__Impl rule__Recipe__Group_27__3 )
            // InternalMyDsl.g:3170:2: rule__Recipe__Group_27__2__Impl rule__Recipe__Group_27__3
            {
            pushFollow(FOLLOW_12);
            rule__Recipe__Group_27__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group_27__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_27__2"


    // $ANTLR start "rule__Recipe__Group_27__2__Impl"
    // InternalMyDsl.g:3177:1: rule__Recipe__Group_27__2__Impl : ( ':' ) ;
    public final void rule__Recipe__Group_27__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3181:1: ( ( ':' ) )
            // InternalMyDsl.g:3182:1: ( ':' )
            {
            // InternalMyDsl.g:3182:1: ( ':' )
            // InternalMyDsl.g:3183:2: ':'
            {
             before(grammarAccess.getRecipeAccess().getColonKeyword_27_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getColonKeyword_27_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_27__2__Impl"


    // $ANTLR start "rule__Recipe__Group_27__3"
    // InternalMyDsl.g:3192:1: rule__Recipe__Group_27__3 : rule__Recipe__Group_27__3__Impl rule__Recipe__Group_27__4 ;
    public final void rule__Recipe__Group_27__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3196:1: ( rule__Recipe__Group_27__3__Impl rule__Recipe__Group_27__4 )
            // InternalMyDsl.g:3197:2: rule__Recipe__Group_27__3__Impl rule__Recipe__Group_27__4
            {
            pushFollow(FOLLOW_4);
            rule__Recipe__Group_27__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group_27__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_27__3"


    // $ANTLR start "rule__Recipe__Group_27__3__Impl"
    // InternalMyDsl.g:3204:1: rule__Recipe__Group_27__3__Impl : ( '[' ) ;
    public final void rule__Recipe__Group_27__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3208:1: ( ( '[' ) )
            // InternalMyDsl.g:3209:1: ( '[' )
            {
            // InternalMyDsl.g:3209:1: ( '[' )
            // InternalMyDsl.g:3210:2: '['
            {
             before(grammarAccess.getRecipeAccess().getLeftSquareBracketKeyword_27_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getLeftSquareBracketKeyword_27_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_27__3__Impl"


    // $ANTLR start "rule__Recipe__Group_27__4"
    // InternalMyDsl.g:3219:1: rule__Recipe__Group_27__4 : rule__Recipe__Group_27__4__Impl rule__Recipe__Group_27__5 ;
    public final void rule__Recipe__Group_27__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3223:1: ( rule__Recipe__Group_27__4__Impl rule__Recipe__Group_27__5 )
            // InternalMyDsl.g:3224:2: rule__Recipe__Group_27__4__Impl rule__Recipe__Group_27__5
            {
            pushFollow(FOLLOW_13);
            rule__Recipe__Group_27__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group_27__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_27__4"


    // $ANTLR start "rule__Recipe__Group_27__4__Impl"
    // InternalMyDsl.g:3231:1: rule__Recipe__Group_27__4__Impl : ( ( rule__Recipe__RatingsAssignment_27_4 ) ) ;
    public final void rule__Recipe__Group_27__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3235:1: ( ( ( rule__Recipe__RatingsAssignment_27_4 ) ) )
            // InternalMyDsl.g:3236:1: ( ( rule__Recipe__RatingsAssignment_27_4 ) )
            {
            // InternalMyDsl.g:3236:1: ( ( rule__Recipe__RatingsAssignment_27_4 ) )
            // InternalMyDsl.g:3237:2: ( rule__Recipe__RatingsAssignment_27_4 )
            {
             before(grammarAccess.getRecipeAccess().getRatingsAssignment_27_4()); 
            // InternalMyDsl.g:3238:2: ( rule__Recipe__RatingsAssignment_27_4 )
            // InternalMyDsl.g:3238:3: rule__Recipe__RatingsAssignment_27_4
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__RatingsAssignment_27_4();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getRatingsAssignment_27_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_27__4__Impl"


    // $ANTLR start "rule__Recipe__Group_27__5"
    // InternalMyDsl.g:3246:1: rule__Recipe__Group_27__5 : rule__Recipe__Group_27__5__Impl rule__Recipe__Group_27__6 ;
    public final void rule__Recipe__Group_27__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3250:1: ( rule__Recipe__Group_27__5__Impl rule__Recipe__Group_27__6 )
            // InternalMyDsl.g:3251:2: rule__Recipe__Group_27__5__Impl rule__Recipe__Group_27__6
            {
            pushFollow(FOLLOW_13);
            rule__Recipe__Group_27__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group_27__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_27__5"


    // $ANTLR start "rule__Recipe__Group_27__5__Impl"
    // InternalMyDsl.g:3258:1: rule__Recipe__Group_27__5__Impl : ( ( rule__Recipe__Group_27_5__0 )* ) ;
    public final void rule__Recipe__Group_27__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3262:1: ( ( ( rule__Recipe__Group_27_5__0 )* ) )
            // InternalMyDsl.g:3263:1: ( ( rule__Recipe__Group_27_5__0 )* )
            {
            // InternalMyDsl.g:3263:1: ( ( rule__Recipe__Group_27_5__0 )* )
            // InternalMyDsl.g:3264:2: ( rule__Recipe__Group_27_5__0 )*
            {
             before(grammarAccess.getRecipeAccess().getGroup_27_5()); 
            // InternalMyDsl.g:3265:2: ( rule__Recipe__Group_27_5__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==30) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyDsl.g:3265:3: rule__Recipe__Group_27_5__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Recipe__Group_27_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getRecipeAccess().getGroup_27_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_27__5__Impl"


    // $ANTLR start "rule__Recipe__Group_27__6"
    // InternalMyDsl.g:3273:1: rule__Recipe__Group_27__6 : rule__Recipe__Group_27__6__Impl ;
    public final void rule__Recipe__Group_27__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3277:1: ( rule__Recipe__Group_27__6__Impl )
            // InternalMyDsl.g:3278:2: rule__Recipe__Group_27__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__Group_27__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_27__6"


    // $ANTLR start "rule__Recipe__Group_27__6__Impl"
    // InternalMyDsl.g:3284:1: rule__Recipe__Group_27__6__Impl : ( ']' ) ;
    public final void rule__Recipe__Group_27__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3288:1: ( ( ']' ) )
            // InternalMyDsl.g:3289:1: ( ']' )
            {
            // InternalMyDsl.g:3289:1: ( ']' )
            // InternalMyDsl.g:3290:2: ']'
            {
             before(grammarAccess.getRecipeAccess().getRightSquareBracketKeyword_27_6()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getRightSquareBracketKeyword_27_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_27__6__Impl"


    // $ANTLR start "rule__Recipe__Group_27_5__0"
    // InternalMyDsl.g:3300:1: rule__Recipe__Group_27_5__0 : rule__Recipe__Group_27_5__0__Impl rule__Recipe__Group_27_5__1 ;
    public final void rule__Recipe__Group_27_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3304:1: ( rule__Recipe__Group_27_5__0__Impl rule__Recipe__Group_27_5__1 )
            // InternalMyDsl.g:3305:2: rule__Recipe__Group_27_5__0__Impl rule__Recipe__Group_27_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Recipe__Group_27_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group_27_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_27_5__0"


    // $ANTLR start "rule__Recipe__Group_27_5__0__Impl"
    // InternalMyDsl.g:3312:1: rule__Recipe__Group_27_5__0__Impl : ( ',' ) ;
    public final void rule__Recipe__Group_27_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3316:1: ( ( ',' ) )
            // InternalMyDsl.g:3317:1: ( ',' )
            {
            // InternalMyDsl.g:3317:1: ( ',' )
            // InternalMyDsl.g:3318:2: ','
            {
             before(grammarAccess.getRecipeAccess().getCommaKeyword_27_5_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getCommaKeyword_27_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_27_5__0__Impl"


    // $ANTLR start "rule__Recipe__Group_27_5__1"
    // InternalMyDsl.g:3327:1: rule__Recipe__Group_27_5__1 : rule__Recipe__Group_27_5__1__Impl ;
    public final void rule__Recipe__Group_27_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3331:1: ( rule__Recipe__Group_27_5__1__Impl )
            // InternalMyDsl.g:3332:2: rule__Recipe__Group_27_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__Group_27_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_27_5__1"


    // $ANTLR start "rule__Recipe__Group_27_5__1__Impl"
    // InternalMyDsl.g:3338:1: rule__Recipe__Group_27_5__1__Impl : ( ( rule__Recipe__RatingsAssignment_27_5_1 ) ) ;
    public final void rule__Recipe__Group_27_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3342:1: ( ( ( rule__Recipe__RatingsAssignment_27_5_1 ) ) )
            // InternalMyDsl.g:3343:1: ( ( rule__Recipe__RatingsAssignment_27_5_1 ) )
            {
            // InternalMyDsl.g:3343:1: ( ( rule__Recipe__RatingsAssignment_27_5_1 ) )
            // InternalMyDsl.g:3344:2: ( rule__Recipe__RatingsAssignment_27_5_1 )
            {
             before(grammarAccess.getRecipeAccess().getRatingsAssignment_27_5_1()); 
            // InternalMyDsl.g:3345:2: ( rule__Recipe__RatingsAssignment_27_5_1 )
            // InternalMyDsl.g:3345:3: rule__Recipe__RatingsAssignment_27_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__RatingsAssignment_27_5_1();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getRatingsAssignment_27_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_27_5__1__Impl"


    // $ANTLR start "rule__Ingredient__Group_0__0"
    // InternalMyDsl.g:3354:1: rule__Ingredient__Group_0__0 : rule__Ingredient__Group_0__0__Impl rule__Ingredient__Group_0__1 ;
    public final void rule__Ingredient__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3358:1: ( rule__Ingredient__Group_0__0__Impl rule__Ingredient__Group_0__1 )
            // InternalMyDsl.g:3359:2: rule__Ingredient__Group_0__0__Impl rule__Ingredient__Group_0__1
            {
            pushFollow(FOLLOW_28);
            rule__Ingredient__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredient__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group_0__0"


    // $ANTLR start "rule__Ingredient__Group_0__0__Impl"
    // InternalMyDsl.g:3366:1: rule__Ingredient__Group_0__0__Impl : ( '{' ) ;
    public final void rule__Ingredient__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3370:1: ( ( '{' ) )
            // InternalMyDsl.g:3371:1: ( '{' )
            {
            // InternalMyDsl.g:3371:1: ( '{' )
            // InternalMyDsl.g:3372:2: '{'
            {
             before(grammarAccess.getIngredientAccess().getLeftCurlyBracketKeyword_0_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getIngredientAccess().getLeftCurlyBracketKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group_0__0__Impl"


    // $ANTLR start "rule__Ingredient__Group_0__1"
    // InternalMyDsl.g:3381:1: rule__Ingredient__Group_0__1 : rule__Ingredient__Group_0__1__Impl rule__Ingredient__Group_0__2 ;
    public final void rule__Ingredient__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3385:1: ( rule__Ingredient__Group_0__1__Impl rule__Ingredient__Group_0__2 )
            // InternalMyDsl.g:3386:2: rule__Ingredient__Group_0__1__Impl rule__Ingredient__Group_0__2
            {
            pushFollow(FOLLOW_3);
            rule__Ingredient__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredient__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group_0__1"


    // $ANTLR start "rule__Ingredient__Group_0__1__Impl"
    // InternalMyDsl.g:3393:1: rule__Ingredient__Group_0__1__Impl : ( 'Name' ) ;
    public final void rule__Ingredient__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3397:1: ( ( 'Name' ) )
            // InternalMyDsl.g:3398:1: ( 'Name' )
            {
            // InternalMyDsl.g:3398:1: ( 'Name' )
            // InternalMyDsl.g:3399:2: 'Name'
            {
             before(grammarAccess.getIngredientAccess().getNameKeyword_0_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getIngredientAccess().getNameKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group_0__1__Impl"


    // $ANTLR start "rule__Ingredient__Group_0__2"
    // InternalMyDsl.g:3408:1: rule__Ingredient__Group_0__2 : rule__Ingredient__Group_0__2__Impl rule__Ingredient__Group_0__3 ;
    public final void rule__Ingredient__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3412:1: ( rule__Ingredient__Group_0__2__Impl rule__Ingredient__Group_0__3 )
            // InternalMyDsl.g:3413:2: rule__Ingredient__Group_0__2__Impl rule__Ingredient__Group_0__3
            {
            pushFollow(FOLLOW_10);
            rule__Ingredient__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredient__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group_0__2"


    // $ANTLR start "rule__Ingredient__Group_0__2__Impl"
    // InternalMyDsl.g:3420:1: rule__Ingredient__Group_0__2__Impl : ( ':' ) ;
    public final void rule__Ingredient__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3424:1: ( ( ':' ) )
            // InternalMyDsl.g:3425:1: ( ':' )
            {
            // InternalMyDsl.g:3425:1: ( ':' )
            // InternalMyDsl.g:3426:2: ':'
            {
             before(grammarAccess.getIngredientAccess().getColonKeyword_0_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getIngredientAccess().getColonKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group_0__2__Impl"


    // $ANTLR start "rule__Ingredient__Group_0__3"
    // InternalMyDsl.g:3435:1: rule__Ingredient__Group_0__3 : rule__Ingredient__Group_0__3__Impl rule__Ingredient__Group_0__4 ;
    public final void rule__Ingredient__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3439:1: ( rule__Ingredient__Group_0__3__Impl rule__Ingredient__Group_0__4 )
            // InternalMyDsl.g:3440:2: rule__Ingredient__Group_0__3__Impl rule__Ingredient__Group_0__4
            {
            pushFollow(FOLLOW_16);
            rule__Ingredient__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredient__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group_0__3"


    // $ANTLR start "rule__Ingredient__Group_0__3__Impl"
    // InternalMyDsl.g:3447:1: rule__Ingredient__Group_0__3__Impl : ( ( rule__Ingredient__NameAssignment_0_3 ) ) ;
    public final void rule__Ingredient__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3451:1: ( ( ( rule__Ingredient__NameAssignment_0_3 ) ) )
            // InternalMyDsl.g:3452:1: ( ( rule__Ingredient__NameAssignment_0_3 ) )
            {
            // InternalMyDsl.g:3452:1: ( ( rule__Ingredient__NameAssignment_0_3 ) )
            // InternalMyDsl.g:3453:2: ( rule__Ingredient__NameAssignment_0_3 )
            {
             before(grammarAccess.getIngredientAccess().getNameAssignment_0_3()); 
            // InternalMyDsl.g:3454:2: ( rule__Ingredient__NameAssignment_0_3 )
            // InternalMyDsl.g:3454:3: rule__Ingredient__NameAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__NameAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getIngredientAccess().getNameAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group_0__3__Impl"


    // $ANTLR start "rule__Ingredient__Group_0__4"
    // InternalMyDsl.g:3462:1: rule__Ingredient__Group_0__4 : rule__Ingredient__Group_0__4__Impl rule__Ingredient__Group_0__5 ;
    public final void rule__Ingredient__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3466:1: ( rule__Ingredient__Group_0__4__Impl rule__Ingredient__Group_0__5 )
            // InternalMyDsl.g:3467:2: rule__Ingredient__Group_0__4__Impl rule__Ingredient__Group_0__5
            {
            pushFollow(FOLLOW_29);
            rule__Ingredient__Group_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredient__Group_0__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group_0__4"


    // $ANTLR start "rule__Ingredient__Group_0__4__Impl"
    // InternalMyDsl.g:3474:1: rule__Ingredient__Group_0__4__Impl : ( ',' ) ;
    public final void rule__Ingredient__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3478:1: ( ( ',' ) )
            // InternalMyDsl.g:3479:1: ( ',' )
            {
            // InternalMyDsl.g:3479:1: ( ',' )
            // InternalMyDsl.g:3480:2: ','
            {
             before(grammarAccess.getIngredientAccess().getCommaKeyword_0_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getIngredientAccess().getCommaKeyword_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group_0__4__Impl"


    // $ANTLR start "rule__Ingredient__Group_0__5"
    // InternalMyDsl.g:3489:1: rule__Ingredient__Group_0__5 : rule__Ingredient__Group_0__5__Impl rule__Ingredient__Group_0__6 ;
    public final void rule__Ingredient__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3493:1: ( rule__Ingredient__Group_0__5__Impl rule__Ingredient__Group_0__6 )
            // InternalMyDsl.g:3494:2: rule__Ingredient__Group_0__5__Impl rule__Ingredient__Group_0__6
            {
            pushFollow(FOLLOW_3);
            rule__Ingredient__Group_0__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredient__Group_0__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group_0__5"


    // $ANTLR start "rule__Ingredient__Group_0__5__Impl"
    // InternalMyDsl.g:3501:1: rule__Ingredient__Group_0__5__Impl : ( 'Amount' ) ;
    public final void rule__Ingredient__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3505:1: ( ( 'Amount' ) )
            // InternalMyDsl.g:3506:1: ( 'Amount' )
            {
            // InternalMyDsl.g:3506:1: ( 'Amount' )
            // InternalMyDsl.g:3507:2: 'Amount'
            {
             before(grammarAccess.getIngredientAccess().getAmountKeyword_0_5()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getIngredientAccess().getAmountKeyword_0_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group_0__5__Impl"


    // $ANTLR start "rule__Ingredient__Group_0__6"
    // InternalMyDsl.g:3516:1: rule__Ingredient__Group_0__6 : rule__Ingredient__Group_0__6__Impl rule__Ingredient__Group_0__7 ;
    public final void rule__Ingredient__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3520:1: ( rule__Ingredient__Group_0__6__Impl rule__Ingredient__Group_0__7 )
            // InternalMyDsl.g:3521:2: rule__Ingredient__Group_0__6__Impl rule__Ingredient__Group_0__7
            {
            pushFollow(FOLLOW_15);
            rule__Ingredient__Group_0__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredient__Group_0__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group_0__6"


    // $ANTLR start "rule__Ingredient__Group_0__6__Impl"
    // InternalMyDsl.g:3528:1: rule__Ingredient__Group_0__6__Impl : ( ':' ) ;
    public final void rule__Ingredient__Group_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3532:1: ( ( ':' ) )
            // InternalMyDsl.g:3533:1: ( ':' )
            {
            // InternalMyDsl.g:3533:1: ( ':' )
            // InternalMyDsl.g:3534:2: ':'
            {
             before(grammarAccess.getIngredientAccess().getColonKeyword_0_6()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getIngredientAccess().getColonKeyword_0_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group_0__6__Impl"


    // $ANTLR start "rule__Ingredient__Group_0__7"
    // InternalMyDsl.g:3543:1: rule__Ingredient__Group_0__7 : rule__Ingredient__Group_0__7__Impl rule__Ingredient__Group_0__8 ;
    public final void rule__Ingredient__Group_0__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3547:1: ( rule__Ingredient__Group_0__7__Impl rule__Ingredient__Group_0__8 )
            // InternalMyDsl.g:3548:2: rule__Ingredient__Group_0__7__Impl rule__Ingredient__Group_0__8
            {
            pushFollow(FOLLOW_16);
            rule__Ingredient__Group_0__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredient__Group_0__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group_0__7"


    // $ANTLR start "rule__Ingredient__Group_0__7__Impl"
    // InternalMyDsl.g:3555:1: rule__Ingredient__Group_0__7__Impl : ( ( rule__Ingredient__AmountAssignment_0_7 ) ) ;
    public final void rule__Ingredient__Group_0__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3559:1: ( ( ( rule__Ingredient__AmountAssignment_0_7 ) ) )
            // InternalMyDsl.g:3560:1: ( ( rule__Ingredient__AmountAssignment_0_7 ) )
            {
            // InternalMyDsl.g:3560:1: ( ( rule__Ingredient__AmountAssignment_0_7 ) )
            // InternalMyDsl.g:3561:2: ( rule__Ingredient__AmountAssignment_0_7 )
            {
             before(grammarAccess.getIngredientAccess().getAmountAssignment_0_7()); 
            // InternalMyDsl.g:3562:2: ( rule__Ingredient__AmountAssignment_0_7 )
            // InternalMyDsl.g:3562:3: rule__Ingredient__AmountAssignment_0_7
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__AmountAssignment_0_7();

            state._fsp--;


            }

             after(grammarAccess.getIngredientAccess().getAmountAssignment_0_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group_0__7__Impl"


    // $ANTLR start "rule__Ingredient__Group_0__8"
    // InternalMyDsl.g:3570:1: rule__Ingredient__Group_0__8 : rule__Ingredient__Group_0__8__Impl rule__Ingredient__Group_0__9 ;
    public final void rule__Ingredient__Group_0__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3574:1: ( rule__Ingredient__Group_0__8__Impl rule__Ingredient__Group_0__9 )
            // InternalMyDsl.g:3575:2: rule__Ingredient__Group_0__8__Impl rule__Ingredient__Group_0__9
            {
            pushFollow(FOLLOW_30);
            rule__Ingredient__Group_0__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredient__Group_0__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group_0__8"


    // $ANTLR start "rule__Ingredient__Group_0__8__Impl"
    // InternalMyDsl.g:3582:1: rule__Ingredient__Group_0__8__Impl : ( ',' ) ;
    public final void rule__Ingredient__Group_0__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3586:1: ( ( ',' ) )
            // InternalMyDsl.g:3587:1: ( ',' )
            {
            // InternalMyDsl.g:3587:1: ( ',' )
            // InternalMyDsl.g:3588:2: ','
            {
             before(grammarAccess.getIngredientAccess().getCommaKeyword_0_8()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getIngredientAccess().getCommaKeyword_0_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group_0__8__Impl"


    // $ANTLR start "rule__Ingredient__Group_0__9"
    // InternalMyDsl.g:3597:1: rule__Ingredient__Group_0__9 : rule__Ingredient__Group_0__9__Impl rule__Ingredient__Group_0__10 ;
    public final void rule__Ingredient__Group_0__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3601:1: ( rule__Ingredient__Group_0__9__Impl rule__Ingredient__Group_0__10 )
            // InternalMyDsl.g:3602:2: rule__Ingredient__Group_0__9__Impl rule__Ingredient__Group_0__10
            {
            pushFollow(FOLLOW_3);
            rule__Ingredient__Group_0__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredient__Group_0__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group_0__9"


    // $ANTLR start "rule__Ingredient__Group_0__9__Impl"
    // InternalMyDsl.g:3609:1: rule__Ingredient__Group_0__9__Impl : ( 'Unit' ) ;
    public final void rule__Ingredient__Group_0__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3613:1: ( ( 'Unit' ) )
            // InternalMyDsl.g:3614:1: ( 'Unit' )
            {
            // InternalMyDsl.g:3614:1: ( 'Unit' )
            // InternalMyDsl.g:3615:2: 'Unit'
            {
             before(grammarAccess.getIngredientAccess().getUnitKeyword_0_9()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getIngredientAccess().getUnitKeyword_0_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group_0__9__Impl"


    // $ANTLR start "rule__Ingredient__Group_0__10"
    // InternalMyDsl.g:3624:1: rule__Ingredient__Group_0__10 : rule__Ingredient__Group_0__10__Impl rule__Ingredient__Group_0__11 ;
    public final void rule__Ingredient__Group_0__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3628:1: ( rule__Ingredient__Group_0__10__Impl rule__Ingredient__Group_0__11 )
            // InternalMyDsl.g:3629:2: rule__Ingredient__Group_0__10__Impl rule__Ingredient__Group_0__11
            {
            pushFollow(FOLLOW_31);
            rule__Ingredient__Group_0__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredient__Group_0__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group_0__10"


    // $ANTLR start "rule__Ingredient__Group_0__10__Impl"
    // InternalMyDsl.g:3636:1: rule__Ingredient__Group_0__10__Impl : ( ':' ) ;
    public final void rule__Ingredient__Group_0__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3640:1: ( ( ':' ) )
            // InternalMyDsl.g:3641:1: ( ':' )
            {
            // InternalMyDsl.g:3641:1: ( ':' )
            // InternalMyDsl.g:3642:2: ':'
            {
             before(grammarAccess.getIngredientAccess().getColonKeyword_0_10()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getIngredientAccess().getColonKeyword_0_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group_0__10__Impl"


    // $ANTLR start "rule__Ingredient__Group_0__11"
    // InternalMyDsl.g:3651:1: rule__Ingredient__Group_0__11 : rule__Ingredient__Group_0__11__Impl rule__Ingredient__Group_0__12 ;
    public final void rule__Ingredient__Group_0__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3655:1: ( rule__Ingredient__Group_0__11__Impl rule__Ingredient__Group_0__12 )
            // InternalMyDsl.g:3656:2: rule__Ingredient__Group_0__11__Impl rule__Ingredient__Group_0__12
            {
            pushFollow(FOLLOW_16);
            rule__Ingredient__Group_0__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredient__Group_0__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group_0__11"


    // $ANTLR start "rule__Ingredient__Group_0__11__Impl"
    // InternalMyDsl.g:3663:1: rule__Ingredient__Group_0__11__Impl : ( ( rule__Ingredient__UnitAssignment_0_11 ) ) ;
    public final void rule__Ingredient__Group_0__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3667:1: ( ( ( rule__Ingredient__UnitAssignment_0_11 ) ) )
            // InternalMyDsl.g:3668:1: ( ( rule__Ingredient__UnitAssignment_0_11 ) )
            {
            // InternalMyDsl.g:3668:1: ( ( rule__Ingredient__UnitAssignment_0_11 ) )
            // InternalMyDsl.g:3669:2: ( rule__Ingredient__UnitAssignment_0_11 )
            {
             before(grammarAccess.getIngredientAccess().getUnitAssignment_0_11()); 
            // InternalMyDsl.g:3670:2: ( rule__Ingredient__UnitAssignment_0_11 )
            // InternalMyDsl.g:3670:3: rule__Ingredient__UnitAssignment_0_11
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__UnitAssignment_0_11();

            state._fsp--;


            }

             after(grammarAccess.getIngredientAccess().getUnitAssignment_0_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group_0__11__Impl"


    // $ANTLR start "rule__Ingredient__Group_0__12"
    // InternalMyDsl.g:3678:1: rule__Ingredient__Group_0__12 : rule__Ingredient__Group_0__12__Impl rule__Ingredient__Group_0__13 ;
    public final void rule__Ingredient__Group_0__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3682:1: ( rule__Ingredient__Group_0__12__Impl rule__Ingredient__Group_0__13 )
            // InternalMyDsl.g:3683:2: rule__Ingredient__Group_0__12__Impl rule__Ingredient__Group_0__13
            {
            pushFollow(FOLLOW_20);
            rule__Ingredient__Group_0__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredient__Group_0__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group_0__12"


    // $ANTLR start "rule__Ingredient__Group_0__12__Impl"
    // InternalMyDsl.g:3690:1: rule__Ingredient__Group_0__12__Impl : ( ',' ) ;
    public final void rule__Ingredient__Group_0__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3694:1: ( ( ',' ) )
            // InternalMyDsl.g:3695:1: ( ',' )
            {
            // InternalMyDsl.g:3695:1: ( ',' )
            // InternalMyDsl.g:3696:2: ','
            {
             before(grammarAccess.getIngredientAccess().getCommaKeyword_0_12()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getIngredientAccess().getCommaKeyword_0_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group_0__12__Impl"


    // $ANTLR start "rule__Ingredient__Group_0__13"
    // InternalMyDsl.g:3705:1: rule__Ingredient__Group_0__13 : rule__Ingredient__Group_0__13__Impl rule__Ingredient__Group_0__14 ;
    public final void rule__Ingredient__Group_0__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3709:1: ( rule__Ingredient__Group_0__13__Impl rule__Ingredient__Group_0__14 )
            // InternalMyDsl.g:3710:2: rule__Ingredient__Group_0__13__Impl rule__Ingredient__Group_0__14
            {
            pushFollow(FOLLOW_3);
            rule__Ingredient__Group_0__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredient__Group_0__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group_0__13"


    // $ANTLR start "rule__Ingredient__Group_0__13__Impl"
    // InternalMyDsl.g:3717:1: rule__Ingredient__Group_0__13__Impl : ( 'VeganismLevel' ) ;
    public final void rule__Ingredient__Group_0__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3721:1: ( ( 'VeganismLevel' ) )
            // InternalMyDsl.g:3722:1: ( 'VeganismLevel' )
            {
            // InternalMyDsl.g:3722:1: ( 'VeganismLevel' )
            // InternalMyDsl.g:3723:2: 'VeganismLevel'
            {
             before(grammarAccess.getIngredientAccess().getVeganismLevelKeyword_0_13()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getIngredientAccess().getVeganismLevelKeyword_0_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group_0__13__Impl"


    // $ANTLR start "rule__Ingredient__Group_0__14"
    // InternalMyDsl.g:3732:1: rule__Ingredient__Group_0__14 : rule__Ingredient__Group_0__14__Impl rule__Ingredient__Group_0__15 ;
    public final void rule__Ingredient__Group_0__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3736:1: ( rule__Ingredient__Group_0__14__Impl rule__Ingredient__Group_0__15 )
            // InternalMyDsl.g:3737:2: rule__Ingredient__Group_0__14__Impl rule__Ingredient__Group_0__15
            {
            pushFollow(FOLLOW_21);
            rule__Ingredient__Group_0__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredient__Group_0__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group_0__14"


    // $ANTLR start "rule__Ingredient__Group_0__14__Impl"
    // InternalMyDsl.g:3744:1: rule__Ingredient__Group_0__14__Impl : ( ':' ) ;
    public final void rule__Ingredient__Group_0__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3748:1: ( ( ':' ) )
            // InternalMyDsl.g:3749:1: ( ':' )
            {
            // InternalMyDsl.g:3749:1: ( ':' )
            // InternalMyDsl.g:3750:2: ':'
            {
             before(grammarAccess.getIngredientAccess().getColonKeyword_0_14()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getIngredientAccess().getColonKeyword_0_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group_0__14__Impl"


    // $ANTLR start "rule__Ingredient__Group_0__15"
    // InternalMyDsl.g:3759:1: rule__Ingredient__Group_0__15 : rule__Ingredient__Group_0__15__Impl rule__Ingredient__Group_0__16 ;
    public final void rule__Ingredient__Group_0__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3763:1: ( rule__Ingredient__Group_0__15__Impl rule__Ingredient__Group_0__16 )
            // InternalMyDsl.g:3764:2: rule__Ingredient__Group_0__15__Impl rule__Ingredient__Group_0__16
            {
            pushFollow(FOLLOW_18);
            rule__Ingredient__Group_0__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredient__Group_0__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group_0__15"


    // $ANTLR start "rule__Ingredient__Group_0__15__Impl"
    // InternalMyDsl.g:3771:1: rule__Ingredient__Group_0__15__Impl : ( ( rule__Ingredient__VeganismLevelAssignment_0_15 ) ) ;
    public final void rule__Ingredient__Group_0__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3775:1: ( ( ( rule__Ingredient__VeganismLevelAssignment_0_15 ) ) )
            // InternalMyDsl.g:3776:1: ( ( rule__Ingredient__VeganismLevelAssignment_0_15 ) )
            {
            // InternalMyDsl.g:3776:1: ( ( rule__Ingredient__VeganismLevelAssignment_0_15 ) )
            // InternalMyDsl.g:3777:2: ( rule__Ingredient__VeganismLevelAssignment_0_15 )
            {
             before(grammarAccess.getIngredientAccess().getVeganismLevelAssignment_0_15()); 
            // InternalMyDsl.g:3778:2: ( rule__Ingredient__VeganismLevelAssignment_0_15 )
            // InternalMyDsl.g:3778:3: rule__Ingredient__VeganismLevelAssignment_0_15
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__VeganismLevelAssignment_0_15();

            state._fsp--;


            }

             after(grammarAccess.getIngredientAccess().getVeganismLevelAssignment_0_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group_0__15__Impl"


    // $ANTLR start "rule__Ingredient__Group_0__16"
    // InternalMyDsl.g:3786:1: rule__Ingredient__Group_0__16 : rule__Ingredient__Group_0__16__Impl ;
    public final void rule__Ingredient__Group_0__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3790:1: ( rule__Ingredient__Group_0__16__Impl )
            // InternalMyDsl.g:3791:2: rule__Ingredient__Group_0__16__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__Group_0__16__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group_0__16"


    // $ANTLR start "rule__Ingredient__Group_0__16__Impl"
    // InternalMyDsl.g:3797:1: rule__Ingredient__Group_0__16__Impl : ( '}' ) ;
    public final void rule__Ingredient__Group_0__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3801:1: ( ( '}' ) )
            // InternalMyDsl.g:3802:1: ( '}' )
            {
            // InternalMyDsl.g:3802:1: ( '}' )
            // InternalMyDsl.g:3803:2: '}'
            {
             before(grammarAccess.getIngredientAccess().getRightCurlyBracketKeyword_0_16()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getIngredientAccess().getRightCurlyBracketKeyword_0_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group_0__16__Impl"


    // $ANTLR start "rule__RecipeManager__AuthorblockAssignment_2"
    // InternalMyDsl.g:3813:1: rule__RecipeManager__AuthorblockAssignment_2 : ( ruleAuthorblock ) ;
    public final void rule__RecipeManager__AuthorblockAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3817:1: ( ( ruleAuthorblock ) )
            // InternalMyDsl.g:3818:2: ( ruleAuthorblock )
            {
            // InternalMyDsl.g:3818:2: ( ruleAuthorblock )
            // InternalMyDsl.g:3819:3: ruleAuthorblock
            {
             before(grammarAccess.getRecipeManagerAccess().getAuthorblockAuthorblockParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAuthorblock();

            state._fsp--;

             after(grammarAccess.getRecipeManagerAccess().getAuthorblockAuthorblockParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecipeManager__AuthorblockAssignment_2"


    // $ANTLR start "rule__RecipeManager__RecipeblockAssignment_5"
    // InternalMyDsl.g:3828:1: rule__RecipeManager__RecipeblockAssignment_5 : ( ruleRecipeblock ) ;
    public final void rule__RecipeManager__RecipeblockAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3832:1: ( ( ruleRecipeblock ) )
            // InternalMyDsl.g:3833:2: ( ruleRecipeblock )
            {
            // InternalMyDsl.g:3833:2: ( ruleRecipeblock )
            // InternalMyDsl.g:3834:3: ruleRecipeblock
            {
             before(grammarAccess.getRecipeManagerAccess().getRecipeblockRecipeblockParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleRecipeblock();

            state._fsp--;

             after(grammarAccess.getRecipeManagerAccess().getRecipeblockRecipeblockParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecipeManager__RecipeblockAssignment_5"


    // $ANTLR start "rule__Authorblock__AuthorsAssignment_1"
    // InternalMyDsl.g:3843:1: rule__Authorblock__AuthorsAssignment_1 : ( ruleAuthor ) ;
    public final void rule__Authorblock__AuthorsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3847:1: ( ( ruleAuthor ) )
            // InternalMyDsl.g:3848:2: ( ruleAuthor )
            {
            // InternalMyDsl.g:3848:2: ( ruleAuthor )
            // InternalMyDsl.g:3849:3: ruleAuthor
            {
             before(grammarAccess.getAuthorblockAccess().getAuthorsAuthorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAuthor();

            state._fsp--;

             after(grammarAccess.getAuthorblockAccess().getAuthorsAuthorParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authorblock__AuthorsAssignment_1"


    // $ANTLR start "rule__Authorblock__AuthorsAssignment_2_1"
    // InternalMyDsl.g:3858:1: rule__Authorblock__AuthorsAssignment_2_1 : ( ruleAuthor ) ;
    public final void rule__Authorblock__AuthorsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3862:1: ( ( ruleAuthor ) )
            // InternalMyDsl.g:3863:2: ( ruleAuthor )
            {
            // InternalMyDsl.g:3863:2: ( ruleAuthor )
            // InternalMyDsl.g:3864:3: ruleAuthor
            {
             before(grammarAccess.getAuthorblockAccess().getAuthorsAuthorParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAuthor();

            state._fsp--;

             after(grammarAccess.getAuthorblockAccess().getAuthorsAuthorParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authorblock__AuthorsAssignment_2_1"


    // $ANTLR start "rule__Author__NameAssignment_0"
    // InternalMyDsl.g:3873:1: rule__Author__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Author__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3877:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3878:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3878:2: ( RULE_ID )
            // InternalMyDsl.g:3879:3: RULE_ID
            {
             before(grammarAccess.getAuthorAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAuthorAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Author__NameAssignment_0"


    // $ANTLR start "rule__Author__EmailAssignment_5"
    // InternalMyDsl.g:3888:1: rule__Author__EmailAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Author__EmailAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3892:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3893:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3893:2: ( RULE_STRING )
            // InternalMyDsl.g:3894:3: RULE_STRING
            {
             before(grammarAccess.getAuthorAccess().getEmailSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAuthorAccess().getEmailSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Author__EmailAssignment_5"


    // $ANTLR start "rule__Author__CallsAssignment_6_4"
    // InternalMyDsl.g:3903:1: rule__Author__CallsAssignment_6_4 : ( ( RULE_ID ) ) ;
    public final void rule__Author__CallsAssignment_6_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3907:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:3908:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:3908:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:3909:3: ( RULE_ID )
            {
             before(grammarAccess.getAuthorAccess().getCallsRecipeCrossReference_6_4_0()); 
            // InternalMyDsl.g:3910:3: ( RULE_ID )
            // InternalMyDsl.g:3911:4: RULE_ID
            {
             before(grammarAccess.getAuthorAccess().getCallsRecipeIDTerminalRuleCall_6_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAuthorAccess().getCallsRecipeIDTerminalRuleCall_6_4_0_1()); 

            }

             after(grammarAccess.getAuthorAccess().getCallsRecipeCrossReference_6_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Author__CallsAssignment_6_4"


    // $ANTLR start "rule__Author__CallsAssignment_6_5_1"
    // InternalMyDsl.g:3922:1: rule__Author__CallsAssignment_6_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Author__CallsAssignment_6_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3926:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:3927:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:3927:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:3928:3: ( RULE_ID )
            {
             before(grammarAccess.getAuthorAccess().getCallsRecipeCrossReference_6_5_1_0()); 
            // InternalMyDsl.g:3929:3: ( RULE_ID )
            // InternalMyDsl.g:3930:4: RULE_ID
            {
             before(grammarAccess.getAuthorAccess().getCallsRecipeIDTerminalRuleCall_6_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAuthorAccess().getCallsRecipeIDTerminalRuleCall_6_5_1_0_1()); 

            }

             after(grammarAccess.getAuthorAccess().getCallsRecipeCrossReference_6_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Author__CallsAssignment_6_5_1"


    // $ANTLR start "rule__Recipeblock__RecipesAssignment_1"
    // InternalMyDsl.g:3941:1: rule__Recipeblock__RecipesAssignment_1 : ( ruleRecipe ) ;
    public final void rule__Recipeblock__RecipesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3945:1: ( ( ruleRecipe ) )
            // InternalMyDsl.g:3946:2: ( ruleRecipe )
            {
            // InternalMyDsl.g:3946:2: ( ruleRecipe )
            // InternalMyDsl.g:3947:3: ruleRecipe
            {
             before(grammarAccess.getRecipeblockAccess().getRecipesRecipeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRecipe();

            state._fsp--;

             after(grammarAccess.getRecipeblockAccess().getRecipesRecipeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipeblock__RecipesAssignment_1"


    // $ANTLR start "rule__Recipeblock__RecipesAssignment_2_1"
    // InternalMyDsl.g:3956:1: rule__Recipeblock__RecipesAssignment_2_1 : ( ruleRecipe ) ;
    public final void rule__Recipeblock__RecipesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3960:1: ( ( ruleRecipe ) )
            // InternalMyDsl.g:3961:2: ( ruleRecipe )
            {
            // InternalMyDsl.g:3961:2: ( ruleRecipe )
            // InternalMyDsl.g:3962:3: ruleRecipe
            {
             before(grammarAccess.getRecipeblockAccess().getRecipesRecipeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRecipe();

            state._fsp--;

             after(grammarAccess.getRecipeblockAccess().getRecipesRecipeParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipeblock__RecipesAssignment_2_1"


    // $ANTLR start "rule__Rating__StarsAssignment_3"
    // InternalMyDsl.g:3971:1: rule__Rating__StarsAssignment_3 : ( RULE_INT ) ;
    public final void rule__Rating__StarsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3975:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:3976:2: ( RULE_INT )
            {
            // InternalMyDsl.g:3976:2: ( RULE_INT )
            // InternalMyDsl.g:3977:3: RULE_INT
            {
             before(grammarAccess.getRatingAccess().getStarsINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRatingAccess().getStarsINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating__StarsAssignment_3"


    // $ANTLR start "rule__Rating__CommentAssignment_5_2"
    // InternalMyDsl.g:3986:1: rule__Rating__CommentAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__Rating__CommentAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3990:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3991:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3991:2: ( RULE_STRING )
            // InternalMyDsl.g:3992:3: RULE_STRING
            {
             before(grammarAccess.getRatingAccess().getCommentSTRINGTerminalRuleCall_5_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRatingAccess().getCommentSTRINGTerminalRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating__CommentAssignment_5_2"


    // $ANTLR start "rule__Rating__AuthorAssignment_8"
    // InternalMyDsl.g:4001:1: rule__Rating__AuthorAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__Rating__AuthorAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4005:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4006:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4006:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4007:3: ( RULE_ID )
            {
             before(grammarAccess.getRatingAccess().getAuthorAuthorCrossReference_8_0()); 
            // InternalMyDsl.g:4008:3: ( RULE_ID )
            // InternalMyDsl.g:4009:4: RULE_ID
            {
             before(grammarAccess.getRatingAccess().getAuthorAuthorIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRatingAccess().getAuthorAuthorIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getRatingAccess().getAuthorAuthorCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating__AuthorAssignment_8"


    // $ANTLR start "rule__Recipe__NameAssignment_0"
    // InternalMyDsl.g:4020:1: rule__Recipe__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Recipe__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4024:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4025:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4025:2: ( RULE_ID )
            // InternalMyDsl.g:4026:3: RULE_ID
            {
             before(grammarAccess.getRecipeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__NameAssignment_0"


    // $ANTLR start "rule__Recipe__AuthorAssignment_5"
    // InternalMyDsl.g:4035:1: rule__Recipe__AuthorAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Recipe__AuthorAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4039:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4040:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4040:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4041:3: ( RULE_ID )
            {
             before(grammarAccess.getRecipeAccess().getAuthorAuthorCrossReference_5_0()); 
            // InternalMyDsl.g:4042:3: ( RULE_ID )
            // InternalMyDsl.g:4043:4: RULE_ID
            {
             before(grammarAccess.getRecipeAccess().getAuthorAuthorIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getAuthorAuthorIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getRecipeAccess().getAuthorAuthorCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__AuthorAssignment_5"


    // $ANTLR start "rule__Recipe__VeganAssignment_9"
    // InternalMyDsl.g:4054:1: rule__Recipe__VeganAssignment_9 : ( ruleVeganismLevel ) ;
    public final void rule__Recipe__VeganAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4058:1: ( ( ruleVeganismLevel ) )
            // InternalMyDsl.g:4059:2: ( ruleVeganismLevel )
            {
            // InternalMyDsl.g:4059:2: ( ruleVeganismLevel )
            // InternalMyDsl.g:4060:3: ruleVeganismLevel
            {
             before(grammarAccess.getRecipeAccess().getVeganVeganismLevelParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleVeganismLevel();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getVeganVeganismLevelParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__VeganAssignment_9"


    // $ANTLR start "rule__Recipe__DurationAssignment_13"
    // InternalMyDsl.g:4069:1: rule__Recipe__DurationAssignment_13 : ( RULE_INT ) ;
    public final void rule__Recipe__DurationAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4073:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:4074:2: ( RULE_INT )
            {
            // InternalMyDsl.g:4074:2: ( RULE_INT )
            // InternalMyDsl.g:4075:3: RULE_INT
            {
             before(grammarAccess.getRecipeAccess().getDurationINTTerminalRuleCall_13_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getDurationINTTerminalRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__DurationAssignment_13"


    // $ANTLR start "rule__Recipe__DifficultyAssignment_17"
    // InternalMyDsl.g:4084:1: rule__Recipe__DifficultyAssignment_17 : ( RULE_INT ) ;
    public final void rule__Recipe__DifficultyAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4088:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:4089:2: ( RULE_INT )
            {
            // InternalMyDsl.g:4089:2: ( RULE_INT )
            // InternalMyDsl.g:4090:3: RULE_INT
            {
             before(grammarAccess.getRecipeAccess().getDifficultyINTTerminalRuleCall_17_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getDifficultyINTTerminalRuleCall_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__DifficultyAssignment_17"


    // $ANTLR start "rule__Recipe__KitchenUtensilsAssignment_19_3"
    // InternalMyDsl.g:4099:1: rule__Recipe__KitchenUtensilsAssignment_19_3 : ( ruleKitchenUtensil ) ;
    public final void rule__Recipe__KitchenUtensilsAssignment_19_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4103:1: ( ( ruleKitchenUtensil ) )
            // InternalMyDsl.g:4104:2: ( ruleKitchenUtensil )
            {
            // InternalMyDsl.g:4104:2: ( ruleKitchenUtensil )
            // InternalMyDsl.g:4105:3: ruleKitchenUtensil
            {
             before(grammarAccess.getRecipeAccess().getKitchenUtensilsKitchenUtensilParserRuleCall_19_3_0()); 
            pushFollow(FOLLOW_2);
            ruleKitchenUtensil();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getKitchenUtensilsKitchenUtensilParserRuleCall_19_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__KitchenUtensilsAssignment_19_3"


    // $ANTLR start "rule__Recipe__KitchenUtensilsAssignment_19_4_1"
    // InternalMyDsl.g:4114:1: rule__Recipe__KitchenUtensilsAssignment_19_4_1 : ( ruleKitchenUtensil ) ;
    public final void rule__Recipe__KitchenUtensilsAssignment_19_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4118:1: ( ( ruleKitchenUtensil ) )
            // InternalMyDsl.g:4119:2: ( ruleKitchenUtensil )
            {
            // InternalMyDsl.g:4119:2: ( ruleKitchenUtensil )
            // InternalMyDsl.g:4120:3: ruleKitchenUtensil
            {
             before(grammarAccess.getRecipeAccess().getKitchenUtensilsKitchenUtensilParserRuleCall_19_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleKitchenUtensil();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getKitchenUtensilsKitchenUtensilParserRuleCall_19_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__KitchenUtensilsAssignment_19_4_1"


    // $ANTLR start "rule__Recipe__FoodCategoryAssignment_20_3"
    // InternalMyDsl.g:4129:1: rule__Recipe__FoodCategoryAssignment_20_3 : ( ruleFoodCategory ) ;
    public final void rule__Recipe__FoodCategoryAssignment_20_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4133:1: ( ( ruleFoodCategory ) )
            // InternalMyDsl.g:4134:2: ( ruleFoodCategory )
            {
            // InternalMyDsl.g:4134:2: ( ruleFoodCategory )
            // InternalMyDsl.g:4135:3: ruleFoodCategory
            {
             before(grammarAccess.getRecipeAccess().getFoodCategoryFoodCategoryParserRuleCall_20_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFoodCategory();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getFoodCategoryFoodCategoryParserRuleCall_20_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__FoodCategoryAssignment_20_3"


    // $ANTLR start "rule__Recipe__FoodCategoryAssignment_20_4_1"
    // InternalMyDsl.g:4144:1: rule__Recipe__FoodCategoryAssignment_20_4_1 : ( ruleFoodCategory ) ;
    public final void rule__Recipe__FoodCategoryAssignment_20_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4148:1: ( ( ruleFoodCategory ) )
            // InternalMyDsl.g:4149:2: ( ruleFoodCategory )
            {
            // InternalMyDsl.g:4149:2: ( ruleFoodCategory )
            // InternalMyDsl.g:4150:3: ruleFoodCategory
            {
             before(grammarAccess.getRecipeAccess().getFoodCategoryFoodCategoryParserRuleCall_20_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFoodCategory();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getFoodCategoryFoodCategoryParserRuleCall_20_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__FoodCategoryAssignment_20_4_1"


    // $ANTLR start "rule__Recipe__IngredientAssignment_24"
    // InternalMyDsl.g:4159:1: rule__Recipe__IngredientAssignment_24 : ( ruleIngredient ) ;
    public final void rule__Recipe__IngredientAssignment_24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4163:1: ( ( ruleIngredient ) )
            // InternalMyDsl.g:4164:2: ( ruleIngredient )
            {
            // InternalMyDsl.g:4164:2: ( ruleIngredient )
            // InternalMyDsl.g:4165:3: ruleIngredient
            {
             before(grammarAccess.getRecipeAccess().getIngredientIngredientParserRuleCall_24_0()); 
            pushFollow(FOLLOW_2);
            ruleIngredient();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getIngredientIngredientParserRuleCall_24_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__IngredientAssignment_24"


    // $ANTLR start "rule__Recipe__IngredientAssignment_25_1"
    // InternalMyDsl.g:4174:1: rule__Recipe__IngredientAssignment_25_1 : ( ruleIngredient ) ;
    public final void rule__Recipe__IngredientAssignment_25_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4178:1: ( ( ruleIngredient ) )
            // InternalMyDsl.g:4179:2: ( ruleIngredient )
            {
            // InternalMyDsl.g:4179:2: ( ruleIngredient )
            // InternalMyDsl.g:4180:3: ruleIngredient
            {
             before(grammarAccess.getRecipeAccess().getIngredientIngredientParserRuleCall_25_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIngredient();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getIngredientIngredientParserRuleCall_25_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__IngredientAssignment_25_1"


    // $ANTLR start "rule__Recipe__RatingsAssignment_27_4"
    // InternalMyDsl.g:4189:1: rule__Recipe__RatingsAssignment_27_4 : ( ruleRating ) ;
    public final void rule__Recipe__RatingsAssignment_27_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4193:1: ( ( ruleRating ) )
            // InternalMyDsl.g:4194:2: ( ruleRating )
            {
            // InternalMyDsl.g:4194:2: ( ruleRating )
            // InternalMyDsl.g:4195:3: ruleRating
            {
             before(grammarAccess.getRecipeAccess().getRatingsRatingParserRuleCall_27_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRating();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getRatingsRatingParserRuleCall_27_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__RatingsAssignment_27_4"


    // $ANTLR start "rule__Recipe__RatingsAssignment_27_5_1"
    // InternalMyDsl.g:4204:1: rule__Recipe__RatingsAssignment_27_5_1 : ( ruleRating ) ;
    public final void rule__Recipe__RatingsAssignment_27_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4208:1: ( ( ruleRating ) )
            // InternalMyDsl.g:4209:2: ( ruleRating )
            {
            // InternalMyDsl.g:4209:2: ( ruleRating )
            // InternalMyDsl.g:4210:3: ruleRating
            {
             before(grammarAccess.getRecipeAccess().getRatingsRatingParserRuleCall_27_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRating();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getRatingsRatingParserRuleCall_27_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__RatingsAssignment_27_5_1"


    // $ANTLR start "rule__KitchenUtensil__NameAssignment"
    // InternalMyDsl.g:4219:1: rule__KitchenUtensil__NameAssignment : ( ( rule__KitchenUtensil__NameAlternatives_0 ) ) ;
    public final void rule__KitchenUtensil__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4223:1: ( ( ( rule__KitchenUtensil__NameAlternatives_0 ) ) )
            // InternalMyDsl.g:4224:2: ( ( rule__KitchenUtensil__NameAlternatives_0 ) )
            {
            // InternalMyDsl.g:4224:2: ( ( rule__KitchenUtensil__NameAlternatives_0 ) )
            // InternalMyDsl.g:4225:3: ( rule__KitchenUtensil__NameAlternatives_0 )
            {
             before(grammarAccess.getKitchenUtensilAccess().getNameAlternatives_0()); 
            // InternalMyDsl.g:4226:3: ( rule__KitchenUtensil__NameAlternatives_0 )
            // InternalMyDsl.g:4226:4: rule__KitchenUtensil__NameAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__KitchenUtensil__NameAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getKitchenUtensilAccess().getNameAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KitchenUtensil__NameAssignment"


    // $ANTLR start "rule__FoodCategory__NameAssignment"
    // InternalMyDsl.g:4234:1: rule__FoodCategory__NameAssignment : ( RULE_STRING ) ;
    public final void rule__FoodCategory__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4238:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4239:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4239:2: ( RULE_STRING )
            // InternalMyDsl.g:4240:3: RULE_STRING
            {
             before(grammarAccess.getFoodCategoryAccess().getNameSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFoodCategoryAccess().getNameSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoodCategory__NameAssignment"


    // $ANTLR start "rule__Ingredient__NameAssignment_0_3"
    // InternalMyDsl.g:4249:1: rule__Ingredient__NameAssignment_0_3 : ( RULE_STRING ) ;
    public final void rule__Ingredient__NameAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4253:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4254:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4254:2: ( RULE_STRING )
            // InternalMyDsl.g:4255:3: RULE_STRING
            {
             before(grammarAccess.getIngredientAccess().getNameSTRINGTerminalRuleCall_0_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getIngredientAccess().getNameSTRINGTerminalRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__NameAssignment_0_3"


    // $ANTLR start "rule__Ingredient__AmountAssignment_0_7"
    // InternalMyDsl.g:4264:1: rule__Ingredient__AmountAssignment_0_7 : ( RULE_INT ) ;
    public final void rule__Ingredient__AmountAssignment_0_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4268:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:4269:2: ( RULE_INT )
            {
            // InternalMyDsl.g:4269:2: ( RULE_INT )
            // InternalMyDsl.g:4270:3: RULE_INT
            {
             before(grammarAccess.getIngredientAccess().getAmountINTTerminalRuleCall_0_7_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIngredientAccess().getAmountINTTerminalRuleCall_0_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__AmountAssignment_0_7"


    // $ANTLR start "rule__Ingredient__UnitAssignment_0_11"
    // InternalMyDsl.g:4279:1: rule__Ingredient__UnitAssignment_0_11 : ( ruleUnit ) ;
    public final void rule__Ingredient__UnitAssignment_0_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4283:1: ( ( ruleUnit ) )
            // InternalMyDsl.g:4284:2: ( ruleUnit )
            {
            // InternalMyDsl.g:4284:2: ( ruleUnit )
            // InternalMyDsl.g:4285:3: ruleUnit
            {
             before(grammarAccess.getIngredientAccess().getUnitUnitParserRuleCall_0_11_0()); 
            pushFollow(FOLLOW_2);
            ruleUnit();

            state._fsp--;

             after(grammarAccess.getIngredientAccess().getUnitUnitParserRuleCall_0_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__UnitAssignment_0_11"


    // $ANTLR start "rule__Ingredient__VeganismLevelAssignment_0_15"
    // InternalMyDsl.g:4294:1: rule__Ingredient__VeganismLevelAssignment_0_15 : ( ruleVeganismLevel ) ;
    public final void rule__Ingredient__VeganismLevelAssignment_0_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4298:1: ( ( ruleVeganismLevel ) )
            // InternalMyDsl.g:4299:2: ( ruleVeganismLevel )
            {
            // InternalMyDsl.g:4299:2: ( ruleVeganismLevel )
            // InternalMyDsl.g:4300:3: ruleVeganismLevel
            {
             before(grammarAccess.getIngredientAccess().getVeganismLevelVeganismLevelParserRuleCall_0_15_0()); 
            pushFollow(FOLLOW_2);
            ruleVeganismLevel();

            state._fsp--;

             after(grammarAccess.getIngredientAccess().getVeganismLevelVeganismLevelParserRuleCall_0_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__VeganismLevelAssignment_0_15"


    // $ANTLR start "rule__Ingredient__RecipeAssignment_1"
    // InternalMyDsl.g:4309:1: rule__Ingredient__RecipeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Ingredient__RecipeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4313:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4314:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4314:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4315:3: ( RULE_ID )
            {
             before(grammarAccess.getIngredientAccess().getRecipeRecipeCrossReference_1_0()); 
            // InternalMyDsl.g:4316:3: ( RULE_ID )
            // InternalMyDsl.g:4317:4: RULE_ID
            {
             before(grammarAccess.getIngredientAccess().getRecipeRecipeIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIngredientAccess().getRecipeRecipeIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getIngredientAccess().getRecipeRecipeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__RecipeAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000440000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000E0000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000003810L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000001FE0000L});

}