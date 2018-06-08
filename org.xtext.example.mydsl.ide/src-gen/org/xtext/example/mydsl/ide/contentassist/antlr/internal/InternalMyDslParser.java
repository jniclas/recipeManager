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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NEWLINE", "RULE_SL_COMMENT", "RULE_ID", "RULE_QSTRING", "RULE_INT", "RULE_INGEREDIENTSTRING", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'easy'", "'medium'", "'hard'", "'Vegan'", "'Vegetaric'", "'Carnivorous'", "'ml'", "'l'", "'g'", "'kg'", "'tsp'", "'mg'", "'tbsp'", "'pcs'", "'authors'", "'recipes'", "'von'", "','", "'min'", "'Kitchen Utensils'", "'Food Categories'", "'Ingredients'", "'Ratings'"
    };
    public static final int RULE_NEWLINE=4;
    public static final int RULE_STRING=10;
    public static final int RULE_SL_COMMENT=5;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int RULE_INGEREDIENTSTRING=9;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int RULE_QSTRING=7;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

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


    // $ANTLR start "entryRuleAuthor"
    // InternalMyDsl.g:78:1: entryRuleAuthor : ruleAuthor EOF ;
    public final void entryRuleAuthor() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleAuthor EOF )
            // InternalMyDsl.g:80:1: ruleAuthor EOF
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
    // InternalMyDsl.g:87:1: ruleAuthor : ( ( rule__Author__Group__0 ) ) ;
    public final void ruleAuthor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Author__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Author__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Author__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Author__Group__0 )
            {
             before(grammarAccess.getAuthorAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Author__Group__0 )
            // InternalMyDsl.g:94:4: rule__Author__Group__0
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


    // $ANTLR start "entryRuleRating"
    // InternalMyDsl.g:103:1: entryRuleRating : ruleRating EOF ;
    public final void entryRuleRating() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleRating EOF )
            // InternalMyDsl.g:105:1: ruleRating EOF
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
    // InternalMyDsl.g:112:1: ruleRating : ( ( rule__Rating__Group__0 ) ) ;
    public final void ruleRating() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Rating__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Rating__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Rating__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Rating__Group__0 )
            {
             before(grammarAccess.getRatingAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Rating__Group__0 )
            // InternalMyDsl.g:119:4: rule__Rating__Group__0
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
    // InternalMyDsl.g:128:1: entryRuleRecipe : ruleRecipe EOF ;
    public final void entryRuleRecipe() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleRecipe EOF )
            // InternalMyDsl.g:130:1: ruleRecipe EOF
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
    // InternalMyDsl.g:137:1: ruleRecipe : ( ( rule__Recipe__Group__0 ) ) ;
    public final void ruleRecipe() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Recipe__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Recipe__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Recipe__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Recipe__Group__0 )
            {
             before(grammarAccess.getRecipeAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Recipe__Group__0 )
            // InternalMyDsl.g:144:4: rule__Recipe__Group__0
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
    // InternalMyDsl.g:153:1: entryRuleKitchenUtensil : ruleKitchenUtensil EOF ;
    public final void entryRuleKitchenUtensil() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleKitchenUtensil EOF )
            // InternalMyDsl.g:155:1: ruleKitchenUtensil EOF
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
    // InternalMyDsl.g:162:1: ruleKitchenUtensil : ( ( rule__KitchenUtensil__NameAssignment ) ) ;
    public final void ruleKitchenUtensil() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__KitchenUtensil__NameAssignment ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__KitchenUtensil__NameAssignment ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__KitchenUtensil__NameAssignment ) )
            // InternalMyDsl.g:168:3: ( rule__KitchenUtensil__NameAssignment )
            {
             before(grammarAccess.getKitchenUtensilAccess().getNameAssignment()); 
            // InternalMyDsl.g:169:3: ( rule__KitchenUtensil__NameAssignment )
            // InternalMyDsl.g:169:4: rule__KitchenUtensil__NameAssignment
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


    // $ANTLR start "entryRuleDifficultyLevel"
    // InternalMyDsl.g:178:1: entryRuleDifficultyLevel : ruleDifficultyLevel EOF ;
    public final void entryRuleDifficultyLevel() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleDifficultyLevel EOF )
            // InternalMyDsl.g:180:1: ruleDifficultyLevel EOF
            {
             before(grammarAccess.getDifficultyLevelRule()); 
            pushFollow(FOLLOW_1);
            ruleDifficultyLevel();

            state._fsp--;

             after(grammarAccess.getDifficultyLevelRule()); 
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
    // $ANTLR end "entryRuleDifficultyLevel"


    // $ANTLR start "ruleDifficultyLevel"
    // InternalMyDsl.g:187:1: ruleDifficultyLevel : ( ( rule__DifficultyLevel__NameAssignment ) ) ;
    public final void ruleDifficultyLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__DifficultyLevel__NameAssignment ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__DifficultyLevel__NameAssignment ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__DifficultyLevel__NameAssignment ) )
            // InternalMyDsl.g:193:3: ( rule__DifficultyLevel__NameAssignment )
            {
             before(grammarAccess.getDifficultyLevelAccess().getNameAssignment()); 
            // InternalMyDsl.g:194:3: ( rule__DifficultyLevel__NameAssignment )
            // InternalMyDsl.g:194:4: rule__DifficultyLevel__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__DifficultyLevel__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDifficultyLevelAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleDifficultyLevel"


    // $ANTLR start "entryRuleFoodCategory"
    // InternalMyDsl.g:203:1: entryRuleFoodCategory : ruleFoodCategory EOF ;
    public final void entryRuleFoodCategory() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleFoodCategory EOF )
            // InternalMyDsl.g:205:1: ruleFoodCategory EOF
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
    // InternalMyDsl.g:212:1: ruleFoodCategory : ( ( rule__FoodCategory__NameAssignment ) ) ;
    public final void ruleFoodCategory() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__FoodCategory__NameAssignment ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__FoodCategory__NameAssignment ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__FoodCategory__NameAssignment ) )
            // InternalMyDsl.g:218:3: ( rule__FoodCategory__NameAssignment )
            {
             before(grammarAccess.getFoodCategoryAccess().getNameAssignment()); 
            // InternalMyDsl.g:219:3: ( rule__FoodCategory__NameAssignment )
            // InternalMyDsl.g:219:4: rule__FoodCategory__NameAssignment
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
    // InternalMyDsl.g:228:1: entryRuleIngredient : ruleIngredient EOF ;
    public final void entryRuleIngredient() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleIngredient EOF )
            // InternalMyDsl.g:230:1: ruleIngredient EOF
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
    // InternalMyDsl.g:237:1: ruleIngredient : ( ( rule__Ingredient__Group__0 ) ) ;
    public final void ruleIngredient() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Ingredient__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Ingredient__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Ingredient__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__Ingredient__Group__0 )
            {
             before(grammarAccess.getIngredientAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__Ingredient__Group__0 )
            // InternalMyDsl.g:244:4: rule__Ingredient__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIngredientAccess().getGroup()); 

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
    // InternalMyDsl.g:253:1: entryRuleVeganismLevel : ruleVeganismLevel EOF ;
    public final void entryRuleVeganismLevel() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleVeganismLevel EOF )
            // InternalMyDsl.g:255:1: ruleVeganismLevel EOF
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
    // InternalMyDsl.g:262:1: ruleVeganismLevel : ( ( rule__VeganismLevel__Alternatives ) ) ;
    public final void ruleVeganismLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__VeganismLevel__Alternatives ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__VeganismLevel__Alternatives ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__VeganismLevel__Alternatives ) )
            // InternalMyDsl.g:268:3: ( rule__VeganismLevel__Alternatives )
            {
             before(grammarAccess.getVeganismLevelAccess().getAlternatives()); 
            // InternalMyDsl.g:269:3: ( rule__VeganismLevel__Alternatives )
            // InternalMyDsl.g:269:4: rule__VeganismLevel__Alternatives
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
    // InternalMyDsl.g:278:1: entryRuleUnit : ruleUnit EOF ;
    public final void entryRuleUnit() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleUnit EOF )
            // InternalMyDsl.g:280:1: ruleUnit EOF
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
    // InternalMyDsl.g:287:1: ruleUnit : ( ( rule__Unit__Alternatives ) ) ;
    public final void ruleUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__Unit__Alternatives ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__Unit__Alternatives ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__Unit__Alternatives ) )
            // InternalMyDsl.g:293:3: ( rule__Unit__Alternatives )
            {
             before(grammarAccess.getUnitAccess().getAlternatives()); 
            // InternalMyDsl.g:294:3: ( rule__Unit__Alternatives )
            // InternalMyDsl.g:294:4: rule__Unit__Alternatives
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


    // $ANTLR start "entryRuleEOL"
    // InternalMyDsl.g:303:1: entryRuleEOL : ruleEOL EOF ;
    public final void entryRuleEOL() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleEOL EOF )
            // InternalMyDsl.g:305:1: ruleEOL EOF
            {
             before(grammarAccess.getEOLRule()); 
            pushFollow(FOLLOW_1);
            ruleEOL();

            state._fsp--;

             after(grammarAccess.getEOLRule()); 
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
    // $ANTLR end "entryRuleEOL"


    // $ANTLR start "ruleEOL"
    // InternalMyDsl.g:312:1: ruleEOL : ( ( rule__EOL__Alternatives ) ) ;
    public final void ruleEOL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__EOL__Alternatives ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__EOL__Alternatives ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__EOL__Alternatives ) )
            // InternalMyDsl.g:318:3: ( rule__EOL__Alternatives )
            {
             before(grammarAccess.getEOLAccess().getAlternatives()); 
            // InternalMyDsl.g:319:3: ( rule__EOL__Alternatives )
            // InternalMyDsl.g:319:4: rule__EOL__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EOL__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEOLAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEOL"


    // $ANTLR start "rule__DifficultyLevel__NameAlternatives_0"
    // InternalMyDsl.g:327:1: rule__DifficultyLevel__NameAlternatives_0 : ( ( 'easy' ) | ( 'medium' ) | ( 'hard' ) );
    public final void rule__DifficultyLevel__NameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:331:1: ( ( 'easy' ) | ( 'medium' ) | ( 'hard' ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt1=1;
                }
                break;
            case 15:
                {
                alt1=2;
                }
                break;
            case 16:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:332:2: ( 'easy' )
                    {
                    // InternalMyDsl.g:332:2: ( 'easy' )
                    // InternalMyDsl.g:333:3: 'easy'
                    {
                     before(grammarAccess.getDifficultyLevelAccess().getNameEasyKeyword_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getDifficultyLevelAccess().getNameEasyKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:338:2: ( 'medium' )
                    {
                    // InternalMyDsl.g:338:2: ( 'medium' )
                    // InternalMyDsl.g:339:3: 'medium'
                    {
                     before(grammarAccess.getDifficultyLevelAccess().getNameMediumKeyword_0_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getDifficultyLevelAccess().getNameMediumKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:344:2: ( 'hard' )
                    {
                    // InternalMyDsl.g:344:2: ( 'hard' )
                    // InternalMyDsl.g:345:3: 'hard'
                    {
                     before(grammarAccess.getDifficultyLevelAccess().getNameHardKeyword_0_2()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getDifficultyLevelAccess().getNameHardKeyword_0_2()); 

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
    // $ANTLR end "rule__DifficultyLevel__NameAlternatives_0"


    // $ANTLR start "rule__Ingredient__Alternatives_0"
    // InternalMyDsl.g:354:1: rule__Ingredient__Alternatives_0 : ( ( ( rule__Ingredient__Group_0_0__0 ) ) | ( ( rule__Ingredient__RecipeAssignment_0_1 ) ) );
    public final void rule__Ingredient__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:358:1: ( ( ( rule__Ingredient__Group_0_0__0 ) ) | ( ( rule__Ingredient__RecipeAssignment_0_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INGEREDIENTSTRING) ) {
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
                    // InternalMyDsl.g:359:2: ( ( rule__Ingredient__Group_0_0__0 ) )
                    {
                    // InternalMyDsl.g:359:2: ( ( rule__Ingredient__Group_0_0__0 ) )
                    // InternalMyDsl.g:360:3: ( rule__Ingredient__Group_0_0__0 )
                    {
                     before(grammarAccess.getIngredientAccess().getGroup_0_0()); 
                    // InternalMyDsl.g:361:3: ( rule__Ingredient__Group_0_0__0 )
                    // InternalMyDsl.g:361:4: rule__Ingredient__Group_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Ingredient__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIngredientAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:365:2: ( ( rule__Ingredient__RecipeAssignment_0_1 ) )
                    {
                    // InternalMyDsl.g:365:2: ( ( rule__Ingredient__RecipeAssignment_0_1 ) )
                    // InternalMyDsl.g:366:3: ( rule__Ingredient__RecipeAssignment_0_1 )
                    {
                     before(grammarAccess.getIngredientAccess().getRecipeAssignment_0_1()); 
                    // InternalMyDsl.g:367:3: ( rule__Ingredient__RecipeAssignment_0_1 )
                    // InternalMyDsl.g:367:4: rule__Ingredient__RecipeAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Ingredient__RecipeAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getIngredientAccess().getRecipeAssignment_0_1()); 

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
    // $ANTLR end "rule__Ingredient__Alternatives_0"


    // $ANTLR start "rule__VeganismLevel__Alternatives"
    // InternalMyDsl.g:375:1: rule__VeganismLevel__Alternatives : ( ( 'Vegan' ) | ( 'Vegetaric' ) | ( 'Carnivorous' ) );
    public final void rule__VeganismLevel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:379:1: ( ( 'Vegan' ) | ( 'Vegetaric' ) | ( 'Carnivorous' ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt3=1;
                }
                break;
            case 18:
                {
                alt3=2;
                }
                break;
            case 19:
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
                    // InternalMyDsl.g:380:2: ( 'Vegan' )
                    {
                    // InternalMyDsl.g:380:2: ( 'Vegan' )
                    // InternalMyDsl.g:381:3: 'Vegan'
                    {
                     before(grammarAccess.getVeganismLevelAccess().getVeganKeyword_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getVeganismLevelAccess().getVeganKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:386:2: ( 'Vegetaric' )
                    {
                    // InternalMyDsl.g:386:2: ( 'Vegetaric' )
                    // InternalMyDsl.g:387:3: 'Vegetaric'
                    {
                     before(grammarAccess.getVeganismLevelAccess().getVegetaricKeyword_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getVeganismLevelAccess().getVegetaricKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:392:2: ( 'Carnivorous' )
                    {
                    // InternalMyDsl.g:392:2: ( 'Carnivorous' )
                    // InternalMyDsl.g:393:3: 'Carnivorous'
                    {
                     before(grammarAccess.getVeganismLevelAccess().getCarnivorousKeyword_2()); 
                    match(input,19,FOLLOW_2); 
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
    // InternalMyDsl.g:402:1: rule__Unit__Alternatives : ( ( 'ml' ) | ( 'l' ) | ( 'g' ) | ( 'kg' ) | ( 'tsp' ) | ( 'mg' ) | ( 'tbsp' ) | ( 'pcs' ) );
    public final void rule__Unit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:406:1: ( ( 'ml' ) | ( 'l' ) | ( 'g' ) | ( 'kg' ) | ( 'tsp' ) | ( 'mg' ) | ( 'tbsp' ) | ( 'pcs' ) )
            int alt4=8;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt4=1;
                }
                break;
            case 21:
                {
                alt4=2;
                }
                break;
            case 22:
                {
                alt4=3;
                }
                break;
            case 23:
                {
                alt4=4;
                }
                break;
            case 24:
                {
                alt4=5;
                }
                break;
            case 25:
                {
                alt4=6;
                }
                break;
            case 26:
                {
                alt4=7;
                }
                break;
            case 27:
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
                    // InternalMyDsl.g:407:2: ( 'ml' )
                    {
                    // InternalMyDsl.g:407:2: ( 'ml' )
                    // InternalMyDsl.g:408:3: 'ml'
                    {
                     before(grammarAccess.getUnitAccess().getMlKeyword_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getUnitAccess().getMlKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:413:2: ( 'l' )
                    {
                    // InternalMyDsl.g:413:2: ( 'l' )
                    // InternalMyDsl.g:414:3: 'l'
                    {
                     before(grammarAccess.getUnitAccess().getLKeyword_1()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getUnitAccess().getLKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:419:2: ( 'g' )
                    {
                    // InternalMyDsl.g:419:2: ( 'g' )
                    // InternalMyDsl.g:420:3: 'g'
                    {
                     before(grammarAccess.getUnitAccess().getGKeyword_2()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getUnitAccess().getGKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:425:2: ( 'kg' )
                    {
                    // InternalMyDsl.g:425:2: ( 'kg' )
                    // InternalMyDsl.g:426:3: 'kg'
                    {
                     before(grammarAccess.getUnitAccess().getKgKeyword_3()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getUnitAccess().getKgKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:431:2: ( 'tsp' )
                    {
                    // InternalMyDsl.g:431:2: ( 'tsp' )
                    // InternalMyDsl.g:432:3: 'tsp'
                    {
                     before(grammarAccess.getUnitAccess().getTspKeyword_4()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getUnitAccess().getTspKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:437:2: ( 'mg' )
                    {
                    // InternalMyDsl.g:437:2: ( 'mg' )
                    // InternalMyDsl.g:438:3: 'mg'
                    {
                     before(grammarAccess.getUnitAccess().getMgKeyword_5()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getUnitAccess().getMgKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:443:2: ( 'tbsp' )
                    {
                    // InternalMyDsl.g:443:2: ( 'tbsp' )
                    // InternalMyDsl.g:444:3: 'tbsp'
                    {
                     before(grammarAccess.getUnitAccess().getTbspKeyword_6()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getUnitAccess().getTbspKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:449:2: ( 'pcs' )
                    {
                    // InternalMyDsl.g:449:2: ( 'pcs' )
                    // InternalMyDsl.g:450:3: 'pcs'
                    {
                     before(grammarAccess.getUnitAccess().getPcsKeyword_7()); 
                    match(input,27,FOLLOW_2); 
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


    // $ANTLR start "rule__EOL__Alternatives"
    // InternalMyDsl.g:459:1: rule__EOL__Alternatives : ( ( RULE_NEWLINE ) | ( RULE_SL_COMMENT ) );
    public final void rule__EOL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:463:1: ( ( RULE_NEWLINE ) | ( RULE_SL_COMMENT ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_NEWLINE) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_SL_COMMENT) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:464:2: ( RULE_NEWLINE )
                    {
                    // InternalMyDsl.g:464:2: ( RULE_NEWLINE )
                    // InternalMyDsl.g:465:3: RULE_NEWLINE
                    {
                     before(grammarAccess.getEOLAccess().getNEWLINETerminalRuleCall_0()); 
                    match(input,RULE_NEWLINE,FOLLOW_2); 
                     after(grammarAccess.getEOLAccess().getNEWLINETerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:470:2: ( RULE_SL_COMMENT )
                    {
                    // InternalMyDsl.g:470:2: ( RULE_SL_COMMENT )
                    // InternalMyDsl.g:471:3: RULE_SL_COMMENT
                    {
                     before(grammarAccess.getEOLAccess().getSL_COMMENTTerminalRuleCall_1()); 
                    match(input,RULE_SL_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getEOLAccess().getSL_COMMENTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EOL__Alternatives"


    // $ANTLR start "rule__RecipeManager__Group__0"
    // InternalMyDsl.g:480:1: rule__RecipeManager__Group__0 : rule__RecipeManager__Group__0__Impl rule__RecipeManager__Group__1 ;
    public final void rule__RecipeManager__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:484:1: ( rule__RecipeManager__Group__0__Impl rule__RecipeManager__Group__1 )
            // InternalMyDsl.g:485:2: rule__RecipeManager__Group__0__Impl rule__RecipeManager__Group__1
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
    // InternalMyDsl.g:492:1: rule__RecipeManager__Group__0__Impl : ( 'authors' ) ;
    public final void rule__RecipeManager__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:496:1: ( ( 'authors' ) )
            // InternalMyDsl.g:497:1: ( 'authors' )
            {
            // InternalMyDsl.g:497:1: ( 'authors' )
            // InternalMyDsl.g:498:2: 'authors'
            {
             before(grammarAccess.getRecipeManagerAccess().getAuthorsKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyDsl.g:507:1: rule__RecipeManager__Group__1 : rule__RecipeManager__Group__1__Impl rule__RecipeManager__Group__2 ;
    public final void rule__RecipeManager__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:511:1: ( rule__RecipeManager__Group__1__Impl rule__RecipeManager__Group__2 )
            // InternalMyDsl.g:512:2: rule__RecipeManager__Group__1__Impl rule__RecipeManager__Group__2
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
    // InternalMyDsl.g:519:1: rule__RecipeManager__Group__1__Impl : ( ruleEOL ) ;
    public final void rule__RecipeManager__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:523:1: ( ( ruleEOL ) )
            // InternalMyDsl.g:524:1: ( ruleEOL )
            {
            // InternalMyDsl.g:524:1: ( ruleEOL )
            // InternalMyDsl.g:525:2: ruleEOL
            {
             before(grammarAccess.getRecipeManagerAccess().getEOLParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleEOL();

            state._fsp--;

             after(grammarAccess.getRecipeManagerAccess().getEOLParserRuleCall_1()); 

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
    // InternalMyDsl.g:534:1: rule__RecipeManager__Group__2 : rule__RecipeManager__Group__2__Impl rule__RecipeManager__Group__3 ;
    public final void rule__RecipeManager__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:538:1: ( rule__RecipeManager__Group__2__Impl rule__RecipeManager__Group__3 )
            // InternalMyDsl.g:539:2: rule__RecipeManager__Group__2__Impl rule__RecipeManager__Group__3
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
    // InternalMyDsl.g:546:1: rule__RecipeManager__Group__2__Impl : ( ( rule__RecipeManager__AuthorsAssignment_2 ) ) ;
    public final void rule__RecipeManager__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:550:1: ( ( ( rule__RecipeManager__AuthorsAssignment_2 ) ) )
            // InternalMyDsl.g:551:1: ( ( rule__RecipeManager__AuthorsAssignment_2 ) )
            {
            // InternalMyDsl.g:551:1: ( ( rule__RecipeManager__AuthorsAssignment_2 ) )
            // InternalMyDsl.g:552:2: ( rule__RecipeManager__AuthorsAssignment_2 )
            {
             before(grammarAccess.getRecipeManagerAccess().getAuthorsAssignment_2()); 
            // InternalMyDsl.g:553:2: ( rule__RecipeManager__AuthorsAssignment_2 )
            // InternalMyDsl.g:553:3: rule__RecipeManager__AuthorsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RecipeManager__AuthorsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRecipeManagerAccess().getAuthorsAssignment_2()); 

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
    // InternalMyDsl.g:561:1: rule__RecipeManager__Group__3 : rule__RecipeManager__Group__3__Impl rule__RecipeManager__Group__4 ;
    public final void rule__RecipeManager__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:565:1: ( rule__RecipeManager__Group__3__Impl rule__RecipeManager__Group__4 )
            // InternalMyDsl.g:566:2: rule__RecipeManager__Group__3__Impl rule__RecipeManager__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:573:1: rule__RecipeManager__Group__3__Impl : ( ( rule__RecipeManager__AuthorsAssignment_3 )* ) ;
    public final void rule__RecipeManager__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:577:1: ( ( ( rule__RecipeManager__AuthorsAssignment_3 )* ) )
            // InternalMyDsl.g:578:1: ( ( rule__RecipeManager__AuthorsAssignment_3 )* )
            {
            // InternalMyDsl.g:578:1: ( ( rule__RecipeManager__AuthorsAssignment_3 )* )
            // InternalMyDsl.g:579:2: ( rule__RecipeManager__AuthorsAssignment_3 )*
            {
             before(grammarAccess.getRecipeManagerAccess().getAuthorsAssignment_3()); 
            // InternalMyDsl.g:580:2: ( rule__RecipeManager__AuthorsAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:580:3: rule__RecipeManager__AuthorsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__RecipeManager__AuthorsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getRecipeManagerAccess().getAuthorsAssignment_3()); 

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
    // InternalMyDsl.g:588:1: rule__RecipeManager__Group__4 : rule__RecipeManager__Group__4__Impl ;
    public final void rule__RecipeManager__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:592:1: ( rule__RecipeManager__Group__4__Impl )
            // InternalMyDsl.g:593:2: rule__RecipeManager__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RecipeManager__Group__4__Impl();

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
    // InternalMyDsl.g:599:1: rule__RecipeManager__Group__4__Impl : ( ( rule__RecipeManager__Group_4__0 )? ) ;
    public final void rule__RecipeManager__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:603:1: ( ( ( rule__RecipeManager__Group_4__0 )? ) )
            // InternalMyDsl.g:604:1: ( ( rule__RecipeManager__Group_4__0 )? )
            {
            // InternalMyDsl.g:604:1: ( ( rule__RecipeManager__Group_4__0 )? )
            // InternalMyDsl.g:605:2: ( rule__RecipeManager__Group_4__0 )?
            {
             before(grammarAccess.getRecipeManagerAccess().getGroup_4()); 
            // InternalMyDsl.g:606:2: ( rule__RecipeManager__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==29) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:606:3: rule__RecipeManager__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RecipeManager__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRecipeManagerAccess().getGroup_4()); 

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


    // $ANTLR start "rule__RecipeManager__Group_4__0"
    // InternalMyDsl.g:615:1: rule__RecipeManager__Group_4__0 : rule__RecipeManager__Group_4__0__Impl rule__RecipeManager__Group_4__1 ;
    public final void rule__RecipeManager__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:619:1: ( rule__RecipeManager__Group_4__0__Impl rule__RecipeManager__Group_4__1 )
            // InternalMyDsl.g:620:2: rule__RecipeManager__Group_4__0__Impl rule__RecipeManager__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__RecipeManager__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecipeManager__Group_4__1();

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
    // $ANTLR end "rule__RecipeManager__Group_4__0"


    // $ANTLR start "rule__RecipeManager__Group_4__0__Impl"
    // InternalMyDsl.g:627:1: rule__RecipeManager__Group_4__0__Impl : ( 'recipes' ) ;
    public final void rule__RecipeManager__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:631:1: ( ( 'recipes' ) )
            // InternalMyDsl.g:632:1: ( 'recipes' )
            {
            // InternalMyDsl.g:632:1: ( 'recipes' )
            // InternalMyDsl.g:633:2: 'recipes'
            {
             before(grammarAccess.getRecipeManagerAccess().getRecipesKeyword_4_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getRecipeManagerAccess().getRecipesKeyword_4_0()); 

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
    // $ANTLR end "rule__RecipeManager__Group_4__0__Impl"


    // $ANTLR start "rule__RecipeManager__Group_4__1"
    // InternalMyDsl.g:642:1: rule__RecipeManager__Group_4__1 : rule__RecipeManager__Group_4__1__Impl rule__RecipeManager__Group_4__2 ;
    public final void rule__RecipeManager__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:646:1: ( rule__RecipeManager__Group_4__1__Impl rule__RecipeManager__Group_4__2 )
            // InternalMyDsl.g:647:2: rule__RecipeManager__Group_4__1__Impl rule__RecipeManager__Group_4__2
            {
            pushFollow(FOLLOW_4);
            rule__RecipeManager__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecipeManager__Group_4__2();

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
    // $ANTLR end "rule__RecipeManager__Group_4__1"


    // $ANTLR start "rule__RecipeManager__Group_4__1__Impl"
    // InternalMyDsl.g:654:1: rule__RecipeManager__Group_4__1__Impl : ( ruleEOL ) ;
    public final void rule__RecipeManager__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:658:1: ( ( ruleEOL ) )
            // InternalMyDsl.g:659:1: ( ruleEOL )
            {
            // InternalMyDsl.g:659:1: ( ruleEOL )
            // InternalMyDsl.g:660:2: ruleEOL
            {
             before(grammarAccess.getRecipeManagerAccess().getEOLParserRuleCall_4_1()); 
            pushFollow(FOLLOW_2);
            ruleEOL();

            state._fsp--;

             after(grammarAccess.getRecipeManagerAccess().getEOLParserRuleCall_4_1()); 

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
    // $ANTLR end "rule__RecipeManager__Group_4__1__Impl"


    // $ANTLR start "rule__RecipeManager__Group_4__2"
    // InternalMyDsl.g:669:1: rule__RecipeManager__Group_4__2 : rule__RecipeManager__Group_4__2__Impl rule__RecipeManager__Group_4__3 ;
    public final void rule__RecipeManager__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:673:1: ( rule__RecipeManager__Group_4__2__Impl rule__RecipeManager__Group_4__3 )
            // InternalMyDsl.g:674:2: rule__RecipeManager__Group_4__2__Impl rule__RecipeManager__Group_4__3
            {
            pushFollow(FOLLOW_4);
            rule__RecipeManager__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecipeManager__Group_4__3();

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
    // $ANTLR end "rule__RecipeManager__Group_4__2"


    // $ANTLR start "rule__RecipeManager__Group_4__2__Impl"
    // InternalMyDsl.g:681:1: rule__RecipeManager__Group_4__2__Impl : ( ( rule__RecipeManager__RecipesAssignment_4_2 ) ) ;
    public final void rule__RecipeManager__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:685:1: ( ( ( rule__RecipeManager__RecipesAssignment_4_2 ) ) )
            // InternalMyDsl.g:686:1: ( ( rule__RecipeManager__RecipesAssignment_4_2 ) )
            {
            // InternalMyDsl.g:686:1: ( ( rule__RecipeManager__RecipesAssignment_4_2 ) )
            // InternalMyDsl.g:687:2: ( rule__RecipeManager__RecipesAssignment_4_2 )
            {
             before(grammarAccess.getRecipeManagerAccess().getRecipesAssignment_4_2()); 
            // InternalMyDsl.g:688:2: ( rule__RecipeManager__RecipesAssignment_4_2 )
            // InternalMyDsl.g:688:3: rule__RecipeManager__RecipesAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__RecipeManager__RecipesAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getRecipeManagerAccess().getRecipesAssignment_4_2()); 

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
    // $ANTLR end "rule__RecipeManager__Group_4__2__Impl"


    // $ANTLR start "rule__RecipeManager__Group_4__3"
    // InternalMyDsl.g:696:1: rule__RecipeManager__Group_4__3 : rule__RecipeManager__Group_4__3__Impl ;
    public final void rule__RecipeManager__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:700:1: ( rule__RecipeManager__Group_4__3__Impl )
            // InternalMyDsl.g:701:2: rule__RecipeManager__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RecipeManager__Group_4__3__Impl();

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
    // $ANTLR end "rule__RecipeManager__Group_4__3"


    // $ANTLR start "rule__RecipeManager__Group_4__3__Impl"
    // InternalMyDsl.g:707:1: rule__RecipeManager__Group_4__3__Impl : ( ( rule__RecipeManager__RecipesAssignment_4_3 )* ) ;
    public final void rule__RecipeManager__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:711:1: ( ( ( rule__RecipeManager__RecipesAssignment_4_3 )* ) )
            // InternalMyDsl.g:712:1: ( ( rule__RecipeManager__RecipesAssignment_4_3 )* )
            {
            // InternalMyDsl.g:712:1: ( ( rule__RecipeManager__RecipesAssignment_4_3 )* )
            // InternalMyDsl.g:713:2: ( rule__RecipeManager__RecipesAssignment_4_3 )*
            {
             before(grammarAccess.getRecipeManagerAccess().getRecipesAssignment_4_3()); 
            // InternalMyDsl.g:714:2: ( rule__RecipeManager__RecipesAssignment_4_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:714:3: rule__RecipeManager__RecipesAssignment_4_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__RecipeManager__RecipesAssignment_4_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getRecipeManagerAccess().getRecipesAssignment_4_3()); 

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
    // $ANTLR end "rule__RecipeManager__Group_4__3__Impl"


    // $ANTLR start "rule__Author__Group__0"
    // InternalMyDsl.g:723:1: rule__Author__Group__0 : rule__Author__Group__0__Impl rule__Author__Group__1 ;
    public final void rule__Author__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:727:1: ( rule__Author__Group__0__Impl rule__Author__Group__1 )
            // InternalMyDsl.g:728:2: rule__Author__Group__0__Impl rule__Author__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:735:1: rule__Author__Group__0__Impl : ( ( rule__Author__NameAssignment_0 ) ) ;
    public final void rule__Author__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:739:1: ( ( ( rule__Author__NameAssignment_0 ) ) )
            // InternalMyDsl.g:740:1: ( ( rule__Author__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:740:1: ( ( rule__Author__NameAssignment_0 ) )
            // InternalMyDsl.g:741:2: ( rule__Author__NameAssignment_0 )
            {
             before(grammarAccess.getAuthorAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:742:2: ( rule__Author__NameAssignment_0 )
            // InternalMyDsl.g:742:3: rule__Author__NameAssignment_0
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
    // InternalMyDsl.g:750:1: rule__Author__Group__1 : rule__Author__Group__1__Impl ;
    public final void rule__Author__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:754:1: ( rule__Author__Group__1__Impl )
            // InternalMyDsl.g:755:2: rule__Author__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Author__Group__1__Impl();

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
    // InternalMyDsl.g:761:1: rule__Author__Group__1__Impl : ( ( rule__Author__EmailAssignment_1 ) ) ;
    public final void rule__Author__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:765:1: ( ( ( rule__Author__EmailAssignment_1 ) ) )
            // InternalMyDsl.g:766:1: ( ( rule__Author__EmailAssignment_1 ) )
            {
            // InternalMyDsl.g:766:1: ( ( rule__Author__EmailAssignment_1 ) )
            // InternalMyDsl.g:767:2: ( rule__Author__EmailAssignment_1 )
            {
             before(grammarAccess.getAuthorAccess().getEmailAssignment_1()); 
            // InternalMyDsl.g:768:2: ( rule__Author__EmailAssignment_1 )
            // InternalMyDsl.g:768:3: rule__Author__EmailAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Author__EmailAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAuthorAccess().getEmailAssignment_1()); 

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


    // $ANTLR start "rule__Rating__Group__0"
    // InternalMyDsl.g:777:1: rule__Rating__Group__0 : rule__Rating__Group__0__Impl rule__Rating__Group__1 ;
    public final void rule__Rating__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:781:1: ( rule__Rating__Group__0__Impl rule__Rating__Group__1 )
            // InternalMyDsl.g:782:2: rule__Rating__Group__0__Impl rule__Rating__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:789:1: rule__Rating__Group__0__Impl : ( ( rule__Rating__StarsAssignment_0 ) ) ;
    public final void rule__Rating__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:793:1: ( ( ( rule__Rating__StarsAssignment_0 ) ) )
            // InternalMyDsl.g:794:1: ( ( rule__Rating__StarsAssignment_0 ) )
            {
            // InternalMyDsl.g:794:1: ( ( rule__Rating__StarsAssignment_0 ) )
            // InternalMyDsl.g:795:2: ( rule__Rating__StarsAssignment_0 )
            {
             before(grammarAccess.getRatingAccess().getStarsAssignment_0()); 
            // InternalMyDsl.g:796:2: ( rule__Rating__StarsAssignment_0 )
            // InternalMyDsl.g:796:3: rule__Rating__StarsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Rating__StarsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRatingAccess().getStarsAssignment_0()); 

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
    // InternalMyDsl.g:804:1: rule__Rating__Group__1 : rule__Rating__Group__1__Impl rule__Rating__Group__2 ;
    public final void rule__Rating__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:808:1: ( rule__Rating__Group__1__Impl rule__Rating__Group__2 )
            // InternalMyDsl.g:809:2: rule__Rating__Group__1__Impl rule__Rating__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:816:1: rule__Rating__Group__1__Impl : ( ( rule__Rating__CommentAssignment_1 ) ) ;
    public final void rule__Rating__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:820:1: ( ( ( rule__Rating__CommentAssignment_1 ) ) )
            // InternalMyDsl.g:821:1: ( ( rule__Rating__CommentAssignment_1 ) )
            {
            // InternalMyDsl.g:821:1: ( ( rule__Rating__CommentAssignment_1 ) )
            // InternalMyDsl.g:822:2: ( rule__Rating__CommentAssignment_1 )
            {
             before(grammarAccess.getRatingAccess().getCommentAssignment_1()); 
            // InternalMyDsl.g:823:2: ( rule__Rating__CommentAssignment_1 )
            // InternalMyDsl.g:823:3: rule__Rating__CommentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Rating__CommentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRatingAccess().getCommentAssignment_1()); 

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
    // InternalMyDsl.g:831:1: rule__Rating__Group__2 : rule__Rating__Group__2__Impl rule__Rating__Group__3 ;
    public final void rule__Rating__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:835:1: ( rule__Rating__Group__2__Impl rule__Rating__Group__3 )
            // InternalMyDsl.g:836:2: rule__Rating__Group__2__Impl rule__Rating__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:843:1: rule__Rating__Group__2__Impl : ( 'von' ) ;
    public final void rule__Rating__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:847:1: ( ( 'von' ) )
            // InternalMyDsl.g:848:1: ( 'von' )
            {
            // InternalMyDsl.g:848:1: ( 'von' )
            // InternalMyDsl.g:849:2: 'von'
            {
             before(grammarAccess.getRatingAccess().getVonKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getRatingAccess().getVonKeyword_2()); 

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
    // InternalMyDsl.g:858:1: rule__Rating__Group__3 : rule__Rating__Group__3__Impl rule__Rating__Group__4 ;
    public final void rule__Rating__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:862:1: ( rule__Rating__Group__3__Impl rule__Rating__Group__4 )
            // InternalMyDsl.g:863:2: rule__Rating__Group__3__Impl rule__Rating__Group__4
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyDsl.g:870:1: rule__Rating__Group__3__Impl : ( ( rule__Rating__AuthorAssignment_3 ) ) ;
    public final void rule__Rating__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:874:1: ( ( ( rule__Rating__AuthorAssignment_3 ) ) )
            // InternalMyDsl.g:875:1: ( ( rule__Rating__AuthorAssignment_3 ) )
            {
            // InternalMyDsl.g:875:1: ( ( rule__Rating__AuthorAssignment_3 ) )
            // InternalMyDsl.g:876:2: ( rule__Rating__AuthorAssignment_3 )
            {
             before(grammarAccess.getRatingAccess().getAuthorAssignment_3()); 
            // InternalMyDsl.g:877:2: ( rule__Rating__AuthorAssignment_3 )
            // InternalMyDsl.g:877:3: rule__Rating__AuthorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Rating__AuthorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRatingAccess().getAuthorAssignment_3()); 

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
    // InternalMyDsl.g:885:1: rule__Rating__Group__4 : rule__Rating__Group__4__Impl ;
    public final void rule__Rating__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:889:1: ( rule__Rating__Group__4__Impl )
            // InternalMyDsl.g:890:2: rule__Rating__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rating__Group__4__Impl();

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
    // InternalMyDsl.g:896:1: rule__Rating__Group__4__Impl : ( ruleEOL ) ;
    public final void rule__Rating__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:900:1: ( ( ruleEOL ) )
            // InternalMyDsl.g:901:1: ( ruleEOL )
            {
            // InternalMyDsl.g:901:1: ( ruleEOL )
            // InternalMyDsl.g:902:2: ruleEOL
            {
             before(grammarAccess.getRatingAccess().getEOLParserRuleCall_4()); 
            pushFollow(FOLLOW_2);
            ruleEOL();

            state._fsp--;

             after(grammarAccess.getRatingAccess().getEOLParserRuleCall_4()); 

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


    // $ANTLR start "rule__Recipe__Group__0"
    // InternalMyDsl.g:912:1: rule__Recipe__Group__0 : rule__Recipe__Group__0__Impl rule__Recipe__Group__1 ;
    public final void rule__Recipe__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:916:1: ( rule__Recipe__Group__0__Impl rule__Recipe__Group__1 )
            // InternalMyDsl.g:917:2: rule__Recipe__Group__0__Impl rule__Recipe__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:924:1: rule__Recipe__Group__0__Impl : ( ( rule__Recipe__NameAssignment_0 ) ) ;
    public final void rule__Recipe__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:928:1: ( ( ( rule__Recipe__NameAssignment_0 ) ) )
            // InternalMyDsl.g:929:1: ( ( rule__Recipe__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:929:1: ( ( rule__Recipe__NameAssignment_0 ) )
            // InternalMyDsl.g:930:2: ( rule__Recipe__NameAssignment_0 )
            {
             before(grammarAccess.getRecipeAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:931:2: ( rule__Recipe__NameAssignment_0 )
            // InternalMyDsl.g:931:3: rule__Recipe__NameAssignment_0
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
    // InternalMyDsl.g:939:1: rule__Recipe__Group__1 : rule__Recipe__Group__1__Impl rule__Recipe__Group__2 ;
    public final void rule__Recipe__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:943:1: ( rule__Recipe__Group__1__Impl rule__Recipe__Group__2 )
            // InternalMyDsl.g:944:2: rule__Recipe__Group__1__Impl rule__Recipe__Group__2
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
    // InternalMyDsl.g:951:1: rule__Recipe__Group__1__Impl : ( 'von' ) ;
    public final void rule__Recipe__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:955:1: ( ( 'von' ) )
            // InternalMyDsl.g:956:1: ( 'von' )
            {
            // InternalMyDsl.g:956:1: ( 'von' )
            // InternalMyDsl.g:957:2: 'von'
            {
             before(grammarAccess.getRecipeAccess().getVonKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getVonKeyword_1()); 

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
    // InternalMyDsl.g:966:1: rule__Recipe__Group__2 : rule__Recipe__Group__2__Impl rule__Recipe__Group__3 ;
    public final void rule__Recipe__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:970:1: ( rule__Recipe__Group__2__Impl rule__Recipe__Group__3 )
            // InternalMyDsl.g:971:2: rule__Recipe__Group__2__Impl rule__Recipe__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:978:1: rule__Recipe__Group__2__Impl : ( ( rule__Recipe__AuthorAssignment_2 ) ) ;
    public final void rule__Recipe__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:982:1: ( ( ( rule__Recipe__AuthorAssignment_2 ) ) )
            // InternalMyDsl.g:983:1: ( ( rule__Recipe__AuthorAssignment_2 ) )
            {
            // InternalMyDsl.g:983:1: ( ( rule__Recipe__AuthorAssignment_2 ) )
            // InternalMyDsl.g:984:2: ( rule__Recipe__AuthorAssignment_2 )
            {
             before(grammarAccess.getRecipeAccess().getAuthorAssignment_2()); 
            // InternalMyDsl.g:985:2: ( rule__Recipe__AuthorAssignment_2 )
            // InternalMyDsl.g:985:3: rule__Recipe__AuthorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__AuthorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getAuthorAssignment_2()); 

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
    // InternalMyDsl.g:993:1: rule__Recipe__Group__3 : rule__Recipe__Group__3__Impl rule__Recipe__Group__4 ;
    public final void rule__Recipe__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:997:1: ( rule__Recipe__Group__3__Impl rule__Recipe__Group__4 )
            // InternalMyDsl.g:998:2: rule__Recipe__Group__3__Impl rule__Recipe__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:1005:1: rule__Recipe__Group__3__Impl : ( ',' ) ;
    public final void rule__Recipe__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1009:1: ( ( ',' ) )
            // InternalMyDsl.g:1010:1: ( ',' )
            {
            // InternalMyDsl.g:1010:1: ( ',' )
            // InternalMyDsl.g:1011:2: ','
            {
             before(grammarAccess.getRecipeAccess().getCommaKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getCommaKeyword_3()); 

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
    // InternalMyDsl.g:1020:1: rule__Recipe__Group__4 : rule__Recipe__Group__4__Impl rule__Recipe__Group__5 ;
    public final void rule__Recipe__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1024:1: ( rule__Recipe__Group__4__Impl rule__Recipe__Group__5 )
            // InternalMyDsl.g:1025:2: rule__Recipe__Group__4__Impl rule__Recipe__Group__5
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:1032:1: rule__Recipe__Group__4__Impl : ( ( rule__Recipe__VeganAssignment_4 ) ) ;
    public final void rule__Recipe__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1036:1: ( ( ( rule__Recipe__VeganAssignment_4 ) ) )
            // InternalMyDsl.g:1037:1: ( ( rule__Recipe__VeganAssignment_4 ) )
            {
            // InternalMyDsl.g:1037:1: ( ( rule__Recipe__VeganAssignment_4 ) )
            // InternalMyDsl.g:1038:2: ( rule__Recipe__VeganAssignment_4 )
            {
             before(grammarAccess.getRecipeAccess().getVeganAssignment_4()); 
            // InternalMyDsl.g:1039:2: ( rule__Recipe__VeganAssignment_4 )
            // InternalMyDsl.g:1039:3: rule__Recipe__VeganAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__VeganAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getVeganAssignment_4()); 

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
    // InternalMyDsl.g:1047:1: rule__Recipe__Group__5 : rule__Recipe__Group__5__Impl rule__Recipe__Group__6 ;
    public final void rule__Recipe__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1051:1: ( rule__Recipe__Group__5__Impl rule__Recipe__Group__6 )
            // InternalMyDsl.g:1052:2: rule__Recipe__Group__5__Impl rule__Recipe__Group__6
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:1059:1: rule__Recipe__Group__5__Impl : ( ',' ) ;
    public final void rule__Recipe__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1063:1: ( ( ',' ) )
            // InternalMyDsl.g:1064:1: ( ',' )
            {
            // InternalMyDsl.g:1064:1: ( ',' )
            // InternalMyDsl.g:1065:2: ','
            {
             before(grammarAccess.getRecipeAccess().getCommaKeyword_5()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getCommaKeyword_5()); 

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
    // InternalMyDsl.g:1074:1: rule__Recipe__Group__6 : rule__Recipe__Group__6__Impl rule__Recipe__Group__7 ;
    public final void rule__Recipe__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1078:1: ( rule__Recipe__Group__6__Impl rule__Recipe__Group__7 )
            // InternalMyDsl.g:1079:2: rule__Recipe__Group__6__Impl rule__Recipe__Group__7
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:1086:1: rule__Recipe__Group__6__Impl : ( ( rule__Recipe__DurationAssignment_6 ) ) ;
    public final void rule__Recipe__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1090:1: ( ( ( rule__Recipe__DurationAssignment_6 ) ) )
            // InternalMyDsl.g:1091:1: ( ( rule__Recipe__DurationAssignment_6 ) )
            {
            // InternalMyDsl.g:1091:1: ( ( rule__Recipe__DurationAssignment_6 ) )
            // InternalMyDsl.g:1092:2: ( rule__Recipe__DurationAssignment_6 )
            {
             before(grammarAccess.getRecipeAccess().getDurationAssignment_6()); 
            // InternalMyDsl.g:1093:2: ( rule__Recipe__DurationAssignment_6 )
            // InternalMyDsl.g:1093:3: rule__Recipe__DurationAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__DurationAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getDurationAssignment_6()); 

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
    // InternalMyDsl.g:1101:1: rule__Recipe__Group__7 : rule__Recipe__Group__7__Impl rule__Recipe__Group__8 ;
    public final void rule__Recipe__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1105:1: ( rule__Recipe__Group__7__Impl rule__Recipe__Group__8 )
            // InternalMyDsl.g:1106:2: rule__Recipe__Group__7__Impl rule__Recipe__Group__8
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:1113:1: rule__Recipe__Group__7__Impl : ( 'min' ) ;
    public final void rule__Recipe__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1117:1: ( ( 'min' ) )
            // InternalMyDsl.g:1118:1: ( 'min' )
            {
            // InternalMyDsl.g:1118:1: ( 'min' )
            // InternalMyDsl.g:1119:2: 'min'
            {
             before(grammarAccess.getRecipeAccess().getMinKeyword_7()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getMinKeyword_7()); 

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
    // InternalMyDsl.g:1128:1: rule__Recipe__Group__8 : rule__Recipe__Group__8__Impl rule__Recipe__Group__9 ;
    public final void rule__Recipe__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1132:1: ( rule__Recipe__Group__8__Impl rule__Recipe__Group__9 )
            // InternalMyDsl.g:1133:2: rule__Recipe__Group__8__Impl rule__Recipe__Group__9
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:1140:1: rule__Recipe__Group__8__Impl : ( ',' ) ;
    public final void rule__Recipe__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1144:1: ( ( ',' ) )
            // InternalMyDsl.g:1145:1: ( ',' )
            {
            // InternalMyDsl.g:1145:1: ( ',' )
            // InternalMyDsl.g:1146:2: ','
            {
             before(grammarAccess.getRecipeAccess().getCommaKeyword_8()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getCommaKeyword_8()); 

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
    // InternalMyDsl.g:1155:1: rule__Recipe__Group__9 : rule__Recipe__Group__9__Impl rule__Recipe__Group__10 ;
    public final void rule__Recipe__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1159:1: ( rule__Recipe__Group__9__Impl rule__Recipe__Group__10 )
            // InternalMyDsl.g:1160:2: rule__Recipe__Group__9__Impl rule__Recipe__Group__10
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyDsl.g:1167:1: rule__Recipe__Group__9__Impl : ( ( rule__Recipe__DifficultyAssignment_9 ) ) ;
    public final void rule__Recipe__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1171:1: ( ( ( rule__Recipe__DifficultyAssignment_9 ) ) )
            // InternalMyDsl.g:1172:1: ( ( rule__Recipe__DifficultyAssignment_9 ) )
            {
            // InternalMyDsl.g:1172:1: ( ( rule__Recipe__DifficultyAssignment_9 ) )
            // InternalMyDsl.g:1173:2: ( rule__Recipe__DifficultyAssignment_9 )
            {
             before(grammarAccess.getRecipeAccess().getDifficultyAssignment_9()); 
            // InternalMyDsl.g:1174:2: ( rule__Recipe__DifficultyAssignment_9 )
            // InternalMyDsl.g:1174:3: rule__Recipe__DifficultyAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__DifficultyAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getDifficultyAssignment_9()); 

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
    // InternalMyDsl.g:1182:1: rule__Recipe__Group__10 : rule__Recipe__Group__10__Impl rule__Recipe__Group__11 ;
    public final void rule__Recipe__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1186:1: ( rule__Recipe__Group__10__Impl rule__Recipe__Group__11 )
            // InternalMyDsl.g:1187:2: rule__Recipe__Group__10__Impl rule__Recipe__Group__11
            {
            pushFollow(FOLLOW_14);
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
    // InternalMyDsl.g:1194:1: rule__Recipe__Group__10__Impl : ( ruleEOL ) ;
    public final void rule__Recipe__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1198:1: ( ( ruleEOL ) )
            // InternalMyDsl.g:1199:1: ( ruleEOL )
            {
            // InternalMyDsl.g:1199:1: ( ruleEOL )
            // InternalMyDsl.g:1200:2: ruleEOL
            {
             before(grammarAccess.getRecipeAccess().getEOLParserRuleCall_10()); 
            pushFollow(FOLLOW_2);
            ruleEOL();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getEOLParserRuleCall_10()); 

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
    // InternalMyDsl.g:1209:1: rule__Recipe__Group__11 : rule__Recipe__Group__11__Impl rule__Recipe__Group__12 ;
    public final void rule__Recipe__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1213:1: ( rule__Recipe__Group__11__Impl rule__Recipe__Group__12 )
            // InternalMyDsl.g:1214:2: rule__Recipe__Group__11__Impl rule__Recipe__Group__12
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
    // InternalMyDsl.g:1221:1: rule__Recipe__Group__11__Impl : ( 'Kitchen Utensils' ) ;
    public final void rule__Recipe__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1225:1: ( ( 'Kitchen Utensils' ) )
            // InternalMyDsl.g:1226:1: ( 'Kitchen Utensils' )
            {
            // InternalMyDsl.g:1226:1: ( 'Kitchen Utensils' )
            // InternalMyDsl.g:1227:2: 'Kitchen Utensils'
            {
             before(grammarAccess.getRecipeAccess().getKitchenUtensilsKeyword_11()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getKitchenUtensilsKeyword_11()); 

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
    // InternalMyDsl.g:1236:1: rule__Recipe__Group__12 : rule__Recipe__Group__12__Impl rule__Recipe__Group__13 ;
    public final void rule__Recipe__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1240:1: ( rule__Recipe__Group__12__Impl rule__Recipe__Group__13 )
            // InternalMyDsl.g:1241:2: rule__Recipe__Group__12__Impl rule__Recipe__Group__13
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:1248:1: rule__Recipe__Group__12__Impl : ( ruleEOL ) ;
    public final void rule__Recipe__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1252:1: ( ( ruleEOL ) )
            // InternalMyDsl.g:1253:1: ( ruleEOL )
            {
            // InternalMyDsl.g:1253:1: ( ruleEOL )
            // InternalMyDsl.g:1254:2: ruleEOL
            {
             before(grammarAccess.getRecipeAccess().getEOLParserRuleCall_12()); 
            pushFollow(FOLLOW_2);
            ruleEOL();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getEOLParserRuleCall_12()); 

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
    // InternalMyDsl.g:1263:1: rule__Recipe__Group__13 : rule__Recipe__Group__13__Impl rule__Recipe__Group__14 ;
    public final void rule__Recipe__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1267:1: ( rule__Recipe__Group__13__Impl rule__Recipe__Group__14 )
            // InternalMyDsl.g:1268:2: rule__Recipe__Group__13__Impl rule__Recipe__Group__14
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:1275:1: rule__Recipe__Group__13__Impl : ( ( rule__Recipe__KitchenUtensilsAssignment_13 ) ) ;
    public final void rule__Recipe__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1279:1: ( ( ( rule__Recipe__KitchenUtensilsAssignment_13 ) ) )
            // InternalMyDsl.g:1280:1: ( ( rule__Recipe__KitchenUtensilsAssignment_13 ) )
            {
            // InternalMyDsl.g:1280:1: ( ( rule__Recipe__KitchenUtensilsAssignment_13 ) )
            // InternalMyDsl.g:1281:2: ( rule__Recipe__KitchenUtensilsAssignment_13 )
            {
             before(grammarAccess.getRecipeAccess().getKitchenUtensilsAssignment_13()); 
            // InternalMyDsl.g:1282:2: ( rule__Recipe__KitchenUtensilsAssignment_13 )
            // InternalMyDsl.g:1282:3: rule__Recipe__KitchenUtensilsAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__KitchenUtensilsAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getKitchenUtensilsAssignment_13()); 

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
    // InternalMyDsl.g:1290:1: rule__Recipe__Group__14 : rule__Recipe__Group__14__Impl rule__Recipe__Group__15 ;
    public final void rule__Recipe__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1294:1: ( rule__Recipe__Group__14__Impl rule__Recipe__Group__15 )
            // InternalMyDsl.g:1295:2: rule__Recipe__Group__14__Impl rule__Recipe__Group__15
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:1302:1: rule__Recipe__Group__14__Impl : ( ( rule__Recipe__KitchenUtensilsAssignment_14 )* ) ;
    public final void rule__Recipe__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1306:1: ( ( ( rule__Recipe__KitchenUtensilsAssignment_14 )* ) )
            // InternalMyDsl.g:1307:1: ( ( rule__Recipe__KitchenUtensilsAssignment_14 )* )
            {
            // InternalMyDsl.g:1307:1: ( ( rule__Recipe__KitchenUtensilsAssignment_14 )* )
            // InternalMyDsl.g:1308:2: ( rule__Recipe__KitchenUtensilsAssignment_14 )*
            {
             before(grammarAccess.getRecipeAccess().getKitchenUtensilsAssignment_14()); 
            // InternalMyDsl.g:1309:2: ( rule__Recipe__KitchenUtensilsAssignment_14 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_QSTRING) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:1309:3: rule__Recipe__KitchenUtensilsAssignment_14
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Recipe__KitchenUtensilsAssignment_14();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getRecipeAccess().getKitchenUtensilsAssignment_14()); 

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
    // InternalMyDsl.g:1317:1: rule__Recipe__Group__15 : rule__Recipe__Group__15__Impl rule__Recipe__Group__16 ;
    public final void rule__Recipe__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1321:1: ( rule__Recipe__Group__15__Impl rule__Recipe__Group__16 )
            // InternalMyDsl.g:1322:2: rule__Recipe__Group__15__Impl rule__Recipe__Group__16
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
    // InternalMyDsl.g:1329:1: rule__Recipe__Group__15__Impl : ( 'Food Categories' ) ;
    public final void rule__Recipe__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1333:1: ( ( 'Food Categories' ) )
            // InternalMyDsl.g:1334:1: ( 'Food Categories' )
            {
            // InternalMyDsl.g:1334:1: ( 'Food Categories' )
            // InternalMyDsl.g:1335:2: 'Food Categories'
            {
             before(grammarAccess.getRecipeAccess().getFoodCategoriesKeyword_15()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getFoodCategoriesKeyword_15()); 

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
    // InternalMyDsl.g:1344:1: rule__Recipe__Group__16 : rule__Recipe__Group__16__Impl rule__Recipe__Group__17 ;
    public final void rule__Recipe__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1348:1: ( rule__Recipe__Group__16__Impl rule__Recipe__Group__17 )
            // InternalMyDsl.g:1349:2: rule__Recipe__Group__16__Impl rule__Recipe__Group__17
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:1356:1: rule__Recipe__Group__16__Impl : ( ruleEOL ) ;
    public final void rule__Recipe__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1360:1: ( ( ruleEOL ) )
            // InternalMyDsl.g:1361:1: ( ruleEOL )
            {
            // InternalMyDsl.g:1361:1: ( ruleEOL )
            // InternalMyDsl.g:1362:2: ruleEOL
            {
             before(grammarAccess.getRecipeAccess().getEOLParserRuleCall_16()); 
            pushFollow(FOLLOW_2);
            ruleEOL();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getEOLParserRuleCall_16()); 

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
    // InternalMyDsl.g:1371:1: rule__Recipe__Group__17 : rule__Recipe__Group__17__Impl rule__Recipe__Group__18 ;
    public final void rule__Recipe__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1375:1: ( rule__Recipe__Group__17__Impl rule__Recipe__Group__18 )
            // InternalMyDsl.g:1376:2: rule__Recipe__Group__17__Impl rule__Recipe__Group__18
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:1383:1: rule__Recipe__Group__17__Impl : ( ( rule__Recipe__FoodCategoryAssignment_17 ) ) ;
    public final void rule__Recipe__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1387:1: ( ( ( rule__Recipe__FoodCategoryAssignment_17 ) ) )
            // InternalMyDsl.g:1388:1: ( ( rule__Recipe__FoodCategoryAssignment_17 ) )
            {
            // InternalMyDsl.g:1388:1: ( ( rule__Recipe__FoodCategoryAssignment_17 ) )
            // InternalMyDsl.g:1389:2: ( rule__Recipe__FoodCategoryAssignment_17 )
            {
             before(grammarAccess.getRecipeAccess().getFoodCategoryAssignment_17()); 
            // InternalMyDsl.g:1390:2: ( rule__Recipe__FoodCategoryAssignment_17 )
            // InternalMyDsl.g:1390:3: rule__Recipe__FoodCategoryAssignment_17
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__FoodCategoryAssignment_17();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getFoodCategoryAssignment_17()); 

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
    // InternalMyDsl.g:1398:1: rule__Recipe__Group__18 : rule__Recipe__Group__18__Impl rule__Recipe__Group__19 ;
    public final void rule__Recipe__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1402:1: ( rule__Recipe__Group__18__Impl rule__Recipe__Group__19 )
            // InternalMyDsl.g:1403:2: rule__Recipe__Group__18__Impl rule__Recipe__Group__19
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:1410:1: rule__Recipe__Group__18__Impl : ( ( rule__Recipe__FoodCategoryAssignment_18 )* ) ;
    public final void rule__Recipe__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1414:1: ( ( ( rule__Recipe__FoodCategoryAssignment_18 )* ) )
            // InternalMyDsl.g:1415:1: ( ( rule__Recipe__FoodCategoryAssignment_18 )* )
            {
            // InternalMyDsl.g:1415:1: ( ( rule__Recipe__FoodCategoryAssignment_18 )* )
            // InternalMyDsl.g:1416:2: ( rule__Recipe__FoodCategoryAssignment_18 )*
            {
             before(grammarAccess.getRecipeAccess().getFoodCategoryAssignment_18()); 
            // InternalMyDsl.g:1417:2: ( rule__Recipe__FoodCategoryAssignment_18 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_QSTRING) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:1417:3: rule__Recipe__FoodCategoryAssignment_18
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Recipe__FoodCategoryAssignment_18();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getRecipeAccess().getFoodCategoryAssignment_18()); 

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
    // InternalMyDsl.g:1425:1: rule__Recipe__Group__19 : rule__Recipe__Group__19__Impl rule__Recipe__Group__20 ;
    public final void rule__Recipe__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1429:1: ( rule__Recipe__Group__19__Impl rule__Recipe__Group__20 )
            // InternalMyDsl.g:1430:2: rule__Recipe__Group__19__Impl rule__Recipe__Group__20
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyDsl.g:1437:1: rule__Recipe__Group__19__Impl : ( 'Ingredients' ) ;
    public final void rule__Recipe__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1441:1: ( ( 'Ingredients' ) )
            // InternalMyDsl.g:1442:1: ( 'Ingredients' )
            {
            // InternalMyDsl.g:1442:1: ( 'Ingredients' )
            // InternalMyDsl.g:1443:2: 'Ingredients'
            {
             before(grammarAccess.getRecipeAccess().getIngredientsKeyword_19()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getIngredientsKeyword_19()); 

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
    // InternalMyDsl.g:1452:1: rule__Recipe__Group__20 : rule__Recipe__Group__20__Impl rule__Recipe__Group__21 ;
    public final void rule__Recipe__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1456:1: ( rule__Recipe__Group__20__Impl rule__Recipe__Group__21 )
            // InternalMyDsl.g:1457:2: rule__Recipe__Group__20__Impl rule__Recipe__Group__21
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:1464:1: rule__Recipe__Group__20__Impl : ( ruleEOL ) ;
    public final void rule__Recipe__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1468:1: ( ( ruleEOL ) )
            // InternalMyDsl.g:1469:1: ( ruleEOL )
            {
            // InternalMyDsl.g:1469:1: ( ruleEOL )
            // InternalMyDsl.g:1470:2: ruleEOL
            {
             before(grammarAccess.getRecipeAccess().getEOLParserRuleCall_20()); 
            pushFollow(FOLLOW_2);
            ruleEOL();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getEOLParserRuleCall_20()); 

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
    // InternalMyDsl.g:1479:1: rule__Recipe__Group__21 : rule__Recipe__Group__21__Impl rule__Recipe__Group__22 ;
    public final void rule__Recipe__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1483:1: ( rule__Recipe__Group__21__Impl rule__Recipe__Group__22 )
            // InternalMyDsl.g:1484:2: rule__Recipe__Group__21__Impl rule__Recipe__Group__22
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:1491:1: rule__Recipe__Group__21__Impl : ( ( rule__Recipe__IngredientAssignment_21 ) ) ;
    public final void rule__Recipe__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1495:1: ( ( ( rule__Recipe__IngredientAssignment_21 ) ) )
            // InternalMyDsl.g:1496:1: ( ( rule__Recipe__IngredientAssignment_21 ) )
            {
            // InternalMyDsl.g:1496:1: ( ( rule__Recipe__IngredientAssignment_21 ) )
            // InternalMyDsl.g:1497:2: ( rule__Recipe__IngredientAssignment_21 )
            {
             before(grammarAccess.getRecipeAccess().getIngredientAssignment_21()); 
            // InternalMyDsl.g:1498:2: ( rule__Recipe__IngredientAssignment_21 )
            // InternalMyDsl.g:1498:3: rule__Recipe__IngredientAssignment_21
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__IngredientAssignment_21();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getIngredientAssignment_21()); 

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
    // InternalMyDsl.g:1506:1: rule__Recipe__Group__22 : rule__Recipe__Group__22__Impl rule__Recipe__Group__23 ;
    public final void rule__Recipe__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1510:1: ( rule__Recipe__Group__22__Impl rule__Recipe__Group__23 )
            // InternalMyDsl.g:1511:2: rule__Recipe__Group__22__Impl rule__Recipe__Group__23
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:1518:1: rule__Recipe__Group__22__Impl : ( ( rule__Recipe__IngredientAssignment_22 )* ) ;
    public final void rule__Recipe__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1522:1: ( ( ( rule__Recipe__IngredientAssignment_22 )* ) )
            // InternalMyDsl.g:1523:1: ( ( rule__Recipe__IngredientAssignment_22 )* )
            {
            // InternalMyDsl.g:1523:1: ( ( rule__Recipe__IngredientAssignment_22 )* )
            // InternalMyDsl.g:1524:2: ( rule__Recipe__IngredientAssignment_22 )*
            {
             before(grammarAccess.getRecipeAccess().getIngredientAssignment_22()); 
            // InternalMyDsl.g:1525:2: ( rule__Recipe__IngredientAssignment_22 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==RULE_INGEREDIENTSTRING) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1525:3: rule__Recipe__IngredientAssignment_22
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Recipe__IngredientAssignment_22();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getRecipeAccess().getIngredientAssignment_22()); 

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
    // InternalMyDsl.g:1533:1: rule__Recipe__Group__23 : rule__Recipe__Group__23__Impl rule__Recipe__Group__24 ;
    public final void rule__Recipe__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1537:1: ( rule__Recipe__Group__23__Impl rule__Recipe__Group__24 )
            // InternalMyDsl.g:1538:2: rule__Recipe__Group__23__Impl rule__Recipe__Group__24
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyDsl.g:1545:1: rule__Recipe__Group__23__Impl : ( 'Ratings' ) ;
    public final void rule__Recipe__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1549:1: ( ( 'Ratings' ) )
            // InternalMyDsl.g:1550:1: ( 'Ratings' )
            {
            // InternalMyDsl.g:1550:1: ( 'Ratings' )
            // InternalMyDsl.g:1551:2: 'Ratings'
            {
             before(grammarAccess.getRecipeAccess().getRatingsKeyword_23()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getRatingsKeyword_23()); 

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
    // InternalMyDsl.g:1560:1: rule__Recipe__Group__24 : rule__Recipe__Group__24__Impl rule__Recipe__Group__25 ;
    public final void rule__Recipe__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1564:1: ( rule__Recipe__Group__24__Impl rule__Recipe__Group__25 )
            // InternalMyDsl.g:1565:2: rule__Recipe__Group__24__Impl rule__Recipe__Group__25
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:1572:1: rule__Recipe__Group__24__Impl : ( ruleEOL ) ;
    public final void rule__Recipe__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1576:1: ( ( ruleEOL ) )
            // InternalMyDsl.g:1577:1: ( ruleEOL )
            {
            // InternalMyDsl.g:1577:1: ( ruleEOL )
            // InternalMyDsl.g:1578:2: ruleEOL
            {
             before(grammarAccess.getRecipeAccess().getEOLParserRuleCall_24()); 
            pushFollow(FOLLOW_2);
            ruleEOL();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getEOLParserRuleCall_24()); 

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
    // InternalMyDsl.g:1587:1: rule__Recipe__Group__25 : rule__Recipe__Group__25__Impl rule__Recipe__Group__26 ;
    public final void rule__Recipe__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1591:1: ( rule__Recipe__Group__25__Impl rule__Recipe__Group__26 )
            // InternalMyDsl.g:1592:2: rule__Recipe__Group__25__Impl rule__Recipe__Group__26
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:1599:1: rule__Recipe__Group__25__Impl : ( ( rule__Recipe__RatingsAssignment_25 ) ) ;
    public final void rule__Recipe__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1603:1: ( ( ( rule__Recipe__RatingsAssignment_25 ) ) )
            // InternalMyDsl.g:1604:1: ( ( rule__Recipe__RatingsAssignment_25 ) )
            {
            // InternalMyDsl.g:1604:1: ( ( rule__Recipe__RatingsAssignment_25 ) )
            // InternalMyDsl.g:1605:2: ( rule__Recipe__RatingsAssignment_25 )
            {
             before(grammarAccess.getRecipeAccess().getRatingsAssignment_25()); 
            // InternalMyDsl.g:1606:2: ( rule__Recipe__RatingsAssignment_25 )
            // InternalMyDsl.g:1606:3: rule__Recipe__RatingsAssignment_25
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__RatingsAssignment_25();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getRatingsAssignment_25()); 

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
    // InternalMyDsl.g:1614:1: rule__Recipe__Group__26 : rule__Recipe__Group__26__Impl ;
    public final void rule__Recipe__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1618:1: ( rule__Recipe__Group__26__Impl )
            // InternalMyDsl.g:1619:2: rule__Recipe__Group__26__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__Group__26__Impl();

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
    // InternalMyDsl.g:1625:1: rule__Recipe__Group__26__Impl : ( ( rule__Recipe__RatingsAssignment_26 )* ) ;
    public final void rule__Recipe__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1629:1: ( ( ( rule__Recipe__RatingsAssignment_26 )* ) )
            // InternalMyDsl.g:1630:1: ( ( rule__Recipe__RatingsAssignment_26 )* )
            {
            // InternalMyDsl.g:1630:1: ( ( rule__Recipe__RatingsAssignment_26 )* )
            // InternalMyDsl.g:1631:2: ( rule__Recipe__RatingsAssignment_26 )*
            {
             before(grammarAccess.getRecipeAccess().getRatingsAssignment_26()); 
            // InternalMyDsl.g:1632:2: ( rule__Recipe__RatingsAssignment_26 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_INT) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:1632:3: rule__Recipe__RatingsAssignment_26
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Recipe__RatingsAssignment_26();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getRecipeAccess().getRatingsAssignment_26()); 

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


    // $ANTLR start "rule__Ingredient__Group__0"
    // InternalMyDsl.g:1641:1: rule__Ingredient__Group__0 : rule__Ingredient__Group__0__Impl rule__Ingredient__Group__1 ;
    public final void rule__Ingredient__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1645:1: ( rule__Ingredient__Group__0__Impl rule__Ingredient__Group__1 )
            // InternalMyDsl.g:1646:2: rule__Ingredient__Group__0__Impl rule__Ingredient__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Ingredient__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredient__Group__1();

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
    // $ANTLR end "rule__Ingredient__Group__0"


    // $ANTLR start "rule__Ingredient__Group__0__Impl"
    // InternalMyDsl.g:1653:1: rule__Ingredient__Group__0__Impl : ( ( rule__Ingredient__Alternatives_0 ) ) ;
    public final void rule__Ingredient__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1657:1: ( ( ( rule__Ingredient__Alternatives_0 ) ) )
            // InternalMyDsl.g:1658:1: ( ( rule__Ingredient__Alternatives_0 ) )
            {
            // InternalMyDsl.g:1658:1: ( ( rule__Ingredient__Alternatives_0 ) )
            // InternalMyDsl.g:1659:2: ( rule__Ingredient__Alternatives_0 )
            {
             before(grammarAccess.getIngredientAccess().getAlternatives_0()); 
            // InternalMyDsl.g:1660:2: ( rule__Ingredient__Alternatives_0 )
            // InternalMyDsl.g:1660:3: rule__Ingredient__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getIngredientAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__Ingredient__Group__0__Impl"


    // $ANTLR start "rule__Ingredient__Group__1"
    // InternalMyDsl.g:1668:1: rule__Ingredient__Group__1 : rule__Ingredient__Group__1__Impl ;
    public final void rule__Ingredient__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1672:1: ( rule__Ingredient__Group__1__Impl )
            // InternalMyDsl.g:1673:2: rule__Ingredient__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__Group__1__Impl();

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
    // $ANTLR end "rule__Ingredient__Group__1"


    // $ANTLR start "rule__Ingredient__Group__1__Impl"
    // InternalMyDsl.g:1679:1: rule__Ingredient__Group__1__Impl : ( ruleEOL ) ;
    public final void rule__Ingredient__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1683:1: ( ( ruleEOL ) )
            // InternalMyDsl.g:1684:1: ( ruleEOL )
            {
            // InternalMyDsl.g:1684:1: ( ruleEOL )
            // InternalMyDsl.g:1685:2: ruleEOL
            {
             before(grammarAccess.getIngredientAccess().getEOLParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleEOL();

            state._fsp--;

             after(grammarAccess.getIngredientAccess().getEOLParserRuleCall_1()); 

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
    // $ANTLR end "rule__Ingredient__Group__1__Impl"


    // $ANTLR start "rule__Ingredient__Group_0_0__0"
    // InternalMyDsl.g:1695:1: rule__Ingredient__Group_0_0__0 : rule__Ingredient__Group_0_0__0__Impl rule__Ingredient__Group_0_0__1 ;
    public final void rule__Ingredient__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1699:1: ( rule__Ingredient__Group_0_0__0__Impl rule__Ingredient__Group_0_0__1 )
            // InternalMyDsl.g:1700:2: rule__Ingredient__Group_0_0__0__Impl rule__Ingredient__Group_0_0__1
            {
            pushFollow(FOLLOW_11);
            rule__Ingredient__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredient__Group_0_0__1();

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
    // $ANTLR end "rule__Ingredient__Group_0_0__0"


    // $ANTLR start "rule__Ingredient__Group_0_0__0__Impl"
    // InternalMyDsl.g:1707:1: rule__Ingredient__Group_0_0__0__Impl : ( ( rule__Ingredient__NameAssignment_0_0_0 ) ) ;
    public final void rule__Ingredient__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1711:1: ( ( ( rule__Ingredient__NameAssignment_0_0_0 ) ) )
            // InternalMyDsl.g:1712:1: ( ( rule__Ingredient__NameAssignment_0_0_0 ) )
            {
            // InternalMyDsl.g:1712:1: ( ( rule__Ingredient__NameAssignment_0_0_0 ) )
            // InternalMyDsl.g:1713:2: ( rule__Ingredient__NameAssignment_0_0_0 )
            {
             before(grammarAccess.getIngredientAccess().getNameAssignment_0_0_0()); 
            // InternalMyDsl.g:1714:2: ( rule__Ingredient__NameAssignment_0_0_0 )
            // InternalMyDsl.g:1714:3: rule__Ingredient__NameAssignment_0_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__NameAssignment_0_0_0();

            state._fsp--;


            }

             after(grammarAccess.getIngredientAccess().getNameAssignment_0_0_0()); 

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
    // $ANTLR end "rule__Ingredient__Group_0_0__0__Impl"


    // $ANTLR start "rule__Ingredient__Group_0_0__1"
    // InternalMyDsl.g:1722:1: rule__Ingredient__Group_0_0__1 : rule__Ingredient__Group_0_0__1__Impl rule__Ingredient__Group_0_0__2 ;
    public final void rule__Ingredient__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1726:1: ( rule__Ingredient__Group_0_0__1__Impl rule__Ingredient__Group_0_0__2 )
            // InternalMyDsl.g:1727:2: rule__Ingredient__Group_0_0__1__Impl rule__Ingredient__Group_0_0__2
            {
            pushFollow(FOLLOW_22);
            rule__Ingredient__Group_0_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredient__Group_0_0__2();

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
    // $ANTLR end "rule__Ingredient__Group_0_0__1"


    // $ANTLR start "rule__Ingredient__Group_0_0__1__Impl"
    // InternalMyDsl.g:1734:1: rule__Ingredient__Group_0_0__1__Impl : ( ( rule__Ingredient__AmountAssignment_0_0_1 ) ) ;
    public final void rule__Ingredient__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1738:1: ( ( ( rule__Ingredient__AmountAssignment_0_0_1 ) ) )
            // InternalMyDsl.g:1739:1: ( ( rule__Ingredient__AmountAssignment_0_0_1 ) )
            {
            // InternalMyDsl.g:1739:1: ( ( rule__Ingredient__AmountAssignment_0_0_1 ) )
            // InternalMyDsl.g:1740:2: ( rule__Ingredient__AmountAssignment_0_0_1 )
            {
             before(grammarAccess.getIngredientAccess().getAmountAssignment_0_0_1()); 
            // InternalMyDsl.g:1741:2: ( rule__Ingredient__AmountAssignment_0_0_1 )
            // InternalMyDsl.g:1741:3: rule__Ingredient__AmountAssignment_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__AmountAssignment_0_0_1();

            state._fsp--;


            }

             after(grammarAccess.getIngredientAccess().getAmountAssignment_0_0_1()); 

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
    // $ANTLR end "rule__Ingredient__Group_0_0__1__Impl"


    // $ANTLR start "rule__Ingredient__Group_0_0__2"
    // InternalMyDsl.g:1749:1: rule__Ingredient__Group_0_0__2 : rule__Ingredient__Group_0_0__2__Impl rule__Ingredient__Group_0_0__3 ;
    public final void rule__Ingredient__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1753:1: ( rule__Ingredient__Group_0_0__2__Impl rule__Ingredient__Group_0_0__3 )
            // InternalMyDsl.g:1754:2: rule__Ingredient__Group_0_0__2__Impl rule__Ingredient__Group_0_0__3
            {
            pushFollow(FOLLOW_9);
            rule__Ingredient__Group_0_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredient__Group_0_0__3();

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
    // $ANTLR end "rule__Ingredient__Group_0_0__2"


    // $ANTLR start "rule__Ingredient__Group_0_0__2__Impl"
    // InternalMyDsl.g:1761:1: rule__Ingredient__Group_0_0__2__Impl : ( ( rule__Ingredient__UnitAssignment_0_0_2 ) ) ;
    public final void rule__Ingredient__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1765:1: ( ( ( rule__Ingredient__UnitAssignment_0_0_2 ) ) )
            // InternalMyDsl.g:1766:1: ( ( rule__Ingredient__UnitAssignment_0_0_2 ) )
            {
            // InternalMyDsl.g:1766:1: ( ( rule__Ingredient__UnitAssignment_0_0_2 ) )
            // InternalMyDsl.g:1767:2: ( rule__Ingredient__UnitAssignment_0_0_2 )
            {
             before(grammarAccess.getIngredientAccess().getUnitAssignment_0_0_2()); 
            // InternalMyDsl.g:1768:2: ( rule__Ingredient__UnitAssignment_0_0_2 )
            // InternalMyDsl.g:1768:3: rule__Ingredient__UnitAssignment_0_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__UnitAssignment_0_0_2();

            state._fsp--;


            }

             after(grammarAccess.getIngredientAccess().getUnitAssignment_0_0_2()); 

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
    // $ANTLR end "rule__Ingredient__Group_0_0__2__Impl"


    // $ANTLR start "rule__Ingredient__Group_0_0__3"
    // InternalMyDsl.g:1776:1: rule__Ingredient__Group_0_0__3 : rule__Ingredient__Group_0_0__3__Impl rule__Ingredient__Group_0_0__4 ;
    public final void rule__Ingredient__Group_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1780:1: ( rule__Ingredient__Group_0_0__3__Impl rule__Ingredient__Group_0_0__4 )
            // InternalMyDsl.g:1781:2: rule__Ingredient__Group_0_0__3__Impl rule__Ingredient__Group_0_0__4
            {
            pushFollow(FOLLOW_10);
            rule__Ingredient__Group_0_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredient__Group_0_0__4();

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
    // $ANTLR end "rule__Ingredient__Group_0_0__3"


    // $ANTLR start "rule__Ingredient__Group_0_0__3__Impl"
    // InternalMyDsl.g:1788:1: rule__Ingredient__Group_0_0__3__Impl : ( ',' ) ;
    public final void rule__Ingredient__Group_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1792:1: ( ( ',' ) )
            // InternalMyDsl.g:1793:1: ( ',' )
            {
            // InternalMyDsl.g:1793:1: ( ',' )
            // InternalMyDsl.g:1794:2: ','
            {
             before(grammarAccess.getIngredientAccess().getCommaKeyword_0_0_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getIngredientAccess().getCommaKeyword_0_0_3()); 

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
    // $ANTLR end "rule__Ingredient__Group_0_0__3__Impl"


    // $ANTLR start "rule__Ingredient__Group_0_0__4"
    // InternalMyDsl.g:1803:1: rule__Ingredient__Group_0_0__4 : rule__Ingredient__Group_0_0__4__Impl ;
    public final void rule__Ingredient__Group_0_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1807:1: ( rule__Ingredient__Group_0_0__4__Impl )
            // InternalMyDsl.g:1808:2: rule__Ingredient__Group_0_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__Group_0_0__4__Impl();

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
    // $ANTLR end "rule__Ingredient__Group_0_0__4"


    // $ANTLR start "rule__Ingredient__Group_0_0__4__Impl"
    // InternalMyDsl.g:1814:1: rule__Ingredient__Group_0_0__4__Impl : ( ( rule__Ingredient__VeganismLevelAssignment_0_0_4 ) ) ;
    public final void rule__Ingredient__Group_0_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1818:1: ( ( ( rule__Ingredient__VeganismLevelAssignment_0_0_4 ) ) )
            // InternalMyDsl.g:1819:1: ( ( rule__Ingredient__VeganismLevelAssignment_0_0_4 ) )
            {
            // InternalMyDsl.g:1819:1: ( ( rule__Ingredient__VeganismLevelAssignment_0_0_4 ) )
            // InternalMyDsl.g:1820:2: ( rule__Ingredient__VeganismLevelAssignment_0_0_4 )
            {
             before(grammarAccess.getIngredientAccess().getVeganismLevelAssignment_0_0_4()); 
            // InternalMyDsl.g:1821:2: ( rule__Ingredient__VeganismLevelAssignment_0_0_4 )
            // InternalMyDsl.g:1821:3: rule__Ingredient__VeganismLevelAssignment_0_0_4
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__VeganismLevelAssignment_0_0_4();

            state._fsp--;


            }

             after(grammarAccess.getIngredientAccess().getVeganismLevelAssignment_0_0_4()); 

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
    // $ANTLR end "rule__Ingredient__Group_0_0__4__Impl"


    // $ANTLR start "rule__RecipeManager__AuthorsAssignment_2"
    // InternalMyDsl.g:1830:1: rule__RecipeManager__AuthorsAssignment_2 : ( ruleAuthor ) ;
    public final void rule__RecipeManager__AuthorsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1834:1: ( ( ruleAuthor ) )
            // InternalMyDsl.g:1835:2: ( ruleAuthor )
            {
            // InternalMyDsl.g:1835:2: ( ruleAuthor )
            // InternalMyDsl.g:1836:3: ruleAuthor
            {
             before(grammarAccess.getRecipeManagerAccess().getAuthorsAuthorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAuthor();

            state._fsp--;

             after(grammarAccess.getRecipeManagerAccess().getAuthorsAuthorParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__RecipeManager__AuthorsAssignment_2"


    // $ANTLR start "rule__RecipeManager__AuthorsAssignment_3"
    // InternalMyDsl.g:1845:1: rule__RecipeManager__AuthorsAssignment_3 : ( ruleAuthor ) ;
    public final void rule__RecipeManager__AuthorsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1849:1: ( ( ruleAuthor ) )
            // InternalMyDsl.g:1850:2: ( ruleAuthor )
            {
            // InternalMyDsl.g:1850:2: ( ruleAuthor )
            // InternalMyDsl.g:1851:3: ruleAuthor
            {
             before(grammarAccess.getRecipeManagerAccess().getAuthorsAuthorParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAuthor();

            state._fsp--;

             after(grammarAccess.getRecipeManagerAccess().getAuthorsAuthorParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__RecipeManager__AuthorsAssignment_3"


    // $ANTLR start "rule__RecipeManager__RecipesAssignment_4_2"
    // InternalMyDsl.g:1860:1: rule__RecipeManager__RecipesAssignment_4_2 : ( ruleRecipe ) ;
    public final void rule__RecipeManager__RecipesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1864:1: ( ( ruleRecipe ) )
            // InternalMyDsl.g:1865:2: ( ruleRecipe )
            {
            // InternalMyDsl.g:1865:2: ( ruleRecipe )
            // InternalMyDsl.g:1866:3: ruleRecipe
            {
             before(grammarAccess.getRecipeManagerAccess().getRecipesRecipeParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRecipe();

            state._fsp--;

             after(grammarAccess.getRecipeManagerAccess().getRecipesRecipeParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__RecipeManager__RecipesAssignment_4_2"


    // $ANTLR start "rule__RecipeManager__RecipesAssignment_4_3"
    // InternalMyDsl.g:1875:1: rule__RecipeManager__RecipesAssignment_4_3 : ( ruleRecipe ) ;
    public final void rule__RecipeManager__RecipesAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1879:1: ( ( ruleRecipe ) )
            // InternalMyDsl.g:1880:2: ( ruleRecipe )
            {
            // InternalMyDsl.g:1880:2: ( ruleRecipe )
            // InternalMyDsl.g:1881:3: ruleRecipe
            {
             before(grammarAccess.getRecipeManagerAccess().getRecipesRecipeParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRecipe();

            state._fsp--;

             after(grammarAccess.getRecipeManagerAccess().getRecipesRecipeParserRuleCall_4_3_0()); 

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
    // $ANTLR end "rule__RecipeManager__RecipesAssignment_4_3"


    // $ANTLR start "rule__Author__NameAssignment_0"
    // InternalMyDsl.g:1890:1: rule__Author__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Author__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1894:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1895:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1895:2: ( RULE_ID )
            // InternalMyDsl.g:1896:3: RULE_ID
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


    // $ANTLR start "rule__Author__EmailAssignment_1"
    // InternalMyDsl.g:1905:1: rule__Author__EmailAssignment_1 : ( RULE_QSTRING ) ;
    public final void rule__Author__EmailAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1909:1: ( ( RULE_QSTRING ) )
            // InternalMyDsl.g:1910:2: ( RULE_QSTRING )
            {
            // InternalMyDsl.g:1910:2: ( RULE_QSTRING )
            // InternalMyDsl.g:1911:3: RULE_QSTRING
            {
             before(grammarAccess.getAuthorAccess().getEmailQSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_QSTRING,FOLLOW_2); 
             after(grammarAccess.getAuthorAccess().getEmailQSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Author__EmailAssignment_1"


    // $ANTLR start "rule__Rating__StarsAssignment_0"
    // InternalMyDsl.g:1920:1: rule__Rating__StarsAssignment_0 : ( RULE_INT ) ;
    public final void rule__Rating__StarsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1924:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1925:2: ( RULE_INT )
            {
            // InternalMyDsl.g:1925:2: ( RULE_INT )
            // InternalMyDsl.g:1926:3: RULE_INT
            {
             before(grammarAccess.getRatingAccess().getStarsINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRatingAccess().getStarsINTTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Rating__StarsAssignment_0"


    // $ANTLR start "rule__Rating__CommentAssignment_1"
    // InternalMyDsl.g:1935:1: rule__Rating__CommentAssignment_1 : ( RULE_QSTRING ) ;
    public final void rule__Rating__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1939:1: ( ( RULE_QSTRING ) )
            // InternalMyDsl.g:1940:2: ( RULE_QSTRING )
            {
            // InternalMyDsl.g:1940:2: ( RULE_QSTRING )
            // InternalMyDsl.g:1941:3: RULE_QSTRING
            {
             before(grammarAccess.getRatingAccess().getCommentQSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_QSTRING,FOLLOW_2); 
             after(grammarAccess.getRatingAccess().getCommentQSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Rating__CommentAssignment_1"


    // $ANTLR start "rule__Rating__AuthorAssignment_3"
    // InternalMyDsl.g:1950:1: rule__Rating__AuthorAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Rating__AuthorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1954:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:1955:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:1955:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:1956:3: ( RULE_ID )
            {
             before(grammarAccess.getRatingAccess().getAuthorAuthorCrossReference_3_0()); 
            // InternalMyDsl.g:1957:3: ( RULE_ID )
            // InternalMyDsl.g:1958:4: RULE_ID
            {
             before(grammarAccess.getRatingAccess().getAuthorAuthorIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRatingAccess().getAuthorAuthorIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getRatingAccess().getAuthorAuthorCrossReference_3_0()); 

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
    // $ANTLR end "rule__Rating__AuthorAssignment_3"


    // $ANTLR start "rule__Recipe__NameAssignment_0"
    // InternalMyDsl.g:1969:1: rule__Recipe__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Recipe__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1973:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1974:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1974:2: ( RULE_ID )
            // InternalMyDsl.g:1975:3: RULE_ID
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


    // $ANTLR start "rule__Recipe__AuthorAssignment_2"
    // InternalMyDsl.g:1984:1: rule__Recipe__AuthorAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Recipe__AuthorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1988:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:1989:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:1989:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:1990:3: ( RULE_ID )
            {
             before(grammarAccess.getRecipeAccess().getAuthorAuthorCrossReference_2_0()); 
            // InternalMyDsl.g:1991:3: ( RULE_ID )
            // InternalMyDsl.g:1992:4: RULE_ID
            {
             before(grammarAccess.getRecipeAccess().getAuthorAuthorIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getAuthorAuthorIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getRecipeAccess().getAuthorAuthorCrossReference_2_0()); 

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
    // $ANTLR end "rule__Recipe__AuthorAssignment_2"


    // $ANTLR start "rule__Recipe__VeganAssignment_4"
    // InternalMyDsl.g:2003:1: rule__Recipe__VeganAssignment_4 : ( ruleVeganismLevel ) ;
    public final void rule__Recipe__VeganAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2007:1: ( ( ruleVeganismLevel ) )
            // InternalMyDsl.g:2008:2: ( ruleVeganismLevel )
            {
            // InternalMyDsl.g:2008:2: ( ruleVeganismLevel )
            // InternalMyDsl.g:2009:3: ruleVeganismLevel
            {
             before(grammarAccess.getRecipeAccess().getVeganVeganismLevelParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleVeganismLevel();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getVeganVeganismLevelParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Recipe__VeganAssignment_4"


    // $ANTLR start "rule__Recipe__DurationAssignment_6"
    // InternalMyDsl.g:2018:1: rule__Recipe__DurationAssignment_6 : ( RULE_INT ) ;
    public final void rule__Recipe__DurationAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2022:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2023:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2023:2: ( RULE_INT )
            // InternalMyDsl.g:2024:3: RULE_INT
            {
             before(grammarAccess.getRecipeAccess().getDurationINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getDurationINTTerminalRuleCall_6_0()); 

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
    // $ANTLR end "rule__Recipe__DurationAssignment_6"


    // $ANTLR start "rule__Recipe__DifficultyAssignment_9"
    // InternalMyDsl.g:2033:1: rule__Recipe__DifficultyAssignment_9 : ( ruleDifficultyLevel ) ;
    public final void rule__Recipe__DifficultyAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2037:1: ( ( ruleDifficultyLevel ) )
            // InternalMyDsl.g:2038:2: ( ruleDifficultyLevel )
            {
            // InternalMyDsl.g:2038:2: ( ruleDifficultyLevel )
            // InternalMyDsl.g:2039:3: ruleDifficultyLevel
            {
             before(grammarAccess.getRecipeAccess().getDifficultyDifficultyLevelParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleDifficultyLevel();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getDifficultyDifficultyLevelParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__Recipe__DifficultyAssignment_9"


    // $ANTLR start "rule__Recipe__KitchenUtensilsAssignment_13"
    // InternalMyDsl.g:2048:1: rule__Recipe__KitchenUtensilsAssignment_13 : ( ruleKitchenUtensil ) ;
    public final void rule__Recipe__KitchenUtensilsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2052:1: ( ( ruleKitchenUtensil ) )
            // InternalMyDsl.g:2053:2: ( ruleKitchenUtensil )
            {
            // InternalMyDsl.g:2053:2: ( ruleKitchenUtensil )
            // InternalMyDsl.g:2054:3: ruleKitchenUtensil
            {
             before(grammarAccess.getRecipeAccess().getKitchenUtensilsKitchenUtensilParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleKitchenUtensil();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getKitchenUtensilsKitchenUtensilParserRuleCall_13_0()); 

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
    // $ANTLR end "rule__Recipe__KitchenUtensilsAssignment_13"


    // $ANTLR start "rule__Recipe__KitchenUtensilsAssignment_14"
    // InternalMyDsl.g:2063:1: rule__Recipe__KitchenUtensilsAssignment_14 : ( ruleKitchenUtensil ) ;
    public final void rule__Recipe__KitchenUtensilsAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2067:1: ( ( ruleKitchenUtensil ) )
            // InternalMyDsl.g:2068:2: ( ruleKitchenUtensil )
            {
            // InternalMyDsl.g:2068:2: ( ruleKitchenUtensil )
            // InternalMyDsl.g:2069:3: ruleKitchenUtensil
            {
             before(grammarAccess.getRecipeAccess().getKitchenUtensilsKitchenUtensilParserRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            ruleKitchenUtensil();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getKitchenUtensilsKitchenUtensilParserRuleCall_14_0()); 

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
    // $ANTLR end "rule__Recipe__KitchenUtensilsAssignment_14"


    // $ANTLR start "rule__Recipe__FoodCategoryAssignment_17"
    // InternalMyDsl.g:2078:1: rule__Recipe__FoodCategoryAssignment_17 : ( ruleFoodCategory ) ;
    public final void rule__Recipe__FoodCategoryAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2082:1: ( ( ruleFoodCategory ) )
            // InternalMyDsl.g:2083:2: ( ruleFoodCategory )
            {
            // InternalMyDsl.g:2083:2: ( ruleFoodCategory )
            // InternalMyDsl.g:2084:3: ruleFoodCategory
            {
             before(grammarAccess.getRecipeAccess().getFoodCategoryFoodCategoryParserRuleCall_17_0()); 
            pushFollow(FOLLOW_2);
            ruleFoodCategory();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getFoodCategoryFoodCategoryParserRuleCall_17_0()); 

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
    // $ANTLR end "rule__Recipe__FoodCategoryAssignment_17"


    // $ANTLR start "rule__Recipe__FoodCategoryAssignment_18"
    // InternalMyDsl.g:2093:1: rule__Recipe__FoodCategoryAssignment_18 : ( ruleFoodCategory ) ;
    public final void rule__Recipe__FoodCategoryAssignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2097:1: ( ( ruleFoodCategory ) )
            // InternalMyDsl.g:2098:2: ( ruleFoodCategory )
            {
            // InternalMyDsl.g:2098:2: ( ruleFoodCategory )
            // InternalMyDsl.g:2099:3: ruleFoodCategory
            {
             before(grammarAccess.getRecipeAccess().getFoodCategoryFoodCategoryParserRuleCall_18_0()); 
            pushFollow(FOLLOW_2);
            ruleFoodCategory();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getFoodCategoryFoodCategoryParserRuleCall_18_0()); 

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
    // $ANTLR end "rule__Recipe__FoodCategoryAssignment_18"


    // $ANTLR start "rule__Recipe__IngredientAssignment_21"
    // InternalMyDsl.g:2108:1: rule__Recipe__IngredientAssignment_21 : ( ruleIngredient ) ;
    public final void rule__Recipe__IngredientAssignment_21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2112:1: ( ( ruleIngredient ) )
            // InternalMyDsl.g:2113:2: ( ruleIngredient )
            {
            // InternalMyDsl.g:2113:2: ( ruleIngredient )
            // InternalMyDsl.g:2114:3: ruleIngredient
            {
             before(grammarAccess.getRecipeAccess().getIngredientIngredientParserRuleCall_21_0()); 
            pushFollow(FOLLOW_2);
            ruleIngredient();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getIngredientIngredientParserRuleCall_21_0()); 

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
    // $ANTLR end "rule__Recipe__IngredientAssignment_21"


    // $ANTLR start "rule__Recipe__IngredientAssignment_22"
    // InternalMyDsl.g:2123:1: rule__Recipe__IngredientAssignment_22 : ( ruleIngredient ) ;
    public final void rule__Recipe__IngredientAssignment_22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2127:1: ( ( ruleIngredient ) )
            // InternalMyDsl.g:2128:2: ( ruleIngredient )
            {
            // InternalMyDsl.g:2128:2: ( ruleIngredient )
            // InternalMyDsl.g:2129:3: ruleIngredient
            {
             before(grammarAccess.getRecipeAccess().getIngredientIngredientParserRuleCall_22_0()); 
            pushFollow(FOLLOW_2);
            ruleIngredient();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getIngredientIngredientParserRuleCall_22_0()); 

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
    // $ANTLR end "rule__Recipe__IngredientAssignment_22"


    // $ANTLR start "rule__Recipe__RatingsAssignment_25"
    // InternalMyDsl.g:2138:1: rule__Recipe__RatingsAssignment_25 : ( ruleRating ) ;
    public final void rule__Recipe__RatingsAssignment_25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2142:1: ( ( ruleRating ) )
            // InternalMyDsl.g:2143:2: ( ruleRating )
            {
            // InternalMyDsl.g:2143:2: ( ruleRating )
            // InternalMyDsl.g:2144:3: ruleRating
            {
             before(grammarAccess.getRecipeAccess().getRatingsRatingParserRuleCall_25_0()); 
            pushFollow(FOLLOW_2);
            ruleRating();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getRatingsRatingParserRuleCall_25_0()); 

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
    // $ANTLR end "rule__Recipe__RatingsAssignment_25"


    // $ANTLR start "rule__Recipe__RatingsAssignment_26"
    // InternalMyDsl.g:2153:1: rule__Recipe__RatingsAssignment_26 : ( ruleRating ) ;
    public final void rule__Recipe__RatingsAssignment_26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2157:1: ( ( ruleRating ) )
            // InternalMyDsl.g:2158:2: ( ruleRating )
            {
            // InternalMyDsl.g:2158:2: ( ruleRating )
            // InternalMyDsl.g:2159:3: ruleRating
            {
             before(grammarAccess.getRecipeAccess().getRatingsRatingParserRuleCall_26_0()); 
            pushFollow(FOLLOW_2);
            ruleRating();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getRatingsRatingParserRuleCall_26_0()); 

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
    // $ANTLR end "rule__Recipe__RatingsAssignment_26"


    // $ANTLR start "rule__KitchenUtensil__NameAssignment"
    // InternalMyDsl.g:2168:1: rule__KitchenUtensil__NameAssignment : ( RULE_QSTRING ) ;
    public final void rule__KitchenUtensil__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2172:1: ( ( RULE_QSTRING ) )
            // InternalMyDsl.g:2173:2: ( RULE_QSTRING )
            {
            // InternalMyDsl.g:2173:2: ( RULE_QSTRING )
            // InternalMyDsl.g:2174:3: RULE_QSTRING
            {
             before(grammarAccess.getKitchenUtensilAccess().getNameQSTRINGTerminalRuleCall_0()); 
            match(input,RULE_QSTRING,FOLLOW_2); 
             after(grammarAccess.getKitchenUtensilAccess().getNameQSTRINGTerminalRuleCall_0()); 

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


    // $ANTLR start "rule__DifficultyLevel__NameAssignment"
    // InternalMyDsl.g:2183:1: rule__DifficultyLevel__NameAssignment : ( ( rule__DifficultyLevel__NameAlternatives_0 ) ) ;
    public final void rule__DifficultyLevel__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2187:1: ( ( ( rule__DifficultyLevel__NameAlternatives_0 ) ) )
            // InternalMyDsl.g:2188:2: ( ( rule__DifficultyLevel__NameAlternatives_0 ) )
            {
            // InternalMyDsl.g:2188:2: ( ( rule__DifficultyLevel__NameAlternatives_0 ) )
            // InternalMyDsl.g:2189:3: ( rule__DifficultyLevel__NameAlternatives_0 )
            {
             before(grammarAccess.getDifficultyLevelAccess().getNameAlternatives_0()); 
            // InternalMyDsl.g:2190:3: ( rule__DifficultyLevel__NameAlternatives_0 )
            // InternalMyDsl.g:2190:4: rule__DifficultyLevel__NameAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__DifficultyLevel__NameAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getDifficultyLevelAccess().getNameAlternatives_0()); 

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
    // $ANTLR end "rule__DifficultyLevel__NameAssignment"


    // $ANTLR start "rule__FoodCategory__NameAssignment"
    // InternalMyDsl.g:2198:1: rule__FoodCategory__NameAssignment : ( RULE_QSTRING ) ;
    public final void rule__FoodCategory__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2202:1: ( ( RULE_QSTRING ) )
            // InternalMyDsl.g:2203:2: ( RULE_QSTRING )
            {
            // InternalMyDsl.g:2203:2: ( RULE_QSTRING )
            // InternalMyDsl.g:2204:3: RULE_QSTRING
            {
             before(grammarAccess.getFoodCategoryAccess().getNameQSTRINGTerminalRuleCall_0()); 
            match(input,RULE_QSTRING,FOLLOW_2); 
             after(grammarAccess.getFoodCategoryAccess().getNameQSTRINGTerminalRuleCall_0()); 

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


    // $ANTLR start "rule__Ingredient__NameAssignment_0_0_0"
    // InternalMyDsl.g:2213:1: rule__Ingredient__NameAssignment_0_0_0 : ( RULE_INGEREDIENTSTRING ) ;
    public final void rule__Ingredient__NameAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2217:1: ( ( RULE_INGEREDIENTSTRING ) )
            // InternalMyDsl.g:2218:2: ( RULE_INGEREDIENTSTRING )
            {
            // InternalMyDsl.g:2218:2: ( RULE_INGEREDIENTSTRING )
            // InternalMyDsl.g:2219:3: RULE_INGEREDIENTSTRING
            {
             before(grammarAccess.getIngredientAccess().getNameINGEREDIENTSTRINGTerminalRuleCall_0_0_0_0()); 
            match(input,RULE_INGEREDIENTSTRING,FOLLOW_2); 
             after(grammarAccess.getIngredientAccess().getNameINGEREDIENTSTRINGTerminalRuleCall_0_0_0_0()); 

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
    // $ANTLR end "rule__Ingredient__NameAssignment_0_0_0"


    // $ANTLR start "rule__Ingredient__AmountAssignment_0_0_1"
    // InternalMyDsl.g:2228:1: rule__Ingredient__AmountAssignment_0_0_1 : ( RULE_INT ) ;
    public final void rule__Ingredient__AmountAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2232:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2233:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2233:2: ( RULE_INT )
            // InternalMyDsl.g:2234:3: RULE_INT
            {
             before(grammarAccess.getIngredientAccess().getAmountINTTerminalRuleCall_0_0_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIngredientAccess().getAmountINTTerminalRuleCall_0_0_1_0()); 

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
    // $ANTLR end "rule__Ingredient__AmountAssignment_0_0_1"


    // $ANTLR start "rule__Ingredient__UnitAssignment_0_0_2"
    // InternalMyDsl.g:2243:1: rule__Ingredient__UnitAssignment_0_0_2 : ( ruleUnit ) ;
    public final void rule__Ingredient__UnitAssignment_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2247:1: ( ( ruleUnit ) )
            // InternalMyDsl.g:2248:2: ( ruleUnit )
            {
            // InternalMyDsl.g:2248:2: ( ruleUnit )
            // InternalMyDsl.g:2249:3: ruleUnit
            {
             before(grammarAccess.getIngredientAccess().getUnitUnitParserRuleCall_0_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnit();

            state._fsp--;

             after(grammarAccess.getIngredientAccess().getUnitUnitParserRuleCall_0_0_2_0()); 

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
    // $ANTLR end "rule__Ingredient__UnitAssignment_0_0_2"


    // $ANTLR start "rule__Ingredient__VeganismLevelAssignment_0_0_4"
    // InternalMyDsl.g:2258:1: rule__Ingredient__VeganismLevelAssignment_0_0_4 : ( ruleVeganismLevel ) ;
    public final void rule__Ingredient__VeganismLevelAssignment_0_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2262:1: ( ( ruleVeganismLevel ) )
            // InternalMyDsl.g:2263:2: ( ruleVeganismLevel )
            {
            // InternalMyDsl.g:2263:2: ( ruleVeganismLevel )
            // InternalMyDsl.g:2264:3: ruleVeganismLevel
            {
             before(grammarAccess.getIngredientAccess().getVeganismLevelVeganismLevelParserRuleCall_0_0_4_0()); 
            pushFollow(FOLLOW_2);
            ruleVeganismLevel();

            state._fsp--;

             after(grammarAccess.getIngredientAccess().getVeganismLevelVeganismLevelParserRuleCall_0_0_4_0()); 

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
    // $ANTLR end "rule__Ingredient__VeganismLevelAssignment_0_0_4"


    // $ANTLR start "rule__Ingredient__RecipeAssignment_0_1"
    // InternalMyDsl.g:2273:1: rule__Ingredient__RecipeAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__Ingredient__RecipeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2277:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2278:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2278:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2279:3: ( RULE_ID )
            {
             before(grammarAccess.getIngredientAccess().getRecipeRecipeCrossReference_0_1_0()); 
            // InternalMyDsl.g:2280:3: ( RULE_ID )
            // InternalMyDsl.g:2281:4: RULE_ID
            {
             before(grammarAccess.getIngredientAccess().getRecipeRecipeIDTerminalRuleCall_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIngredientAccess().getRecipeRecipeIDTerminalRuleCall_0_1_0_1()); 

            }

             after(grammarAccess.getIngredientAccess().getRecipeRecipeCrossReference_0_1_0()); 

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
    // $ANTLR end "rule__Ingredient__RecipeAssignment_0_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000400000080L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000800000080L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001000000240L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000242L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000000FF00000L});

}