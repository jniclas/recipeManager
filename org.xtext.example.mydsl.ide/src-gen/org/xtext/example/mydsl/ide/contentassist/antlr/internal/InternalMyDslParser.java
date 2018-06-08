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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_NEWLINE", "RULE_SL_COMMENT", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'furnace'", "'stovetop'", "'rolling pin'", "'easy'", "'medium'", "'hard'", "'Vegan'", "'Vegetaric'", "'Carnivorous'", "'ml'", "'l'", "'g'", "'kg'", "'tsp'", "'mg'", "'tbsp'", "'pcs'", "'authors'", "'recipes'", "','", "'von'", "'min'", "'Kitchen Utensils'", "'Food Categories'", "'Ingredients'", "'- '", "'Ratings'"
    };
    public static final int RULE_NEWLINE=5;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=6;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=7;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
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
    // InternalMyDsl.g:237:1: ruleIngredient : ( ( rule__Ingredient__Alternatives ) ) ;
    public final void ruleIngredient() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Ingredient__Alternatives ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Ingredient__Alternatives ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Ingredient__Alternatives ) )
            // InternalMyDsl.g:243:3: ( rule__Ingredient__Alternatives )
            {
             before(grammarAccess.getIngredientAccess().getAlternatives()); 
            // InternalMyDsl.g:244:3: ( rule__Ingredient__Alternatives )
            // InternalMyDsl.g:244:4: rule__Ingredient__Alternatives
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
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            case 14:
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
                    match(input,12,FOLLOW_2); 
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
                    match(input,13,FOLLOW_2); 
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
                    match(input,14,FOLLOW_2); 
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


    // $ANTLR start "rule__DifficultyLevel__NameAlternatives_0"
    // InternalMyDsl.g:360:1: rule__DifficultyLevel__NameAlternatives_0 : ( ( 'easy' ) | ( 'medium' ) | ( 'hard' ) );
    public final void rule__DifficultyLevel__NameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:364:1: ( ( 'easy' ) | ( 'medium' ) | ( 'hard' ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt2=1;
                }
                break;
            case 16:
                {
                alt2=2;
                }
                break;
            case 17:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:365:2: ( 'easy' )
                    {
                    // InternalMyDsl.g:365:2: ( 'easy' )
                    // InternalMyDsl.g:366:3: 'easy'
                    {
                     before(grammarAccess.getDifficultyLevelAccess().getNameEasyKeyword_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getDifficultyLevelAccess().getNameEasyKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:371:2: ( 'medium' )
                    {
                    // InternalMyDsl.g:371:2: ( 'medium' )
                    // InternalMyDsl.g:372:3: 'medium'
                    {
                     before(grammarAccess.getDifficultyLevelAccess().getNameMediumKeyword_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getDifficultyLevelAccess().getNameMediumKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:377:2: ( 'hard' )
                    {
                    // InternalMyDsl.g:377:2: ( 'hard' )
                    // InternalMyDsl.g:378:3: 'hard'
                    {
                     before(grammarAccess.getDifficultyLevelAccess().getNameHardKeyword_0_2()); 
                    match(input,17,FOLLOW_2); 
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


    // $ANTLR start "rule__Ingredient__Alternatives"
    // InternalMyDsl.g:387:1: rule__Ingredient__Alternatives : ( ( ( rule__Ingredient__Group_0__0 ) ) | ( ( rule__Ingredient__RecipeAssignment_1 ) ) );
    public final void rule__Ingredient__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:1: ( ( ( rule__Ingredient__Group_0__0 ) ) | ( ( rule__Ingredient__RecipeAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:392:2: ( ( rule__Ingredient__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:392:2: ( ( rule__Ingredient__Group_0__0 ) )
                    // InternalMyDsl.g:393:3: ( rule__Ingredient__Group_0__0 )
                    {
                     before(grammarAccess.getIngredientAccess().getGroup_0()); 
                    // InternalMyDsl.g:394:3: ( rule__Ingredient__Group_0__0 )
                    // InternalMyDsl.g:394:4: rule__Ingredient__Group_0__0
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
                    // InternalMyDsl.g:398:2: ( ( rule__Ingredient__RecipeAssignment_1 ) )
                    {
                    // InternalMyDsl.g:398:2: ( ( rule__Ingredient__RecipeAssignment_1 ) )
                    // InternalMyDsl.g:399:3: ( rule__Ingredient__RecipeAssignment_1 )
                    {
                     before(grammarAccess.getIngredientAccess().getRecipeAssignment_1()); 
                    // InternalMyDsl.g:400:3: ( rule__Ingredient__RecipeAssignment_1 )
                    // InternalMyDsl.g:400:4: rule__Ingredient__RecipeAssignment_1
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
    // InternalMyDsl.g:408:1: rule__VeganismLevel__Alternatives : ( ( 'Vegan' ) | ( 'Vegetaric' ) | ( 'Carnivorous' ) );
    public final void rule__VeganismLevel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:412:1: ( ( 'Vegan' ) | ( 'Vegetaric' ) | ( 'Carnivorous' ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt4=1;
                }
                break;
            case 19:
                {
                alt4=2;
                }
                break;
            case 20:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:413:2: ( 'Vegan' )
                    {
                    // InternalMyDsl.g:413:2: ( 'Vegan' )
                    // InternalMyDsl.g:414:3: 'Vegan'
                    {
                     before(grammarAccess.getVeganismLevelAccess().getVeganKeyword_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getVeganismLevelAccess().getVeganKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:419:2: ( 'Vegetaric' )
                    {
                    // InternalMyDsl.g:419:2: ( 'Vegetaric' )
                    // InternalMyDsl.g:420:3: 'Vegetaric'
                    {
                     before(grammarAccess.getVeganismLevelAccess().getVegetaricKeyword_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getVeganismLevelAccess().getVegetaricKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:425:2: ( 'Carnivorous' )
                    {
                    // InternalMyDsl.g:425:2: ( 'Carnivorous' )
                    // InternalMyDsl.g:426:3: 'Carnivorous'
                    {
                     before(grammarAccess.getVeganismLevelAccess().getCarnivorousKeyword_2()); 
                    match(input,20,FOLLOW_2); 
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
    // InternalMyDsl.g:435:1: rule__Unit__Alternatives : ( ( 'ml' ) | ( 'l' ) | ( 'g' ) | ( 'kg' ) | ( 'tsp' ) | ( 'mg' ) | ( 'tbsp' ) | ( 'pcs' ) );
    public final void rule__Unit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:439:1: ( ( 'ml' ) | ( 'l' ) | ( 'g' ) | ( 'kg' ) | ( 'tsp' ) | ( 'mg' ) | ( 'tbsp' ) | ( 'pcs' ) )
            int alt5=8;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt5=1;
                }
                break;
            case 22:
                {
                alt5=2;
                }
                break;
            case 23:
                {
                alt5=3;
                }
                break;
            case 24:
                {
                alt5=4;
                }
                break;
            case 25:
                {
                alt5=5;
                }
                break;
            case 26:
                {
                alt5=6;
                }
                break;
            case 27:
                {
                alt5=7;
                }
                break;
            case 28:
                {
                alt5=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:440:2: ( 'ml' )
                    {
                    // InternalMyDsl.g:440:2: ( 'ml' )
                    // InternalMyDsl.g:441:3: 'ml'
                    {
                     before(grammarAccess.getUnitAccess().getMlKeyword_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getUnitAccess().getMlKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:446:2: ( 'l' )
                    {
                    // InternalMyDsl.g:446:2: ( 'l' )
                    // InternalMyDsl.g:447:3: 'l'
                    {
                     before(grammarAccess.getUnitAccess().getLKeyword_1()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getUnitAccess().getLKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:452:2: ( 'g' )
                    {
                    // InternalMyDsl.g:452:2: ( 'g' )
                    // InternalMyDsl.g:453:3: 'g'
                    {
                     before(grammarAccess.getUnitAccess().getGKeyword_2()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getUnitAccess().getGKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:458:2: ( 'kg' )
                    {
                    // InternalMyDsl.g:458:2: ( 'kg' )
                    // InternalMyDsl.g:459:3: 'kg'
                    {
                     before(grammarAccess.getUnitAccess().getKgKeyword_3()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getUnitAccess().getKgKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:464:2: ( 'tsp' )
                    {
                    // InternalMyDsl.g:464:2: ( 'tsp' )
                    // InternalMyDsl.g:465:3: 'tsp'
                    {
                     before(grammarAccess.getUnitAccess().getTspKeyword_4()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getUnitAccess().getTspKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:470:2: ( 'mg' )
                    {
                    // InternalMyDsl.g:470:2: ( 'mg' )
                    // InternalMyDsl.g:471:3: 'mg'
                    {
                     before(grammarAccess.getUnitAccess().getMgKeyword_5()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getUnitAccess().getMgKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:476:2: ( 'tbsp' )
                    {
                    // InternalMyDsl.g:476:2: ( 'tbsp' )
                    // InternalMyDsl.g:477:3: 'tbsp'
                    {
                     before(grammarAccess.getUnitAccess().getTbspKeyword_6()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getUnitAccess().getTbspKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:482:2: ( 'pcs' )
                    {
                    // InternalMyDsl.g:482:2: ( 'pcs' )
                    // InternalMyDsl.g:483:3: 'pcs'
                    {
                     before(grammarAccess.getUnitAccess().getPcsKeyword_7()); 
                    match(input,28,FOLLOW_2); 
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
    // InternalMyDsl.g:492:1: rule__EOL__Alternatives : ( ( RULE_NEWLINE ) | ( RULE_SL_COMMENT ) );
    public final void rule__EOL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:496:1: ( ( RULE_NEWLINE ) | ( RULE_SL_COMMENT ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_NEWLINE) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_SL_COMMENT) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:497:2: ( RULE_NEWLINE )
                    {
                    // InternalMyDsl.g:497:2: ( RULE_NEWLINE )
                    // InternalMyDsl.g:498:3: RULE_NEWLINE
                    {
                     before(grammarAccess.getEOLAccess().getNEWLINETerminalRuleCall_0()); 
                    match(input,RULE_NEWLINE,FOLLOW_2); 
                     after(grammarAccess.getEOLAccess().getNEWLINETerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:503:2: ( RULE_SL_COMMENT )
                    {
                    // InternalMyDsl.g:503:2: ( RULE_SL_COMMENT )
                    // InternalMyDsl.g:504:3: RULE_SL_COMMENT
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
    // InternalMyDsl.g:513:1: rule__RecipeManager__Group__0 : rule__RecipeManager__Group__0__Impl rule__RecipeManager__Group__1 ;
    public final void rule__RecipeManager__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:517:1: ( rule__RecipeManager__Group__0__Impl rule__RecipeManager__Group__1 )
            // InternalMyDsl.g:518:2: rule__RecipeManager__Group__0__Impl rule__RecipeManager__Group__1
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
    // InternalMyDsl.g:525:1: rule__RecipeManager__Group__0__Impl : ( 'authors' ) ;
    public final void rule__RecipeManager__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:529:1: ( ( 'authors' ) )
            // InternalMyDsl.g:530:1: ( 'authors' )
            {
            // InternalMyDsl.g:530:1: ( 'authors' )
            // InternalMyDsl.g:531:2: 'authors'
            {
             before(grammarAccess.getRecipeManagerAccess().getAuthorsKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalMyDsl.g:540:1: rule__RecipeManager__Group__1 : rule__RecipeManager__Group__1__Impl rule__RecipeManager__Group__2 ;
    public final void rule__RecipeManager__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:544:1: ( rule__RecipeManager__Group__1__Impl rule__RecipeManager__Group__2 )
            // InternalMyDsl.g:545:2: rule__RecipeManager__Group__1__Impl rule__RecipeManager__Group__2
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
    // InternalMyDsl.g:552:1: rule__RecipeManager__Group__1__Impl : ( ruleEOL ) ;
    public final void rule__RecipeManager__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:556:1: ( ( ruleEOL ) )
            // InternalMyDsl.g:557:1: ( ruleEOL )
            {
            // InternalMyDsl.g:557:1: ( ruleEOL )
            // InternalMyDsl.g:558:2: ruleEOL
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
    // InternalMyDsl.g:567:1: rule__RecipeManager__Group__2 : rule__RecipeManager__Group__2__Impl rule__RecipeManager__Group__3 ;
    public final void rule__RecipeManager__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:571:1: ( rule__RecipeManager__Group__2__Impl rule__RecipeManager__Group__3 )
            // InternalMyDsl.g:572:2: rule__RecipeManager__Group__2__Impl rule__RecipeManager__Group__3
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
    // InternalMyDsl.g:579:1: rule__RecipeManager__Group__2__Impl : ( ( rule__RecipeManager__AuthorsAssignment_2 ) ) ;
    public final void rule__RecipeManager__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:583:1: ( ( ( rule__RecipeManager__AuthorsAssignment_2 ) ) )
            // InternalMyDsl.g:584:1: ( ( rule__RecipeManager__AuthorsAssignment_2 ) )
            {
            // InternalMyDsl.g:584:1: ( ( rule__RecipeManager__AuthorsAssignment_2 ) )
            // InternalMyDsl.g:585:2: ( rule__RecipeManager__AuthorsAssignment_2 )
            {
             before(grammarAccess.getRecipeManagerAccess().getAuthorsAssignment_2()); 
            // InternalMyDsl.g:586:2: ( rule__RecipeManager__AuthorsAssignment_2 )
            // InternalMyDsl.g:586:3: rule__RecipeManager__AuthorsAssignment_2
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
    // InternalMyDsl.g:594:1: rule__RecipeManager__Group__3 : rule__RecipeManager__Group__3__Impl rule__RecipeManager__Group__4 ;
    public final void rule__RecipeManager__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:598:1: ( rule__RecipeManager__Group__3__Impl rule__RecipeManager__Group__4 )
            // InternalMyDsl.g:599:2: rule__RecipeManager__Group__3__Impl rule__RecipeManager__Group__4
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
    // InternalMyDsl.g:606:1: rule__RecipeManager__Group__3__Impl : ( ( rule__RecipeManager__AuthorsAssignment_3 )* ) ;
    public final void rule__RecipeManager__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:610:1: ( ( ( rule__RecipeManager__AuthorsAssignment_3 )* ) )
            // InternalMyDsl.g:611:1: ( ( rule__RecipeManager__AuthorsAssignment_3 )* )
            {
            // InternalMyDsl.g:611:1: ( ( rule__RecipeManager__AuthorsAssignment_3 )* )
            // InternalMyDsl.g:612:2: ( rule__RecipeManager__AuthorsAssignment_3 )*
            {
             before(grammarAccess.getRecipeManagerAccess().getAuthorsAssignment_3()); 
            // InternalMyDsl.g:613:2: ( rule__RecipeManager__AuthorsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:613:3: rule__RecipeManager__AuthorsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__RecipeManager__AuthorsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalMyDsl.g:621:1: rule__RecipeManager__Group__4 : rule__RecipeManager__Group__4__Impl ;
    public final void rule__RecipeManager__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:625:1: ( rule__RecipeManager__Group__4__Impl )
            // InternalMyDsl.g:626:2: rule__RecipeManager__Group__4__Impl
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
    // InternalMyDsl.g:632:1: rule__RecipeManager__Group__4__Impl : ( ( rule__RecipeManager__Group_4__0 )? ) ;
    public final void rule__RecipeManager__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:636:1: ( ( ( rule__RecipeManager__Group_4__0 )? ) )
            // InternalMyDsl.g:637:1: ( ( rule__RecipeManager__Group_4__0 )? )
            {
            // InternalMyDsl.g:637:1: ( ( rule__RecipeManager__Group_4__0 )? )
            // InternalMyDsl.g:638:2: ( rule__RecipeManager__Group_4__0 )?
            {
             before(grammarAccess.getRecipeManagerAccess().getGroup_4()); 
            // InternalMyDsl.g:639:2: ( rule__RecipeManager__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==30) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:639:3: rule__RecipeManager__Group_4__0
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
    // InternalMyDsl.g:648:1: rule__RecipeManager__Group_4__0 : rule__RecipeManager__Group_4__0__Impl rule__RecipeManager__Group_4__1 ;
    public final void rule__RecipeManager__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:652:1: ( rule__RecipeManager__Group_4__0__Impl rule__RecipeManager__Group_4__1 )
            // InternalMyDsl.g:653:2: rule__RecipeManager__Group_4__0__Impl rule__RecipeManager__Group_4__1
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
    // InternalMyDsl.g:660:1: rule__RecipeManager__Group_4__0__Impl : ( 'recipes' ) ;
    public final void rule__RecipeManager__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:664:1: ( ( 'recipes' ) )
            // InternalMyDsl.g:665:1: ( 'recipes' )
            {
            // InternalMyDsl.g:665:1: ( 'recipes' )
            // InternalMyDsl.g:666:2: 'recipes'
            {
             before(grammarAccess.getRecipeManagerAccess().getRecipesKeyword_4_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalMyDsl.g:675:1: rule__RecipeManager__Group_4__1 : rule__RecipeManager__Group_4__1__Impl rule__RecipeManager__Group_4__2 ;
    public final void rule__RecipeManager__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:679:1: ( rule__RecipeManager__Group_4__1__Impl rule__RecipeManager__Group_4__2 )
            // InternalMyDsl.g:680:2: rule__RecipeManager__Group_4__1__Impl rule__RecipeManager__Group_4__2
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
    // InternalMyDsl.g:687:1: rule__RecipeManager__Group_4__1__Impl : ( ruleEOL ) ;
    public final void rule__RecipeManager__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:691:1: ( ( ruleEOL ) )
            // InternalMyDsl.g:692:1: ( ruleEOL )
            {
            // InternalMyDsl.g:692:1: ( ruleEOL )
            // InternalMyDsl.g:693:2: ruleEOL
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
    // InternalMyDsl.g:702:1: rule__RecipeManager__Group_4__2 : rule__RecipeManager__Group_4__2__Impl rule__RecipeManager__Group_4__3 ;
    public final void rule__RecipeManager__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:706:1: ( rule__RecipeManager__Group_4__2__Impl rule__RecipeManager__Group_4__3 )
            // InternalMyDsl.g:707:2: rule__RecipeManager__Group_4__2__Impl rule__RecipeManager__Group_4__3
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
    // InternalMyDsl.g:714:1: rule__RecipeManager__Group_4__2__Impl : ( ( rule__RecipeManager__RecipesAssignment_4_2 ) ) ;
    public final void rule__RecipeManager__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:718:1: ( ( ( rule__RecipeManager__RecipesAssignment_4_2 ) ) )
            // InternalMyDsl.g:719:1: ( ( rule__RecipeManager__RecipesAssignment_4_2 ) )
            {
            // InternalMyDsl.g:719:1: ( ( rule__RecipeManager__RecipesAssignment_4_2 ) )
            // InternalMyDsl.g:720:2: ( rule__RecipeManager__RecipesAssignment_4_2 )
            {
             before(grammarAccess.getRecipeManagerAccess().getRecipesAssignment_4_2()); 
            // InternalMyDsl.g:721:2: ( rule__RecipeManager__RecipesAssignment_4_2 )
            // InternalMyDsl.g:721:3: rule__RecipeManager__RecipesAssignment_4_2
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
    // InternalMyDsl.g:729:1: rule__RecipeManager__Group_4__3 : rule__RecipeManager__Group_4__3__Impl ;
    public final void rule__RecipeManager__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:733:1: ( rule__RecipeManager__Group_4__3__Impl )
            // InternalMyDsl.g:734:2: rule__RecipeManager__Group_4__3__Impl
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
    // InternalMyDsl.g:740:1: rule__RecipeManager__Group_4__3__Impl : ( ( rule__RecipeManager__RecipesAssignment_4_3 )* ) ;
    public final void rule__RecipeManager__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:744:1: ( ( ( rule__RecipeManager__RecipesAssignment_4_3 )* ) )
            // InternalMyDsl.g:745:1: ( ( rule__RecipeManager__RecipesAssignment_4_3 )* )
            {
            // InternalMyDsl.g:745:1: ( ( rule__RecipeManager__RecipesAssignment_4_3 )* )
            // InternalMyDsl.g:746:2: ( rule__RecipeManager__RecipesAssignment_4_3 )*
            {
             before(grammarAccess.getRecipeManagerAccess().getRecipesAssignment_4_3()); 
            // InternalMyDsl.g:747:2: ( rule__RecipeManager__RecipesAssignment_4_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:747:3: rule__RecipeManager__RecipesAssignment_4_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__RecipeManager__RecipesAssignment_4_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalMyDsl.g:756:1: rule__Author__Group__0 : rule__Author__Group__0__Impl rule__Author__Group__1 ;
    public final void rule__Author__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:760:1: ( rule__Author__Group__0__Impl rule__Author__Group__1 )
            // InternalMyDsl.g:761:2: rule__Author__Group__0__Impl rule__Author__Group__1
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
    // InternalMyDsl.g:768:1: rule__Author__Group__0__Impl : ( ( rule__Author__NameAssignment_0 ) ) ;
    public final void rule__Author__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:772:1: ( ( ( rule__Author__NameAssignment_0 ) ) )
            // InternalMyDsl.g:773:1: ( ( rule__Author__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:773:1: ( ( rule__Author__NameAssignment_0 ) )
            // InternalMyDsl.g:774:2: ( rule__Author__NameAssignment_0 )
            {
             before(grammarAccess.getAuthorAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:775:2: ( rule__Author__NameAssignment_0 )
            // InternalMyDsl.g:775:3: rule__Author__NameAssignment_0
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
    // InternalMyDsl.g:783:1: rule__Author__Group__1 : rule__Author__Group__1__Impl rule__Author__Group__2 ;
    public final void rule__Author__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:787:1: ( rule__Author__Group__1__Impl rule__Author__Group__2 )
            // InternalMyDsl.g:788:2: rule__Author__Group__1__Impl rule__Author__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyDsl.g:795:1: rule__Author__Group__1__Impl : ( ( rule__Author__EmailAssignment_1 ) ) ;
    public final void rule__Author__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:799:1: ( ( ( rule__Author__EmailAssignment_1 ) ) )
            // InternalMyDsl.g:800:1: ( ( rule__Author__EmailAssignment_1 ) )
            {
            // InternalMyDsl.g:800:1: ( ( rule__Author__EmailAssignment_1 ) )
            // InternalMyDsl.g:801:2: ( rule__Author__EmailAssignment_1 )
            {
             before(grammarAccess.getAuthorAccess().getEmailAssignment_1()); 
            // InternalMyDsl.g:802:2: ( rule__Author__EmailAssignment_1 )
            // InternalMyDsl.g:802:3: rule__Author__EmailAssignment_1
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


    // $ANTLR start "rule__Author__Group__2"
    // InternalMyDsl.g:810:1: rule__Author__Group__2 : rule__Author__Group__2__Impl ;
    public final void rule__Author__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:814:1: ( rule__Author__Group__2__Impl )
            // InternalMyDsl.g:815:2: rule__Author__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Author__Group__2__Impl();

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
    // InternalMyDsl.g:821:1: rule__Author__Group__2__Impl : ( ruleEOL ) ;
    public final void rule__Author__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:825:1: ( ( ruleEOL ) )
            // InternalMyDsl.g:826:1: ( ruleEOL )
            {
            // InternalMyDsl.g:826:1: ( ruleEOL )
            // InternalMyDsl.g:827:2: ruleEOL
            {
             before(grammarAccess.getAuthorAccess().getEOLParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleEOL();

            state._fsp--;

             after(grammarAccess.getAuthorAccess().getEOLParserRuleCall_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Rating__Group__0"
    // InternalMyDsl.g:837:1: rule__Rating__Group__0 : rule__Rating__Group__0__Impl rule__Rating__Group__1 ;
    public final void rule__Rating__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:841:1: ( rule__Rating__Group__0__Impl rule__Rating__Group__1 )
            // InternalMyDsl.g:842:2: rule__Rating__Group__0__Impl rule__Rating__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:849:1: rule__Rating__Group__0__Impl : ( ( rule__Rating__StarsAssignment_0 ) ) ;
    public final void rule__Rating__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:853:1: ( ( ( rule__Rating__StarsAssignment_0 ) ) )
            // InternalMyDsl.g:854:1: ( ( rule__Rating__StarsAssignment_0 ) )
            {
            // InternalMyDsl.g:854:1: ( ( rule__Rating__StarsAssignment_0 ) )
            // InternalMyDsl.g:855:2: ( rule__Rating__StarsAssignment_0 )
            {
             before(grammarAccess.getRatingAccess().getStarsAssignment_0()); 
            // InternalMyDsl.g:856:2: ( rule__Rating__StarsAssignment_0 )
            // InternalMyDsl.g:856:3: rule__Rating__StarsAssignment_0
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
    // InternalMyDsl.g:864:1: rule__Rating__Group__1 : rule__Rating__Group__1__Impl rule__Rating__Group__2 ;
    public final void rule__Rating__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:868:1: ( rule__Rating__Group__1__Impl rule__Rating__Group__2 )
            // InternalMyDsl.g:869:2: rule__Rating__Group__1__Impl rule__Rating__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:876:1: rule__Rating__Group__1__Impl : ( ',' ) ;
    public final void rule__Rating__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:880:1: ( ( ',' ) )
            // InternalMyDsl.g:881:1: ( ',' )
            {
            // InternalMyDsl.g:881:1: ( ',' )
            // InternalMyDsl.g:882:2: ','
            {
             before(grammarAccess.getRatingAccess().getCommaKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getRatingAccess().getCommaKeyword_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:891:1: rule__Rating__Group__2 : rule__Rating__Group__2__Impl rule__Rating__Group__3 ;
    public final void rule__Rating__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:895:1: ( rule__Rating__Group__2__Impl rule__Rating__Group__3 )
            // InternalMyDsl.g:896:2: rule__Rating__Group__2__Impl rule__Rating__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:903:1: rule__Rating__Group__2__Impl : ( ( rule__Rating__CommentAssignment_2 ) ) ;
    public final void rule__Rating__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:907:1: ( ( ( rule__Rating__CommentAssignment_2 ) ) )
            // InternalMyDsl.g:908:1: ( ( rule__Rating__CommentAssignment_2 ) )
            {
            // InternalMyDsl.g:908:1: ( ( rule__Rating__CommentAssignment_2 ) )
            // InternalMyDsl.g:909:2: ( rule__Rating__CommentAssignment_2 )
            {
             before(grammarAccess.getRatingAccess().getCommentAssignment_2()); 
            // InternalMyDsl.g:910:2: ( rule__Rating__CommentAssignment_2 )
            // InternalMyDsl.g:910:3: rule__Rating__CommentAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Rating__CommentAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRatingAccess().getCommentAssignment_2()); 

            }


            }

        }
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
    // InternalMyDsl.g:918:1: rule__Rating__Group__3 : rule__Rating__Group__3__Impl rule__Rating__Group__4 ;
    public final void rule__Rating__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:922:1: ( rule__Rating__Group__3__Impl rule__Rating__Group__4 )
            // InternalMyDsl.g:923:2: rule__Rating__Group__3__Impl rule__Rating__Group__4
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:930:1: rule__Rating__Group__3__Impl : ( 'von' ) ;
    public final void rule__Rating__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:934:1: ( ( 'von' ) )
            // InternalMyDsl.g:935:1: ( 'von' )
            {
            // InternalMyDsl.g:935:1: ( 'von' )
            // InternalMyDsl.g:936:2: 'von'
            {
             before(grammarAccess.getRatingAccess().getVonKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getRatingAccess().getVonKeyword_3()); 

            }


            }

        }
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
    // InternalMyDsl.g:945:1: rule__Rating__Group__4 : rule__Rating__Group__4__Impl ;
    public final void rule__Rating__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:949:1: ( rule__Rating__Group__4__Impl )
            // InternalMyDsl.g:950:2: rule__Rating__Group__4__Impl
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
    // InternalMyDsl.g:956:1: rule__Rating__Group__4__Impl : ( ( rule__Rating__AuthorAssignment_4 ) ) ;
    public final void rule__Rating__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:960:1: ( ( ( rule__Rating__AuthorAssignment_4 ) ) )
            // InternalMyDsl.g:961:1: ( ( rule__Rating__AuthorAssignment_4 ) )
            {
            // InternalMyDsl.g:961:1: ( ( rule__Rating__AuthorAssignment_4 ) )
            // InternalMyDsl.g:962:2: ( rule__Rating__AuthorAssignment_4 )
            {
             before(grammarAccess.getRatingAccess().getAuthorAssignment_4()); 
            // InternalMyDsl.g:963:2: ( rule__Rating__AuthorAssignment_4 )
            // InternalMyDsl.g:963:3: rule__Rating__AuthorAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Rating__AuthorAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRatingAccess().getAuthorAssignment_4()); 

            }


            }

        }
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
    // InternalMyDsl.g:972:1: rule__Recipe__Group__0 : rule__Recipe__Group__0__Impl rule__Recipe__Group__1 ;
    public final void rule__Recipe__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:976:1: ( rule__Recipe__Group__0__Impl rule__Recipe__Group__1 )
            // InternalMyDsl.g:977:2: rule__Recipe__Group__0__Impl rule__Recipe__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:984:1: rule__Recipe__Group__0__Impl : ( ( rule__Recipe__NameAssignment_0 ) ) ;
    public final void rule__Recipe__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:988:1: ( ( ( rule__Recipe__NameAssignment_0 ) ) )
            // InternalMyDsl.g:989:1: ( ( rule__Recipe__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:989:1: ( ( rule__Recipe__NameAssignment_0 ) )
            // InternalMyDsl.g:990:2: ( rule__Recipe__NameAssignment_0 )
            {
             before(grammarAccess.getRecipeAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:991:2: ( rule__Recipe__NameAssignment_0 )
            // InternalMyDsl.g:991:3: rule__Recipe__NameAssignment_0
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
    // InternalMyDsl.g:999:1: rule__Recipe__Group__1 : rule__Recipe__Group__1__Impl rule__Recipe__Group__2 ;
    public final void rule__Recipe__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1003:1: ( rule__Recipe__Group__1__Impl rule__Recipe__Group__2 )
            // InternalMyDsl.g:1004:2: rule__Recipe__Group__1__Impl rule__Recipe__Group__2
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
    // InternalMyDsl.g:1011:1: rule__Recipe__Group__1__Impl : ( 'von' ) ;
    public final void rule__Recipe__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1015:1: ( ( 'von' ) )
            // InternalMyDsl.g:1016:1: ( 'von' )
            {
            // InternalMyDsl.g:1016:1: ( 'von' )
            // InternalMyDsl.g:1017:2: 'von'
            {
             before(grammarAccess.getRecipeAccess().getVonKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalMyDsl.g:1026:1: rule__Recipe__Group__2 : rule__Recipe__Group__2__Impl rule__Recipe__Group__3 ;
    public final void rule__Recipe__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1030:1: ( rule__Recipe__Group__2__Impl rule__Recipe__Group__3 )
            // InternalMyDsl.g:1031:2: rule__Recipe__Group__2__Impl rule__Recipe__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:1038:1: rule__Recipe__Group__2__Impl : ( ( rule__Recipe__AuthorAssignment_2 ) ) ;
    public final void rule__Recipe__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1042:1: ( ( ( rule__Recipe__AuthorAssignment_2 ) ) )
            // InternalMyDsl.g:1043:1: ( ( rule__Recipe__AuthorAssignment_2 ) )
            {
            // InternalMyDsl.g:1043:1: ( ( rule__Recipe__AuthorAssignment_2 ) )
            // InternalMyDsl.g:1044:2: ( rule__Recipe__AuthorAssignment_2 )
            {
             before(grammarAccess.getRecipeAccess().getAuthorAssignment_2()); 
            // InternalMyDsl.g:1045:2: ( rule__Recipe__AuthorAssignment_2 )
            // InternalMyDsl.g:1045:3: rule__Recipe__AuthorAssignment_2
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
    // InternalMyDsl.g:1053:1: rule__Recipe__Group__3 : rule__Recipe__Group__3__Impl rule__Recipe__Group__4 ;
    public final void rule__Recipe__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1057:1: ( rule__Recipe__Group__3__Impl rule__Recipe__Group__4 )
            // InternalMyDsl.g:1058:2: rule__Recipe__Group__3__Impl rule__Recipe__Group__4
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
    // InternalMyDsl.g:1065:1: rule__Recipe__Group__3__Impl : ( ',' ) ;
    public final void rule__Recipe__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1069:1: ( ( ',' ) )
            // InternalMyDsl.g:1070:1: ( ',' )
            {
            // InternalMyDsl.g:1070:1: ( ',' )
            // InternalMyDsl.g:1071:2: ','
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
    // InternalMyDsl.g:1080:1: rule__Recipe__Group__4 : rule__Recipe__Group__4__Impl rule__Recipe__Group__5 ;
    public final void rule__Recipe__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1084:1: ( rule__Recipe__Group__4__Impl rule__Recipe__Group__5 )
            // InternalMyDsl.g:1085:2: rule__Recipe__Group__4__Impl rule__Recipe__Group__5
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:1092:1: rule__Recipe__Group__4__Impl : ( ( rule__Recipe__VeganAssignment_4 ) ) ;
    public final void rule__Recipe__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1096:1: ( ( ( rule__Recipe__VeganAssignment_4 ) ) )
            // InternalMyDsl.g:1097:1: ( ( rule__Recipe__VeganAssignment_4 ) )
            {
            // InternalMyDsl.g:1097:1: ( ( rule__Recipe__VeganAssignment_4 ) )
            // InternalMyDsl.g:1098:2: ( rule__Recipe__VeganAssignment_4 )
            {
             before(grammarAccess.getRecipeAccess().getVeganAssignment_4()); 
            // InternalMyDsl.g:1099:2: ( rule__Recipe__VeganAssignment_4 )
            // InternalMyDsl.g:1099:3: rule__Recipe__VeganAssignment_4
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
    // InternalMyDsl.g:1107:1: rule__Recipe__Group__5 : rule__Recipe__Group__5__Impl rule__Recipe__Group__6 ;
    public final void rule__Recipe__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1111:1: ( rule__Recipe__Group__5__Impl rule__Recipe__Group__6 )
            // InternalMyDsl.g:1112:2: rule__Recipe__Group__5__Impl rule__Recipe__Group__6
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
    // InternalMyDsl.g:1119:1: rule__Recipe__Group__5__Impl : ( ',' ) ;
    public final void rule__Recipe__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1123:1: ( ( ',' ) )
            // InternalMyDsl.g:1124:1: ( ',' )
            {
            // InternalMyDsl.g:1124:1: ( ',' )
            // InternalMyDsl.g:1125:2: ','
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
    // InternalMyDsl.g:1134:1: rule__Recipe__Group__6 : rule__Recipe__Group__6__Impl rule__Recipe__Group__7 ;
    public final void rule__Recipe__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1138:1: ( rule__Recipe__Group__6__Impl rule__Recipe__Group__7 )
            // InternalMyDsl.g:1139:2: rule__Recipe__Group__6__Impl rule__Recipe__Group__7
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
    // InternalMyDsl.g:1146:1: rule__Recipe__Group__6__Impl : ( ( rule__Recipe__DurationAssignment_6 ) ) ;
    public final void rule__Recipe__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1150:1: ( ( ( rule__Recipe__DurationAssignment_6 ) ) )
            // InternalMyDsl.g:1151:1: ( ( rule__Recipe__DurationAssignment_6 ) )
            {
            // InternalMyDsl.g:1151:1: ( ( rule__Recipe__DurationAssignment_6 ) )
            // InternalMyDsl.g:1152:2: ( rule__Recipe__DurationAssignment_6 )
            {
             before(grammarAccess.getRecipeAccess().getDurationAssignment_6()); 
            // InternalMyDsl.g:1153:2: ( rule__Recipe__DurationAssignment_6 )
            // InternalMyDsl.g:1153:3: rule__Recipe__DurationAssignment_6
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
    // InternalMyDsl.g:1161:1: rule__Recipe__Group__7 : rule__Recipe__Group__7__Impl rule__Recipe__Group__8 ;
    public final void rule__Recipe__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1165:1: ( rule__Recipe__Group__7__Impl rule__Recipe__Group__8 )
            // InternalMyDsl.g:1166:2: rule__Recipe__Group__7__Impl rule__Recipe__Group__8
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:1173:1: rule__Recipe__Group__7__Impl : ( 'min' ) ;
    public final void rule__Recipe__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1177:1: ( ( 'min' ) )
            // InternalMyDsl.g:1178:1: ( 'min' )
            {
            // InternalMyDsl.g:1178:1: ( 'min' )
            // InternalMyDsl.g:1179:2: 'min'
            {
             before(grammarAccess.getRecipeAccess().getMinKeyword_7()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMyDsl.g:1188:1: rule__Recipe__Group__8 : rule__Recipe__Group__8__Impl rule__Recipe__Group__9 ;
    public final void rule__Recipe__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1192:1: ( rule__Recipe__Group__8__Impl rule__Recipe__Group__9 )
            // InternalMyDsl.g:1193:2: rule__Recipe__Group__8__Impl rule__Recipe__Group__9
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
    // InternalMyDsl.g:1200:1: rule__Recipe__Group__8__Impl : ( ',' ) ;
    public final void rule__Recipe__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1204:1: ( ( ',' ) )
            // InternalMyDsl.g:1205:1: ( ',' )
            {
            // InternalMyDsl.g:1205:1: ( ',' )
            // InternalMyDsl.g:1206:2: ','
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
    // InternalMyDsl.g:1215:1: rule__Recipe__Group__9 : rule__Recipe__Group__9__Impl rule__Recipe__Group__10 ;
    public final void rule__Recipe__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1219:1: ( rule__Recipe__Group__9__Impl rule__Recipe__Group__10 )
            // InternalMyDsl.g:1220:2: rule__Recipe__Group__9__Impl rule__Recipe__Group__10
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
    // InternalMyDsl.g:1227:1: rule__Recipe__Group__9__Impl : ( ( rule__Recipe__DifficultyAssignment_9 ) ) ;
    public final void rule__Recipe__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1231:1: ( ( ( rule__Recipe__DifficultyAssignment_9 ) ) )
            // InternalMyDsl.g:1232:1: ( ( rule__Recipe__DifficultyAssignment_9 ) )
            {
            // InternalMyDsl.g:1232:1: ( ( rule__Recipe__DifficultyAssignment_9 ) )
            // InternalMyDsl.g:1233:2: ( rule__Recipe__DifficultyAssignment_9 )
            {
             before(grammarAccess.getRecipeAccess().getDifficultyAssignment_9()); 
            // InternalMyDsl.g:1234:2: ( rule__Recipe__DifficultyAssignment_9 )
            // InternalMyDsl.g:1234:3: rule__Recipe__DifficultyAssignment_9
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
    // InternalMyDsl.g:1242:1: rule__Recipe__Group__10 : rule__Recipe__Group__10__Impl rule__Recipe__Group__11 ;
    public final void rule__Recipe__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1246:1: ( rule__Recipe__Group__10__Impl rule__Recipe__Group__11 )
            // InternalMyDsl.g:1247:2: rule__Recipe__Group__10__Impl rule__Recipe__Group__11
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
    // InternalMyDsl.g:1254:1: rule__Recipe__Group__10__Impl : ( ruleEOL ) ;
    public final void rule__Recipe__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1258:1: ( ( ruleEOL ) )
            // InternalMyDsl.g:1259:1: ( ruleEOL )
            {
            // InternalMyDsl.g:1259:1: ( ruleEOL )
            // InternalMyDsl.g:1260:2: ruleEOL
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
    // InternalMyDsl.g:1269:1: rule__Recipe__Group__11 : rule__Recipe__Group__11__Impl rule__Recipe__Group__12 ;
    public final void rule__Recipe__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1273:1: ( rule__Recipe__Group__11__Impl rule__Recipe__Group__12 )
            // InternalMyDsl.g:1274:2: rule__Recipe__Group__11__Impl rule__Recipe__Group__12
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
    // InternalMyDsl.g:1281:1: rule__Recipe__Group__11__Impl : ( 'Kitchen Utensils' ) ;
    public final void rule__Recipe__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1285:1: ( ( 'Kitchen Utensils' ) )
            // InternalMyDsl.g:1286:1: ( 'Kitchen Utensils' )
            {
            // InternalMyDsl.g:1286:1: ( 'Kitchen Utensils' )
            // InternalMyDsl.g:1287:2: 'Kitchen Utensils'
            {
             before(grammarAccess.getRecipeAccess().getKitchenUtensilsKeyword_11()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyDsl.g:1296:1: rule__Recipe__Group__12 : rule__Recipe__Group__12__Impl rule__Recipe__Group__13 ;
    public final void rule__Recipe__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1300:1: ( rule__Recipe__Group__12__Impl rule__Recipe__Group__13 )
            // InternalMyDsl.g:1301:2: rule__Recipe__Group__12__Impl rule__Recipe__Group__13
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
    // InternalMyDsl.g:1308:1: rule__Recipe__Group__12__Impl : ( ruleEOL ) ;
    public final void rule__Recipe__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1312:1: ( ( ruleEOL ) )
            // InternalMyDsl.g:1313:1: ( ruleEOL )
            {
            // InternalMyDsl.g:1313:1: ( ruleEOL )
            // InternalMyDsl.g:1314:2: ruleEOL
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
    // InternalMyDsl.g:1323:1: rule__Recipe__Group__13 : rule__Recipe__Group__13__Impl rule__Recipe__Group__14 ;
    public final void rule__Recipe__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1327:1: ( rule__Recipe__Group__13__Impl rule__Recipe__Group__14 )
            // InternalMyDsl.g:1328:2: rule__Recipe__Group__13__Impl rule__Recipe__Group__14
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyDsl.g:1335:1: rule__Recipe__Group__13__Impl : ( ( rule__Recipe__KitchenUtensilsAssignment_13 ) ) ;
    public final void rule__Recipe__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1339:1: ( ( ( rule__Recipe__KitchenUtensilsAssignment_13 ) ) )
            // InternalMyDsl.g:1340:1: ( ( rule__Recipe__KitchenUtensilsAssignment_13 ) )
            {
            // InternalMyDsl.g:1340:1: ( ( rule__Recipe__KitchenUtensilsAssignment_13 ) )
            // InternalMyDsl.g:1341:2: ( rule__Recipe__KitchenUtensilsAssignment_13 )
            {
             before(grammarAccess.getRecipeAccess().getKitchenUtensilsAssignment_13()); 
            // InternalMyDsl.g:1342:2: ( rule__Recipe__KitchenUtensilsAssignment_13 )
            // InternalMyDsl.g:1342:3: rule__Recipe__KitchenUtensilsAssignment_13
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
    // InternalMyDsl.g:1350:1: rule__Recipe__Group__14 : rule__Recipe__Group__14__Impl rule__Recipe__Group__15 ;
    public final void rule__Recipe__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1354:1: ( rule__Recipe__Group__14__Impl rule__Recipe__Group__15 )
            // InternalMyDsl.g:1355:2: rule__Recipe__Group__14__Impl rule__Recipe__Group__15
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:1362:1: rule__Recipe__Group__14__Impl : ( ruleEOL ) ;
    public final void rule__Recipe__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1366:1: ( ( ruleEOL ) )
            // InternalMyDsl.g:1367:1: ( ruleEOL )
            {
            // InternalMyDsl.g:1367:1: ( ruleEOL )
            // InternalMyDsl.g:1368:2: ruleEOL
            {
             before(grammarAccess.getRecipeAccess().getEOLParserRuleCall_14()); 
            pushFollow(FOLLOW_2);
            ruleEOL();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getEOLParserRuleCall_14()); 

            }


            }

        }
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
    // InternalMyDsl.g:1377:1: rule__Recipe__Group__15 : rule__Recipe__Group__15__Impl rule__Recipe__Group__16 ;
    public final void rule__Recipe__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1381:1: ( rule__Recipe__Group__15__Impl rule__Recipe__Group__16 )
            // InternalMyDsl.g:1382:2: rule__Recipe__Group__15__Impl rule__Recipe__Group__16
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:1389:1: rule__Recipe__Group__15__Impl : ( ( rule__Recipe__Group_15__0 )* ) ;
    public final void rule__Recipe__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1393:1: ( ( ( rule__Recipe__Group_15__0 )* ) )
            // InternalMyDsl.g:1394:1: ( ( rule__Recipe__Group_15__0 )* )
            {
            // InternalMyDsl.g:1394:1: ( ( rule__Recipe__Group_15__0 )* )
            // InternalMyDsl.g:1395:2: ( rule__Recipe__Group_15__0 )*
            {
             before(grammarAccess.getRecipeAccess().getGroup_15()); 
            // InternalMyDsl.g:1396:2: ( rule__Recipe__Group_15__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_STRING||(LA10_0>=12 && LA10_0<=14)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:1396:3: rule__Recipe__Group_15__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Recipe__Group_15__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getRecipeAccess().getGroup_15()); 

            }


            }

        }
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
    // InternalMyDsl.g:1404:1: rule__Recipe__Group__16 : rule__Recipe__Group__16__Impl rule__Recipe__Group__17 ;
    public final void rule__Recipe__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1408:1: ( rule__Recipe__Group__16__Impl rule__Recipe__Group__17 )
            // InternalMyDsl.g:1409:2: rule__Recipe__Group__16__Impl rule__Recipe__Group__17
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyDsl.g:1416:1: rule__Recipe__Group__16__Impl : ( 'Food Categories' ) ;
    public final void rule__Recipe__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1420:1: ( ( 'Food Categories' ) )
            // InternalMyDsl.g:1421:1: ( 'Food Categories' )
            {
            // InternalMyDsl.g:1421:1: ( 'Food Categories' )
            // InternalMyDsl.g:1422:2: 'Food Categories'
            {
             before(grammarAccess.getRecipeAccess().getFoodCategoriesKeyword_16()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getFoodCategoriesKeyword_16()); 

            }


            }

        }
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
    // InternalMyDsl.g:1431:1: rule__Recipe__Group__17 : rule__Recipe__Group__17__Impl rule__Recipe__Group__18 ;
    public final void rule__Recipe__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1435:1: ( rule__Recipe__Group__17__Impl rule__Recipe__Group__18 )
            // InternalMyDsl.g:1436:2: rule__Recipe__Group__17__Impl rule__Recipe__Group__18
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:1443:1: rule__Recipe__Group__17__Impl : ( ruleEOL ) ;
    public final void rule__Recipe__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1447:1: ( ( ruleEOL ) )
            // InternalMyDsl.g:1448:1: ( ruleEOL )
            {
            // InternalMyDsl.g:1448:1: ( ruleEOL )
            // InternalMyDsl.g:1449:2: ruleEOL
            {
             before(grammarAccess.getRecipeAccess().getEOLParserRuleCall_17()); 
            pushFollow(FOLLOW_2);
            ruleEOL();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getEOLParserRuleCall_17()); 

            }


            }

        }
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
    // InternalMyDsl.g:1458:1: rule__Recipe__Group__18 : rule__Recipe__Group__18__Impl rule__Recipe__Group__19 ;
    public final void rule__Recipe__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1462:1: ( rule__Recipe__Group__18__Impl rule__Recipe__Group__19 )
            // InternalMyDsl.g:1463:2: rule__Recipe__Group__18__Impl rule__Recipe__Group__19
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyDsl.g:1470:1: rule__Recipe__Group__18__Impl : ( ( rule__Recipe__FoodCategoryAssignment_18 ) ) ;
    public final void rule__Recipe__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1474:1: ( ( ( rule__Recipe__FoodCategoryAssignment_18 ) ) )
            // InternalMyDsl.g:1475:1: ( ( rule__Recipe__FoodCategoryAssignment_18 ) )
            {
            // InternalMyDsl.g:1475:1: ( ( rule__Recipe__FoodCategoryAssignment_18 ) )
            // InternalMyDsl.g:1476:2: ( rule__Recipe__FoodCategoryAssignment_18 )
            {
             before(grammarAccess.getRecipeAccess().getFoodCategoryAssignment_18()); 
            // InternalMyDsl.g:1477:2: ( rule__Recipe__FoodCategoryAssignment_18 )
            // InternalMyDsl.g:1477:3: rule__Recipe__FoodCategoryAssignment_18
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__FoodCategoryAssignment_18();

            state._fsp--;


            }

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
    // InternalMyDsl.g:1485:1: rule__Recipe__Group__19 : rule__Recipe__Group__19__Impl rule__Recipe__Group__20 ;
    public final void rule__Recipe__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1489:1: ( rule__Recipe__Group__19__Impl rule__Recipe__Group__20 )
            // InternalMyDsl.g:1490:2: rule__Recipe__Group__19__Impl rule__Recipe__Group__20
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:1497:1: rule__Recipe__Group__19__Impl : ( ruleEOL ) ;
    public final void rule__Recipe__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1501:1: ( ( ruleEOL ) )
            // InternalMyDsl.g:1502:1: ( ruleEOL )
            {
            // InternalMyDsl.g:1502:1: ( ruleEOL )
            // InternalMyDsl.g:1503:2: ruleEOL
            {
             before(grammarAccess.getRecipeAccess().getEOLParserRuleCall_19()); 
            pushFollow(FOLLOW_2);
            ruleEOL();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getEOLParserRuleCall_19()); 

            }


            }

        }
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
    // InternalMyDsl.g:1512:1: rule__Recipe__Group__20 : rule__Recipe__Group__20__Impl rule__Recipe__Group__21 ;
    public final void rule__Recipe__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1516:1: ( rule__Recipe__Group__20__Impl rule__Recipe__Group__21 )
            // InternalMyDsl.g:1517:2: rule__Recipe__Group__20__Impl rule__Recipe__Group__21
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
    // InternalMyDsl.g:1524:1: rule__Recipe__Group__20__Impl : ( ( rule__Recipe__Group_20__0 )* ) ;
    public final void rule__Recipe__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1528:1: ( ( ( rule__Recipe__Group_20__0 )* ) )
            // InternalMyDsl.g:1529:1: ( ( rule__Recipe__Group_20__0 )* )
            {
            // InternalMyDsl.g:1529:1: ( ( rule__Recipe__Group_20__0 )* )
            // InternalMyDsl.g:1530:2: ( rule__Recipe__Group_20__0 )*
            {
             before(grammarAccess.getRecipeAccess().getGroup_20()); 
            // InternalMyDsl.g:1531:2: ( rule__Recipe__Group_20__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_STRING) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1531:3: rule__Recipe__Group_20__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Recipe__Group_20__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

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
    // InternalMyDsl.g:1539:1: rule__Recipe__Group__21 : rule__Recipe__Group__21__Impl rule__Recipe__Group__22 ;
    public final void rule__Recipe__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1543:1: ( rule__Recipe__Group__21__Impl rule__Recipe__Group__22 )
            // InternalMyDsl.g:1544:2: rule__Recipe__Group__21__Impl rule__Recipe__Group__22
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
    // InternalMyDsl.g:1551:1: rule__Recipe__Group__21__Impl : ( 'Ingredients' ) ;
    public final void rule__Recipe__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1555:1: ( ( 'Ingredients' ) )
            // InternalMyDsl.g:1556:1: ( 'Ingredients' )
            {
            // InternalMyDsl.g:1556:1: ( 'Ingredients' )
            // InternalMyDsl.g:1557:2: 'Ingredients'
            {
             before(grammarAccess.getRecipeAccess().getIngredientsKeyword_21()); 
            match(input,36,FOLLOW_2); 
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
    // InternalMyDsl.g:1566:1: rule__Recipe__Group__22 : rule__Recipe__Group__22__Impl rule__Recipe__Group__23 ;
    public final void rule__Recipe__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1570:1: ( rule__Recipe__Group__22__Impl rule__Recipe__Group__23 )
            // InternalMyDsl.g:1571:2: rule__Recipe__Group__22__Impl rule__Recipe__Group__23
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:1578:1: rule__Recipe__Group__22__Impl : ( ruleEOL ) ;
    public final void rule__Recipe__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1582:1: ( ( ruleEOL ) )
            // InternalMyDsl.g:1583:1: ( ruleEOL )
            {
            // InternalMyDsl.g:1583:1: ( ruleEOL )
            // InternalMyDsl.g:1584:2: ruleEOL
            {
             before(grammarAccess.getRecipeAccess().getEOLParserRuleCall_22()); 
            pushFollow(FOLLOW_2);
            ruleEOL();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getEOLParserRuleCall_22()); 

            }


            }

        }
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
    // InternalMyDsl.g:1593:1: rule__Recipe__Group__23 : rule__Recipe__Group__23__Impl rule__Recipe__Group__24 ;
    public final void rule__Recipe__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1597:1: ( rule__Recipe__Group__23__Impl rule__Recipe__Group__24 )
            // InternalMyDsl.g:1598:2: rule__Recipe__Group__23__Impl rule__Recipe__Group__24
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:1605:1: rule__Recipe__Group__23__Impl : ( '- ' ) ;
    public final void rule__Recipe__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1609:1: ( ( '- ' ) )
            // InternalMyDsl.g:1610:1: ( '- ' )
            {
            // InternalMyDsl.g:1610:1: ( '- ' )
            // InternalMyDsl.g:1611:2: '- '
            {
             before(grammarAccess.getRecipeAccess().getHyphenMinusSpaceKeyword_23()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getHyphenMinusSpaceKeyword_23()); 

            }


            }

        }
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
    // InternalMyDsl.g:1620:1: rule__Recipe__Group__24 : rule__Recipe__Group__24__Impl rule__Recipe__Group__25 ;
    public final void rule__Recipe__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1624:1: ( rule__Recipe__Group__24__Impl rule__Recipe__Group__25 )
            // InternalMyDsl.g:1625:2: rule__Recipe__Group__24__Impl rule__Recipe__Group__25
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyDsl.g:1632:1: rule__Recipe__Group__24__Impl : ( ( rule__Recipe__IngredientAssignment_24 ) ) ;
    public final void rule__Recipe__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1636:1: ( ( ( rule__Recipe__IngredientAssignment_24 ) ) )
            // InternalMyDsl.g:1637:1: ( ( rule__Recipe__IngredientAssignment_24 ) )
            {
            // InternalMyDsl.g:1637:1: ( ( rule__Recipe__IngredientAssignment_24 ) )
            // InternalMyDsl.g:1638:2: ( rule__Recipe__IngredientAssignment_24 )
            {
             before(grammarAccess.getRecipeAccess().getIngredientAssignment_24()); 
            // InternalMyDsl.g:1639:2: ( rule__Recipe__IngredientAssignment_24 )
            // InternalMyDsl.g:1639:3: rule__Recipe__IngredientAssignment_24
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
    // InternalMyDsl.g:1647:1: rule__Recipe__Group__25 : rule__Recipe__Group__25__Impl rule__Recipe__Group__26 ;
    public final void rule__Recipe__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1651:1: ( rule__Recipe__Group__25__Impl rule__Recipe__Group__26 )
            // InternalMyDsl.g:1652:2: rule__Recipe__Group__25__Impl rule__Recipe__Group__26
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyDsl.g:1659:1: rule__Recipe__Group__25__Impl : ( ruleEOL ) ;
    public final void rule__Recipe__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1663:1: ( ( ruleEOL ) )
            // InternalMyDsl.g:1664:1: ( ruleEOL )
            {
            // InternalMyDsl.g:1664:1: ( ruleEOL )
            // InternalMyDsl.g:1665:2: ruleEOL
            {
             before(grammarAccess.getRecipeAccess().getEOLParserRuleCall_25()); 
            pushFollow(FOLLOW_2);
            ruleEOL();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getEOLParserRuleCall_25()); 

            }


            }

        }
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
    // InternalMyDsl.g:1674:1: rule__Recipe__Group__26 : rule__Recipe__Group__26__Impl rule__Recipe__Group__27 ;
    public final void rule__Recipe__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1678:1: ( rule__Recipe__Group__26__Impl rule__Recipe__Group__27 )
            // InternalMyDsl.g:1679:2: rule__Recipe__Group__26__Impl rule__Recipe__Group__27
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyDsl.g:1686:1: rule__Recipe__Group__26__Impl : ( ( rule__Recipe__Group_26__0 )* ) ;
    public final void rule__Recipe__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1690:1: ( ( ( rule__Recipe__Group_26__0 )* ) )
            // InternalMyDsl.g:1691:1: ( ( rule__Recipe__Group_26__0 )* )
            {
            // InternalMyDsl.g:1691:1: ( ( rule__Recipe__Group_26__0 )* )
            // InternalMyDsl.g:1692:2: ( rule__Recipe__Group_26__0 )*
            {
             before(grammarAccess.getRecipeAccess().getGroup_26()); 
            // InternalMyDsl.g:1693:2: ( rule__Recipe__Group_26__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==37) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:1693:3: rule__Recipe__Group_26__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Recipe__Group_26__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getRecipeAccess().getGroup_26()); 

            }


            }

        }
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
    // InternalMyDsl.g:1701:1: rule__Recipe__Group__27 : rule__Recipe__Group__27__Impl rule__Recipe__Group__28 ;
    public final void rule__Recipe__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1705:1: ( rule__Recipe__Group__27__Impl rule__Recipe__Group__28 )
            // InternalMyDsl.g:1706:2: rule__Recipe__Group__27__Impl rule__Recipe__Group__28
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyDsl.g:1713:1: rule__Recipe__Group__27__Impl : ( 'Ratings' ) ;
    public final void rule__Recipe__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1717:1: ( ( 'Ratings' ) )
            // InternalMyDsl.g:1718:1: ( 'Ratings' )
            {
            // InternalMyDsl.g:1718:1: ( 'Ratings' )
            // InternalMyDsl.g:1719:2: 'Ratings'
            {
             before(grammarAccess.getRecipeAccess().getRatingsKeyword_27()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getRatingsKeyword_27()); 

            }


            }

        }
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
    // InternalMyDsl.g:1728:1: rule__Recipe__Group__28 : rule__Recipe__Group__28__Impl rule__Recipe__Group__29 ;
    public final void rule__Recipe__Group__28() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1732:1: ( rule__Recipe__Group__28__Impl rule__Recipe__Group__29 )
            // InternalMyDsl.g:1733:2: rule__Recipe__Group__28__Impl rule__Recipe__Group__29
            {
            pushFollow(FOLLOW_11);
            rule__Recipe__Group__28__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__29();

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
    // InternalMyDsl.g:1740:1: rule__Recipe__Group__28__Impl : ( ruleEOL ) ;
    public final void rule__Recipe__Group__28__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1744:1: ( ( ruleEOL ) )
            // InternalMyDsl.g:1745:1: ( ruleEOL )
            {
            // InternalMyDsl.g:1745:1: ( ruleEOL )
            // InternalMyDsl.g:1746:2: ruleEOL
            {
             before(grammarAccess.getRecipeAccess().getEOLParserRuleCall_28()); 
            pushFollow(FOLLOW_2);
            ruleEOL();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getEOLParserRuleCall_28()); 

            }


            }

        }
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


    // $ANTLR start "rule__Recipe__Group__29"
    // InternalMyDsl.g:1755:1: rule__Recipe__Group__29 : rule__Recipe__Group__29__Impl rule__Recipe__Group__30 ;
    public final void rule__Recipe__Group__29() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1759:1: ( rule__Recipe__Group__29__Impl rule__Recipe__Group__30 )
            // InternalMyDsl.g:1760:2: rule__Recipe__Group__29__Impl rule__Recipe__Group__30
            {
            pushFollow(FOLLOW_3);
            rule__Recipe__Group__29__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__30();

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
    // $ANTLR end "rule__Recipe__Group__29"


    // $ANTLR start "rule__Recipe__Group__29__Impl"
    // InternalMyDsl.g:1767:1: rule__Recipe__Group__29__Impl : ( ( rule__Recipe__RatingsAssignment_29 ) ) ;
    public final void rule__Recipe__Group__29__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1771:1: ( ( ( rule__Recipe__RatingsAssignment_29 ) ) )
            // InternalMyDsl.g:1772:1: ( ( rule__Recipe__RatingsAssignment_29 ) )
            {
            // InternalMyDsl.g:1772:1: ( ( rule__Recipe__RatingsAssignment_29 ) )
            // InternalMyDsl.g:1773:2: ( rule__Recipe__RatingsAssignment_29 )
            {
             before(grammarAccess.getRecipeAccess().getRatingsAssignment_29()); 
            // InternalMyDsl.g:1774:2: ( rule__Recipe__RatingsAssignment_29 )
            // InternalMyDsl.g:1774:3: rule__Recipe__RatingsAssignment_29
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__RatingsAssignment_29();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getRatingsAssignment_29()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__29__Impl"


    // $ANTLR start "rule__Recipe__Group__30"
    // InternalMyDsl.g:1782:1: rule__Recipe__Group__30 : rule__Recipe__Group__30__Impl rule__Recipe__Group__31 ;
    public final void rule__Recipe__Group__30() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1786:1: ( rule__Recipe__Group__30__Impl rule__Recipe__Group__31 )
            // InternalMyDsl.g:1787:2: rule__Recipe__Group__30__Impl rule__Recipe__Group__31
            {
            pushFollow(FOLLOW_11);
            rule__Recipe__Group__30__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__31();

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
    // $ANTLR end "rule__Recipe__Group__30"


    // $ANTLR start "rule__Recipe__Group__30__Impl"
    // InternalMyDsl.g:1794:1: rule__Recipe__Group__30__Impl : ( ruleEOL ) ;
    public final void rule__Recipe__Group__30__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1798:1: ( ( ruleEOL ) )
            // InternalMyDsl.g:1799:1: ( ruleEOL )
            {
            // InternalMyDsl.g:1799:1: ( ruleEOL )
            // InternalMyDsl.g:1800:2: ruleEOL
            {
             before(grammarAccess.getRecipeAccess().getEOLParserRuleCall_30()); 
            pushFollow(FOLLOW_2);
            ruleEOL();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getEOLParserRuleCall_30()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__30__Impl"


    // $ANTLR start "rule__Recipe__Group__31"
    // InternalMyDsl.g:1809:1: rule__Recipe__Group__31 : rule__Recipe__Group__31__Impl ;
    public final void rule__Recipe__Group__31() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1813:1: ( rule__Recipe__Group__31__Impl )
            // InternalMyDsl.g:1814:2: rule__Recipe__Group__31__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__Group__31__Impl();

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
    // $ANTLR end "rule__Recipe__Group__31"


    // $ANTLR start "rule__Recipe__Group__31__Impl"
    // InternalMyDsl.g:1820:1: rule__Recipe__Group__31__Impl : ( ( rule__Recipe__Group_31__0 )* ) ;
    public final void rule__Recipe__Group__31__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1824:1: ( ( ( rule__Recipe__Group_31__0 )* ) )
            // InternalMyDsl.g:1825:1: ( ( rule__Recipe__Group_31__0 )* )
            {
            // InternalMyDsl.g:1825:1: ( ( rule__Recipe__Group_31__0 )* )
            // InternalMyDsl.g:1826:2: ( rule__Recipe__Group_31__0 )*
            {
             before(grammarAccess.getRecipeAccess().getGroup_31()); 
            // InternalMyDsl.g:1827:2: ( rule__Recipe__Group_31__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_INT) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:1827:3: rule__Recipe__Group_31__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Recipe__Group_31__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getRecipeAccess().getGroup_31()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__31__Impl"


    // $ANTLR start "rule__Recipe__Group_15__0"
    // InternalMyDsl.g:1836:1: rule__Recipe__Group_15__0 : rule__Recipe__Group_15__0__Impl rule__Recipe__Group_15__1 ;
    public final void rule__Recipe__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1840:1: ( rule__Recipe__Group_15__0__Impl rule__Recipe__Group_15__1 )
            // InternalMyDsl.g:1841:2: rule__Recipe__Group_15__0__Impl rule__Recipe__Group_15__1
            {
            pushFollow(FOLLOW_3);
            rule__Recipe__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group_15__1();

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
    // $ANTLR end "rule__Recipe__Group_15__0"


    // $ANTLR start "rule__Recipe__Group_15__0__Impl"
    // InternalMyDsl.g:1848:1: rule__Recipe__Group_15__0__Impl : ( ( rule__Recipe__KitchenUtensilsAssignment_15_0 ) ) ;
    public final void rule__Recipe__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1852:1: ( ( ( rule__Recipe__KitchenUtensilsAssignment_15_0 ) ) )
            // InternalMyDsl.g:1853:1: ( ( rule__Recipe__KitchenUtensilsAssignment_15_0 ) )
            {
            // InternalMyDsl.g:1853:1: ( ( rule__Recipe__KitchenUtensilsAssignment_15_0 ) )
            // InternalMyDsl.g:1854:2: ( rule__Recipe__KitchenUtensilsAssignment_15_0 )
            {
             before(grammarAccess.getRecipeAccess().getKitchenUtensilsAssignment_15_0()); 
            // InternalMyDsl.g:1855:2: ( rule__Recipe__KitchenUtensilsAssignment_15_0 )
            // InternalMyDsl.g:1855:3: rule__Recipe__KitchenUtensilsAssignment_15_0
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__KitchenUtensilsAssignment_15_0();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getKitchenUtensilsAssignment_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_15__0__Impl"


    // $ANTLR start "rule__Recipe__Group_15__1"
    // InternalMyDsl.g:1863:1: rule__Recipe__Group_15__1 : rule__Recipe__Group_15__1__Impl ;
    public final void rule__Recipe__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1867:1: ( rule__Recipe__Group_15__1__Impl )
            // InternalMyDsl.g:1868:2: rule__Recipe__Group_15__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__Group_15__1__Impl();

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
    // $ANTLR end "rule__Recipe__Group_15__1"


    // $ANTLR start "rule__Recipe__Group_15__1__Impl"
    // InternalMyDsl.g:1874:1: rule__Recipe__Group_15__1__Impl : ( ruleEOL ) ;
    public final void rule__Recipe__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1878:1: ( ( ruleEOL ) )
            // InternalMyDsl.g:1879:1: ( ruleEOL )
            {
            // InternalMyDsl.g:1879:1: ( ruleEOL )
            // InternalMyDsl.g:1880:2: ruleEOL
            {
             before(grammarAccess.getRecipeAccess().getEOLParserRuleCall_15_1()); 
            pushFollow(FOLLOW_2);
            ruleEOL();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getEOLParserRuleCall_15_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_15__1__Impl"


    // $ANTLR start "rule__Recipe__Group_20__0"
    // InternalMyDsl.g:1890:1: rule__Recipe__Group_20__0 : rule__Recipe__Group_20__0__Impl rule__Recipe__Group_20__1 ;
    public final void rule__Recipe__Group_20__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1894:1: ( rule__Recipe__Group_20__0__Impl rule__Recipe__Group_20__1 )
            // InternalMyDsl.g:1895:2: rule__Recipe__Group_20__0__Impl rule__Recipe__Group_20__1
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
    // InternalMyDsl.g:1902:1: rule__Recipe__Group_20__0__Impl : ( ( rule__Recipe__FoodCategoryAssignment_20_0 ) ) ;
    public final void rule__Recipe__Group_20__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1906:1: ( ( ( rule__Recipe__FoodCategoryAssignment_20_0 ) ) )
            // InternalMyDsl.g:1907:1: ( ( rule__Recipe__FoodCategoryAssignment_20_0 ) )
            {
            // InternalMyDsl.g:1907:1: ( ( rule__Recipe__FoodCategoryAssignment_20_0 ) )
            // InternalMyDsl.g:1908:2: ( rule__Recipe__FoodCategoryAssignment_20_0 )
            {
             before(grammarAccess.getRecipeAccess().getFoodCategoryAssignment_20_0()); 
            // InternalMyDsl.g:1909:2: ( rule__Recipe__FoodCategoryAssignment_20_0 )
            // InternalMyDsl.g:1909:3: rule__Recipe__FoodCategoryAssignment_20_0
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__FoodCategoryAssignment_20_0();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getFoodCategoryAssignment_20_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:1917:1: rule__Recipe__Group_20__1 : rule__Recipe__Group_20__1__Impl ;
    public final void rule__Recipe__Group_20__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1921:1: ( rule__Recipe__Group_20__1__Impl )
            // InternalMyDsl.g:1922:2: rule__Recipe__Group_20__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__Group_20__1__Impl();

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
    // InternalMyDsl.g:1928:1: rule__Recipe__Group_20__1__Impl : ( ruleEOL ) ;
    public final void rule__Recipe__Group_20__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1932:1: ( ( ruleEOL ) )
            // InternalMyDsl.g:1933:1: ( ruleEOL )
            {
            // InternalMyDsl.g:1933:1: ( ruleEOL )
            // InternalMyDsl.g:1934:2: ruleEOL
            {
             before(grammarAccess.getRecipeAccess().getEOLParserRuleCall_20_1()); 
            pushFollow(FOLLOW_2);
            ruleEOL();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getEOLParserRuleCall_20_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Recipe__Group_26__0"
    // InternalMyDsl.g:1944:1: rule__Recipe__Group_26__0 : rule__Recipe__Group_26__0__Impl rule__Recipe__Group_26__1 ;
    public final void rule__Recipe__Group_26__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1948:1: ( rule__Recipe__Group_26__0__Impl rule__Recipe__Group_26__1 )
            // InternalMyDsl.g:1949:2: rule__Recipe__Group_26__0__Impl rule__Recipe__Group_26__1
            {
            pushFollow(FOLLOW_21);
            rule__Recipe__Group_26__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group_26__1();

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
    // $ANTLR end "rule__Recipe__Group_26__0"


    // $ANTLR start "rule__Recipe__Group_26__0__Impl"
    // InternalMyDsl.g:1956:1: rule__Recipe__Group_26__0__Impl : ( '- ' ) ;
    public final void rule__Recipe__Group_26__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1960:1: ( ( '- ' ) )
            // InternalMyDsl.g:1961:1: ( '- ' )
            {
            // InternalMyDsl.g:1961:1: ( '- ' )
            // InternalMyDsl.g:1962:2: '- '
            {
             before(grammarAccess.getRecipeAccess().getHyphenMinusSpaceKeyword_26_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getHyphenMinusSpaceKeyword_26_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_26__0__Impl"


    // $ANTLR start "rule__Recipe__Group_26__1"
    // InternalMyDsl.g:1971:1: rule__Recipe__Group_26__1 : rule__Recipe__Group_26__1__Impl rule__Recipe__Group_26__2 ;
    public final void rule__Recipe__Group_26__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1975:1: ( rule__Recipe__Group_26__1__Impl rule__Recipe__Group_26__2 )
            // InternalMyDsl.g:1976:2: rule__Recipe__Group_26__1__Impl rule__Recipe__Group_26__2
            {
            pushFollow(FOLLOW_3);
            rule__Recipe__Group_26__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group_26__2();

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
    // $ANTLR end "rule__Recipe__Group_26__1"


    // $ANTLR start "rule__Recipe__Group_26__1__Impl"
    // InternalMyDsl.g:1983:1: rule__Recipe__Group_26__1__Impl : ( ( rule__Recipe__IngredientAssignment_26_1 ) ) ;
    public final void rule__Recipe__Group_26__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1987:1: ( ( ( rule__Recipe__IngredientAssignment_26_1 ) ) )
            // InternalMyDsl.g:1988:1: ( ( rule__Recipe__IngredientAssignment_26_1 ) )
            {
            // InternalMyDsl.g:1988:1: ( ( rule__Recipe__IngredientAssignment_26_1 ) )
            // InternalMyDsl.g:1989:2: ( rule__Recipe__IngredientAssignment_26_1 )
            {
             before(grammarAccess.getRecipeAccess().getIngredientAssignment_26_1()); 
            // InternalMyDsl.g:1990:2: ( rule__Recipe__IngredientAssignment_26_1 )
            // InternalMyDsl.g:1990:3: rule__Recipe__IngredientAssignment_26_1
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__IngredientAssignment_26_1();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getIngredientAssignment_26_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_26__1__Impl"


    // $ANTLR start "rule__Recipe__Group_26__2"
    // InternalMyDsl.g:1998:1: rule__Recipe__Group_26__2 : rule__Recipe__Group_26__2__Impl ;
    public final void rule__Recipe__Group_26__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2002:1: ( rule__Recipe__Group_26__2__Impl )
            // InternalMyDsl.g:2003:2: rule__Recipe__Group_26__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__Group_26__2__Impl();

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
    // $ANTLR end "rule__Recipe__Group_26__2"


    // $ANTLR start "rule__Recipe__Group_26__2__Impl"
    // InternalMyDsl.g:2009:1: rule__Recipe__Group_26__2__Impl : ( ruleEOL ) ;
    public final void rule__Recipe__Group_26__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2013:1: ( ( ruleEOL ) )
            // InternalMyDsl.g:2014:1: ( ruleEOL )
            {
            // InternalMyDsl.g:2014:1: ( ruleEOL )
            // InternalMyDsl.g:2015:2: ruleEOL
            {
             before(grammarAccess.getRecipeAccess().getEOLParserRuleCall_26_2()); 
            pushFollow(FOLLOW_2);
            ruleEOL();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getEOLParserRuleCall_26_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_26__2__Impl"


    // $ANTLR start "rule__Recipe__Group_31__0"
    // InternalMyDsl.g:2025:1: rule__Recipe__Group_31__0 : rule__Recipe__Group_31__0__Impl rule__Recipe__Group_31__1 ;
    public final void rule__Recipe__Group_31__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2029:1: ( rule__Recipe__Group_31__0__Impl rule__Recipe__Group_31__1 )
            // InternalMyDsl.g:2030:2: rule__Recipe__Group_31__0__Impl rule__Recipe__Group_31__1
            {
            pushFollow(FOLLOW_3);
            rule__Recipe__Group_31__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group_31__1();

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
    // $ANTLR end "rule__Recipe__Group_31__0"


    // $ANTLR start "rule__Recipe__Group_31__0__Impl"
    // InternalMyDsl.g:2037:1: rule__Recipe__Group_31__0__Impl : ( ( rule__Recipe__RatingsAssignment_31_0 ) ) ;
    public final void rule__Recipe__Group_31__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2041:1: ( ( ( rule__Recipe__RatingsAssignment_31_0 ) ) )
            // InternalMyDsl.g:2042:1: ( ( rule__Recipe__RatingsAssignment_31_0 ) )
            {
            // InternalMyDsl.g:2042:1: ( ( rule__Recipe__RatingsAssignment_31_0 ) )
            // InternalMyDsl.g:2043:2: ( rule__Recipe__RatingsAssignment_31_0 )
            {
             before(grammarAccess.getRecipeAccess().getRatingsAssignment_31_0()); 
            // InternalMyDsl.g:2044:2: ( rule__Recipe__RatingsAssignment_31_0 )
            // InternalMyDsl.g:2044:3: rule__Recipe__RatingsAssignment_31_0
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__RatingsAssignment_31_0();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getRatingsAssignment_31_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_31__0__Impl"


    // $ANTLR start "rule__Recipe__Group_31__1"
    // InternalMyDsl.g:2052:1: rule__Recipe__Group_31__1 : rule__Recipe__Group_31__1__Impl ;
    public final void rule__Recipe__Group_31__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2056:1: ( rule__Recipe__Group_31__1__Impl )
            // InternalMyDsl.g:2057:2: rule__Recipe__Group_31__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__Group_31__1__Impl();

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
    // $ANTLR end "rule__Recipe__Group_31__1"


    // $ANTLR start "rule__Recipe__Group_31__1__Impl"
    // InternalMyDsl.g:2063:1: rule__Recipe__Group_31__1__Impl : ( ruleEOL ) ;
    public final void rule__Recipe__Group_31__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2067:1: ( ( ruleEOL ) )
            // InternalMyDsl.g:2068:1: ( ruleEOL )
            {
            // InternalMyDsl.g:2068:1: ( ruleEOL )
            // InternalMyDsl.g:2069:2: ruleEOL
            {
             before(grammarAccess.getRecipeAccess().getEOLParserRuleCall_31_1()); 
            pushFollow(FOLLOW_2);
            ruleEOL();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getEOLParserRuleCall_31_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_31__1__Impl"


    // $ANTLR start "rule__Ingredient__Group_0__0"
    // InternalMyDsl.g:2079:1: rule__Ingredient__Group_0__0 : rule__Ingredient__Group_0__0__Impl rule__Ingredient__Group_0__1 ;
    public final void rule__Ingredient__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2083:1: ( rule__Ingredient__Group_0__0__Impl rule__Ingredient__Group_0__1 )
            // InternalMyDsl.g:2084:2: rule__Ingredient__Group_0__0__Impl rule__Ingredient__Group_0__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:2091:1: rule__Ingredient__Group_0__0__Impl : ( ( rule__Ingredient__NameAssignment_0_0 ) ) ;
    public final void rule__Ingredient__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2095:1: ( ( ( rule__Ingredient__NameAssignment_0_0 ) ) )
            // InternalMyDsl.g:2096:1: ( ( rule__Ingredient__NameAssignment_0_0 ) )
            {
            // InternalMyDsl.g:2096:1: ( ( rule__Ingredient__NameAssignment_0_0 ) )
            // InternalMyDsl.g:2097:2: ( rule__Ingredient__NameAssignment_0_0 )
            {
             before(grammarAccess.getIngredientAccess().getNameAssignment_0_0()); 
            // InternalMyDsl.g:2098:2: ( rule__Ingredient__NameAssignment_0_0 )
            // InternalMyDsl.g:2098:3: rule__Ingredient__NameAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__NameAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getIngredientAccess().getNameAssignment_0_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:2106:1: rule__Ingredient__Group_0__1 : rule__Ingredient__Group_0__1__Impl rule__Ingredient__Group_0__2 ;
    public final void rule__Ingredient__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2110:1: ( rule__Ingredient__Group_0__1__Impl rule__Ingredient__Group_0__2 )
            // InternalMyDsl.g:2111:2: rule__Ingredient__Group_0__1__Impl rule__Ingredient__Group_0__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyDsl.g:2118:1: rule__Ingredient__Group_0__1__Impl : ( ( rule__Ingredient__AmountAssignment_0_1 ) ) ;
    public final void rule__Ingredient__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2122:1: ( ( ( rule__Ingredient__AmountAssignment_0_1 ) ) )
            // InternalMyDsl.g:2123:1: ( ( rule__Ingredient__AmountAssignment_0_1 ) )
            {
            // InternalMyDsl.g:2123:1: ( ( rule__Ingredient__AmountAssignment_0_1 ) )
            // InternalMyDsl.g:2124:2: ( rule__Ingredient__AmountAssignment_0_1 )
            {
             before(grammarAccess.getIngredientAccess().getAmountAssignment_0_1()); 
            // InternalMyDsl.g:2125:2: ( rule__Ingredient__AmountAssignment_0_1 )
            // InternalMyDsl.g:2125:3: rule__Ingredient__AmountAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__AmountAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getIngredientAccess().getAmountAssignment_0_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:2133:1: rule__Ingredient__Group_0__2 : rule__Ingredient__Group_0__2__Impl rule__Ingredient__Group_0__3 ;
    public final void rule__Ingredient__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2137:1: ( rule__Ingredient__Group_0__2__Impl rule__Ingredient__Group_0__3 )
            // InternalMyDsl.g:2138:2: rule__Ingredient__Group_0__2__Impl rule__Ingredient__Group_0__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:2145:1: rule__Ingredient__Group_0__2__Impl : ( ( rule__Ingredient__UnitAssignment_0_2 ) ) ;
    public final void rule__Ingredient__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2149:1: ( ( ( rule__Ingredient__UnitAssignment_0_2 ) ) )
            // InternalMyDsl.g:2150:1: ( ( rule__Ingredient__UnitAssignment_0_2 ) )
            {
            // InternalMyDsl.g:2150:1: ( ( rule__Ingredient__UnitAssignment_0_2 ) )
            // InternalMyDsl.g:2151:2: ( rule__Ingredient__UnitAssignment_0_2 )
            {
             before(grammarAccess.getIngredientAccess().getUnitAssignment_0_2()); 
            // InternalMyDsl.g:2152:2: ( rule__Ingredient__UnitAssignment_0_2 )
            // InternalMyDsl.g:2152:3: rule__Ingredient__UnitAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__UnitAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getIngredientAccess().getUnitAssignment_0_2()); 

            }


            }

        }
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
    // InternalMyDsl.g:2160:1: rule__Ingredient__Group_0__3 : rule__Ingredient__Group_0__3__Impl rule__Ingredient__Group_0__4 ;
    public final void rule__Ingredient__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2164:1: ( rule__Ingredient__Group_0__3__Impl rule__Ingredient__Group_0__4 )
            // InternalMyDsl.g:2165:2: rule__Ingredient__Group_0__3__Impl rule__Ingredient__Group_0__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:2172:1: rule__Ingredient__Group_0__3__Impl : ( ',' ) ;
    public final void rule__Ingredient__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2176:1: ( ( ',' ) )
            // InternalMyDsl.g:2177:1: ( ',' )
            {
            // InternalMyDsl.g:2177:1: ( ',' )
            // InternalMyDsl.g:2178:2: ','
            {
             before(grammarAccess.getIngredientAccess().getCommaKeyword_0_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getIngredientAccess().getCommaKeyword_0_3()); 

            }


            }

        }
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
    // InternalMyDsl.g:2187:1: rule__Ingredient__Group_0__4 : rule__Ingredient__Group_0__4__Impl ;
    public final void rule__Ingredient__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2191:1: ( rule__Ingredient__Group_0__4__Impl )
            // InternalMyDsl.g:2192:2: rule__Ingredient__Group_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__Group_0__4__Impl();

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
    // InternalMyDsl.g:2198:1: rule__Ingredient__Group_0__4__Impl : ( ( rule__Ingredient__VeganismLevelAssignment_0_4 ) ) ;
    public final void rule__Ingredient__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2202:1: ( ( ( rule__Ingredient__VeganismLevelAssignment_0_4 ) ) )
            // InternalMyDsl.g:2203:1: ( ( rule__Ingredient__VeganismLevelAssignment_0_4 ) )
            {
            // InternalMyDsl.g:2203:1: ( ( rule__Ingredient__VeganismLevelAssignment_0_4 ) )
            // InternalMyDsl.g:2204:2: ( rule__Ingredient__VeganismLevelAssignment_0_4 )
            {
             before(grammarAccess.getIngredientAccess().getVeganismLevelAssignment_0_4()); 
            // InternalMyDsl.g:2205:2: ( rule__Ingredient__VeganismLevelAssignment_0_4 )
            // InternalMyDsl.g:2205:3: rule__Ingredient__VeganismLevelAssignment_0_4
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__VeganismLevelAssignment_0_4();

            state._fsp--;


            }

             after(grammarAccess.getIngredientAccess().getVeganismLevelAssignment_0_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__RecipeManager__AuthorsAssignment_2"
    // InternalMyDsl.g:2214:1: rule__RecipeManager__AuthorsAssignment_2 : ( ruleAuthor ) ;
    public final void rule__RecipeManager__AuthorsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2218:1: ( ( ruleAuthor ) )
            // InternalMyDsl.g:2219:2: ( ruleAuthor )
            {
            // InternalMyDsl.g:2219:2: ( ruleAuthor )
            // InternalMyDsl.g:2220:3: ruleAuthor
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
    // InternalMyDsl.g:2229:1: rule__RecipeManager__AuthorsAssignment_3 : ( ruleAuthor ) ;
    public final void rule__RecipeManager__AuthorsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2233:1: ( ( ruleAuthor ) )
            // InternalMyDsl.g:2234:2: ( ruleAuthor )
            {
            // InternalMyDsl.g:2234:2: ( ruleAuthor )
            // InternalMyDsl.g:2235:3: ruleAuthor
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
    // InternalMyDsl.g:2244:1: rule__RecipeManager__RecipesAssignment_4_2 : ( ruleRecipe ) ;
    public final void rule__RecipeManager__RecipesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2248:1: ( ( ruleRecipe ) )
            // InternalMyDsl.g:2249:2: ( ruleRecipe )
            {
            // InternalMyDsl.g:2249:2: ( ruleRecipe )
            // InternalMyDsl.g:2250:3: ruleRecipe
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
    // InternalMyDsl.g:2259:1: rule__RecipeManager__RecipesAssignment_4_3 : ( ruleRecipe ) ;
    public final void rule__RecipeManager__RecipesAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2263:1: ( ( ruleRecipe ) )
            // InternalMyDsl.g:2264:2: ( ruleRecipe )
            {
            // InternalMyDsl.g:2264:2: ( ruleRecipe )
            // InternalMyDsl.g:2265:3: ruleRecipe
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
    // InternalMyDsl.g:2274:1: rule__Author__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Author__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2278:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2279:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2279:2: ( RULE_ID )
            // InternalMyDsl.g:2280:3: RULE_ID
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
    // InternalMyDsl.g:2289:1: rule__Author__EmailAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Author__EmailAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2293:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2294:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2294:2: ( RULE_STRING )
            // InternalMyDsl.g:2295:3: RULE_STRING
            {
             before(grammarAccess.getAuthorAccess().getEmailSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAuthorAccess().getEmailSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:2304:1: rule__Rating__StarsAssignment_0 : ( RULE_INT ) ;
    public final void rule__Rating__StarsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2308:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2309:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2309:2: ( RULE_INT )
            // InternalMyDsl.g:2310:3: RULE_INT
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


    // $ANTLR start "rule__Rating__CommentAssignment_2"
    // InternalMyDsl.g:2319:1: rule__Rating__CommentAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Rating__CommentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2323:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2324:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2324:2: ( RULE_STRING )
            // InternalMyDsl.g:2325:3: RULE_STRING
            {
             before(grammarAccess.getRatingAccess().getCommentSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRatingAccess().getCommentSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating__CommentAssignment_2"


    // $ANTLR start "rule__Rating__AuthorAssignment_4"
    // InternalMyDsl.g:2334:1: rule__Rating__AuthorAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Rating__AuthorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2338:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2339:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2339:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2340:3: ( RULE_ID )
            {
             before(grammarAccess.getRatingAccess().getAuthorAuthorCrossReference_4_0()); 
            // InternalMyDsl.g:2341:3: ( RULE_ID )
            // InternalMyDsl.g:2342:4: RULE_ID
            {
             before(grammarAccess.getRatingAccess().getAuthorAuthorIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRatingAccess().getAuthorAuthorIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getRatingAccess().getAuthorAuthorCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating__AuthorAssignment_4"


    // $ANTLR start "rule__Recipe__NameAssignment_0"
    // InternalMyDsl.g:2353:1: rule__Recipe__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Recipe__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2357:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2358:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2358:2: ( RULE_ID )
            // InternalMyDsl.g:2359:3: RULE_ID
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
    // InternalMyDsl.g:2368:1: rule__Recipe__AuthorAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Recipe__AuthorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2372:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2373:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2373:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2374:3: ( RULE_ID )
            {
             before(grammarAccess.getRecipeAccess().getAuthorAuthorCrossReference_2_0()); 
            // InternalMyDsl.g:2375:3: ( RULE_ID )
            // InternalMyDsl.g:2376:4: RULE_ID
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
    // InternalMyDsl.g:2387:1: rule__Recipe__VeganAssignment_4 : ( ruleVeganismLevel ) ;
    public final void rule__Recipe__VeganAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2391:1: ( ( ruleVeganismLevel ) )
            // InternalMyDsl.g:2392:2: ( ruleVeganismLevel )
            {
            // InternalMyDsl.g:2392:2: ( ruleVeganismLevel )
            // InternalMyDsl.g:2393:3: ruleVeganismLevel
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
    // InternalMyDsl.g:2402:1: rule__Recipe__DurationAssignment_6 : ( RULE_INT ) ;
    public final void rule__Recipe__DurationAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2406:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2407:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2407:2: ( RULE_INT )
            // InternalMyDsl.g:2408:3: RULE_INT
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
    // InternalMyDsl.g:2417:1: rule__Recipe__DifficultyAssignment_9 : ( ruleDifficultyLevel ) ;
    public final void rule__Recipe__DifficultyAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2421:1: ( ( ruleDifficultyLevel ) )
            // InternalMyDsl.g:2422:2: ( ruleDifficultyLevel )
            {
            // InternalMyDsl.g:2422:2: ( ruleDifficultyLevel )
            // InternalMyDsl.g:2423:3: ruleDifficultyLevel
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
    // InternalMyDsl.g:2432:1: rule__Recipe__KitchenUtensilsAssignment_13 : ( ruleKitchenUtensil ) ;
    public final void rule__Recipe__KitchenUtensilsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2436:1: ( ( ruleKitchenUtensil ) )
            // InternalMyDsl.g:2437:2: ( ruleKitchenUtensil )
            {
            // InternalMyDsl.g:2437:2: ( ruleKitchenUtensil )
            // InternalMyDsl.g:2438:3: ruleKitchenUtensil
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


    // $ANTLR start "rule__Recipe__KitchenUtensilsAssignment_15_0"
    // InternalMyDsl.g:2447:1: rule__Recipe__KitchenUtensilsAssignment_15_0 : ( ruleKitchenUtensil ) ;
    public final void rule__Recipe__KitchenUtensilsAssignment_15_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2451:1: ( ( ruleKitchenUtensil ) )
            // InternalMyDsl.g:2452:2: ( ruleKitchenUtensil )
            {
            // InternalMyDsl.g:2452:2: ( ruleKitchenUtensil )
            // InternalMyDsl.g:2453:3: ruleKitchenUtensil
            {
             before(grammarAccess.getRecipeAccess().getKitchenUtensilsKitchenUtensilParserRuleCall_15_0_0()); 
            pushFollow(FOLLOW_2);
            ruleKitchenUtensil();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getKitchenUtensilsKitchenUtensilParserRuleCall_15_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__KitchenUtensilsAssignment_15_0"


    // $ANTLR start "rule__Recipe__FoodCategoryAssignment_18"
    // InternalMyDsl.g:2462:1: rule__Recipe__FoodCategoryAssignment_18 : ( ruleFoodCategory ) ;
    public final void rule__Recipe__FoodCategoryAssignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2466:1: ( ( ruleFoodCategory ) )
            // InternalMyDsl.g:2467:2: ( ruleFoodCategory )
            {
            // InternalMyDsl.g:2467:2: ( ruleFoodCategory )
            // InternalMyDsl.g:2468:3: ruleFoodCategory
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


    // $ANTLR start "rule__Recipe__FoodCategoryAssignment_20_0"
    // InternalMyDsl.g:2477:1: rule__Recipe__FoodCategoryAssignment_20_0 : ( ruleFoodCategory ) ;
    public final void rule__Recipe__FoodCategoryAssignment_20_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2481:1: ( ( ruleFoodCategory ) )
            // InternalMyDsl.g:2482:2: ( ruleFoodCategory )
            {
            // InternalMyDsl.g:2482:2: ( ruleFoodCategory )
            // InternalMyDsl.g:2483:3: ruleFoodCategory
            {
             before(grammarAccess.getRecipeAccess().getFoodCategoryFoodCategoryParserRuleCall_20_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFoodCategory();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getFoodCategoryFoodCategoryParserRuleCall_20_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__FoodCategoryAssignment_20_0"


    // $ANTLR start "rule__Recipe__IngredientAssignment_24"
    // InternalMyDsl.g:2492:1: rule__Recipe__IngredientAssignment_24 : ( ruleIngredient ) ;
    public final void rule__Recipe__IngredientAssignment_24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2496:1: ( ( ruleIngredient ) )
            // InternalMyDsl.g:2497:2: ( ruleIngredient )
            {
            // InternalMyDsl.g:2497:2: ( ruleIngredient )
            // InternalMyDsl.g:2498:3: ruleIngredient
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


    // $ANTLR start "rule__Recipe__IngredientAssignment_26_1"
    // InternalMyDsl.g:2507:1: rule__Recipe__IngredientAssignment_26_1 : ( ruleIngredient ) ;
    public final void rule__Recipe__IngredientAssignment_26_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2511:1: ( ( ruleIngredient ) )
            // InternalMyDsl.g:2512:2: ( ruleIngredient )
            {
            // InternalMyDsl.g:2512:2: ( ruleIngredient )
            // InternalMyDsl.g:2513:3: ruleIngredient
            {
             before(grammarAccess.getRecipeAccess().getIngredientIngredientParserRuleCall_26_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIngredient();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getIngredientIngredientParserRuleCall_26_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__IngredientAssignment_26_1"


    // $ANTLR start "rule__Recipe__RatingsAssignment_29"
    // InternalMyDsl.g:2522:1: rule__Recipe__RatingsAssignment_29 : ( ruleRating ) ;
    public final void rule__Recipe__RatingsAssignment_29() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2526:1: ( ( ruleRating ) )
            // InternalMyDsl.g:2527:2: ( ruleRating )
            {
            // InternalMyDsl.g:2527:2: ( ruleRating )
            // InternalMyDsl.g:2528:3: ruleRating
            {
             before(grammarAccess.getRecipeAccess().getRatingsRatingParserRuleCall_29_0()); 
            pushFollow(FOLLOW_2);
            ruleRating();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getRatingsRatingParserRuleCall_29_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__RatingsAssignment_29"


    // $ANTLR start "rule__Recipe__RatingsAssignment_31_0"
    // InternalMyDsl.g:2537:1: rule__Recipe__RatingsAssignment_31_0 : ( ruleRating ) ;
    public final void rule__Recipe__RatingsAssignment_31_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2541:1: ( ( ruleRating ) )
            // InternalMyDsl.g:2542:2: ( ruleRating )
            {
            // InternalMyDsl.g:2542:2: ( ruleRating )
            // InternalMyDsl.g:2543:3: ruleRating
            {
             before(grammarAccess.getRecipeAccess().getRatingsRatingParserRuleCall_31_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRating();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getRatingsRatingParserRuleCall_31_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__RatingsAssignment_31_0"


    // $ANTLR start "rule__KitchenUtensil__NameAssignment"
    // InternalMyDsl.g:2552:1: rule__KitchenUtensil__NameAssignment : ( ( rule__KitchenUtensil__NameAlternatives_0 ) ) ;
    public final void rule__KitchenUtensil__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2556:1: ( ( ( rule__KitchenUtensil__NameAlternatives_0 ) ) )
            // InternalMyDsl.g:2557:2: ( ( rule__KitchenUtensil__NameAlternatives_0 ) )
            {
            // InternalMyDsl.g:2557:2: ( ( rule__KitchenUtensil__NameAlternatives_0 ) )
            // InternalMyDsl.g:2558:3: ( rule__KitchenUtensil__NameAlternatives_0 )
            {
             before(grammarAccess.getKitchenUtensilAccess().getNameAlternatives_0()); 
            // InternalMyDsl.g:2559:3: ( rule__KitchenUtensil__NameAlternatives_0 )
            // InternalMyDsl.g:2559:4: rule__KitchenUtensil__NameAlternatives_0
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


    // $ANTLR start "rule__DifficultyLevel__NameAssignment"
    // InternalMyDsl.g:2567:1: rule__DifficultyLevel__NameAssignment : ( ( rule__DifficultyLevel__NameAlternatives_0 ) ) ;
    public final void rule__DifficultyLevel__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2571:1: ( ( ( rule__DifficultyLevel__NameAlternatives_0 ) ) )
            // InternalMyDsl.g:2572:2: ( ( rule__DifficultyLevel__NameAlternatives_0 ) )
            {
            // InternalMyDsl.g:2572:2: ( ( rule__DifficultyLevel__NameAlternatives_0 ) )
            // InternalMyDsl.g:2573:3: ( rule__DifficultyLevel__NameAlternatives_0 )
            {
             before(grammarAccess.getDifficultyLevelAccess().getNameAlternatives_0()); 
            // InternalMyDsl.g:2574:3: ( rule__DifficultyLevel__NameAlternatives_0 )
            // InternalMyDsl.g:2574:4: rule__DifficultyLevel__NameAlternatives_0
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
    // InternalMyDsl.g:2582:1: rule__FoodCategory__NameAssignment : ( RULE_STRING ) ;
    public final void rule__FoodCategory__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2586:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2587:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2587:2: ( RULE_STRING )
            // InternalMyDsl.g:2588:3: RULE_STRING
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


    // $ANTLR start "rule__Ingredient__NameAssignment_0_0"
    // InternalMyDsl.g:2597:1: rule__Ingredient__NameAssignment_0_0 : ( RULE_STRING ) ;
    public final void rule__Ingredient__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2601:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2602:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2602:2: ( RULE_STRING )
            // InternalMyDsl.g:2603:3: RULE_STRING
            {
             before(grammarAccess.getIngredientAccess().getNameSTRINGTerminalRuleCall_0_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getIngredientAccess().getNameSTRINGTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__NameAssignment_0_0"


    // $ANTLR start "rule__Ingredient__AmountAssignment_0_1"
    // InternalMyDsl.g:2612:1: rule__Ingredient__AmountAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Ingredient__AmountAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2616:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2617:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2617:2: ( RULE_INT )
            // InternalMyDsl.g:2618:3: RULE_INT
            {
             before(grammarAccess.getIngredientAccess().getAmountINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIngredientAccess().getAmountINTTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__AmountAssignment_0_1"


    // $ANTLR start "rule__Ingredient__UnitAssignment_0_2"
    // InternalMyDsl.g:2627:1: rule__Ingredient__UnitAssignment_0_2 : ( ruleUnit ) ;
    public final void rule__Ingredient__UnitAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2631:1: ( ( ruleUnit ) )
            // InternalMyDsl.g:2632:2: ( ruleUnit )
            {
            // InternalMyDsl.g:2632:2: ( ruleUnit )
            // InternalMyDsl.g:2633:3: ruleUnit
            {
             before(grammarAccess.getIngredientAccess().getUnitUnitParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnit();

            state._fsp--;

             after(grammarAccess.getIngredientAccess().getUnitUnitParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__UnitAssignment_0_2"


    // $ANTLR start "rule__Ingredient__VeganismLevelAssignment_0_4"
    // InternalMyDsl.g:2642:1: rule__Ingredient__VeganismLevelAssignment_0_4 : ( ruleVeganismLevel ) ;
    public final void rule__Ingredient__VeganismLevelAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2646:1: ( ( ruleVeganismLevel ) )
            // InternalMyDsl.g:2647:2: ( ruleVeganismLevel )
            {
            // InternalMyDsl.g:2647:2: ( ruleVeganismLevel )
            // InternalMyDsl.g:2648:3: ruleVeganismLevel
            {
             before(grammarAccess.getIngredientAccess().getVeganismLevelVeganismLevelParserRuleCall_0_4_0()); 
            pushFollow(FOLLOW_2);
            ruleVeganismLevel();

            state._fsp--;

             after(grammarAccess.getIngredientAccess().getVeganismLevelVeganismLevelParserRuleCall_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__VeganismLevelAssignment_0_4"


    // $ANTLR start "rule__Ingredient__RecipeAssignment_1"
    // InternalMyDsl.g:2657:1: rule__Ingredient__RecipeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Ingredient__RecipeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2661:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2662:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2662:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2663:3: ( RULE_ID )
            {
             before(grammarAccess.getIngredientAccess().getRecipeRecipeCrossReference_1_0()); 
            // InternalMyDsl.g:2664:3: ( RULE_ID )
            // InternalMyDsl.g:2665:4: RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000040000080L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000007010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000800007010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000007012L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000001FE00000L});

}