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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'furnace'", "'stovetop'", "'rolling pin'", "'Vegan'", "'Vegetaric'", "'Carnivorous'", "'ml'", "'l'", "'g'", "'kg'", "'tsp'", "'mg'", "'tbsp'", "'pcs'", "'authors'", "':'", "'{'", "'}'", "'recipes'", "','", "'Stars'", "'Author'", "'Comment'", "'VeganismLevel'", "'Duration'", "'Difficulty'", "'Ingredients'", "'['", "']'", "'KitchenUtensils'", "'foodCategory'", "'Ratings'", "'Name'", "'Amount'", "'Unit'"
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


    // $ANTLR start "entryRuleFoodCategory"
    // InternalMyDsl.g:178:1: entryRuleFoodCategory : ruleFoodCategory EOF ;
    public final void entryRuleFoodCategory() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleFoodCategory EOF )
            // InternalMyDsl.g:180:1: ruleFoodCategory EOF
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
    // InternalMyDsl.g:187:1: ruleFoodCategory : ( ( rule__FoodCategory__NameAssignment ) ) ;
    public final void ruleFoodCategory() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__FoodCategory__NameAssignment ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__FoodCategory__NameAssignment ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__FoodCategory__NameAssignment ) )
            // InternalMyDsl.g:193:3: ( rule__FoodCategory__NameAssignment )
            {
             before(grammarAccess.getFoodCategoryAccess().getNameAssignment()); 
            // InternalMyDsl.g:194:3: ( rule__FoodCategory__NameAssignment )
            // InternalMyDsl.g:194:4: rule__FoodCategory__NameAssignment
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
    // InternalMyDsl.g:203:1: entryRuleIngredient : ruleIngredient EOF ;
    public final void entryRuleIngredient() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleIngredient EOF )
            // InternalMyDsl.g:205:1: ruleIngredient EOF
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
    // InternalMyDsl.g:212:1: ruleIngredient : ( ( rule__Ingredient__Alternatives ) ) ;
    public final void ruleIngredient() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__Ingredient__Alternatives ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__Ingredient__Alternatives ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__Ingredient__Alternatives ) )
            // InternalMyDsl.g:218:3: ( rule__Ingredient__Alternatives )
            {
             before(grammarAccess.getIngredientAccess().getAlternatives()); 
            // InternalMyDsl.g:219:3: ( rule__Ingredient__Alternatives )
            // InternalMyDsl.g:219:4: rule__Ingredient__Alternatives
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
    // InternalMyDsl.g:228:1: entryRuleVeganismLevel : ruleVeganismLevel EOF ;
    public final void entryRuleVeganismLevel() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleVeganismLevel EOF )
            // InternalMyDsl.g:230:1: ruleVeganismLevel EOF
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
    // InternalMyDsl.g:237:1: ruleVeganismLevel : ( ( rule__VeganismLevel__Alternatives ) ) ;
    public final void ruleVeganismLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__VeganismLevel__Alternatives ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__VeganismLevel__Alternatives ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__VeganismLevel__Alternatives ) )
            // InternalMyDsl.g:243:3: ( rule__VeganismLevel__Alternatives )
            {
             before(grammarAccess.getVeganismLevelAccess().getAlternatives()); 
            // InternalMyDsl.g:244:3: ( rule__VeganismLevel__Alternatives )
            // InternalMyDsl.g:244:4: rule__VeganismLevel__Alternatives
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
    // InternalMyDsl.g:253:1: entryRuleUnit : ruleUnit EOF ;
    public final void entryRuleUnit() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleUnit EOF )
            // InternalMyDsl.g:255:1: ruleUnit EOF
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
    // InternalMyDsl.g:262:1: ruleUnit : ( ( rule__Unit__Alternatives ) ) ;
    public final void ruleUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__Unit__Alternatives ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__Unit__Alternatives ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__Unit__Alternatives ) )
            // InternalMyDsl.g:268:3: ( rule__Unit__Alternatives )
            {
             before(grammarAccess.getUnitAccess().getAlternatives()); 
            // InternalMyDsl.g:269:3: ( rule__Unit__Alternatives )
            // InternalMyDsl.g:269:4: rule__Unit__Alternatives
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
    // InternalMyDsl.g:277:1: rule__KitchenUtensil__NameAlternatives_0 : ( ( RULE_STRING ) | ( 'furnace' ) | ( 'stovetop' ) | ( 'rolling pin' ) );
    public final void rule__KitchenUtensil__NameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:281:1: ( ( RULE_STRING ) | ( 'furnace' ) | ( 'stovetop' ) | ( 'rolling pin' ) )
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
                    // InternalMyDsl.g:282:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:282:2: ( RULE_STRING )
                    // InternalMyDsl.g:283:3: RULE_STRING
                    {
                     before(grammarAccess.getKitchenUtensilAccess().getNameSTRINGTerminalRuleCall_0_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getKitchenUtensilAccess().getNameSTRINGTerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:288:2: ( 'furnace' )
                    {
                    // InternalMyDsl.g:288:2: ( 'furnace' )
                    // InternalMyDsl.g:289:3: 'furnace'
                    {
                     before(grammarAccess.getKitchenUtensilAccess().getNameFurnaceKeyword_0_1()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getKitchenUtensilAccess().getNameFurnaceKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:294:2: ( 'stovetop' )
                    {
                    // InternalMyDsl.g:294:2: ( 'stovetop' )
                    // InternalMyDsl.g:295:3: 'stovetop'
                    {
                     before(grammarAccess.getKitchenUtensilAccess().getNameStovetopKeyword_0_2()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getKitchenUtensilAccess().getNameStovetopKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:300:2: ( 'rolling pin' )
                    {
                    // InternalMyDsl.g:300:2: ( 'rolling pin' )
                    // InternalMyDsl.g:301:3: 'rolling pin'
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
    // InternalMyDsl.g:310:1: rule__Ingredient__Alternatives : ( ( ( rule__Ingredient__Group_0__0 ) ) | ( ( rule__Ingredient__RecipeAssignment_1 ) ) );
    public final void rule__Ingredient__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:314:1: ( ( ( rule__Ingredient__Group_0__0 ) ) | ( ( rule__Ingredient__RecipeAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==27) ) {
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
                    // InternalMyDsl.g:315:2: ( ( rule__Ingredient__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:315:2: ( ( rule__Ingredient__Group_0__0 ) )
                    // InternalMyDsl.g:316:3: ( rule__Ingredient__Group_0__0 )
                    {
                     before(grammarAccess.getIngredientAccess().getGroup_0()); 
                    // InternalMyDsl.g:317:3: ( rule__Ingredient__Group_0__0 )
                    // InternalMyDsl.g:317:4: rule__Ingredient__Group_0__0
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
                    // InternalMyDsl.g:321:2: ( ( rule__Ingredient__RecipeAssignment_1 ) )
                    {
                    // InternalMyDsl.g:321:2: ( ( rule__Ingredient__RecipeAssignment_1 ) )
                    // InternalMyDsl.g:322:3: ( rule__Ingredient__RecipeAssignment_1 )
                    {
                     before(grammarAccess.getIngredientAccess().getRecipeAssignment_1()); 
                    // InternalMyDsl.g:323:3: ( rule__Ingredient__RecipeAssignment_1 )
                    // InternalMyDsl.g:323:4: rule__Ingredient__RecipeAssignment_1
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
    // InternalMyDsl.g:331:1: rule__VeganismLevel__Alternatives : ( ( 'Vegan' ) | ( 'Vegetaric' ) | ( 'Carnivorous' ) );
    public final void rule__VeganismLevel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:335:1: ( ( 'Vegan' ) | ( 'Vegetaric' ) | ( 'Carnivorous' ) )
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
                    // InternalMyDsl.g:336:2: ( 'Vegan' )
                    {
                    // InternalMyDsl.g:336:2: ( 'Vegan' )
                    // InternalMyDsl.g:337:3: 'Vegan'
                    {
                     before(grammarAccess.getVeganismLevelAccess().getVeganKeyword_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getVeganismLevelAccess().getVeganKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:342:2: ( 'Vegetaric' )
                    {
                    // InternalMyDsl.g:342:2: ( 'Vegetaric' )
                    // InternalMyDsl.g:343:3: 'Vegetaric'
                    {
                     before(grammarAccess.getVeganismLevelAccess().getVegetaricKeyword_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getVeganismLevelAccess().getVegetaricKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:348:2: ( 'Carnivorous' )
                    {
                    // InternalMyDsl.g:348:2: ( 'Carnivorous' )
                    // InternalMyDsl.g:349:3: 'Carnivorous'
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
    // InternalMyDsl.g:358:1: rule__Unit__Alternatives : ( ( 'ml' ) | ( 'l' ) | ( 'g' ) | ( 'kg' ) | ( 'tsp' ) | ( 'mg' ) | ( 'tbsp' ) | ( 'pcs' ) );
    public final void rule__Unit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:362:1: ( ( 'ml' ) | ( 'l' ) | ( 'g' ) | ( 'kg' ) | ( 'tsp' ) | ( 'mg' ) | ( 'tbsp' ) | ( 'pcs' ) )
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
                    // InternalMyDsl.g:363:2: ( 'ml' )
                    {
                    // InternalMyDsl.g:363:2: ( 'ml' )
                    // InternalMyDsl.g:364:3: 'ml'
                    {
                     before(grammarAccess.getUnitAccess().getMlKeyword_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getUnitAccess().getMlKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:369:2: ( 'l' )
                    {
                    // InternalMyDsl.g:369:2: ( 'l' )
                    // InternalMyDsl.g:370:3: 'l'
                    {
                     before(grammarAccess.getUnitAccess().getLKeyword_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getUnitAccess().getLKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:375:2: ( 'g' )
                    {
                    // InternalMyDsl.g:375:2: ( 'g' )
                    // InternalMyDsl.g:376:3: 'g'
                    {
                     before(grammarAccess.getUnitAccess().getGKeyword_2()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getUnitAccess().getGKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:381:2: ( 'kg' )
                    {
                    // InternalMyDsl.g:381:2: ( 'kg' )
                    // InternalMyDsl.g:382:3: 'kg'
                    {
                     before(grammarAccess.getUnitAccess().getKgKeyword_3()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getUnitAccess().getKgKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:387:2: ( 'tsp' )
                    {
                    // InternalMyDsl.g:387:2: ( 'tsp' )
                    // InternalMyDsl.g:388:3: 'tsp'
                    {
                     before(grammarAccess.getUnitAccess().getTspKeyword_4()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getUnitAccess().getTspKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:393:2: ( 'mg' )
                    {
                    // InternalMyDsl.g:393:2: ( 'mg' )
                    // InternalMyDsl.g:394:3: 'mg'
                    {
                     before(grammarAccess.getUnitAccess().getMgKeyword_5()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getUnitAccess().getMgKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:399:2: ( 'tbsp' )
                    {
                    // InternalMyDsl.g:399:2: ( 'tbsp' )
                    // InternalMyDsl.g:400:3: 'tbsp'
                    {
                     before(grammarAccess.getUnitAccess().getTbspKeyword_6()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getUnitAccess().getTbspKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:405:2: ( 'pcs' )
                    {
                    // InternalMyDsl.g:405:2: ( 'pcs' )
                    // InternalMyDsl.g:406:3: 'pcs'
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
    // InternalMyDsl.g:415:1: rule__RecipeManager__Group__0 : rule__RecipeManager__Group__0__Impl rule__RecipeManager__Group__1 ;
    public final void rule__RecipeManager__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:419:1: ( rule__RecipeManager__Group__0__Impl rule__RecipeManager__Group__1 )
            // InternalMyDsl.g:420:2: rule__RecipeManager__Group__0__Impl rule__RecipeManager__Group__1
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
    // InternalMyDsl.g:427:1: rule__RecipeManager__Group__0__Impl : ( 'authors' ) ;
    public final void rule__RecipeManager__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:431:1: ( ( 'authors' ) )
            // InternalMyDsl.g:432:1: ( 'authors' )
            {
            // InternalMyDsl.g:432:1: ( 'authors' )
            // InternalMyDsl.g:433:2: 'authors'
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
    // InternalMyDsl.g:442:1: rule__RecipeManager__Group__1 : rule__RecipeManager__Group__1__Impl rule__RecipeManager__Group__2 ;
    public final void rule__RecipeManager__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:446:1: ( rule__RecipeManager__Group__1__Impl rule__RecipeManager__Group__2 )
            // InternalMyDsl.g:447:2: rule__RecipeManager__Group__1__Impl rule__RecipeManager__Group__2
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
    // InternalMyDsl.g:454:1: rule__RecipeManager__Group__1__Impl : ( ':' ) ;
    public final void rule__RecipeManager__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:458:1: ( ( ':' ) )
            // InternalMyDsl.g:459:1: ( ':' )
            {
            // InternalMyDsl.g:459:1: ( ':' )
            // InternalMyDsl.g:460:2: ':'
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
    // InternalMyDsl.g:469:1: rule__RecipeManager__Group__2 : rule__RecipeManager__Group__2__Impl rule__RecipeManager__Group__3 ;
    public final void rule__RecipeManager__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:473:1: ( rule__RecipeManager__Group__2__Impl rule__RecipeManager__Group__3 )
            // InternalMyDsl.g:474:2: rule__RecipeManager__Group__2__Impl rule__RecipeManager__Group__3
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
    // InternalMyDsl.g:481:1: rule__RecipeManager__Group__2__Impl : ( '{' ) ;
    public final void rule__RecipeManager__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:485:1: ( ( '{' ) )
            // InternalMyDsl.g:486:1: ( '{' )
            {
            // InternalMyDsl.g:486:1: ( '{' )
            // InternalMyDsl.g:487:2: '{'
            {
             before(grammarAccess.getRecipeManagerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRecipeManagerAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalMyDsl.g:496:1: rule__RecipeManager__Group__3 : rule__RecipeManager__Group__3__Impl rule__RecipeManager__Group__4 ;
    public final void rule__RecipeManager__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:500:1: ( rule__RecipeManager__Group__3__Impl rule__RecipeManager__Group__4 )
            // InternalMyDsl.g:501:2: rule__RecipeManager__Group__3__Impl rule__RecipeManager__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:508:1: rule__RecipeManager__Group__3__Impl : ( ( rule__RecipeManager__AuthorsAssignment_3 ) ) ;
    public final void rule__RecipeManager__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:512:1: ( ( ( rule__RecipeManager__AuthorsAssignment_3 ) ) )
            // InternalMyDsl.g:513:1: ( ( rule__RecipeManager__AuthorsAssignment_3 ) )
            {
            // InternalMyDsl.g:513:1: ( ( rule__RecipeManager__AuthorsAssignment_3 ) )
            // InternalMyDsl.g:514:2: ( rule__RecipeManager__AuthorsAssignment_3 )
            {
             before(grammarAccess.getRecipeManagerAccess().getAuthorsAssignment_3()); 
            // InternalMyDsl.g:515:2: ( rule__RecipeManager__AuthorsAssignment_3 )
            // InternalMyDsl.g:515:3: rule__RecipeManager__AuthorsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RecipeManager__AuthorsAssignment_3();

            state._fsp--;


            }

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
    // InternalMyDsl.g:523:1: rule__RecipeManager__Group__4 : rule__RecipeManager__Group__4__Impl rule__RecipeManager__Group__5 ;
    public final void rule__RecipeManager__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:527:1: ( rule__RecipeManager__Group__4__Impl rule__RecipeManager__Group__5 )
            // InternalMyDsl.g:528:2: rule__RecipeManager__Group__4__Impl rule__RecipeManager__Group__5
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:535:1: rule__RecipeManager__Group__4__Impl : ( ( rule__RecipeManager__Group_4__0 )* ) ;
    public final void rule__RecipeManager__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:539:1: ( ( ( rule__RecipeManager__Group_4__0 )* ) )
            // InternalMyDsl.g:540:1: ( ( rule__RecipeManager__Group_4__0 )* )
            {
            // InternalMyDsl.g:540:1: ( ( rule__RecipeManager__Group_4__0 )* )
            // InternalMyDsl.g:541:2: ( rule__RecipeManager__Group_4__0 )*
            {
             before(grammarAccess.getRecipeManagerAccess().getGroup_4()); 
            // InternalMyDsl.g:542:2: ( rule__RecipeManager__Group_4__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==30) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:542:3: rule__RecipeManager__Group_4__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__RecipeManager__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

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


    // $ANTLR start "rule__RecipeManager__Group__5"
    // InternalMyDsl.g:550:1: rule__RecipeManager__Group__5 : rule__RecipeManager__Group__5__Impl rule__RecipeManager__Group__6 ;
    public final void rule__RecipeManager__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:554:1: ( rule__RecipeManager__Group__5__Impl rule__RecipeManager__Group__6 )
            // InternalMyDsl.g:555:2: rule__RecipeManager__Group__5__Impl rule__RecipeManager__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__RecipeManager__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecipeManager__Group__6();

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
    // InternalMyDsl.g:562:1: rule__RecipeManager__Group__5__Impl : ( '}' ) ;
    public final void rule__RecipeManager__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:1: ( ( '}' ) )
            // InternalMyDsl.g:567:1: ( '}' )
            {
            // InternalMyDsl.g:567:1: ( '}' )
            // InternalMyDsl.g:568:2: '}'
            {
             before(grammarAccess.getRecipeManagerAccess().getRightCurlyBracketKeyword_5()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRecipeManagerAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__RecipeManager__Group__6"
    // InternalMyDsl.g:577:1: rule__RecipeManager__Group__6 : rule__RecipeManager__Group__6__Impl rule__RecipeManager__Group__7 ;
    public final void rule__RecipeManager__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:581:1: ( rule__RecipeManager__Group__6__Impl rule__RecipeManager__Group__7 )
            // InternalMyDsl.g:582:2: rule__RecipeManager__Group__6__Impl rule__RecipeManager__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__RecipeManager__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecipeManager__Group__7();

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
    // $ANTLR end "rule__RecipeManager__Group__6"


    // $ANTLR start "rule__RecipeManager__Group__6__Impl"
    // InternalMyDsl.g:589:1: rule__RecipeManager__Group__6__Impl : ( 'recipes' ) ;
    public final void rule__RecipeManager__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:593:1: ( ( 'recipes' ) )
            // InternalMyDsl.g:594:1: ( 'recipes' )
            {
            // InternalMyDsl.g:594:1: ( 'recipes' )
            // InternalMyDsl.g:595:2: 'recipes'
            {
             before(grammarAccess.getRecipeManagerAccess().getRecipesKeyword_6()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getRecipeManagerAccess().getRecipesKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecipeManager__Group__6__Impl"


    // $ANTLR start "rule__RecipeManager__Group__7"
    // InternalMyDsl.g:604:1: rule__RecipeManager__Group__7 : rule__RecipeManager__Group__7__Impl rule__RecipeManager__Group__8 ;
    public final void rule__RecipeManager__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:608:1: ( rule__RecipeManager__Group__7__Impl rule__RecipeManager__Group__8 )
            // InternalMyDsl.g:609:2: rule__RecipeManager__Group__7__Impl rule__RecipeManager__Group__8
            {
            pushFollow(FOLLOW_4);
            rule__RecipeManager__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecipeManager__Group__8();

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
    // $ANTLR end "rule__RecipeManager__Group__7"


    // $ANTLR start "rule__RecipeManager__Group__7__Impl"
    // InternalMyDsl.g:616:1: rule__RecipeManager__Group__7__Impl : ( ':' ) ;
    public final void rule__RecipeManager__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:620:1: ( ( ':' ) )
            // InternalMyDsl.g:621:1: ( ':' )
            {
            // InternalMyDsl.g:621:1: ( ':' )
            // InternalMyDsl.g:622:2: ':'
            {
             before(grammarAccess.getRecipeManagerAccess().getColonKeyword_7()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRecipeManagerAccess().getColonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecipeManager__Group__7__Impl"


    // $ANTLR start "rule__RecipeManager__Group__8"
    // InternalMyDsl.g:631:1: rule__RecipeManager__Group__8 : rule__RecipeManager__Group__8__Impl rule__RecipeManager__Group__9 ;
    public final void rule__RecipeManager__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:635:1: ( rule__RecipeManager__Group__8__Impl rule__RecipeManager__Group__9 )
            // InternalMyDsl.g:636:2: rule__RecipeManager__Group__8__Impl rule__RecipeManager__Group__9
            {
            pushFollow(FOLLOW_5);
            rule__RecipeManager__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecipeManager__Group__9();

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
    // $ANTLR end "rule__RecipeManager__Group__8"


    // $ANTLR start "rule__RecipeManager__Group__8__Impl"
    // InternalMyDsl.g:643:1: rule__RecipeManager__Group__8__Impl : ( '{' ) ;
    public final void rule__RecipeManager__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:647:1: ( ( '{' ) )
            // InternalMyDsl.g:648:1: ( '{' )
            {
            // InternalMyDsl.g:648:1: ( '{' )
            // InternalMyDsl.g:649:2: '{'
            {
             before(grammarAccess.getRecipeManagerAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRecipeManagerAccess().getLeftCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecipeManager__Group__8__Impl"


    // $ANTLR start "rule__RecipeManager__Group__9"
    // InternalMyDsl.g:658:1: rule__RecipeManager__Group__9 : rule__RecipeManager__Group__9__Impl rule__RecipeManager__Group__10 ;
    public final void rule__RecipeManager__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:662:1: ( rule__RecipeManager__Group__9__Impl rule__RecipeManager__Group__10 )
            // InternalMyDsl.g:663:2: rule__RecipeManager__Group__9__Impl rule__RecipeManager__Group__10
            {
            pushFollow(FOLLOW_6);
            rule__RecipeManager__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecipeManager__Group__10();

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
    // $ANTLR end "rule__RecipeManager__Group__9"


    // $ANTLR start "rule__RecipeManager__Group__9__Impl"
    // InternalMyDsl.g:670:1: rule__RecipeManager__Group__9__Impl : ( ( rule__RecipeManager__RecipesAssignment_9 ) ) ;
    public final void rule__RecipeManager__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:674:1: ( ( ( rule__RecipeManager__RecipesAssignment_9 ) ) )
            // InternalMyDsl.g:675:1: ( ( rule__RecipeManager__RecipesAssignment_9 ) )
            {
            // InternalMyDsl.g:675:1: ( ( rule__RecipeManager__RecipesAssignment_9 ) )
            // InternalMyDsl.g:676:2: ( rule__RecipeManager__RecipesAssignment_9 )
            {
             before(grammarAccess.getRecipeManagerAccess().getRecipesAssignment_9()); 
            // InternalMyDsl.g:677:2: ( rule__RecipeManager__RecipesAssignment_9 )
            // InternalMyDsl.g:677:3: rule__RecipeManager__RecipesAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__RecipeManager__RecipesAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getRecipeManagerAccess().getRecipesAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecipeManager__Group__9__Impl"


    // $ANTLR start "rule__RecipeManager__Group__10"
    // InternalMyDsl.g:685:1: rule__RecipeManager__Group__10 : rule__RecipeManager__Group__10__Impl rule__RecipeManager__Group__11 ;
    public final void rule__RecipeManager__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:689:1: ( rule__RecipeManager__Group__10__Impl rule__RecipeManager__Group__11 )
            // InternalMyDsl.g:690:2: rule__RecipeManager__Group__10__Impl rule__RecipeManager__Group__11
            {
            pushFollow(FOLLOW_6);
            rule__RecipeManager__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecipeManager__Group__11();

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
    // $ANTLR end "rule__RecipeManager__Group__10"


    // $ANTLR start "rule__RecipeManager__Group__10__Impl"
    // InternalMyDsl.g:697:1: rule__RecipeManager__Group__10__Impl : ( ( rule__RecipeManager__Group_10__0 )* ) ;
    public final void rule__RecipeManager__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:701:1: ( ( ( rule__RecipeManager__Group_10__0 )* ) )
            // InternalMyDsl.g:702:1: ( ( rule__RecipeManager__Group_10__0 )* )
            {
            // InternalMyDsl.g:702:1: ( ( rule__RecipeManager__Group_10__0 )* )
            // InternalMyDsl.g:703:2: ( rule__RecipeManager__Group_10__0 )*
            {
             before(grammarAccess.getRecipeManagerAccess().getGroup_10()); 
            // InternalMyDsl.g:704:2: ( rule__RecipeManager__Group_10__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==30) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:704:3: rule__RecipeManager__Group_10__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__RecipeManager__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getRecipeManagerAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecipeManager__Group__10__Impl"


    // $ANTLR start "rule__RecipeManager__Group__11"
    // InternalMyDsl.g:712:1: rule__RecipeManager__Group__11 : rule__RecipeManager__Group__11__Impl ;
    public final void rule__RecipeManager__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:716:1: ( rule__RecipeManager__Group__11__Impl )
            // InternalMyDsl.g:717:2: rule__RecipeManager__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RecipeManager__Group__11__Impl();

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
    // $ANTLR end "rule__RecipeManager__Group__11"


    // $ANTLR start "rule__RecipeManager__Group__11__Impl"
    // InternalMyDsl.g:723:1: rule__RecipeManager__Group__11__Impl : ( '}' ) ;
    public final void rule__RecipeManager__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:727:1: ( ( '}' ) )
            // InternalMyDsl.g:728:1: ( '}' )
            {
            // InternalMyDsl.g:728:1: ( '}' )
            // InternalMyDsl.g:729:2: '}'
            {
             before(grammarAccess.getRecipeManagerAccess().getRightCurlyBracketKeyword_11()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRecipeManagerAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecipeManager__Group__11__Impl"


    // $ANTLR start "rule__RecipeManager__Group_4__0"
    // InternalMyDsl.g:739:1: rule__RecipeManager__Group_4__0 : rule__RecipeManager__Group_4__0__Impl rule__RecipeManager__Group_4__1 ;
    public final void rule__RecipeManager__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:743:1: ( rule__RecipeManager__Group_4__0__Impl rule__RecipeManager__Group_4__1 )
            // InternalMyDsl.g:744:2: rule__RecipeManager__Group_4__0__Impl rule__RecipeManager__Group_4__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:751:1: rule__RecipeManager__Group_4__0__Impl : ( ',' ) ;
    public final void rule__RecipeManager__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:755:1: ( ( ',' ) )
            // InternalMyDsl.g:756:1: ( ',' )
            {
            // InternalMyDsl.g:756:1: ( ',' )
            // InternalMyDsl.g:757:2: ','
            {
             before(grammarAccess.getRecipeManagerAccess().getCommaKeyword_4_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getRecipeManagerAccess().getCommaKeyword_4_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:766:1: rule__RecipeManager__Group_4__1 : rule__RecipeManager__Group_4__1__Impl ;
    public final void rule__RecipeManager__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:770:1: ( rule__RecipeManager__Group_4__1__Impl )
            // InternalMyDsl.g:771:2: rule__RecipeManager__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RecipeManager__Group_4__1__Impl();

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
    // InternalMyDsl.g:777:1: rule__RecipeManager__Group_4__1__Impl : ( ( rule__RecipeManager__AuthorsAssignment_4_1 ) ) ;
    public final void rule__RecipeManager__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:781:1: ( ( ( rule__RecipeManager__AuthorsAssignment_4_1 ) ) )
            // InternalMyDsl.g:782:1: ( ( rule__RecipeManager__AuthorsAssignment_4_1 ) )
            {
            // InternalMyDsl.g:782:1: ( ( rule__RecipeManager__AuthorsAssignment_4_1 ) )
            // InternalMyDsl.g:783:2: ( rule__RecipeManager__AuthorsAssignment_4_1 )
            {
             before(grammarAccess.getRecipeManagerAccess().getAuthorsAssignment_4_1()); 
            // InternalMyDsl.g:784:2: ( rule__RecipeManager__AuthorsAssignment_4_1 )
            // InternalMyDsl.g:784:3: rule__RecipeManager__AuthorsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__RecipeManager__AuthorsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRecipeManagerAccess().getAuthorsAssignment_4_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__RecipeManager__Group_10__0"
    // InternalMyDsl.g:793:1: rule__RecipeManager__Group_10__0 : rule__RecipeManager__Group_10__0__Impl rule__RecipeManager__Group_10__1 ;
    public final void rule__RecipeManager__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:797:1: ( rule__RecipeManager__Group_10__0__Impl rule__RecipeManager__Group_10__1 )
            // InternalMyDsl.g:798:2: rule__RecipeManager__Group_10__0__Impl rule__RecipeManager__Group_10__1
            {
            pushFollow(FOLLOW_5);
            rule__RecipeManager__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecipeManager__Group_10__1();

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
    // $ANTLR end "rule__RecipeManager__Group_10__0"


    // $ANTLR start "rule__RecipeManager__Group_10__0__Impl"
    // InternalMyDsl.g:805:1: rule__RecipeManager__Group_10__0__Impl : ( ',' ) ;
    public final void rule__RecipeManager__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:809:1: ( ( ',' ) )
            // InternalMyDsl.g:810:1: ( ',' )
            {
            // InternalMyDsl.g:810:1: ( ',' )
            // InternalMyDsl.g:811:2: ','
            {
             before(grammarAccess.getRecipeManagerAccess().getCommaKeyword_10_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getRecipeManagerAccess().getCommaKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecipeManager__Group_10__0__Impl"


    // $ANTLR start "rule__RecipeManager__Group_10__1"
    // InternalMyDsl.g:820:1: rule__RecipeManager__Group_10__1 : rule__RecipeManager__Group_10__1__Impl ;
    public final void rule__RecipeManager__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:824:1: ( rule__RecipeManager__Group_10__1__Impl )
            // InternalMyDsl.g:825:2: rule__RecipeManager__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RecipeManager__Group_10__1__Impl();

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
    // $ANTLR end "rule__RecipeManager__Group_10__1"


    // $ANTLR start "rule__RecipeManager__Group_10__1__Impl"
    // InternalMyDsl.g:831:1: rule__RecipeManager__Group_10__1__Impl : ( ( rule__RecipeManager__RecipesAssignment_10_1 ) ) ;
    public final void rule__RecipeManager__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:835:1: ( ( ( rule__RecipeManager__RecipesAssignment_10_1 ) ) )
            // InternalMyDsl.g:836:1: ( ( rule__RecipeManager__RecipesAssignment_10_1 ) )
            {
            // InternalMyDsl.g:836:1: ( ( rule__RecipeManager__RecipesAssignment_10_1 ) )
            // InternalMyDsl.g:837:2: ( rule__RecipeManager__RecipesAssignment_10_1 )
            {
             before(grammarAccess.getRecipeManagerAccess().getRecipesAssignment_10_1()); 
            // InternalMyDsl.g:838:2: ( rule__RecipeManager__RecipesAssignment_10_1 )
            // InternalMyDsl.g:838:3: rule__RecipeManager__RecipesAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__RecipeManager__RecipesAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getRecipeManagerAccess().getRecipesAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecipeManager__Group_10__1__Impl"


    // $ANTLR start "rule__Author__Group__0"
    // InternalMyDsl.g:847:1: rule__Author__Group__0 : rule__Author__Group__0__Impl rule__Author__Group__1 ;
    public final void rule__Author__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:851:1: ( rule__Author__Group__0__Impl rule__Author__Group__1 )
            // InternalMyDsl.g:852:2: rule__Author__Group__0__Impl rule__Author__Group__1
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
    // InternalMyDsl.g:859:1: rule__Author__Group__0__Impl : ( ( rule__Author__NameAssignment_0 ) ) ;
    public final void rule__Author__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:863:1: ( ( ( rule__Author__NameAssignment_0 ) ) )
            // InternalMyDsl.g:864:1: ( ( rule__Author__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:864:1: ( ( rule__Author__NameAssignment_0 ) )
            // InternalMyDsl.g:865:2: ( rule__Author__NameAssignment_0 )
            {
             before(grammarAccess.getAuthorAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:866:2: ( rule__Author__NameAssignment_0 )
            // InternalMyDsl.g:866:3: rule__Author__NameAssignment_0
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
    // InternalMyDsl.g:874:1: rule__Author__Group__1 : rule__Author__Group__1__Impl rule__Author__Group__2 ;
    public final void rule__Author__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:878:1: ( rule__Author__Group__1__Impl rule__Author__Group__2 )
            // InternalMyDsl.g:879:2: rule__Author__Group__1__Impl rule__Author__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:886:1: rule__Author__Group__1__Impl : ( ':' ) ;
    public final void rule__Author__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:890:1: ( ( ':' ) )
            // InternalMyDsl.g:891:1: ( ':' )
            {
            // InternalMyDsl.g:891:1: ( ':' )
            // InternalMyDsl.g:892:2: ':'
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
    // InternalMyDsl.g:901:1: rule__Author__Group__2 : rule__Author__Group__2__Impl ;
    public final void rule__Author__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:905:1: ( rule__Author__Group__2__Impl )
            // InternalMyDsl.g:906:2: rule__Author__Group__2__Impl
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
    // InternalMyDsl.g:912:1: rule__Author__Group__2__Impl : ( ( rule__Author__EmailAssignment_2 ) ) ;
    public final void rule__Author__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:916:1: ( ( ( rule__Author__EmailAssignment_2 ) ) )
            // InternalMyDsl.g:917:1: ( ( rule__Author__EmailAssignment_2 ) )
            {
            // InternalMyDsl.g:917:1: ( ( rule__Author__EmailAssignment_2 ) )
            // InternalMyDsl.g:918:2: ( rule__Author__EmailAssignment_2 )
            {
             before(grammarAccess.getAuthorAccess().getEmailAssignment_2()); 
            // InternalMyDsl.g:919:2: ( rule__Author__EmailAssignment_2 )
            // InternalMyDsl.g:919:3: rule__Author__EmailAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Author__EmailAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAuthorAccess().getEmailAssignment_2()); 

            }


            }

        }
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
    // InternalMyDsl.g:928:1: rule__Rating__Group__0 : rule__Rating__Group__0__Impl rule__Rating__Group__1 ;
    public final void rule__Rating__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:932:1: ( rule__Rating__Group__0__Impl rule__Rating__Group__1 )
            // InternalMyDsl.g:933:2: rule__Rating__Group__0__Impl rule__Rating__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:940:1: rule__Rating__Group__0__Impl : ( '{' ) ;
    public final void rule__Rating__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:944:1: ( ( '{' ) )
            // InternalMyDsl.g:945:1: ( '{' )
            {
            // InternalMyDsl.g:945:1: ( '{' )
            // InternalMyDsl.g:946:2: '{'
            {
             before(grammarAccess.getRatingAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyDsl.g:955:1: rule__Rating__Group__1 : rule__Rating__Group__1__Impl rule__Rating__Group__2 ;
    public final void rule__Rating__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:959:1: ( rule__Rating__Group__1__Impl rule__Rating__Group__2 )
            // InternalMyDsl.g:960:2: rule__Rating__Group__1__Impl rule__Rating__Group__2
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
    // InternalMyDsl.g:967:1: rule__Rating__Group__1__Impl : ( 'Stars' ) ;
    public final void rule__Rating__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:971:1: ( ( 'Stars' ) )
            // InternalMyDsl.g:972:1: ( 'Stars' )
            {
            // InternalMyDsl.g:972:1: ( 'Stars' )
            // InternalMyDsl.g:973:2: 'Stars'
            {
             before(grammarAccess.getRatingAccess().getStarsKeyword_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalMyDsl.g:982:1: rule__Rating__Group__2 : rule__Rating__Group__2__Impl rule__Rating__Group__3 ;
    public final void rule__Rating__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:986:1: ( rule__Rating__Group__2__Impl rule__Rating__Group__3 )
            // InternalMyDsl.g:987:2: rule__Rating__Group__2__Impl rule__Rating__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:994:1: rule__Rating__Group__2__Impl : ( ':' ) ;
    public final void rule__Rating__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:998:1: ( ( ':' ) )
            // InternalMyDsl.g:999:1: ( ':' )
            {
            // InternalMyDsl.g:999:1: ( ':' )
            // InternalMyDsl.g:1000:2: ':'
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
    // InternalMyDsl.g:1009:1: rule__Rating__Group__3 : rule__Rating__Group__3__Impl rule__Rating__Group__4 ;
    public final void rule__Rating__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1013:1: ( rule__Rating__Group__3__Impl rule__Rating__Group__4 )
            // InternalMyDsl.g:1014:2: rule__Rating__Group__3__Impl rule__Rating__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:1021:1: rule__Rating__Group__3__Impl : ( ( rule__Rating__StarsAssignment_3 ) ) ;
    public final void rule__Rating__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1025:1: ( ( ( rule__Rating__StarsAssignment_3 ) ) )
            // InternalMyDsl.g:1026:1: ( ( rule__Rating__StarsAssignment_3 ) )
            {
            // InternalMyDsl.g:1026:1: ( ( rule__Rating__StarsAssignment_3 ) )
            // InternalMyDsl.g:1027:2: ( rule__Rating__StarsAssignment_3 )
            {
             before(grammarAccess.getRatingAccess().getStarsAssignment_3()); 
            // InternalMyDsl.g:1028:2: ( rule__Rating__StarsAssignment_3 )
            // InternalMyDsl.g:1028:3: rule__Rating__StarsAssignment_3
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
    // InternalMyDsl.g:1036:1: rule__Rating__Group__4 : rule__Rating__Group__4__Impl rule__Rating__Group__5 ;
    public final void rule__Rating__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1040:1: ( rule__Rating__Group__4__Impl rule__Rating__Group__5 )
            // InternalMyDsl.g:1041:2: rule__Rating__Group__4__Impl rule__Rating__Group__5
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:1048:1: rule__Rating__Group__4__Impl : ( ',' ) ;
    public final void rule__Rating__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1052:1: ( ( ',' ) )
            // InternalMyDsl.g:1053:1: ( ',' )
            {
            // InternalMyDsl.g:1053:1: ( ',' )
            // InternalMyDsl.g:1054:2: ','
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
    // InternalMyDsl.g:1063:1: rule__Rating__Group__5 : rule__Rating__Group__5__Impl rule__Rating__Group__6 ;
    public final void rule__Rating__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1067:1: ( rule__Rating__Group__5__Impl rule__Rating__Group__6 )
            // InternalMyDsl.g:1068:2: rule__Rating__Group__5__Impl rule__Rating__Group__6
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:1075:1: rule__Rating__Group__5__Impl : ( ( rule__Rating__Group_5__0 )? ) ;
    public final void rule__Rating__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1079:1: ( ( ( rule__Rating__Group_5__0 )? ) )
            // InternalMyDsl.g:1080:1: ( ( rule__Rating__Group_5__0 )? )
            {
            // InternalMyDsl.g:1080:1: ( ( rule__Rating__Group_5__0 )? )
            // InternalMyDsl.g:1081:2: ( rule__Rating__Group_5__0 )?
            {
             before(grammarAccess.getRatingAccess().getGroup_5()); 
            // InternalMyDsl.g:1082:2: ( rule__Rating__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==33) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:1082:3: rule__Rating__Group_5__0
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
    // InternalMyDsl.g:1090:1: rule__Rating__Group__6 : rule__Rating__Group__6__Impl rule__Rating__Group__7 ;
    public final void rule__Rating__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1094:1: ( rule__Rating__Group__6__Impl rule__Rating__Group__7 )
            // InternalMyDsl.g:1095:2: rule__Rating__Group__6__Impl rule__Rating__Group__7
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
    // InternalMyDsl.g:1102:1: rule__Rating__Group__6__Impl : ( 'Author' ) ;
    public final void rule__Rating__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1106:1: ( ( 'Author' ) )
            // InternalMyDsl.g:1107:1: ( 'Author' )
            {
            // InternalMyDsl.g:1107:1: ( 'Author' )
            // InternalMyDsl.g:1108:2: 'Author'
            {
             before(grammarAccess.getRatingAccess().getAuthorKeyword_6()); 
            match(input,32,FOLLOW_2); 
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
    // InternalMyDsl.g:1117:1: rule__Rating__Group__7 : rule__Rating__Group__7__Impl rule__Rating__Group__8 ;
    public final void rule__Rating__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1121:1: ( rule__Rating__Group__7__Impl rule__Rating__Group__8 )
            // InternalMyDsl.g:1122:2: rule__Rating__Group__7__Impl rule__Rating__Group__8
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:1129:1: rule__Rating__Group__7__Impl : ( ':' ) ;
    public final void rule__Rating__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1133:1: ( ( ':' ) )
            // InternalMyDsl.g:1134:1: ( ':' )
            {
            // InternalMyDsl.g:1134:1: ( ':' )
            // InternalMyDsl.g:1135:2: ':'
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
    // InternalMyDsl.g:1144:1: rule__Rating__Group__8 : rule__Rating__Group__8__Impl rule__Rating__Group__9 ;
    public final void rule__Rating__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1148:1: ( rule__Rating__Group__8__Impl rule__Rating__Group__9 )
            // InternalMyDsl.g:1149:2: rule__Rating__Group__8__Impl rule__Rating__Group__9
            {
            pushFollow(FOLLOW_14);
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
    // InternalMyDsl.g:1156:1: rule__Rating__Group__8__Impl : ( ( rule__Rating__AuthorAssignment_8 ) ) ;
    public final void rule__Rating__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1160:1: ( ( ( rule__Rating__AuthorAssignment_8 ) ) )
            // InternalMyDsl.g:1161:1: ( ( rule__Rating__AuthorAssignment_8 ) )
            {
            // InternalMyDsl.g:1161:1: ( ( rule__Rating__AuthorAssignment_8 ) )
            // InternalMyDsl.g:1162:2: ( rule__Rating__AuthorAssignment_8 )
            {
             before(grammarAccess.getRatingAccess().getAuthorAssignment_8()); 
            // InternalMyDsl.g:1163:2: ( rule__Rating__AuthorAssignment_8 )
            // InternalMyDsl.g:1163:3: rule__Rating__AuthorAssignment_8
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
    // InternalMyDsl.g:1171:1: rule__Rating__Group__9 : rule__Rating__Group__9__Impl ;
    public final void rule__Rating__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1175:1: ( rule__Rating__Group__9__Impl )
            // InternalMyDsl.g:1176:2: rule__Rating__Group__9__Impl
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
    // InternalMyDsl.g:1182:1: rule__Rating__Group__9__Impl : ( '}' ) ;
    public final void rule__Rating__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1186:1: ( ( '}' ) )
            // InternalMyDsl.g:1187:1: ( '}' )
            {
            // InternalMyDsl.g:1187:1: ( '}' )
            // InternalMyDsl.g:1188:2: '}'
            {
             before(grammarAccess.getRatingAccess().getRightCurlyBracketKeyword_9()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyDsl.g:1198:1: rule__Rating__Group_5__0 : rule__Rating__Group_5__0__Impl rule__Rating__Group_5__1 ;
    public final void rule__Rating__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1202:1: ( rule__Rating__Group_5__0__Impl rule__Rating__Group_5__1 )
            // InternalMyDsl.g:1203:2: rule__Rating__Group_5__0__Impl rule__Rating__Group_5__1
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
    // InternalMyDsl.g:1210:1: rule__Rating__Group_5__0__Impl : ( 'Comment' ) ;
    public final void rule__Rating__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1214:1: ( ( 'Comment' ) )
            // InternalMyDsl.g:1215:1: ( 'Comment' )
            {
            // InternalMyDsl.g:1215:1: ( 'Comment' )
            // InternalMyDsl.g:1216:2: 'Comment'
            {
             before(grammarAccess.getRatingAccess().getCommentKeyword_5_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMyDsl.g:1225:1: rule__Rating__Group_5__1 : rule__Rating__Group_5__1__Impl rule__Rating__Group_5__2 ;
    public final void rule__Rating__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1229:1: ( rule__Rating__Group_5__1__Impl rule__Rating__Group_5__2 )
            // InternalMyDsl.g:1230:2: rule__Rating__Group_5__1__Impl rule__Rating__Group_5__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:1237:1: rule__Rating__Group_5__1__Impl : ( ':' ) ;
    public final void rule__Rating__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1241:1: ( ( ':' ) )
            // InternalMyDsl.g:1242:1: ( ':' )
            {
            // InternalMyDsl.g:1242:1: ( ':' )
            // InternalMyDsl.g:1243:2: ':'
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
    // InternalMyDsl.g:1252:1: rule__Rating__Group_5__2 : rule__Rating__Group_5__2__Impl rule__Rating__Group_5__3 ;
    public final void rule__Rating__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1256:1: ( rule__Rating__Group_5__2__Impl rule__Rating__Group_5__3 )
            // InternalMyDsl.g:1257:2: rule__Rating__Group_5__2__Impl rule__Rating__Group_5__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:1264:1: rule__Rating__Group_5__2__Impl : ( ( rule__Rating__CommentAssignment_5_2 ) ) ;
    public final void rule__Rating__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1268:1: ( ( ( rule__Rating__CommentAssignment_5_2 ) ) )
            // InternalMyDsl.g:1269:1: ( ( rule__Rating__CommentAssignment_5_2 ) )
            {
            // InternalMyDsl.g:1269:1: ( ( rule__Rating__CommentAssignment_5_2 ) )
            // InternalMyDsl.g:1270:2: ( rule__Rating__CommentAssignment_5_2 )
            {
             before(grammarAccess.getRatingAccess().getCommentAssignment_5_2()); 
            // InternalMyDsl.g:1271:2: ( rule__Rating__CommentAssignment_5_2 )
            // InternalMyDsl.g:1271:3: rule__Rating__CommentAssignment_5_2
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
    // InternalMyDsl.g:1279:1: rule__Rating__Group_5__3 : rule__Rating__Group_5__3__Impl ;
    public final void rule__Rating__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1283:1: ( rule__Rating__Group_5__3__Impl )
            // InternalMyDsl.g:1284:2: rule__Rating__Group_5__3__Impl
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
    // InternalMyDsl.g:1290:1: rule__Rating__Group_5__3__Impl : ( ',' ) ;
    public final void rule__Rating__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1294:1: ( ( ',' ) )
            // InternalMyDsl.g:1295:1: ( ',' )
            {
            // InternalMyDsl.g:1295:1: ( ',' )
            // InternalMyDsl.g:1296:2: ','
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
    // InternalMyDsl.g:1306:1: rule__Recipe__Group__0 : rule__Recipe__Group__0__Impl rule__Recipe__Group__1 ;
    public final void rule__Recipe__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1310:1: ( rule__Recipe__Group__0__Impl rule__Recipe__Group__1 )
            // InternalMyDsl.g:1311:2: rule__Recipe__Group__0__Impl rule__Recipe__Group__1
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
    // InternalMyDsl.g:1318:1: rule__Recipe__Group__0__Impl : ( ( rule__Recipe__NameAssignment_0 ) ) ;
    public final void rule__Recipe__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1322:1: ( ( ( rule__Recipe__NameAssignment_0 ) ) )
            // InternalMyDsl.g:1323:1: ( ( rule__Recipe__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:1323:1: ( ( rule__Recipe__NameAssignment_0 ) )
            // InternalMyDsl.g:1324:2: ( rule__Recipe__NameAssignment_0 )
            {
             before(grammarAccess.getRecipeAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:1325:2: ( rule__Recipe__NameAssignment_0 )
            // InternalMyDsl.g:1325:3: rule__Recipe__NameAssignment_0
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
    // InternalMyDsl.g:1333:1: rule__Recipe__Group__1 : rule__Recipe__Group__1__Impl rule__Recipe__Group__2 ;
    public final void rule__Recipe__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1337:1: ( rule__Recipe__Group__1__Impl rule__Recipe__Group__2 )
            // InternalMyDsl.g:1338:2: rule__Recipe__Group__1__Impl rule__Recipe__Group__2
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
    // InternalMyDsl.g:1345:1: rule__Recipe__Group__1__Impl : ( ':' ) ;
    public final void rule__Recipe__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1349:1: ( ( ':' ) )
            // InternalMyDsl.g:1350:1: ( ':' )
            {
            // InternalMyDsl.g:1350:1: ( ':' )
            // InternalMyDsl.g:1351:2: ':'
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
    // InternalMyDsl.g:1360:1: rule__Recipe__Group__2 : rule__Recipe__Group__2__Impl rule__Recipe__Group__3 ;
    public final void rule__Recipe__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1364:1: ( rule__Recipe__Group__2__Impl rule__Recipe__Group__3 )
            // InternalMyDsl.g:1365:2: rule__Recipe__Group__2__Impl rule__Recipe__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:1372:1: rule__Recipe__Group__2__Impl : ( '{' ) ;
    public final void rule__Recipe__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1376:1: ( ( '{' ) )
            // InternalMyDsl.g:1377:1: ( '{' )
            {
            // InternalMyDsl.g:1377:1: ( '{' )
            // InternalMyDsl.g:1378:2: '{'
            {
             before(grammarAccess.getRecipeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyDsl.g:1387:1: rule__Recipe__Group__3 : rule__Recipe__Group__3__Impl rule__Recipe__Group__4 ;
    public final void rule__Recipe__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1391:1: ( rule__Recipe__Group__3__Impl rule__Recipe__Group__4 )
            // InternalMyDsl.g:1392:2: rule__Recipe__Group__3__Impl rule__Recipe__Group__4
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
    // InternalMyDsl.g:1399:1: rule__Recipe__Group__3__Impl : ( 'Author' ) ;
    public final void rule__Recipe__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1403:1: ( ( 'Author' ) )
            // InternalMyDsl.g:1404:1: ( 'Author' )
            {
            // InternalMyDsl.g:1404:1: ( 'Author' )
            // InternalMyDsl.g:1405:2: 'Author'
            {
             before(grammarAccess.getRecipeAccess().getAuthorKeyword_3()); 
            match(input,32,FOLLOW_2); 
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
    // InternalMyDsl.g:1414:1: rule__Recipe__Group__4 : rule__Recipe__Group__4__Impl rule__Recipe__Group__5 ;
    public final void rule__Recipe__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1418:1: ( rule__Recipe__Group__4__Impl rule__Recipe__Group__5 )
            // InternalMyDsl.g:1419:2: rule__Recipe__Group__4__Impl rule__Recipe__Group__5
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:1426:1: rule__Recipe__Group__4__Impl : ( ':' ) ;
    public final void rule__Recipe__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1430:1: ( ( ':' ) )
            // InternalMyDsl.g:1431:1: ( ':' )
            {
            // InternalMyDsl.g:1431:1: ( ':' )
            // InternalMyDsl.g:1432:2: ':'
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
    // InternalMyDsl.g:1441:1: rule__Recipe__Group__5 : rule__Recipe__Group__5__Impl rule__Recipe__Group__6 ;
    public final void rule__Recipe__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1445:1: ( rule__Recipe__Group__5__Impl rule__Recipe__Group__6 )
            // InternalMyDsl.g:1446:2: rule__Recipe__Group__5__Impl rule__Recipe__Group__6
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:1453:1: rule__Recipe__Group__5__Impl : ( ( rule__Recipe__AuthorAssignment_5 ) ) ;
    public final void rule__Recipe__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1457:1: ( ( ( rule__Recipe__AuthorAssignment_5 ) ) )
            // InternalMyDsl.g:1458:1: ( ( rule__Recipe__AuthorAssignment_5 ) )
            {
            // InternalMyDsl.g:1458:1: ( ( rule__Recipe__AuthorAssignment_5 ) )
            // InternalMyDsl.g:1459:2: ( rule__Recipe__AuthorAssignment_5 )
            {
             before(grammarAccess.getRecipeAccess().getAuthorAssignment_5()); 
            // InternalMyDsl.g:1460:2: ( rule__Recipe__AuthorAssignment_5 )
            // InternalMyDsl.g:1460:3: rule__Recipe__AuthorAssignment_5
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
    // InternalMyDsl.g:1468:1: rule__Recipe__Group__6 : rule__Recipe__Group__6__Impl rule__Recipe__Group__7 ;
    public final void rule__Recipe__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1472:1: ( rule__Recipe__Group__6__Impl rule__Recipe__Group__7 )
            // InternalMyDsl.g:1473:2: rule__Recipe__Group__6__Impl rule__Recipe__Group__7
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:1480:1: rule__Recipe__Group__6__Impl : ( ',' ) ;
    public final void rule__Recipe__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1484:1: ( ( ',' ) )
            // InternalMyDsl.g:1485:1: ( ',' )
            {
            // InternalMyDsl.g:1485:1: ( ',' )
            // InternalMyDsl.g:1486:2: ','
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
    // InternalMyDsl.g:1495:1: rule__Recipe__Group__7 : rule__Recipe__Group__7__Impl rule__Recipe__Group__8 ;
    public final void rule__Recipe__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1499:1: ( rule__Recipe__Group__7__Impl rule__Recipe__Group__8 )
            // InternalMyDsl.g:1500:2: rule__Recipe__Group__7__Impl rule__Recipe__Group__8
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
    // InternalMyDsl.g:1507:1: rule__Recipe__Group__7__Impl : ( 'VeganismLevel' ) ;
    public final void rule__Recipe__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1511:1: ( ( 'VeganismLevel' ) )
            // InternalMyDsl.g:1512:1: ( 'VeganismLevel' )
            {
            // InternalMyDsl.g:1512:1: ( 'VeganismLevel' )
            // InternalMyDsl.g:1513:2: 'VeganismLevel'
            {
             before(grammarAccess.getRecipeAccess().getVeganismLevelKeyword_7()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyDsl.g:1522:1: rule__Recipe__Group__8 : rule__Recipe__Group__8__Impl rule__Recipe__Group__9 ;
    public final void rule__Recipe__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1526:1: ( rule__Recipe__Group__8__Impl rule__Recipe__Group__9 )
            // InternalMyDsl.g:1527:2: rule__Recipe__Group__8__Impl rule__Recipe__Group__9
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:1534:1: rule__Recipe__Group__8__Impl : ( ':' ) ;
    public final void rule__Recipe__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1538:1: ( ( ':' ) )
            // InternalMyDsl.g:1539:1: ( ':' )
            {
            // InternalMyDsl.g:1539:1: ( ':' )
            // InternalMyDsl.g:1540:2: ':'
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
    // InternalMyDsl.g:1549:1: rule__Recipe__Group__9 : rule__Recipe__Group__9__Impl rule__Recipe__Group__10 ;
    public final void rule__Recipe__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1553:1: ( rule__Recipe__Group__9__Impl rule__Recipe__Group__10 )
            // InternalMyDsl.g:1554:2: rule__Recipe__Group__9__Impl rule__Recipe__Group__10
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:1561:1: rule__Recipe__Group__9__Impl : ( ( rule__Recipe__VeganAssignment_9 ) ) ;
    public final void rule__Recipe__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1565:1: ( ( ( rule__Recipe__VeganAssignment_9 ) ) )
            // InternalMyDsl.g:1566:1: ( ( rule__Recipe__VeganAssignment_9 ) )
            {
            // InternalMyDsl.g:1566:1: ( ( rule__Recipe__VeganAssignment_9 ) )
            // InternalMyDsl.g:1567:2: ( rule__Recipe__VeganAssignment_9 )
            {
             before(grammarAccess.getRecipeAccess().getVeganAssignment_9()); 
            // InternalMyDsl.g:1568:2: ( rule__Recipe__VeganAssignment_9 )
            // InternalMyDsl.g:1568:3: rule__Recipe__VeganAssignment_9
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
    // InternalMyDsl.g:1576:1: rule__Recipe__Group__10 : rule__Recipe__Group__10__Impl rule__Recipe__Group__11 ;
    public final void rule__Recipe__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1580:1: ( rule__Recipe__Group__10__Impl rule__Recipe__Group__11 )
            // InternalMyDsl.g:1581:2: rule__Recipe__Group__10__Impl rule__Recipe__Group__11
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:1588:1: rule__Recipe__Group__10__Impl : ( ',' ) ;
    public final void rule__Recipe__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1592:1: ( ( ',' ) )
            // InternalMyDsl.g:1593:1: ( ',' )
            {
            // InternalMyDsl.g:1593:1: ( ',' )
            // InternalMyDsl.g:1594:2: ','
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
    // InternalMyDsl.g:1603:1: rule__Recipe__Group__11 : rule__Recipe__Group__11__Impl rule__Recipe__Group__12 ;
    public final void rule__Recipe__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1607:1: ( rule__Recipe__Group__11__Impl rule__Recipe__Group__12 )
            // InternalMyDsl.g:1608:2: rule__Recipe__Group__11__Impl rule__Recipe__Group__12
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
    // InternalMyDsl.g:1615:1: rule__Recipe__Group__11__Impl : ( 'Duration' ) ;
    public final void rule__Recipe__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1619:1: ( ( 'Duration' ) )
            // InternalMyDsl.g:1620:1: ( 'Duration' )
            {
            // InternalMyDsl.g:1620:1: ( 'Duration' )
            // InternalMyDsl.g:1621:2: 'Duration'
            {
             before(grammarAccess.getRecipeAccess().getDurationKeyword_11()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMyDsl.g:1630:1: rule__Recipe__Group__12 : rule__Recipe__Group__12__Impl rule__Recipe__Group__13 ;
    public final void rule__Recipe__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1634:1: ( rule__Recipe__Group__12__Impl rule__Recipe__Group__13 )
            // InternalMyDsl.g:1635:2: rule__Recipe__Group__12__Impl rule__Recipe__Group__13
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:1642:1: rule__Recipe__Group__12__Impl : ( ':' ) ;
    public final void rule__Recipe__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1646:1: ( ( ':' ) )
            // InternalMyDsl.g:1647:1: ( ':' )
            {
            // InternalMyDsl.g:1647:1: ( ':' )
            // InternalMyDsl.g:1648:2: ':'
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
    // InternalMyDsl.g:1657:1: rule__Recipe__Group__13 : rule__Recipe__Group__13__Impl rule__Recipe__Group__14 ;
    public final void rule__Recipe__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1661:1: ( rule__Recipe__Group__13__Impl rule__Recipe__Group__14 )
            // InternalMyDsl.g:1662:2: rule__Recipe__Group__13__Impl rule__Recipe__Group__14
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:1669:1: rule__Recipe__Group__13__Impl : ( ( rule__Recipe__DurationAssignment_13 ) ) ;
    public final void rule__Recipe__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1673:1: ( ( ( rule__Recipe__DurationAssignment_13 ) ) )
            // InternalMyDsl.g:1674:1: ( ( rule__Recipe__DurationAssignment_13 ) )
            {
            // InternalMyDsl.g:1674:1: ( ( rule__Recipe__DurationAssignment_13 ) )
            // InternalMyDsl.g:1675:2: ( rule__Recipe__DurationAssignment_13 )
            {
             before(grammarAccess.getRecipeAccess().getDurationAssignment_13()); 
            // InternalMyDsl.g:1676:2: ( rule__Recipe__DurationAssignment_13 )
            // InternalMyDsl.g:1676:3: rule__Recipe__DurationAssignment_13
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
    // InternalMyDsl.g:1684:1: rule__Recipe__Group__14 : rule__Recipe__Group__14__Impl rule__Recipe__Group__15 ;
    public final void rule__Recipe__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1688:1: ( rule__Recipe__Group__14__Impl rule__Recipe__Group__15 )
            // InternalMyDsl.g:1689:2: rule__Recipe__Group__14__Impl rule__Recipe__Group__15
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:1696:1: rule__Recipe__Group__14__Impl : ( ',' ) ;
    public final void rule__Recipe__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1700:1: ( ( ',' ) )
            // InternalMyDsl.g:1701:1: ( ',' )
            {
            // InternalMyDsl.g:1701:1: ( ',' )
            // InternalMyDsl.g:1702:2: ','
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
    // InternalMyDsl.g:1711:1: rule__Recipe__Group__15 : rule__Recipe__Group__15__Impl rule__Recipe__Group__16 ;
    public final void rule__Recipe__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1715:1: ( rule__Recipe__Group__15__Impl rule__Recipe__Group__16 )
            // InternalMyDsl.g:1716:2: rule__Recipe__Group__15__Impl rule__Recipe__Group__16
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
    // InternalMyDsl.g:1723:1: rule__Recipe__Group__15__Impl : ( 'Difficulty' ) ;
    public final void rule__Recipe__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1727:1: ( ( 'Difficulty' ) )
            // InternalMyDsl.g:1728:1: ( 'Difficulty' )
            {
            // InternalMyDsl.g:1728:1: ( 'Difficulty' )
            // InternalMyDsl.g:1729:2: 'Difficulty'
            {
             before(grammarAccess.getRecipeAccess().getDifficultyKeyword_15()); 
            match(input,36,FOLLOW_2); 
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
    // InternalMyDsl.g:1738:1: rule__Recipe__Group__16 : rule__Recipe__Group__16__Impl rule__Recipe__Group__17 ;
    public final void rule__Recipe__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1742:1: ( rule__Recipe__Group__16__Impl rule__Recipe__Group__17 )
            // InternalMyDsl.g:1743:2: rule__Recipe__Group__16__Impl rule__Recipe__Group__17
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:1750:1: rule__Recipe__Group__16__Impl : ( ':' ) ;
    public final void rule__Recipe__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1754:1: ( ( ':' ) )
            // InternalMyDsl.g:1755:1: ( ':' )
            {
            // InternalMyDsl.g:1755:1: ( ':' )
            // InternalMyDsl.g:1756:2: ':'
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
    // InternalMyDsl.g:1765:1: rule__Recipe__Group__17 : rule__Recipe__Group__17__Impl rule__Recipe__Group__18 ;
    public final void rule__Recipe__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1769:1: ( rule__Recipe__Group__17__Impl rule__Recipe__Group__18 )
            // InternalMyDsl.g:1770:2: rule__Recipe__Group__17__Impl rule__Recipe__Group__18
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:1777:1: rule__Recipe__Group__17__Impl : ( ( rule__Recipe__DifficultyAssignment_17 ) ) ;
    public final void rule__Recipe__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1781:1: ( ( ( rule__Recipe__DifficultyAssignment_17 ) ) )
            // InternalMyDsl.g:1782:1: ( ( rule__Recipe__DifficultyAssignment_17 ) )
            {
            // InternalMyDsl.g:1782:1: ( ( rule__Recipe__DifficultyAssignment_17 ) )
            // InternalMyDsl.g:1783:2: ( rule__Recipe__DifficultyAssignment_17 )
            {
             before(grammarAccess.getRecipeAccess().getDifficultyAssignment_17()); 
            // InternalMyDsl.g:1784:2: ( rule__Recipe__DifficultyAssignment_17 )
            // InternalMyDsl.g:1784:3: rule__Recipe__DifficultyAssignment_17
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
    // InternalMyDsl.g:1792:1: rule__Recipe__Group__18 : rule__Recipe__Group__18__Impl rule__Recipe__Group__19 ;
    public final void rule__Recipe__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1796:1: ( rule__Recipe__Group__18__Impl rule__Recipe__Group__19 )
            // InternalMyDsl.g:1797:2: rule__Recipe__Group__18__Impl rule__Recipe__Group__19
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:1804:1: rule__Recipe__Group__18__Impl : ( ',' ) ;
    public final void rule__Recipe__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1808:1: ( ( ',' ) )
            // InternalMyDsl.g:1809:1: ( ',' )
            {
            // InternalMyDsl.g:1809:1: ( ',' )
            // InternalMyDsl.g:1810:2: ','
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
    // InternalMyDsl.g:1819:1: rule__Recipe__Group__19 : rule__Recipe__Group__19__Impl rule__Recipe__Group__20 ;
    public final void rule__Recipe__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1823:1: ( rule__Recipe__Group__19__Impl rule__Recipe__Group__20 )
            // InternalMyDsl.g:1824:2: rule__Recipe__Group__19__Impl rule__Recipe__Group__20
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:1831:1: rule__Recipe__Group__19__Impl : ( ( rule__Recipe__Group_19__0 )? ) ;
    public final void rule__Recipe__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1835:1: ( ( ( rule__Recipe__Group_19__0 )? ) )
            // InternalMyDsl.g:1836:1: ( ( rule__Recipe__Group_19__0 )? )
            {
            // InternalMyDsl.g:1836:1: ( ( rule__Recipe__Group_19__0 )? )
            // InternalMyDsl.g:1837:2: ( rule__Recipe__Group_19__0 )?
            {
             before(grammarAccess.getRecipeAccess().getGroup_19()); 
            // InternalMyDsl.g:1838:2: ( rule__Recipe__Group_19__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==40) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:1838:3: rule__Recipe__Group_19__0
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
    // InternalMyDsl.g:1846:1: rule__Recipe__Group__20 : rule__Recipe__Group__20__Impl rule__Recipe__Group__21 ;
    public final void rule__Recipe__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1850:1: ( rule__Recipe__Group__20__Impl rule__Recipe__Group__21 )
            // InternalMyDsl.g:1851:2: rule__Recipe__Group__20__Impl rule__Recipe__Group__21
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:1858:1: rule__Recipe__Group__20__Impl : ( ( rule__Recipe__Group_20__0 )? ) ;
    public final void rule__Recipe__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1862:1: ( ( ( rule__Recipe__Group_20__0 )? ) )
            // InternalMyDsl.g:1863:1: ( ( rule__Recipe__Group_20__0 )? )
            {
            // InternalMyDsl.g:1863:1: ( ( rule__Recipe__Group_20__0 )? )
            // InternalMyDsl.g:1864:2: ( rule__Recipe__Group_20__0 )?
            {
             before(grammarAccess.getRecipeAccess().getGroup_20()); 
            // InternalMyDsl.g:1865:2: ( rule__Recipe__Group_20__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==41) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:1865:3: rule__Recipe__Group_20__0
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
    // InternalMyDsl.g:1873:1: rule__Recipe__Group__21 : rule__Recipe__Group__21__Impl rule__Recipe__Group__22 ;
    public final void rule__Recipe__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1877:1: ( rule__Recipe__Group__21__Impl rule__Recipe__Group__22 )
            // InternalMyDsl.g:1878:2: rule__Recipe__Group__21__Impl rule__Recipe__Group__22
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
    // InternalMyDsl.g:1885:1: rule__Recipe__Group__21__Impl : ( 'Ingredients' ) ;
    public final void rule__Recipe__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1889:1: ( ( 'Ingredients' ) )
            // InternalMyDsl.g:1890:1: ( 'Ingredients' )
            {
            // InternalMyDsl.g:1890:1: ( 'Ingredients' )
            // InternalMyDsl.g:1891:2: 'Ingredients'
            {
             before(grammarAccess.getRecipeAccess().getIngredientsKeyword_21()); 
            match(input,37,FOLLOW_2); 
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
    // InternalMyDsl.g:1900:1: rule__Recipe__Group__22 : rule__Recipe__Group__22__Impl rule__Recipe__Group__23 ;
    public final void rule__Recipe__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1904:1: ( rule__Recipe__Group__22__Impl rule__Recipe__Group__23 )
            // InternalMyDsl.g:1905:2: rule__Recipe__Group__22__Impl rule__Recipe__Group__23
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:1912:1: rule__Recipe__Group__22__Impl : ( ':' ) ;
    public final void rule__Recipe__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1916:1: ( ( ':' ) )
            // InternalMyDsl.g:1917:1: ( ':' )
            {
            // InternalMyDsl.g:1917:1: ( ':' )
            // InternalMyDsl.g:1918:2: ':'
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
    // InternalMyDsl.g:1927:1: rule__Recipe__Group__23 : rule__Recipe__Group__23__Impl rule__Recipe__Group__24 ;
    public final void rule__Recipe__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1931:1: ( rule__Recipe__Group__23__Impl rule__Recipe__Group__24 )
            // InternalMyDsl.g:1932:2: rule__Recipe__Group__23__Impl rule__Recipe__Group__24
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyDsl.g:1939:1: rule__Recipe__Group__23__Impl : ( '[' ) ;
    public final void rule__Recipe__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1943:1: ( ( '[' ) )
            // InternalMyDsl.g:1944:1: ( '[' )
            {
            // InternalMyDsl.g:1944:1: ( '[' )
            // InternalMyDsl.g:1945:2: '['
            {
             before(grammarAccess.getRecipeAccess().getLeftSquareBracketKeyword_23()); 
            match(input,38,FOLLOW_2); 
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
    // InternalMyDsl.g:1954:1: rule__Recipe__Group__24 : rule__Recipe__Group__24__Impl rule__Recipe__Group__25 ;
    public final void rule__Recipe__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1958:1: ( rule__Recipe__Group__24__Impl rule__Recipe__Group__25 )
            // InternalMyDsl.g:1959:2: rule__Recipe__Group__24__Impl rule__Recipe__Group__25
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:1966:1: rule__Recipe__Group__24__Impl : ( ( rule__Recipe__IngredientAssignment_24 ) ) ;
    public final void rule__Recipe__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1970:1: ( ( ( rule__Recipe__IngredientAssignment_24 ) ) )
            // InternalMyDsl.g:1971:1: ( ( rule__Recipe__IngredientAssignment_24 ) )
            {
            // InternalMyDsl.g:1971:1: ( ( rule__Recipe__IngredientAssignment_24 ) )
            // InternalMyDsl.g:1972:2: ( rule__Recipe__IngredientAssignment_24 )
            {
             before(grammarAccess.getRecipeAccess().getIngredientAssignment_24()); 
            // InternalMyDsl.g:1973:2: ( rule__Recipe__IngredientAssignment_24 )
            // InternalMyDsl.g:1973:3: rule__Recipe__IngredientAssignment_24
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
    // InternalMyDsl.g:1981:1: rule__Recipe__Group__25 : rule__Recipe__Group__25__Impl rule__Recipe__Group__26 ;
    public final void rule__Recipe__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1985:1: ( rule__Recipe__Group__25__Impl rule__Recipe__Group__26 )
            // InternalMyDsl.g:1986:2: rule__Recipe__Group__25__Impl rule__Recipe__Group__26
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:1993:1: rule__Recipe__Group__25__Impl : ( ( rule__Recipe__Group_25__0 )* ) ;
    public final void rule__Recipe__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1997:1: ( ( ( rule__Recipe__Group_25__0 )* ) )
            // InternalMyDsl.g:1998:1: ( ( rule__Recipe__Group_25__0 )* )
            {
            // InternalMyDsl.g:1998:1: ( ( rule__Recipe__Group_25__0 )* )
            // InternalMyDsl.g:1999:2: ( rule__Recipe__Group_25__0 )*
            {
             before(grammarAccess.getRecipeAccess().getGroup_25()); 
            // InternalMyDsl.g:2000:2: ( rule__Recipe__Group_25__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==30) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:2000:3: rule__Recipe__Group_25__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Recipe__Group_25__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalMyDsl.g:2008:1: rule__Recipe__Group__26 : rule__Recipe__Group__26__Impl rule__Recipe__Group__27 ;
    public final void rule__Recipe__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2012:1: ( rule__Recipe__Group__26__Impl rule__Recipe__Group__27 )
            // InternalMyDsl.g:2013:2: rule__Recipe__Group__26__Impl rule__Recipe__Group__27
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:2020:1: rule__Recipe__Group__26__Impl : ( ']' ) ;
    public final void rule__Recipe__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2024:1: ( ( ']' ) )
            // InternalMyDsl.g:2025:1: ( ']' )
            {
            // InternalMyDsl.g:2025:1: ( ']' )
            // InternalMyDsl.g:2026:2: ']'
            {
             before(grammarAccess.getRecipeAccess().getRightSquareBracketKeyword_26()); 
            match(input,39,FOLLOW_2); 
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
    // InternalMyDsl.g:2035:1: rule__Recipe__Group__27 : rule__Recipe__Group__27__Impl rule__Recipe__Group__28 ;
    public final void rule__Recipe__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2039:1: ( rule__Recipe__Group__27__Impl rule__Recipe__Group__28 )
            // InternalMyDsl.g:2040:2: rule__Recipe__Group__27__Impl rule__Recipe__Group__28
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:2047:1: rule__Recipe__Group__27__Impl : ( ( rule__Recipe__Group_27__0 )? ) ;
    public final void rule__Recipe__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2051:1: ( ( ( rule__Recipe__Group_27__0 )? ) )
            // InternalMyDsl.g:2052:1: ( ( rule__Recipe__Group_27__0 )? )
            {
            // InternalMyDsl.g:2052:1: ( ( rule__Recipe__Group_27__0 )? )
            // InternalMyDsl.g:2053:2: ( rule__Recipe__Group_27__0 )?
            {
             before(grammarAccess.getRecipeAccess().getGroup_27()); 
            // InternalMyDsl.g:2054:2: ( rule__Recipe__Group_27__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:2054:3: rule__Recipe__Group_27__0
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
    // InternalMyDsl.g:2062:1: rule__Recipe__Group__28 : rule__Recipe__Group__28__Impl ;
    public final void rule__Recipe__Group__28() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2066:1: ( rule__Recipe__Group__28__Impl )
            // InternalMyDsl.g:2067:2: rule__Recipe__Group__28__Impl
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
    // InternalMyDsl.g:2073:1: rule__Recipe__Group__28__Impl : ( '}' ) ;
    public final void rule__Recipe__Group__28__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2077:1: ( ( '}' ) )
            // InternalMyDsl.g:2078:1: ( '}' )
            {
            // InternalMyDsl.g:2078:1: ( '}' )
            // InternalMyDsl.g:2079:2: '}'
            {
             before(grammarAccess.getRecipeAccess().getRightCurlyBracketKeyword_28()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyDsl.g:2089:1: rule__Recipe__Group_19__0 : rule__Recipe__Group_19__0__Impl rule__Recipe__Group_19__1 ;
    public final void rule__Recipe__Group_19__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2093:1: ( rule__Recipe__Group_19__0__Impl rule__Recipe__Group_19__1 )
            // InternalMyDsl.g:2094:2: rule__Recipe__Group_19__0__Impl rule__Recipe__Group_19__1
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
    // InternalMyDsl.g:2101:1: rule__Recipe__Group_19__0__Impl : ( 'KitchenUtensils' ) ;
    public final void rule__Recipe__Group_19__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2105:1: ( ( 'KitchenUtensils' ) )
            // InternalMyDsl.g:2106:1: ( 'KitchenUtensils' )
            {
            // InternalMyDsl.g:2106:1: ( 'KitchenUtensils' )
            // InternalMyDsl.g:2107:2: 'KitchenUtensils'
            {
             before(grammarAccess.getRecipeAccess().getKitchenUtensilsKeyword_19_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalMyDsl.g:2116:1: rule__Recipe__Group_19__1 : rule__Recipe__Group_19__1__Impl rule__Recipe__Group_19__2 ;
    public final void rule__Recipe__Group_19__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2120:1: ( rule__Recipe__Group_19__1__Impl rule__Recipe__Group_19__2 )
            // InternalMyDsl.g:2121:2: rule__Recipe__Group_19__1__Impl rule__Recipe__Group_19__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:2128:1: rule__Recipe__Group_19__1__Impl : ( ':' ) ;
    public final void rule__Recipe__Group_19__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2132:1: ( ( ':' ) )
            // InternalMyDsl.g:2133:1: ( ':' )
            {
            // InternalMyDsl.g:2133:1: ( ':' )
            // InternalMyDsl.g:2134:2: ':'
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
    // InternalMyDsl.g:2143:1: rule__Recipe__Group_19__2 : rule__Recipe__Group_19__2__Impl rule__Recipe__Group_19__3 ;
    public final void rule__Recipe__Group_19__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2147:1: ( rule__Recipe__Group_19__2__Impl rule__Recipe__Group_19__3 )
            // InternalMyDsl.g:2148:2: rule__Recipe__Group_19__2__Impl rule__Recipe__Group_19__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:2155:1: rule__Recipe__Group_19__2__Impl : ( '[' ) ;
    public final void rule__Recipe__Group_19__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2159:1: ( ( '[' ) )
            // InternalMyDsl.g:2160:1: ( '[' )
            {
            // InternalMyDsl.g:2160:1: ( '[' )
            // InternalMyDsl.g:2161:2: '['
            {
             before(grammarAccess.getRecipeAccess().getLeftSquareBracketKeyword_19_2()); 
            match(input,38,FOLLOW_2); 
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
    // InternalMyDsl.g:2170:1: rule__Recipe__Group_19__3 : rule__Recipe__Group_19__3__Impl rule__Recipe__Group_19__4 ;
    public final void rule__Recipe__Group_19__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2174:1: ( rule__Recipe__Group_19__3__Impl rule__Recipe__Group_19__4 )
            // InternalMyDsl.g:2175:2: rule__Recipe__Group_19__3__Impl rule__Recipe__Group_19__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:2182:1: rule__Recipe__Group_19__3__Impl : ( ( rule__Recipe__KitchenUtensilsAssignment_19_3 ) ) ;
    public final void rule__Recipe__Group_19__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2186:1: ( ( ( rule__Recipe__KitchenUtensilsAssignment_19_3 ) ) )
            // InternalMyDsl.g:2187:1: ( ( rule__Recipe__KitchenUtensilsAssignment_19_3 ) )
            {
            // InternalMyDsl.g:2187:1: ( ( rule__Recipe__KitchenUtensilsAssignment_19_3 ) )
            // InternalMyDsl.g:2188:2: ( rule__Recipe__KitchenUtensilsAssignment_19_3 )
            {
             before(grammarAccess.getRecipeAccess().getKitchenUtensilsAssignment_19_3()); 
            // InternalMyDsl.g:2189:2: ( rule__Recipe__KitchenUtensilsAssignment_19_3 )
            // InternalMyDsl.g:2189:3: rule__Recipe__KitchenUtensilsAssignment_19_3
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
    // InternalMyDsl.g:2197:1: rule__Recipe__Group_19__4 : rule__Recipe__Group_19__4__Impl rule__Recipe__Group_19__5 ;
    public final void rule__Recipe__Group_19__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2201:1: ( rule__Recipe__Group_19__4__Impl rule__Recipe__Group_19__5 )
            // InternalMyDsl.g:2202:2: rule__Recipe__Group_19__4__Impl rule__Recipe__Group_19__5
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:2209:1: rule__Recipe__Group_19__4__Impl : ( ( rule__Recipe__Group_19_4__0 )* ) ;
    public final void rule__Recipe__Group_19__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2213:1: ( ( ( rule__Recipe__Group_19_4__0 )* ) )
            // InternalMyDsl.g:2214:1: ( ( rule__Recipe__Group_19_4__0 )* )
            {
            // InternalMyDsl.g:2214:1: ( ( rule__Recipe__Group_19_4__0 )* )
            // InternalMyDsl.g:2215:2: ( rule__Recipe__Group_19_4__0 )*
            {
             before(grammarAccess.getRecipeAccess().getGroup_19_4()); 
            // InternalMyDsl.g:2216:2: ( rule__Recipe__Group_19_4__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==30) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:2216:3: rule__Recipe__Group_19_4__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Recipe__Group_19_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalMyDsl.g:2224:1: rule__Recipe__Group_19__5 : rule__Recipe__Group_19__5__Impl rule__Recipe__Group_19__6 ;
    public final void rule__Recipe__Group_19__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2228:1: ( rule__Recipe__Group_19__5__Impl rule__Recipe__Group_19__6 )
            // InternalMyDsl.g:2229:2: rule__Recipe__Group_19__5__Impl rule__Recipe__Group_19__6
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:2236:1: rule__Recipe__Group_19__5__Impl : ( ']' ) ;
    public final void rule__Recipe__Group_19__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2240:1: ( ( ']' ) )
            // InternalMyDsl.g:2241:1: ( ']' )
            {
            // InternalMyDsl.g:2241:1: ( ']' )
            // InternalMyDsl.g:2242:2: ']'
            {
             before(grammarAccess.getRecipeAccess().getRightSquareBracketKeyword_19_5()); 
            match(input,39,FOLLOW_2); 
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
    // InternalMyDsl.g:2251:1: rule__Recipe__Group_19__6 : rule__Recipe__Group_19__6__Impl ;
    public final void rule__Recipe__Group_19__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2255:1: ( rule__Recipe__Group_19__6__Impl )
            // InternalMyDsl.g:2256:2: rule__Recipe__Group_19__6__Impl
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
    // InternalMyDsl.g:2262:1: rule__Recipe__Group_19__6__Impl : ( ',' ) ;
    public final void rule__Recipe__Group_19__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2266:1: ( ( ',' ) )
            // InternalMyDsl.g:2267:1: ( ',' )
            {
            // InternalMyDsl.g:2267:1: ( ',' )
            // InternalMyDsl.g:2268:2: ','
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
    // InternalMyDsl.g:2278:1: rule__Recipe__Group_19_4__0 : rule__Recipe__Group_19_4__0__Impl rule__Recipe__Group_19_4__1 ;
    public final void rule__Recipe__Group_19_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2282:1: ( rule__Recipe__Group_19_4__0__Impl rule__Recipe__Group_19_4__1 )
            // InternalMyDsl.g:2283:2: rule__Recipe__Group_19_4__0__Impl rule__Recipe__Group_19_4__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:2290:1: rule__Recipe__Group_19_4__0__Impl : ( ',' ) ;
    public final void rule__Recipe__Group_19_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2294:1: ( ( ',' ) )
            // InternalMyDsl.g:2295:1: ( ',' )
            {
            // InternalMyDsl.g:2295:1: ( ',' )
            // InternalMyDsl.g:2296:2: ','
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
    // InternalMyDsl.g:2305:1: rule__Recipe__Group_19_4__1 : rule__Recipe__Group_19_4__1__Impl ;
    public final void rule__Recipe__Group_19_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2309:1: ( rule__Recipe__Group_19_4__1__Impl )
            // InternalMyDsl.g:2310:2: rule__Recipe__Group_19_4__1__Impl
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
    // InternalMyDsl.g:2316:1: rule__Recipe__Group_19_4__1__Impl : ( ( rule__Recipe__KitchenUtensilsAssignment_19_4_1 ) ) ;
    public final void rule__Recipe__Group_19_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2320:1: ( ( ( rule__Recipe__KitchenUtensilsAssignment_19_4_1 ) ) )
            // InternalMyDsl.g:2321:1: ( ( rule__Recipe__KitchenUtensilsAssignment_19_4_1 ) )
            {
            // InternalMyDsl.g:2321:1: ( ( rule__Recipe__KitchenUtensilsAssignment_19_4_1 ) )
            // InternalMyDsl.g:2322:2: ( rule__Recipe__KitchenUtensilsAssignment_19_4_1 )
            {
             before(grammarAccess.getRecipeAccess().getKitchenUtensilsAssignment_19_4_1()); 
            // InternalMyDsl.g:2323:2: ( rule__Recipe__KitchenUtensilsAssignment_19_4_1 )
            // InternalMyDsl.g:2323:3: rule__Recipe__KitchenUtensilsAssignment_19_4_1
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
    // InternalMyDsl.g:2332:1: rule__Recipe__Group_20__0 : rule__Recipe__Group_20__0__Impl rule__Recipe__Group_20__1 ;
    public final void rule__Recipe__Group_20__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2336:1: ( rule__Recipe__Group_20__0__Impl rule__Recipe__Group_20__1 )
            // InternalMyDsl.g:2337:2: rule__Recipe__Group_20__0__Impl rule__Recipe__Group_20__1
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
    // InternalMyDsl.g:2344:1: rule__Recipe__Group_20__0__Impl : ( 'foodCategory' ) ;
    public final void rule__Recipe__Group_20__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2348:1: ( ( 'foodCategory' ) )
            // InternalMyDsl.g:2349:1: ( 'foodCategory' )
            {
            // InternalMyDsl.g:2349:1: ( 'foodCategory' )
            // InternalMyDsl.g:2350:2: 'foodCategory'
            {
             before(grammarAccess.getRecipeAccess().getFoodCategoryKeyword_20_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalMyDsl.g:2359:1: rule__Recipe__Group_20__1 : rule__Recipe__Group_20__1__Impl rule__Recipe__Group_20__2 ;
    public final void rule__Recipe__Group_20__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2363:1: ( rule__Recipe__Group_20__1__Impl rule__Recipe__Group_20__2 )
            // InternalMyDsl.g:2364:2: rule__Recipe__Group_20__1__Impl rule__Recipe__Group_20__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:2371:1: rule__Recipe__Group_20__1__Impl : ( ':' ) ;
    public final void rule__Recipe__Group_20__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2375:1: ( ( ':' ) )
            // InternalMyDsl.g:2376:1: ( ':' )
            {
            // InternalMyDsl.g:2376:1: ( ':' )
            // InternalMyDsl.g:2377:2: ':'
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
    // InternalMyDsl.g:2386:1: rule__Recipe__Group_20__2 : rule__Recipe__Group_20__2__Impl rule__Recipe__Group_20__3 ;
    public final void rule__Recipe__Group_20__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2390:1: ( rule__Recipe__Group_20__2__Impl rule__Recipe__Group_20__3 )
            // InternalMyDsl.g:2391:2: rule__Recipe__Group_20__2__Impl rule__Recipe__Group_20__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:2398:1: rule__Recipe__Group_20__2__Impl : ( '[' ) ;
    public final void rule__Recipe__Group_20__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2402:1: ( ( '[' ) )
            // InternalMyDsl.g:2403:1: ( '[' )
            {
            // InternalMyDsl.g:2403:1: ( '[' )
            // InternalMyDsl.g:2404:2: '['
            {
             before(grammarAccess.getRecipeAccess().getLeftSquareBracketKeyword_20_2()); 
            match(input,38,FOLLOW_2); 
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
    // InternalMyDsl.g:2413:1: rule__Recipe__Group_20__3 : rule__Recipe__Group_20__3__Impl rule__Recipe__Group_20__4 ;
    public final void rule__Recipe__Group_20__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2417:1: ( rule__Recipe__Group_20__3__Impl rule__Recipe__Group_20__4 )
            // InternalMyDsl.g:2418:2: rule__Recipe__Group_20__3__Impl rule__Recipe__Group_20__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:2425:1: rule__Recipe__Group_20__3__Impl : ( ( rule__Recipe__FoodCategoryAssignment_20_3 ) ) ;
    public final void rule__Recipe__Group_20__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2429:1: ( ( ( rule__Recipe__FoodCategoryAssignment_20_3 ) ) )
            // InternalMyDsl.g:2430:1: ( ( rule__Recipe__FoodCategoryAssignment_20_3 ) )
            {
            // InternalMyDsl.g:2430:1: ( ( rule__Recipe__FoodCategoryAssignment_20_3 ) )
            // InternalMyDsl.g:2431:2: ( rule__Recipe__FoodCategoryAssignment_20_3 )
            {
             before(grammarAccess.getRecipeAccess().getFoodCategoryAssignment_20_3()); 
            // InternalMyDsl.g:2432:2: ( rule__Recipe__FoodCategoryAssignment_20_3 )
            // InternalMyDsl.g:2432:3: rule__Recipe__FoodCategoryAssignment_20_3
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
    // InternalMyDsl.g:2440:1: rule__Recipe__Group_20__4 : rule__Recipe__Group_20__4__Impl rule__Recipe__Group_20__5 ;
    public final void rule__Recipe__Group_20__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2444:1: ( rule__Recipe__Group_20__4__Impl rule__Recipe__Group_20__5 )
            // InternalMyDsl.g:2445:2: rule__Recipe__Group_20__4__Impl rule__Recipe__Group_20__5
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:2452:1: rule__Recipe__Group_20__4__Impl : ( ( rule__Recipe__Group_20_4__0 )* ) ;
    public final void rule__Recipe__Group_20__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2456:1: ( ( ( rule__Recipe__Group_20_4__0 )* ) )
            // InternalMyDsl.g:2457:1: ( ( rule__Recipe__Group_20_4__0 )* )
            {
            // InternalMyDsl.g:2457:1: ( ( rule__Recipe__Group_20_4__0 )* )
            // InternalMyDsl.g:2458:2: ( rule__Recipe__Group_20_4__0 )*
            {
             before(grammarAccess.getRecipeAccess().getGroup_20_4()); 
            // InternalMyDsl.g:2459:2: ( rule__Recipe__Group_20_4__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==30) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:2459:3: rule__Recipe__Group_20_4__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Recipe__Group_20_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalMyDsl.g:2467:1: rule__Recipe__Group_20__5 : rule__Recipe__Group_20__5__Impl rule__Recipe__Group_20__6 ;
    public final void rule__Recipe__Group_20__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2471:1: ( rule__Recipe__Group_20__5__Impl rule__Recipe__Group_20__6 )
            // InternalMyDsl.g:2472:2: rule__Recipe__Group_20__5__Impl rule__Recipe__Group_20__6
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:2479:1: rule__Recipe__Group_20__5__Impl : ( ']' ) ;
    public final void rule__Recipe__Group_20__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2483:1: ( ( ']' ) )
            // InternalMyDsl.g:2484:1: ( ']' )
            {
            // InternalMyDsl.g:2484:1: ( ']' )
            // InternalMyDsl.g:2485:2: ']'
            {
             before(grammarAccess.getRecipeAccess().getRightSquareBracketKeyword_20_5()); 
            match(input,39,FOLLOW_2); 
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
    // InternalMyDsl.g:2494:1: rule__Recipe__Group_20__6 : rule__Recipe__Group_20__6__Impl ;
    public final void rule__Recipe__Group_20__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2498:1: ( rule__Recipe__Group_20__6__Impl )
            // InternalMyDsl.g:2499:2: rule__Recipe__Group_20__6__Impl
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
    // InternalMyDsl.g:2505:1: rule__Recipe__Group_20__6__Impl : ( ',' ) ;
    public final void rule__Recipe__Group_20__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2509:1: ( ( ',' ) )
            // InternalMyDsl.g:2510:1: ( ',' )
            {
            // InternalMyDsl.g:2510:1: ( ',' )
            // InternalMyDsl.g:2511:2: ','
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
    // InternalMyDsl.g:2521:1: rule__Recipe__Group_20_4__0 : rule__Recipe__Group_20_4__0__Impl rule__Recipe__Group_20_4__1 ;
    public final void rule__Recipe__Group_20_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2525:1: ( rule__Recipe__Group_20_4__0__Impl rule__Recipe__Group_20_4__1 )
            // InternalMyDsl.g:2526:2: rule__Recipe__Group_20_4__0__Impl rule__Recipe__Group_20_4__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:2533:1: rule__Recipe__Group_20_4__0__Impl : ( ',' ) ;
    public final void rule__Recipe__Group_20_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2537:1: ( ( ',' ) )
            // InternalMyDsl.g:2538:1: ( ',' )
            {
            // InternalMyDsl.g:2538:1: ( ',' )
            // InternalMyDsl.g:2539:2: ','
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
    // InternalMyDsl.g:2548:1: rule__Recipe__Group_20_4__1 : rule__Recipe__Group_20_4__1__Impl ;
    public final void rule__Recipe__Group_20_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2552:1: ( rule__Recipe__Group_20_4__1__Impl )
            // InternalMyDsl.g:2553:2: rule__Recipe__Group_20_4__1__Impl
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
    // InternalMyDsl.g:2559:1: rule__Recipe__Group_20_4__1__Impl : ( ( rule__Recipe__FoodCategoryAssignment_20_4_1 ) ) ;
    public final void rule__Recipe__Group_20_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2563:1: ( ( ( rule__Recipe__FoodCategoryAssignment_20_4_1 ) ) )
            // InternalMyDsl.g:2564:1: ( ( rule__Recipe__FoodCategoryAssignment_20_4_1 ) )
            {
            // InternalMyDsl.g:2564:1: ( ( rule__Recipe__FoodCategoryAssignment_20_4_1 ) )
            // InternalMyDsl.g:2565:2: ( rule__Recipe__FoodCategoryAssignment_20_4_1 )
            {
             before(grammarAccess.getRecipeAccess().getFoodCategoryAssignment_20_4_1()); 
            // InternalMyDsl.g:2566:2: ( rule__Recipe__FoodCategoryAssignment_20_4_1 )
            // InternalMyDsl.g:2566:3: rule__Recipe__FoodCategoryAssignment_20_4_1
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
    // InternalMyDsl.g:2575:1: rule__Recipe__Group_25__0 : rule__Recipe__Group_25__0__Impl rule__Recipe__Group_25__1 ;
    public final void rule__Recipe__Group_25__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2579:1: ( rule__Recipe__Group_25__0__Impl rule__Recipe__Group_25__1 )
            // InternalMyDsl.g:2580:2: rule__Recipe__Group_25__0__Impl rule__Recipe__Group_25__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyDsl.g:2587:1: rule__Recipe__Group_25__0__Impl : ( ',' ) ;
    public final void rule__Recipe__Group_25__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2591:1: ( ( ',' ) )
            // InternalMyDsl.g:2592:1: ( ',' )
            {
            // InternalMyDsl.g:2592:1: ( ',' )
            // InternalMyDsl.g:2593:2: ','
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
    // InternalMyDsl.g:2602:1: rule__Recipe__Group_25__1 : rule__Recipe__Group_25__1__Impl ;
    public final void rule__Recipe__Group_25__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2606:1: ( rule__Recipe__Group_25__1__Impl )
            // InternalMyDsl.g:2607:2: rule__Recipe__Group_25__1__Impl
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
    // InternalMyDsl.g:2613:1: rule__Recipe__Group_25__1__Impl : ( ( rule__Recipe__IngredientAssignment_25_1 ) ) ;
    public final void rule__Recipe__Group_25__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2617:1: ( ( ( rule__Recipe__IngredientAssignment_25_1 ) ) )
            // InternalMyDsl.g:2618:1: ( ( rule__Recipe__IngredientAssignment_25_1 ) )
            {
            // InternalMyDsl.g:2618:1: ( ( rule__Recipe__IngredientAssignment_25_1 ) )
            // InternalMyDsl.g:2619:2: ( rule__Recipe__IngredientAssignment_25_1 )
            {
             before(grammarAccess.getRecipeAccess().getIngredientAssignment_25_1()); 
            // InternalMyDsl.g:2620:2: ( rule__Recipe__IngredientAssignment_25_1 )
            // InternalMyDsl.g:2620:3: rule__Recipe__IngredientAssignment_25_1
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
    // InternalMyDsl.g:2629:1: rule__Recipe__Group_27__0 : rule__Recipe__Group_27__0__Impl rule__Recipe__Group_27__1 ;
    public final void rule__Recipe__Group_27__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2633:1: ( rule__Recipe__Group_27__0__Impl rule__Recipe__Group_27__1 )
            // InternalMyDsl.g:2634:2: rule__Recipe__Group_27__0__Impl rule__Recipe__Group_27__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyDsl.g:2641:1: rule__Recipe__Group_27__0__Impl : ( ',' ) ;
    public final void rule__Recipe__Group_27__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2645:1: ( ( ',' ) )
            // InternalMyDsl.g:2646:1: ( ',' )
            {
            // InternalMyDsl.g:2646:1: ( ',' )
            // InternalMyDsl.g:2647:2: ','
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
    // InternalMyDsl.g:2656:1: rule__Recipe__Group_27__1 : rule__Recipe__Group_27__1__Impl rule__Recipe__Group_27__2 ;
    public final void rule__Recipe__Group_27__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2660:1: ( rule__Recipe__Group_27__1__Impl rule__Recipe__Group_27__2 )
            // InternalMyDsl.g:2661:2: rule__Recipe__Group_27__1__Impl rule__Recipe__Group_27__2
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
    // InternalMyDsl.g:2668:1: rule__Recipe__Group_27__1__Impl : ( 'Ratings' ) ;
    public final void rule__Recipe__Group_27__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2672:1: ( ( 'Ratings' ) )
            // InternalMyDsl.g:2673:1: ( 'Ratings' )
            {
            // InternalMyDsl.g:2673:1: ( 'Ratings' )
            // InternalMyDsl.g:2674:2: 'Ratings'
            {
             before(grammarAccess.getRecipeAccess().getRatingsKeyword_27_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalMyDsl.g:2683:1: rule__Recipe__Group_27__2 : rule__Recipe__Group_27__2__Impl rule__Recipe__Group_27__3 ;
    public final void rule__Recipe__Group_27__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2687:1: ( rule__Recipe__Group_27__2__Impl rule__Recipe__Group_27__3 )
            // InternalMyDsl.g:2688:2: rule__Recipe__Group_27__2__Impl rule__Recipe__Group_27__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:2695:1: rule__Recipe__Group_27__2__Impl : ( ':' ) ;
    public final void rule__Recipe__Group_27__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2699:1: ( ( ':' ) )
            // InternalMyDsl.g:2700:1: ( ':' )
            {
            // InternalMyDsl.g:2700:1: ( ':' )
            // InternalMyDsl.g:2701:2: ':'
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
    // InternalMyDsl.g:2710:1: rule__Recipe__Group_27__3 : rule__Recipe__Group_27__3__Impl rule__Recipe__Group_27__4 ;
    public final void rule__Recipe__Group_27__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2714:1: ( rule__Recipe__Group_27__3__Impl rule__Recipe__Group_27__4 )
            // InternalMyDsl.g:2715:2: rule__Recipe__Group_27__3__Impl rule__Recipe__Group_27__4
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
    // InternalMyDsl.g:2722:1: rule__Recipe__Group_27__3__Impl : ( '[' ) ;
    public final void rule__Recipe__Group_27__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2726:1: ( ( '[' ) )
            // InternalMyDsl.g:2727:1: ( '[' )
            {
            // InternalMyDsl.g:2727:1: ( '[' )
            // InternalMyDsl.g:2728:2: '['
            {
             before(grammarAccess.getRecipeAccess().getLeftSquareBracketKeyword_27_3()); 
            match(input,38,FOLLOW_2); 
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
    // InternalMyDsl.g:2737:1: rule__Recipe__Group_27__4 : rule__Recipe__Group_27__4__Impl rule__Recipe__Group_27__5 ;
    public final void rule__Recipe__Group_27__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2741:1: ( rule__Recipe__Group_27__4__Impl rule__Recipe__Group_27__5 )
            // InternalMyDsl.g:2742:2: rule__Recipe__Group_27__4__Impl rule__Recipe__Group_27__5
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:2749:1: rule__Recipe__Group_27__4__Impl : ( ( rule__Recipe__RatingsAssignment_27_4 ) ) ;
    public final void rule__Recipe__Group_27__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2753:1: ( ( ( rule__Recipe__RatingsAssignment_27_4 ) ) )
            // InternalMyDsl.g:2754:1: ( ( rule__Recipe__RatingsAssignment_27_4 ) )
            {
            // InternalMyDsl.g:2754:1: ( ( rule__Recipe__RatingsAssignment_27_4 ) )
            // InternalMyDsl.g:2755:2: ( rule__Recipe__RatingsAssignment_27_4 )
            {
             before(grammarAccess.getRecipeAccess().getRatingsAssignment_27_4()); 
            // InternalMyDsl.g:2756:2: ( rule__Recipe__RatingsAssignment_27_4 )
            // InternalMyDsl.g:2756:3: rule__Recipe__RatingsAssignment_27_4
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
    // InternalMyDsl.g:2764:1: rule__Recipe__Group_27__5 : rule__Recipe__Group_27__5__Impl rule__Recipe__Group_27__6 ;
    public final void rule__Recipe__Group_27__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2768:1: ( rule__Recipe__Group_27__5__Impl rule__Recipe__Group_27__6 )
            // InternalMyDsl.g:2769:2: rule__Recipe__Group_27__5__Impl rule__Recipe__Group_27__6
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:2776:1: rule__Recipe__Group_27__5__Impl : ( ( rule__Recipe__Group_27_5__0 )* ) ;
    public final void rule__Recipe__Group_27__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2780:1: ( ( ( rule__Recipe__Group_27_5__0 )* ) )
            // InternalMyDsl.g:2781:1: ( ( rule__Recipe__Group_27_5__0 )* )
            {
            // InternalMyDsl.g:2781:1: ( ( rule__Recipe__Group_27_5__0 )* )
            // InternalMyDsl.g:2782:2: ( rule__Recipe__Group_27_5__0 )*
            {
             before(grammarAccess.getRecipeAccess().getGroup_27_5()); 
            // InternalMyDsl.g:2783:2: ( rule__Recipe__Group_27_5__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==30) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:2783:3: rule__Recipe__Group_27_5__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Recipe__Group_27_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalMyDsl.g:2791:1: rule__Recipe__Group_27__6 : rule__Recipe__Group_27__6__Impl ;
    public final void rule__Recipe__Group_27__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2795:1: ( rule__Recipe__Group_27__6__Impl )
            // InternalMyDsl.g:2796:2: rule__Recipe__Group_27__6__Impl
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
    // InternalMyDsl.g:2802:1: rule__Recipe__Group_27__6__Impl : ( ']' ) ;
    public final void rule__Recipe__Group_27__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2806:1: ( ( ']' ) )
            // InternalMyDsl.g:2807:1: ( ']' )
            {
            // InternalMyDsl.g:2807:1: ( ']' )
            // InternalMyDsl.g:2808:2: ']'
            {
             before(grammarAccess.getRecipeAccess().getRightSquareBracketKeyword_27_6()); 
            match(input,39,FOLLOW_2); 
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
    // InternalMyDsl.g:2818:1: rule__Recipe__Group_27_5__0 : rule__Recipe__Group_27_5__0__Impl rule__Recipe__Group_27_5__1 ;
    public final void rule__Recipe__Group_27_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2822:1: ( rule__Recipe__Group_27_5__0__Impl rule__Recipe__Group_27_5__1 )
            // InternalMyDsl.g:2823:2: rule__Recipe__Group_27_5__0__Impl rule__Recipe__Group_27_5__1
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
    // InternalMyDsl.g:2830:1: rule__Recipe__Group_27_5__0__Impl : ( ',' ) ;
    public final void rule__Recipe__Group_27_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2834:1: ( ( ',' ) )
            // InternalMyDsl.g:2835:1: ( ',' )
            {
            // InternalMyDsl.g:2835:1: ( ',' )
            // InternalMyDsl.g:2836:2: ','
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
    // InternalMyDsl.g:2845:1: rule__Recipe__Group_27_5__1 : rule__Recipe__Group_27_5__1__Impl ;
    public final void rule__Recipe__Group_27_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2849:1: ( rule__Recipe__Group_27_5__1__Impl )
            // InternalMyDsl.g:2850:2: rule__Recipe__Group_27_5__1__Impl
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
    // InternalMyDsl.g:2856:1: rule__Recipe__Group_27_5__1__Impl : ( ( rule__Recipe__RatingsAssignment_27_5_1 ) ) ;
    public final void rule__Recipe__Group_27_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2860:1: ( ( ( rule__Recipe__RatingsAssignment_27_5_1 ) ) )
            // InternalMyDsl.g:2861:1: ( ( rule__Recipe__RatingsAssignment_27_5_1 ) )
            {
            // InternalMyDsl.g:2861:1: ( ( rule__Recipe__RatingsAssignment_27_5_1 ) )
            // InternalMyDsl.g:2862:2: ( rule__Recipe__RatingsAssignment_27_5_1 )
            {
             before(grammarAccess.getRecipeAccess().getRatingsAssignment_27_5_1()); 
            // InternalMyDsl.g:2863:2: ( rule__Recipe__RatingsAssignment_27_5_1 )
            // InternalMyDsl.g:2863:3: rule__Recipe__RatingsAssignment_27_5_1
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
    // InternalMyDsl.g:2872:1: rule__Ingredient__Group_0__0 : rule__Ingredient__Group_0__0__Impl rule__Ingredient__Group_0__1 ;
    public final void rule__Ingredient__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2876:1: ( rule__Ingredient__Group_0__0__Impl rule__Ingredient__Group_0__1 )
            // InternalMyDsl.g:2877:2: rule__Ingredient__Group_0__0__Impl rule__Ingredient__Group_0__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalMyDsl.g:2884:1: rule__Ingredient__Group_0__0__Impl : ( '{' ) ;
    public final void rule__Ingredient__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2888:1: ( ( '{' ) )
            // InternalMyDsl.g:2889:1: ( '{' )
            {
            // InternalMyDsl.g:2889:1: ( '{' )
            // InternalMyDsl.g:2890:2: '{'
            {
             before(grammarAccess.getIngredientAccess().getLeftCurlyBracketKeyword_0_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyDsl.g:2899:1: rule__Ingredient__Group_0__1 : rule__Ingredient__Group_0__1__Impl rule__Ingredient__Group_0__2 ;
    public final void rule__Ingredient__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2903:1: ( rule__Ingredient__Group_0__1__Impl rule__Ingredient__Group_0__2 )
            // InternalMyDsl.g:2904:2: rule__Ingredient__Group_0__1__Impl rule__Ingredient__Group_0__2
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
    // InternalMyDsl.g:2911:1: rule__Ingredient__Group_0__1__Impl : ( 'Name' ) ;
    public final void rule__Ingredient__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2915:1: ( ( 'Name' ) )
            // InternalMyDsl.g:2916:1: ( 'Name' )
            {
            // InternalMyDsl.g:2916:1: ( 'Name' )
            // InternalMyDsl.g:2917:2: 'Name'
            {
             before(grammarAccess.getIngredientAccess().getNameKeyword_0_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyDsl.g:2926:1: rule__Ingredient__Group_0__2 : rule__Ingredient__Group_0__2__Impl rule__Ingredient__Group_0__3 ;
    public final void rule__Ingredient__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2930:1: ( rule__Ingredient__Group_0__2__Impl rule__Ingredient__Group_0__3 )
            // InternalMyDsl.g:2931:2: rule__Ingredient__Group_0__2__Impl rule__Ingredient__Group_0__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:2938:1: rule__Ingredient__Group_0__2__Impl : ( ':' ) ;
    public final void rule__Ingredient__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2942:1: ( ( ':' ) )
            // InternalMyDsl.g:2943:1: ( ':' )
            {
            // InternalMyDsl.g:2943:1: ( ':' )
            // InternalMyDsl.g:2944:2: ':'
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
    // InternalMyDsl.g:2953:1: rule__Ingredient__Group_0__3 : rule__Ingredient__Group_0__3__Impl rule__Ingredient__Group_0__4 ;
    public final void rule__Ingredient__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2957:1: ( rule__Ingredient__Group_0__3__Impl rule__Ingredient__Group_0__4 )
            // InternalMyDsl.g:2958:2: rule__Ingredient__Group_0__3__Impl rule__Ingredient__Group_0__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:2965:1: rule__Ingredient__Group_0__3__Impl : ( ( rule__Ingredient__NameAssignment_0_3 ) ) ;
    public final void rule__Ingredient__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2969:1: ( ( ( rule__Ingredient__NameAssignment_0_3 ) ) )
            // InternalMyDsl.g:2970:1: ( ( rule__Ingredient__NameAssignment_0_3 ) )
            {
            // InternalMyDsl.g:2970:1: ( ( rule__Ingredient__NameAssignment_0_3 ) )
            // InternalMyDsl.g:2971:2: ( rule__Ingredient__NameAssignment_0_3 )
            {
             before(grammarAccess.getIngredientAccess().getNameAssignment_0_3()); 
            // InternalMyDsl.g:2972:2: ( rule__Ingredient__NameAssignment_0_3 )
            // InternalMyDsl.g:2972:3: rule__Ingredient__NameAssignment_0_3
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
    // InternalMyDsl.g:2980:1: rule__Ingredient__Group_0__4 : rule__Ingredient__Group_0__4__Impl rule__Ingredient__Group_0__5 ;
    public final void rule__Ingredient__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2984:1: ( rule__Ingredient__Group_0__4__Impl rule__Ingredient__Group_0__5 )
            // InternalMyDsl.g:2985:2: rule__Ingredient__Group_0__4__Impl rule__Ingredient__Group_0__5
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyDsl.g:2992:1: rule__Ingredient__Group_0__4__Impl : ( ',' ) ;
    public final void rule__Ingredient__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2996:1: ( ( ',' ) )
            // InternalMyDsl.g:2997:1: ( ',' )
            {
            // InternalMyDsl.g:2997:1: ( ',' )
            // InternalMyDsl.g:2998:2: ','
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
    // InternalMyDsl.g:3007:1: rule__Ingredient__Group_0__5 : rule__Ingredient__Group_0__5__Impl rule__Ingredient__Group_0__6 ;
    public final void rule__Ingredient__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3011:1: ( rule__Ingredient__Group_0__5__Impl rule__Ingredient__Group_0__6 )
            // InternalMyDsl.g:3012:2: rule__Ingredient__Group_0__5__Impl rule__Ingredient__Group_0__6
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
    // InternalMyDsl.g:3019:1: rule__Ingredient__Group_0__5__Impl : ( 'Amount' ) ;
    public final void rule__Ingredient__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3023:1: ( ( 'Amount' ) )
            // InternalMyDsl.g:3024:1: ( 'Amount' )
            {
            // InternalMyDsl.g:3024:1: ( 'Amount' )
            // InternalMyDsl.g:3025:2: 'Amount'
            {
             before(grammarAccess.getIngredientAccess().getAmountKeyword_0_5()); 
            match(input,44,FOLLOW_2); 
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
    // InternalMyDsl.g:3034:1: rule__Ingredient__Group_0__6 : rule__Ingredient__Group_0__6__Impl rule__Ingredient__Group_0__7 ;
    public final void rule__Ingredient__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3038:1: ( rule__Ingredient__Group_0__6__Impl rule__Ingredient__Group_0__7 )
            // InternalMyDsl.g:3039:2: rule__Ingredient__Group_0__6__Impl rule__Ingredient__Group_0__7
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:3046:1: rule__Ingredient__Group_0__6__Impl : ( ':' ) ;
    public final void rule__Ingredient__Group_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3050:1: ( ( ':' ) )
            // InternalMyDsl.g:3051:1: ( ':' )
            {
            // InternalMyDsl.g:3051:1: ( ':' )
            // InternalMyDsl.g:3052:2: ':'
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
    // InternalMyDsl.g:3061:1: rule__Ingredient__Group_0__7 : rule__Ingredient__Group_0__7__Impl rule__Ingredient__Group_0__8 ;
    public final void rule__Ingredient__Group_0__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3065:1: ( rule__Ingredient__Group_0__7__Impl rule__Ingredient__Group_0__8 )
            // InternalMyDsl.g:3066:2: rule__Ingredient__Group_0__7__Impl rule__Ingredient__Group_0__8
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:3073:1: rule__Ingredient__Group_0__7__Impl : ( ( rule__Ingredient__AmountAssignment_0_7 ) ) ;
    public final void rule__Ingredient__Group_0__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3077:1: ( ( ( rule__Ingredient__AmountAssignment_0_7 ) ) )
            // InternalMyDsl.g:3078:1: ( ( rule__Ingredient__AmountAssignment_0_7 ) )
            {
            // InternalMyDsl.g:3078:1: ( ( rule__Ingredient__AmountAssignment_0_7 ) )
            // InternalMyDsl.g:3079:2: ( rule__Ingredient__AmountAssignment_0_7 )
            {
             before(grammarAccess.getIngredientAccess().getAmountAssignment_0_7()); 
            // InternalMyDsl.g:3080:2: ( rule__Ingredient__AmountAssignment_0_7 )
            // InternalMyDsl.g:3080:3: rule__Ingredient__AmountAssignment_0_7
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
    // InternalMyDsl.g:3088:1: rule__Ingredient__Group_0__8 : rule__Ingredient__Group_0__8__Impl rule__Ingredient__Group_0__9 ;
    public final void rule__Ingredient__Group_0__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3092:1: ( rule__Ingredient__Group_0__8__Impl rule__Ingredient__Group_0__9 )
            // InternalMyDsl.g:3093:2: rule__Ingredient__Group_0__8__Impl rule__Ingredient__Group_0__9
            {
            pushFollow(FOLLOW_28);
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
    // InternalMyDsl.g:3100:1: rule__Ingredient__Group_0__8__Impl : ( ',' ) ;
    public final void rule__Ingredient__Group_0__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3104:1: ( ( ',' ) )
            // InternalMyDsl.g:3105:1: ( ',' )
            {
            // InternalMyDsl.g:3105:1: ( ',' )
            // InternalMyDsl.g:3106:2: ','
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
    // InternalMyDsl.g:3115:1: rule__Ingredient__Group_0__9 : rule__Ingredient__Group_0__9__Impl rule__Ingredient__Group_0__10 ;
    public final void rule__Ingredient__Group_0__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3119:1: ( rule__Ingredient__Group_0__9__Impl rule__Ingredient__Group_0__10 )
            // InternalMyDsl.g:3120:2: rule__Ingredient__Group_0__9__Impl rule__Ingredient__Group_0__10
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
    // InternalMyDsl.g:3127:1: rule__Ingredient__Group_0__9__Impl : ( 'Unit' ) ;
    public final void rule__Ingredient__Group_0__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3131:1: ( ( 'Unit' ) )
            // InternalMyDsl.g:3132:1: ( 'Unit' )
            {
            // InternalMyDsl.g:3132:1: ( 'Unit' )
            // InternalMyDsl.g:3133:2: 'Unit'
            {
             before(grammarAccess.getIngredientAccess().getUnitKeyword_0_9()); 
            match(input,45,FOLLOW_2); 
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
    // InternalMyDsl.g:3142:1: rule__Ingredient__Group_0__10 : rule__Ingredient__Group_0__10__Impl rule__Ingredient__Group_0__11 ;
    public final void rule__Ingredient__Group_0__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3146:1: ( rule__Ingredient__Group_0__10__Impl rule__Ingredient__Group_0__11 )
            // InternalMyDsl.g:3147:2: rule__Ingredient__Group_0__10__Impl rule__Ingredient__Group_0__11
            {
            pushFollow(FOLLOW_29);
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
    // InternalMyDsl.g:3154:1: rule__Ingredient__Group_0__10__Impl : ( ':' ) ;
    public final void rule__Ingredient__Group_0__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3158:1: ( ( ':' ) )
            // InternalMyDsl.g:3159:1: ( ':' )
            {
            // InternalMyDsl.g:3159:1: ( ':' )
            // InternalMyDsl.g:3160:2: ':'
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
    // InternalMyDsl.g:3169:1: rule__Ingredient__Group_0__11 : rule__Ingredient__Group_0__11__Impl rule__Ingredient__Group_0__12 ;
    public final void rule__Ingredient__Group_0__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3173:1: ( rule__Ingredient__Group_0__11__Impl rule__Ingredient__Group_0__12 )
            // InternalMyDsl.g:3174:2: rule__Ingredient__Group_0__11__Impl rule__Ingredient__Group_0__12
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:3181:1: rule__Ingredient__Group_0__11__Impl : ( ( rule__Ingredient__UnitAssignment_0_11 ) ) ;
    public final void rule__Ingredient__Group_0__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3185:1: ( ( ( rule__Ingredient__UnitAssignment_0_11 ) ) )
            // InternalMyDsl.g:3186:1: ( ( rule__Ingredient__UnitAssignment_0_11 ) )
            {
            // InternalMyDsl.g:3186:1: ( ( rule__Ingredient__UnitAssignment_0_11 ) )
            // InternalMyDsl.g:3187:2: ( rule__Ingredient__UnitAssignment_0_11 )
            {
             before(grammarAccess.getIngredientAccess().getUnitAssignment_0_11()); 
            // InternalMyDsl.g:3188:2: ( rule__Ingredient__UnitAssignment_0_11 )
            // InternalMyDsl.g:3188:3: rule__Ingredient__UnitAssignment_0_11
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
    // InternalMyDsl.g:3196:1: rule__Ingredient__Group_0__12 : rule__Ingredient__Group_0__12__Impl rule__Ingredient__Group_0__13 ;
    public final void rule__Ingredient__Group_0__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3200:1: ( rule__Ingredient__Group_0__12__Impl rule__Ingredient__Group_0__13 )
            // InternalMyDsl.g:3201:2: rule__Ingredient__Group_0__12__Impl rule__Ingredient__Group_0__13
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:3208:1: rule__Ingredient__Group_0__12__Impl : ( ',' ) ;
    public final void rule__Ingredient__Group_0__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3212:1: ( ( ',' ) )
            // InternalMyDsl.g:3213:1: ( ',' )
            {
            // InternalMyDsl.g:3213:1: ( ',' )
            // InternalMyDsl.g:3214:2: ','
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
    // InternalMyDsl.g:3223:1: rule__Ingredient__Group_0__13 : rule__Ingredient__Group_0__13__Impl rule__Ingredient__Group_0__14 ;
    public final void rule__Ingredient__Group_0__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3227:1: ( rule__Ingredient__Group_0__13__Impl rule__Ingredient__Group_0__14 )
            // InternalMyDsl.g:3228:2: rule__Ingredient__Group_0__13__Impl rule__Ingredient__Group_0__14
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
    // InternalMyDsl.g:3235:1: rule__Ingredient__Group_0__13__Impl : ( 'VeganismLevel' ) ;
    public final void rule__Ingredient__Group_0__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3239:1: ( ( 'VeganismLevel' ) )
            // InternalMyDsl.g:3240:1: ( 'VeganismLevel' )
            {
            // InternalMyDsl.g:3240:1: ( 'VeganismLevel' )
            // InternalMyDsl.g:3241:2: 'VeganismLevel'
            {
             before(grammarAccess.getIngredientAccess().getVeganismLevelKeyword_0_13()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyDsl.g:3250:1: rule__Ingredient__Group_0__14 : rule__Ingredient__Group_0__14__Impl rule__Ingredient__Group_0__15 ;
    public final void rule__Ingredient__Group_0__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3254:1: ( rule__Ingredient__Group_0__14__Impl rule__Ingredient__Group_0__15 )
            // InternalMyDsl.g:3255:2: rule__Ingredient__Group_0__14__Impl rule__Ingredient__Group_0__15
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:3262:1: rule__Ingredient__Group_0__14__Impl : ( ':' ) ;
    public final void rule__Ingredient__Group_0__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3266:1: ( ( ':' ) )
            // InternalMyDsl.g:3267:1: ( ':' )
            {
            // InternalMyDsl.g:3267:1: ( ':' )
            // InternalMyDsl.g:3268:2: ':'
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
    // InternalMyDsl.g:3277:1: rule__Ingredient__Group_0__15 : rule__Ingredient__Group_0__15__Impl rule__Ingredient__Group_0__16 ;
    public final void rule__Ingredient__Group_0__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3281:1: ( rule__Ingredient__Group_0__15__Impl rule__Ingredient__Group_0__16 )
            // InternalMyDsl.g:3282:2: rule__Ingredient__Group_0__15__Impl rule__Ingredient__Group_0__16
            {
            pushFollow(FOLLOW_14);
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
    // InternalMyDsl.g:3289:1: rule__Ingredient__Group_0__15__Impl : ( ( rule__Ingredient__VeganismLevelAssignment_0_15 ) ) ;
    public final void rule__Ingredient__Group_0__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3293:1: ( ( ( rule__Ingredient__VeganismLevelAssignment_0_15 ) ) )
            // InternalMyDsl.g:3294:1: ( ( rule__Ingredient__VeganismLevelAssignment_0_15 ) )
            {
            // InternalMyDsl.g:3294:1: ( ( rule__Ingredient__VeganismLevelAssignment_0_15 ) )
            // InternalMyDsl.g:3295:2: ( rule__Ingredient__VeganismLevelAssignment_0_15 )
            {
             before(grammarAccess.getIngredientAccess().getVeganismLevelAssignment_0_15()); 
            // InternalMyDsl.g:3296:2: ( rule__Ingredient__VeganismLevelAssignment_0_15 )
            // InternalMyDsl.g:3296:3: rule__Ingredient__VeganismLevelAssignment_0_15
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
    // InternalMyDsl.g:3304:1: rule__Ingredient__Group_0__16 : rule__Ingredient__Group_0__16__Impl ;
    public final void rule__Ingredient__Group_0__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3308:1: ( rule__Ingredient__Group_0__16__Impl )
            // InternalMyDsl.g:3309:2: rule__Ingredient__Group_0__16__Impl
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
    // InternalMyDsl.g:3315:1: rule__Ingredient__Group_0__16__Impl : ( '}' ) ;
    public final void rule__Ingredient__Group_0__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3319:1: ( ( '}' ) )
            // InternalMyDsl.g:3320:1: ( '}' )
            {
            // InternalMyDsl.g:3320:1: ( '}' )
            // InternalMyDsl.g:3321:2: '}'
            {
             before(grammarAccess.getIngredientAccess().getRightCurlyBracketKeyword_0_16()); 
            match(input,28,FOLLOW_2); 
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


    // $ANTLR start "rule__RecipeManager__AuthorsAssignment_3"
    // InternalMyDsl.g:3331:1: rule__RecipeManager__AuthorsAssignment_3 : ( ruleAuthor ) ;
    public final void rule__RecipeManager__AuthorsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3335:1: ( ( ruleAuthor ) )
            // InternalMyDsl.g:3336:2: ( ruleAuthor )
            {
            // InternalMyDsl.g:3336:2: ( ruleAuthor )
            // InternalMyDsl.g:3337:3: ruleAuthor
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


    // $ANTLR start "rule__RecipeManager__AuthorsAssignment_4_1"
    // InternalMyDsl.g:3346:1: rule__RecipeManager__AuthorsAssignment_4_1 : ( ruleAuthor ) ;
    public final void rule__RecipeManager__AuthorsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3350:1: ( ( ruleAuthor ) )
            // InternalMyDsl.g:3351:2: ( ruleAuthor )
            {
            // InternalMyDsl.g:3351:2: ( ruleAuthor )
            // InternalMyDsl.g:3352:3: ruleAuthor
            {
             before(grammarAccess.getRecipeManagerAccess().getAuthorsAuthorParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAuthor();

            state._fsp--;

             after(grammarAccess.getRecipeManagerAccess().getAuthorsAuthorParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecipeManager__AuthorsAssignment_4_1"


    // $ANTLR start "rule__RecipeManager__RecipesAssignment_9"
    // InternalMyDsl.g:3361:1: rule__RecipeManager__RecipesAssignment_9 : ( ruleRecipe ) ;
    public final void rule__RecipeManager__RecipesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3365:1: ( ( ruleRecipe ) )
            // InternalMyDsl.g:3366:2: ( ruleRecipe )
            {
            // InternalMyDsl.g:3366:2: ( ruleRecipe )
            // InternalMyDsl.g:3367:3: ruleRecipe
            {
             before(grammarAccess.getRecipeManagerAccess().getRecipesRecipeParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleRecipe();

            state._fsp--;

             after(grammarAccess.getRecipeManagerAccess().getRecipesRecipeParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecipeManager__RecipesAssignment_9"


    // $ANTLR start "rule__RecipeManager__RecipesAssignment_10_1"
    // InternalMyDsl.g:3376:1: rule__RecipeManager__RecipesAssignment_10_1 : ( ruleRecipe ) ;
    public final void rule__RecipeManager__RecipesAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3380:1: ( ( ruleRecipe ) )
            // InternalMyDsl.g:3381:2: ( ruleRecipe )
            {
            // InternalMyDsl.g:3381:2: ( ruleRecipe )
            // InternalMyDsl.g:3382:3: ruleRecipe
            {
             before(grammarAccess.getRecipeManagerAccess().getRecipesRecipeParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRecipe();

            state._fsp--;

             after(grammarAccess.getRecipeManagerAccess().getRecipesRecipeParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecipeManager__RecipesAssignment_10_1"


    // $ANTLR start "rule__Author__NameAssignment_0"
    // InternalMyDsl.g:3391:1: rule__Author__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Author__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3395:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3396:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3396:2: ( RULE_ID )
            // InternalMyDsl.g:3397:3: RULE_ID
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


    // $ANTLR start "rule__Author__EmailAssignment_2"
    // InternalMyDsl.g:3406:1: rule__Author__EmailAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Author__EmailAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3410:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3411:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3411:2: ( RULE_STRING )
            // InternalMyDsl.g:3412:3: RULE_STRING
            {
             before(grammarAccess.getAuthorAccess().getEmailSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAuthorAccess().getEmailSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Author__EmailAssignment_2"


    // $ANTLR start "rule__Rating__StarsAssignment_3"
    // InternalMyDsl.g:3421:1: rule__Rating__StarsAssignment_3 : ( RULE_INT ) ;
    public final void rule__Rating__StarsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3425:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:3426:2: ( RULE_INT )
            {
            // InternalMyDsl.g:3426:2: ( RULE_INT )
            // InternalMyDsl.g:3427:3: RULE_INT
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
    // InternalMyDsl.g:3436:1: rule__Rating__CommentAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__Rating__CommentAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3440:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3441:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3441:2: ( RULE_STRING )
            // InternalMyDsl.g:3442:3: RULE_STRING
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
    // InternalMyDsl.g:3451:1: rule__Rating__AuthorAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__Rating__AuthorAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3455:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:3456:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:3456:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:3457:3: ( RULE_ID )
            {
             before(grammarAccess.getRatingAccess().getAuthorAuthorCrossReference_8_0()); 
            // InternalMyDsl.g:3458:3: ( RULE_ID )
            // InternalMyDsl.g:3459:4: RULE_ID
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
    // InternalMyDsl.g:3470:1: rule__Recipe__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Recipe__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3474:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3475:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3475:2: ( RULE_ID )
            // InternalMyDsl.g:3476:3: RULE_ID
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
    // InternalMyDsl.g:3485:1: rule__Recipe__AuthorAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Recipe__AuthorAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3489:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:3490:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:3490:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:3491:3: ( RULE_ID )
            {
             before(grammarAccess.getRecipeAccess().getAuthorAuthorCrossReference_5_0()); 
            // InternalMyDsl.g:3492:3: ( RULE_ID )
            // InternalMyDsl.g:3493:4: RULE_ID
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
    // InternalMyDsl.g:3504:1: rule__Recipe__VeganAssignment_9 : ( ruleVeganismLevel ) ;
    public final void rule__Recipe__VeganAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3508:1: ( ( ruleVeganismLevel ) )
            // InternalMyDsl.g:3509:2: ( ruleVeganismLevel )
            {
            // InternalMyDsl.g:3509:2: ( ruleVeganismLevel )
            // InternalMyDsl.g:3510:3: ruleVeganismLevel
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
    // InternalMyDsl.g:3519:1: rule__Recipe__DurationAssignment_13 : ( RULE_INT ) ;
    public final void rule__Recipe__DurationAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3523:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:3524:2: ( RULE_INT )
            {
            // InternalMyDsl.g:3524:2: ( RULE_INT )
            // InternalMyDsl.g:3525:3: RULE_INT
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
    // InternalMyDsl.g:3534:1: rule__Recipe__DifficultyAssignment_17 : ( RULE_INT ) ;
    public final void rule__Recipe__DifficultyAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3538:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:3539:2: ( RULE_INT )
            {
            // InternalMyDsl.g:3539:2: ( RULE_INT )
            // InternalMyDsl.g:3540:3: RULE_INT
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
    // InternalMyDsl.g:3549:1: rule__Recipe__KitchenUtensilsAssignment_19_3 : ( ruleKitchenUtensil ) ;
    public final void rule__Recipe__KitchenUtensilsAssignment_19_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3553:1: ( ( ruleKitchenUtensil ) )
            // InternalMyDsl.g:3554:2: ( ruleKitchenUtensil )
            {
            // InternalMyDsl.g:3554:2: ( ruleKitchenUtensil )
            // InternalMyDsl.g:3555:3: ruleKitchenUtensil
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
    // InternalMyDsl.g:3564:1: rule__Recipe__KitchenUtensilsAssignment_19_4_1 : ( ruleKitchenUtensil ) ;
    public final void rule__Recipe__KitchenUtensilsAssignment_19_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3568:1: ( ( ruleKitchenUtensil ) )
            // InternalMyDsl.g:3569:2: ( ruleKitchenUtensil )
            {
            // InternalMyDsl.g:3569:2: ( ruleKitchenUtensil )
            // InternalMyDsl.g:3570:3: ruleKitchenUtensil
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
    // InternalMyDsl.g:3579:1: rule__Recipe__FoodCategoryAssignment_20_3 : ( ruleFoodCategory ) ;
    public final void rule__Recipe__FoodCategoryAssignment_20_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3583:1: ( ( ruleFoodCategory ) )
            // InternalMyDsl.g:3584:2: ( ruleFoodCategory )
            {
            // InternalMyDsl.g:3584:2: ( ruleFoodCategory )
            // InternalMyDsl.g:3585:3: ruleFoodCategory
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
    // InternalMyDsl.g:3594:1: rule__Recipe__FoodCategoryAssignment_20_4_1 : ( ruleFoodCategory ) ;
    public final void rule__Recipe__FoodCategoryAssignment_20_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3598:1: ( ( ruleFoodCategory ) )
            // InternalMyDsl.g:3599:2: ( ruleFoodCategory )
            {
            // InternalMyDsl.g:3599:2: ( ruleFoodCategory )
            // InternalMyDsl.g:3600:3: ruleFoodCategory
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
    // InternalMyDsl.g:3609:1: rule__Recipe__IngredientAssignment_24 : ( ruleIngredient ) ;
    public final void rule__Recipe__IngredientAssignment_24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3613:1: ( ( ruleIngredient ) )
            // InternalMyDsl.g:3614:2: ( ruleIngredient )
            {
            // InternalMyDsl.g:3614:2: ( ruleIngredient )
            // InternalMyDsl.g:3615:3: ruleIngredient
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
    // InternalMyDsl.g:3624:1: rule__Recipe__IngredientAssignment_25_1 : ( ruleIngredient ) ;
    public final void rule__Recipe__IngredientAssignment_25_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3628:1: ( ( ruleIngredient ) )
            // InternalMyDsl.g:3629:2: ( ruleIngredient )
            {
            // InternalMyDsl.g:3629:2: ( ruleIngredient )
            // InternalMyDsl.g:3630:3: ruleIngredient
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
    // InternalMyDsl.g:3639:1: rule__Recipe__RatingsAssignment_27_4 : ( ruleRating ) ;
    public final void rule__Recipe__RatingsAssignment_27_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3643:1: ( ( ruleRating ) )
            // InternalMyDsl.g:3644:2: ( ruleRating )
            {
            // InternalMyDsl.g:3644:2: ( ruleRating )
            // InternalMyDsl.g:3645:3: ruleRating
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
    // InternalMyDsl.g:3654:1: rule__Recipe__RatingsAssignment_27_5_1 : ( ruleRating ) ;
    public final void rule__Recipe__RatingsAssignment_27_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3658:1: ( ( ruleRating ) )
            // InternalMyDsl.g:3659:2: ( ruleRating )
            {
            // InternalMyDsl.g:3659:2: ( ruleRating )
            // InternalMyDsl.g:3660:3: ruleRating
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
    // InternalMyDsl.g:3669:1: rule__KitchenUtensil__NameAssignment : ( ( rule__KitchenUtensil__NameAlternatives_0 ) ) ;
    public final void rule__KitchenUtensil__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3673:1: ( ( ( rule__KitchenUtensil__NameAlternatives_0 ) ) )
            // InternalMyDsl.g:3674:2: ( ( rule__KitchenUtensil__NameAlternatives_0 ) )
            {
            // InternalMyDsl.g:3674:2: ( ( rule__KitchenUtensil__NameAlternatives_0 ) )
            // InternalMyDsl.g:3675:3: ( rule__KitchenUtensil__NameAlternatives_0 )
            {
             before(grammarAccess.getKitchenUtensilAccess().getNameAlternatives_0()); 
            // InternalMyDsl.g:3676:3: ( rule__KitchenUtensil__NameAlternatives_0 )
            // InternalMyDsl.g:3676:4: rule__KitchenUtensil__NameAlternatives_0
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
    // InternalMyDsl.g:3684:1: rule__FoodCategory__NameAssignment : ( RULE_STRING ) ;
    public final void rule__FoodCategory__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3688:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3689:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3689:2: ( RULE_STRING )
            // InternalMyDsl.g:3690:3: RULE_STRING
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
    // InternalMyDsl.g:3699:1: rule__Ingredient__NameAssignment_0_3 : ( RULE_STRING ) ;
    public final void rule__Ingredient__NameAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3703:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3704:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3704:2: ( RULE_STRING )
            // InternalMyDsl.g:3705:3: RULE_STRING
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
    // InternalMyDsl.g:3714:1: rule__Ingredient__AmountAssignment_0_7 : ( RULE_INT ) ;
    public final void rule__Ingredient__AmountAssignment_0_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3718:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:3719:2: ( RULE_INT )
            {
            // InternalMyDsl.g:3719:2: ( RULE_INT )
            // InternalMyDsl.g:3720:3: RULE_INT
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
    // InternalMyDsl.g:3729:1: rule__Ingredient__UnitAssignment_0_11 : ( ruleUnit ) ;
    public final void rule__Ingredient__UnitAssignment_0_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3733:1: ( ( ruleUnit ) )
            // InternalMyDsl.g:3734:2: ( ruleUnit )
            {
            // InternalMyDsl.g:3734:2: ( ruleUnit )
            // InternalMyDsl.g:3735:3: ruleUnit
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
    // InternalMyDsl.g:3744:1: rule__Ingredient__VeganismLevelAssignment_0_15 : ( ruleVeganismLevel ) ;
    public final void rule__Ingredient__VeganismLevelAssignment_0_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3748:1: ( ( ruleVeganismLevel ) )
            // InternalMyDsl.g:3749:2: ( ruleVeganismLevel )
            {
            // InternalMyDsl.g:3749:2: ( ruleVeganismLevel )
            // InternalMyDsl.g:3750:3: ruleVeganismLevel
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
    // InternalMyDsl.g:3759:1: rule__Ingredient__RecipeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Ingredient__RecipeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3763:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:3764:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:3764:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:3765:3: ( RULE_ID )
            {
             before(grammarAccess.getIngredientAccess().getRecipeRecipeCrossReference_1_0()); 
            // InternalMyDsl.g:3766:3: ( RULE_ID )
            // InternalMyDsl.g:3767:4: RULE_ID
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000032000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000008040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000003810L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000001FE0000L});

}