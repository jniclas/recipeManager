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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NEWLINE", "RULE_SL_COMMENT", "RULE_ID", "RULE_QSTRING", "RULE_INT", "RULE_INGEREDIENTSTRING", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'easy'", "'medium'", "'hard'", "'Vegan'", "'Vegetaric'", "'Carnivorous'", "'ml'", "'l'", "'g'", "'kg'", "'tsp'", "'mg'", "'tbsp'", "'pcs'", "'authors'", "'recipes'", "'from'", "','", "'min'", "'Food Categories'", "'Ingredients'", "'Preparation'", "'Kitchen Utensils'", "'Video'", "'Ratings'", "'--'", "')'"
    };
    public static final int RULE_NEWLINE=4;
    public static final int RULE_STRING=10;
    public static final int RULE_SL_COMMENT=5;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
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
    public static final int T__40=40;
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


    // $ANTLR start "entryRuleRecipe"
    // InternalMyDsl.g:103:1: entryRuleRecipe : ruleRecipe EOF ;
    public final void entryRuleRecipe() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleRecipe EOF )
            // InternalMyDsl.g:105:1: ruleRecipe EOF
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
    // InternalMyDsl.g:112:1: ruleRecipe : ( ( rule__Recipe__Group__0 ) ) ;
    public final void ruleRecipe() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Recipe__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Recipe__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Recipe__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Recipe__Group__0 )
            {
             before(grammarAccess.getRecipeAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Recipe__Group__0 )
            // InternalMyDsl.g:119:4: rule__Recipe__Group__0
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
    // InternalMyDsl.g:128:1: entryRuleKitchenUtensil : ruleKitchenUtensil EOF ;
    public final void entryRuleKitchenUtensil() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleKitchenUtensil EOF )
            // InternalMyDsl.g:130:1: ruleKitchenUtensil EOF
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
    // InternalMyDsl.g:137:1: ruleKitchenUtensil : ( ( rule__KitchenUtensil__NameAssignment ) ) ;
    public final void ruleKitchenUtensil() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__KitchenUtensil__NameAssignment ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__KitchenUtensil__NameAssignment ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__KitchenUtensil__NameAssignment ) )
            // InternalMyDsl.g:143:3: ( rule__KitchenUtensil__NameAssignment )
            {
             before(grammarAccess.getKitchenUtensilAccess().getNameAssignment()); 
            // InternalMyDsl.g:144:3: ( rule__KitchenUtensil__NameAssignment )
            // InternalMyDsl.g:144:4: rule__KitchenUtensil__NameAssignment
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
    // InternalMyDsl.g:153:1: entryRuleDifficultyLevel : ruleDifficultyLevel EOF ;
    public final void entryRuleDifficultyLevel() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleDifficultyLevel EOF )
            // InternalMyDsl.g:155:1: ruleDifficultyLevel EOF
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
    // InternalMyDsl.g:162:1: ruleDifficultyLevel : ( ( rule__DifficultyLevel__NameAssignment ) ) ;
    public final void ruleDifficultyLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__DifficultyLevel__NameAssignment ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__DifficultyLevel__NameAssignment ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__DifficultyLevel__NameAssignment ) )
            // InternalMyDsl.g:168:3: ( rule__DifficultyLevel__NameAssignment )
            {
             before(grammarAccess.getDifficultyLevelAccess().getNameAssignment()); 
            // InternalMyDsl.g:169:3: ( rule__DifficultyLevel__NameAssignment )
            // InternalMyDsl.g:169:4: rule__DifficultyLevel__NameAssignment
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
    // InternalMyDsl.g:212:1: ruleIngredient : ( ( rule__Ingredient__Group__0 ) ) ;
    public final void ruleIngredient() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__Ingredient__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__Ingredient__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__Ingredient__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__Ingredient__Group__0 )
            {
             before(grammarAccess.getIngredientAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__Ingredient__Group__0 )
            // InternalMyDsl.g:219:4: rule__Ingredient__Group__0
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


    // $ANTLR start "entryRuleList"
    // InternalMyDsl.g:228:1: entryRuleList : ruleList EOF ;
    public final void entryRuleList() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleList EOF )
            // InternalMyDsl.g:230:1: ruleList EOF
            {
             before(grammarAccess.getListRule()); 
            pushFollow(FOLLOW_1);
            ruleList();

            state._fsp--;

             after(grammarAccess.getListRule()); 
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
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // InternalMyDsl.g:237:1: ruleList : ( ( ( rule__List__ElementsAssignment ) ) ( ( rule__List__ElementsAssignment )* ) ) ;
    public final void ruleList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( ( rule__List__ElementsAssignment ) ) ( ( rule__List__ElementsAssignment )* ) ) )
            // InternalMyDsl.g:242:2: ( ( ( rule__List__ElementsAssignment ) ) ( ( rule__List__ElementsAssignment )* ) )
            {
            // InternalMyDsl.g:242:2: ( ( ( rule__List__ElementsAssignment ) ) ( ( rule__List__ElementsAssignment )* ) )
            // InternalMyDsl.g:243:3: ( ( rule__List__ElementsAssignment ) ) ( ( rule__List__ElementsAssignment )* )
            {
            // InternalMyDsl.g:243:3: ( ( rule__List__ElementsAssignment ) )
            // InternalMyDsl.g:244:4: ( rule__List__ElementsAssignment )
            {
             before(grammarAccess.getListAccess().getElementsAssignment()); 
            // InternalMyDsl.g:245:4: ( rule__List__ElementsAssignment )
            // InternalMyDsl.g:245:5: rule__List__ElementsAssignment
            {
            pushFollow(FOLLOW_3);
            rule__List__ElementsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getListAccess().getElementsAssignment()); 

            }

            // InternalMyDsl.g:248:3: ( ( rule__List__ElementsAssignment )* )
            // InternalMyDsl.g:249:4: ( rule__List__ElementsAssignment )*
            {
             before(grammarAccess.getListAccess().getElementsAssignment()); 
            // InternalMyDsl.g:250:4: ( rule__List__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_INT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:250:5: rule__List__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__List__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getListAccess().getElementsAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleList"


    // $ANTLR start "entryRuleListElement"
    // InternalMyDsl.g:260:1: entryRuleListElement : ruleListElement EOF ;
    public final void entryRuleListElement() throws RecognitionException {
        try {
            // InternalMyDsl.g:261:1: ( ruleListElement EOF )
            // InternalMyDsl.g:262:1: ruleListElement EOF
            {
             before(grammarAccess.getListElementRule()); 
            pushFollow(FOLLOW_1);
            ruleListElement();

            state._fsp--;

             after(grammarAccess.getListElementRule()); 
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
    // $ANTLR end "entryRuleListElement"


    // $ANTLR start "ruleListElement"
    // InternalMyDsl.g:269:1: ruleListElement : ( ( rule__ListElement__Group__0 ) ) ;
    public final void ruleListElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:273:2: ( ( ( rule__ListElement__Group__0 ) ) )
            // InternalMyDsl.g:274:2: ( ( rule__ListElement__Group__0 ) )
            {
            // InternalMyDsl.g:274:2: ( ( rule__ListElement__Group__0 ) )
            // InternalMyDsl.g:275:3: ( rule__ListElement__Group__0 )
            {
             before(grammarAccess.getListElementAccess().getGroup()); 
            // InternalMyDsl.g:276:3: ( rule__ListElement__Group__0 )
            // InternalMyDsl.g:276:4: rule__ListElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListElement"


    // $ANTLR start "entryRuleVideo"
    // InternalMyDsl.g:285:1: entryRuleVideo : ruleVideo EOF ;
    public final void entryRuleVideo() throws RecognitionException {
        try {
            // InternalMyDsl.g:286:1: ( ruleVideo EOF )
            // InternalMyDsl.g:287:1: ruleVideo EOF
            {
             before(grammarAccess.getVideoRule()); 
            pushFollow(FOLLOW_1);
            ruleVideo();

            state._fsp--;

             after(grammarAccess.getVideoRule()); 
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
    // $ANTLR end "entryRuleVideo"


    // $ANTLR start "ruleVideo"
    // InternalMyDsl.g:294:1: ruleVideo : ( ( rule__Video__NameAssignment ) ) ;
    public final void ruleVideo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:298:2: ( ( ( rule__Video__NameAssignment ) ) )
            // InternalMyDsl.g:299:2: ( ( rule__Video__NameAssignment ) )
            {
            // InternalMyDsl.g:299:2: ( ( rule__Video__NameAssignment ) )
            // InternalMyDsl.g:300:3: ( rule__Video__NameAssignment )
            {
             before(grammarAccess.getVideoAccess().getNameAssignment()); 
            // InternalMyDsl.g:301:3: ( rule__Video__NameAssignment )
            // InternalMyDsl.g:301:4: rule__Video__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Video__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVideoAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVideo"


    // $ANTLR start "entryRuleRating"
    // InternalMyDsl.g:310:1: entryRuleRating : ruleRating EOF ;
    public final void entryRuleRating() throws RecognitionException {
        try {
            // InternalMyDsl.g:311:1: ( ruleRating EOF )
            // InternalMyDsl.g:312:1: ruleRating EOF
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
    // InternalMyDsl.g:319:1: ruleRating : ( ( rule__Rating__Group__0 ) ) ;
    public final void ruleRating() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:323:2: ( ( ( rule__Rating__Group__0 ) ) )
            // InternalMyDsl.g:324:2: ( ( rule__Rating__Group__0 ) )
            {
            // InternalMyDsl.g:324:2: ( ( rule__Rating__Group__0 ) )
            // InternalMyDsl.g:325:3: ( rule__Rating__Group__0 )
            {
             before(grammarAccess.getRatingAccess().getGroup()); 
            // InternalMyDsl.g:326:3: ( rule__Rating__Group__0 )
            // InternalMyDsl.g:326:4: rule__Rating__Group__0
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


    // $ANTLR start "entryRuleVeganismLevel"
    // InternalMyDsl.g:335:1: entryRuleVeganismLevel : ruleVeganismLevel EOF ;
    public final void entryRuleVeganismLevel() throws RecognitionException {
        try {
            // InternalMyDsl.g:336:1: ( ruleVeganismLevel EOF )
            // InternalMyDsl.g:337:1: ruleVeganismLevel EOF
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
    // InternalMyDsl.g:344:1: ruleVeganismLevel : ( ( rule__VeganismLevel__Alternatives ) ) ;
    public final void ruleVeganismLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:348:2: ( ( ( rule__VeganismLevel__Alternatives ) ) )
            // InternalMyDsl.g:349:2: ( ( rule__VeganismLevel__Alternatives ) )
            {
            // InternalMyDsl.g:349:2: ( ( rule__VeganismLevel__Alternatives ) )
            // InternalMyDsl.g:350:3: ( rule__VeganismLevel__Alternatives )
            {
             before(grammarAccess.getVeganismLevelAccess().getAlternatives()); 
            // InternalMyDsl.g:351:3: ( rule__VeganismLevel__Alternatives )
            // InternalMyDsl.g:351:4: rule__VeganismLevel__Alternatives
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
    // InternalMyDsl.g:360:1: entryRuleUnit : ruleUnit EOF ;
    public final void entryRuleUnit() throws RecognitionException {
        try {
            // InternalMyDsl.g:361:1: ( ruleUnit EOF )
            // InternalMyDsl.g:362:1: ruleUnit EOF
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
    // InternalMyDsl.g:369:1: ruleUnit : ( ( rule__Unit__Alternatives ) ) ;
    public final void ruleUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:373:2: ( ( ( rule__Unit__Alternatives ) ) )
            // InternalMyDsl.g:374:2: ( ( rule__Unit__Alternatives ) )
            {
            // InternalMyDsl.g:374:2: ( ( rule__Unit__Alternatives ) )
            // InternalMyDsl.g:375:3: ( rule__Unit__Alternatives )
            {
             before(grammarAccess.getUnitAccess().getAlternatives()); 
            // InternalMyDsl.g:376:3: ( rule__Unit__Alternatives )
            // InternalMyDsl.g:376:4: rule__Unit__Alternatives
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
    // InternalMyDsl.g:385:1: entryRuleEOL : ruleEOL EOF ;
    public final void entryRuleEOL() throws RecognitionException {
        try {
            // InternalMyDsl.g:386:1: ( ruleEOL EOF )
            // InternalMyDsl.g:387:1: ruleEOL EOF
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
    // InternalMyDsl.g:394:1: ruleEOL : ( ( rule__EOL__Alternatives ) ) ;
    public final void ruleEOL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:398:2: ( ( ( rule__EOL__Alternatives ) ) )
            // InternalMyDsl.g:399:2: ( ( rule__EOL__Alternatives ) )
            {
            // InternalMyDsl.g:399:2: ( ( rule__EOL__Alternatives ) )
            // InternalMyDsl.g:400:3: ( rule__EOL__Alternatives )
            {
             before(grammarAccess.getEOLAccess().getAlternatives()); 
            // InternalMyDsl.g:401:3: ( rule__EOL__Alternatives )
            // InternalMyDsl.g:401:4: rule__EOL__Alternatives
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
    // InternalMyDsl.g:409:1: rule__DifficultyLevel__NameAlternatives_0 : ( ( 'easy' ) | ( 'medium' ) | ( 'hard' ) );
    public final void rule__DifficultyLevel__NameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:413:1: ( ( 'easy' ) | ( 'medium' ) | ( 'hard' ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 16:
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
                    // InternalMyDsl.g:414:2: ( 'easy' )
                    {
                    // InternalMyDsl.g:414:2: ( 'easy' )
                    // InternalMyDsl.g:415:3: 'easy'
                    {
                     before(grammarAccess.getDifficultyLevelAccess().getNameEasyKeyword_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getDifficultyLevelAccess().getNameEasyKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:420:2: ( 'medium' )
                    {
                    // InternalMyDsl.g:420:2: ( 'medium' )
                    // InternalMyDsl.g:421:3: 'medium'
                    {
                     before(grammarAccess.getDifficultyLevelAccess().getNameMediumKeyword_0_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getDifficultyLevelAccess().getNameMediumKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:426:2: ( 'hard' )
                    {
                    // InternalMyDsl.g:426:2: ( 'hard' )
                    // InternalMyDsl.g:427:3: 'hard'
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
    // InternalMyDsl.g:436:1: rule__Ingredient__Alternatives_0 : ( ( ( rule__Ingredient__Group_0_0__0 ) ) | ( ( rule__Ingredient__Group_0_1__0 ) ) );
    public final void rule__Ingredient__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:440:1: ( ( ( rule__Ingredient__Group_0_0__0 ) ) | ( ( rule__Ingredient__Group_0_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==39) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_INGEREDIENTSTRING) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:441:2: ( ( rule__Ingredient__Group_0_0__0 ) )
                    {
                    // InternalMyDsl.g:441:2: ( ( rule__Ingredient__Group_0_0__0 ) )
                    // InternalMyDsl.g:442:3: ( rule__Ingredient__Group_0_0__0 )
                    {
                     before(grammarAccess.getIngredientAccess().getGroup_0_0()); 
                    // InternalMyDsl.g:443:3: ( rule__Ingredient__Group_0_0__0 )
                    // InternalMyDsl.g:443:4: rule__Ingredient__Group_0_0__0
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
                    // InternalMyDsl.g:447:2: ( ( rule__Ingredient__Group_0_1__0 ) )
                    {
                    // InternalMyDsl.g:447:2: ( ( rule__Ingredient__Group_0_1__0 ) )
                    // InternalMyDsl.g:448:3: ( rule__Ingredient__Group_0_1__0 )
                    {
                     before(grammarAccess.getIngredientAccess().getGroup_0_1()); 
                    // InternalMyDsl.g:449:3: ( rule__Ingredient__Group_0_1__0 )
                    // InternalMyDsl.g:449:4: rule__Ingredient__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Ingredient__Group_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIngredientAccess().getGroup_0_1()); 

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
    // InternalMyDsl.g:457:1: rule__VeganismLevel__Alternatives : ( ( 'Vegan' ) | ( 'Vegetaric' ) | ( 'Carnivorous' ) );
    public final void rule__VeganismLevel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:461:1: ( ( 'Vegan' ) | ( 'Vegetaric' ) | ( 'Carnivorous' ) )
            int alt4=3;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:462:2: ( 'Vegan' )
                    {
                    // InternalMyDsl.g:462:2: ( 'Vegan' )
                    // InternalMyDsl.g:463:3: 'Vegan'
                    {
                     before(grammarAccess.getVeganismLevelAccess().getVeganKeyword_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getVeganismLevelAccess().getVeganKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:468:2: ( 'Vegetaric' )
                    {
                    // InternalMyDsl.g:468:2: ( 'Vegetaric' )
                    // InternalMyDsl.g:469:3: 'Vegetaric'
                    {
                     before(grammarAccess.getVeganismLevelAccess().getVegetaricKeyword_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getVeganismLevelAccess().getVegetaricKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:474:2: ( 'Carnivorous' )
                    {
                    // InternalMyDsl.g:474:2: ( 'Carnivorous' )
                    // InternalMyDsl.g:475:3: 'Carnivorous'
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
    // InternalMyDsl.g:484:1: rule__Unit__Alternatives : ( ( 'ml' ) | ( 'l' ) | ( 'g' ) | ( 'kg' ) | ( 'tsp' ) | ( 'mg' ) | ( 'tbsp' ) | ( 'pcs' ) );
    public final void rule__Unit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:488:1: ( ( 'ml' ) | ( 'l' ) | ( 'g' ) | ( 'kg' ) | ( 'tsp' ) | ( 'mg' ) | ( 'tbsp' ) | ( 'pcs' ) )
            int alt5=8;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt5=1;
                }
                break;
            case 21:
                {
                alt5=2;
                }
                break;
            case 22:
                {
                alt5=3;
                }
                break;
            case 23:
                {
                alt5=4;
                }
                break;
            case 24:
                {
                alt5=5;
                }
                break;
            case 25:
                {
                alt5=6;
                }
                break;
            case 26:
                {
                alt5=7;
                }
                break;
            case 27:
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
                    // InternalMyDsl.g:489:2: ( 'ml' )
                    {
                    // InternalMyDsl.g:489:2: ( 'ml' )
                    // InternalMyDsl.g:490:3: 'ml'
                    {
                     before(grammarAccess.getUnitAccess().getMlKeyword_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getUnitAccess().getMlKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:495:2: ( 'l' )
                    {
                    // InternalMyDsl.g:495:2: ( 'l' )
                    // InternalMyDsl.g:496:3: 'l'
                    {
                     before(grammarAccess.getUnitAccess().getLKeyword_1()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getUnitAccess().getLKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:501:2: ( 'g' )
                    {
                    // InternalMyDsl.g:501:2: ( 'g' )
                    // InternalMyDsl.g:502:3: 'g'
                    {
                     before(grammarAccess.getUnitAccess().getGKeyword_2()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getUnitAccess().getGKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:507:2: ( 'kg' )
                    {
                    // InternalMyDsl.g:507:2: ( 'kg' )
                    // InternalMyDsl.g:508:3: 'kg'
                    {
                     before(grammarAccess.getUnitAccess().getKgKeyword_3()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getUnitAccess().getKgKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:513:2: ( 'tsp' )
                    {
                    // InternalMyDsl.g:513:2: ( 'tsp' )
                    // InternalMyDsl.g:514:3: 'tsp'
                    {
                     before(grammarAccess.getUnitAccess().getTspKeyword_4()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getUnitAccess().getTspKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:519:2: ( 'mg' )
                    {
                    // InternalMyDsl.g:519:2: ( 'mg' )
                    // InternalMyDsl.g:520:3: 'mg'
                    {
                     before(grammarAccess.getUnitAccess().getMgKeyword_5()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getUnitAccess().getMgKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:525:2: ( 'tbsp' )
                    {
                    // InternalMyDsl.g:525:2: ( 'tbsp' )
                    // InternalMyDsl.g:526:3: 'tbsp'
                    {
                     before(grammarAccess.getUnitAccess().getTbspKeyword_6()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getUnitAccess().getTbspKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:531:2: ( 'pcs' )
                    {
                    // InternalMyDsl.g:531:2: ( 'pcs' )
                    // InternalMyDsl.g:532:3: 'pcs'
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
    // InternalMyDsl.g:541:1: rule__EOL__Alternatives : ( ( RULE_NEWLINE ) | ( RULE_SL_COMMENT ) );
    public final void rule__EOL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:545:1: ( ( RULE_NEWLINE ) | ( RULE_SL_COMMENT ) )
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
                    // InternalMyDsl.g:546:2: ( RULE_NEWLINE )
                    {
                    // InternalMyDsl.g:546:2: ( RULE_NEWLINE )
                    // InternalMyDsl.g:547:3: RULE_NEWLINE
                    {
                     before(grammarAccess.getEOLAccess().getNEWLINETerminalRuleCall_0()); 
                    match(input,RULE_NEWLINE,FOLLOW_2); 
                     after(grammarAccess.getEOLAccess().getNEWLINETerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:552:2: ( RULE_SL_COMMENT )
                    {
                    // InternalMyDsl.g:552:2: ( RULE_SL_COMMENT )
                    // InternalMyDsl.g:553:3: RULE_SL_COMMENT
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
    // InternalMyDsl.g:562:1: rule__RecipeManager__Group__0 : rule__RecipeManager__Group__0__Impl rule__RecipeManager__Group__1 ;
    public final void rule__RecipeManager__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:1: ( rule__RecipeManager__Group__0__Impl rule__RecipeManager__Group__1 )
            // InternalMyDsl.g:567:2: rule__RecipeManager__Group__0__Impl rule__RecipeManager__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:574:1: rule__RecipeManager__Group__0__Impl : ( 'authors' ) ;
    public final void rule__RecipeManager__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:578:1: ( ( 'authors' ) )
            // InternalMyDsl.g:579:1: ( 'authors' )
            {
            // InternalMyDsl.g:579:1: ( 'authors' )
            // InternalMyDsl.g:580:2: 'authors'
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
    // InternalMyDsl.g:589:1: rule__RecipeManager__Group__1 : rule__RecipeManager__Group__1__Impl rule__RecipeManager__Group__2 ;
    public final void rule__RecipeManager__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:593:1: ( rule__RecipeManager__Group__1__Impl rule__RecipeManager__Group__2 )
            // InternalMyDsl.g:594:2: rule__RecipeManager__Group__1__Impl rule__RecipeManager__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:601:1: rule__RecipeManager__Group__1__Impl : ( ruleEOL ) ;
    public final void rule__RecipeManager__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:605:1: ( ( ruleEOL ) )
            // InternalMyDsl.g:606:1: ( ruleEOL )
            {
            // InternalMyDsl.g:606:1: ( ruleEOL )
            // InternalMyDsl.g:607:2: ruleEOL
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
    // InternalMyDsl.g:616:1: rule__RecipeManager__Group__2 : rule__RecipeManager__Group__2__Impl rule__RecipeManager__Group__3 ;
    public final void rule__RecipeManager__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:620:1: ( rule__RecipeManager__Group__2__Impl rule__RecipeManager__Group__3 )
            // InternalMyDsl.g:621:2: rule__RecipeManager__Group__2__Impl rule__RecipeManager__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:628:1: rule__RecipeManager__Group__2__Impl : ( ( rule__RecipeManager__AuthorsAssignment_2 ) ) ;
    public final void rule__RecipeManager__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:632:1: ( ( ( rule__RecipeManager__AuthorsAssignment_2 ) ) )
            // InternalMyDsl.g:633:1: ( ( rule__RecipeManager__AuthorsAssignment_2 ) )
            {
            // InternalMyDsl.g:633:1: ( ( rule__RecipeManager__AuthorsAssignment_2 ) )
            // InternalMyDsl.g:634:2: ( rule__RecipeManager__AuthorsAssignment_2 )
            {
             before(grammarAccess.getRecipeManagerAccess().getAuthorsAssignment_2()); 
            // InternalMyDsl.g:635:2: ( rule__RecipeManager__AuthorsAssignment_2 )
            // InternalMyDsl.g:635:3: rule__RecipeManager__AuthorsAssignment_2
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
    // InternalMyDsl.g:643:1: rule__RecipeManager__Group__3 : rule__RecipeManager__Group__3__Impl rule__RecipeManager__Group__4 ;
    public final void rule__RecipeManager__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:647:1: ( rule__RecipeManager__Group__3__Impl rule__RecipeManager__Group__4 )
            // InternalMyDsl.g:648:2: rule__RecipeManager__Group__3__Impl rule__RecipeManager__Group__4
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
    // InternalMyDsl.g:655:1: rule__RecipeManager__Group__3__Impl : ( ( rule__RecipeManager__AuthorsAssignment_3 )* ) ;
    public final void rule__RecipeManager__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:659:1: ( ( ( rule__RecipeManager__AuthorsAssignment_3 )* ) )
            // InternalMyDsl.g:660:1: ( ( rule__RecipeManager__AuthorsAssignment_3 )* )
            {
            // InternalMyDsl.g:660:1: ( ( rule__RecipeManager__AuthorsAssignment_3 )* )
            // InternalMyDsl.g:661:2: ( rule__RecipeManager__AuthorsAssignment_3 )*
            {
             before(grammarAccess.getRecipeManagerAccess().getAuthorsAssignment_3()); 
            // InternalMyDsl.g:662:2: ( rule__RecipeManager__AuthorsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:662:3: rule__RecipeManager__AuthorsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:670:1: rule__RecipeManager__Group__4 : rule__RecipeManager__Group__4__Impl ;
    public final void rule__RecipeManager__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:674:1: ( rule__RecipeManager__Group__4__Impl )
            // InternalMyDsl.g:675:2: rule__RecipeManager__Group__4__Impl
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
    // InternalMyDsl.g:681:1: rule__RecipeManager__Group__4__Impl : ( ( rule__RecipeManager__Group_4__0 )? ) ;
    public final void rule__RecipeManager__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:685:1: ( ( ( rule__RecipeManager__Group_4__0 )? ) )
            // InternalMyDsl.g:686:1: ( ( rule__RecipeManager__Group_4__0 )? )
            {
            // InternalMyDsl.g:686:1: ( ( rule__RecipeManager__Group_4__0 )? )
            // InternalMyDsl.g:687:2: ( rule__RecipeManager__Group_4__0 )?
            {
             before(grammarAccess.getRecipeManagerAccess().getGroup_4()); 
            // InternalMyDsl.g:688:2: ( rule__RecipeManager__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:688:3: rule__RecipeManager__Group_4__0
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
    // InternalMyDsl.g:697:1: rule__RecipeManager__Group_4__0 : rule__RecipeManager__Group_4__0__Impl rule__RecipeManager__Group_4__1 ;
    public final void rule__RecipeManager__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:701:1: ( rule__RecipeManager__Group_4__0__Impl rule__RecipeManager__Group_4__1 )
            // InternalMyDsl.g:702:2: rule__RecipeManager__Group_4__0__Impl rule__RecipeManager__Group_4__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:709:1: rule__RecipeManager__Group_4__0__Impl : ( 'recipes' ) ;
    public final void rule__RecipeManager__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:713:1: ( ( 'recipes' ) )
            // InternalMyDsl.g:714:1: ( 'recipes' )
            {
            // InternalMyDsl.g:714:1: ( 'recipes' )
            // InternalMyDsl.g:715:2: 'recipes'
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
    // InternalMyDsl.g:724:1: rule__RecipeManager__Group_4__1 : rule__RecipeManager__Group_4__1__Impl rule__RecipeManager__Group_4__2 ;
    public final void rule__RecipeManager__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:728:1: ( rule__RecipeManager__Group_4__1__Impl rule__RecipeManager__Group_4__2 )
            // InternalMyDsl.g:729:2: rule__RecipeManager__Group_4__1__Impl rule__RecipeManager__Group_4__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:736:1: rule__RecipeManager__Group_4__1__Impl : ( ruleEOL ) ;
    public final void rule__RecipeManager__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:740:1: ( ( ruleEOL ) )
            // InternalMyDsl.g:741:1: ( ruleEOL )
            {
            // InternalMyDsl.g:741:1: ( ruleEOL )
            // InternalMyDsl.g:742:2: ruleEOL
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
    // InternalMyDsl.g:751:1: rule__RecipeManager__Group_4__2 : rule__RecipeManager__Group_4__2__Impl rule__RecipeManager__Group_4__3 ;
    public final void rule__RecipeManager__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:755:1: ( rule__RecipeManager__Group_4__2__Impl rule__RecipeManager__Group_4__3 )
            // InternalMyDsl.g:756:2: rule__RecipeManager__Group_4__2__Impl rule__RecipeManager__Group_4__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:763:1: rule__RecipeManager__Group_4__2__Impl : ( ( rule__RecipeManager__RecipesAssignment_4_2 ) ) ;
    public final void rule__RecipeManager__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:767:1: ( ( ( rule__RecipeManager__RecipesAssignment_4_2 ) ) )
            // InternalMyDsl.g:768:1: ( ( rule__RecipeManager__RecipesAssignment_4_2 ) )
            {
            // InternalMyDsl.g:768:1: ( ( rule__RecipeManager__RecipesAssignment_4_2 ) )
            // InternalMyDsl.g:769:2: ( rule__RecipeManager__RecipesAssignment_4_2 )
            {
             before(grammarAccess.getRecipeManagerAccess().getRecipesAssignment_4_2()); 
            // InternalMyDsl.g:770:2: ( rule__RecipeManager__RecipesAssignment_4_2 )
            // InternalMyDsl.g:770:3: rule__RecipeManager__RecipesAssignment_4_2
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
    // InternalMyDsl.g:778:1: rule__RecipeManager__Group_4__3 : rule__RecipeManager__Group_4__3__Impl ;
    public final void rule__RecipeManager__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:782:1: ( rule__RecipeManager__Group_4__3__Impl )
            // InternalMyDsl.g:783:2: rule__RecipeManager__Group_4__3__Impl
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
    // InternalMyDsl.g:789:1: rule__RecipeManager__Group_4__3__Impl : ( ( rule__RecipeManager__RecipesAssignment_4_3 )* ) ;
    public final void rule__RecipeManager__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:793:1: ( ( ( rule__RecipeManager__RecipesAssignment_4_3 )* ) )
            // InternalMyDsl.g:794:1: ( ( rule__RecipeManager__RecipesAssignment_4_3 )* )
            {
            // InternalMyDsl.g:794:1: ( ( rule__RecipeManager__RecipesAssignment_4_3 )* )
            // InternalMyDsl.g:795:2: ( rule__RecipeManager__RecipesAssignment_4_3 )*
            {
             before(grammarAccess.getRecipeManagerAccess().getRecipesAssignment_4_3()); 
            // InternalMyDsl.g:796:2: ( rule__RecipeManager__RecipesAssignment_4_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:796:3: rule__RecipeManager__RecipesAssignment_4_3
            	    {
            	    pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:805:1: rule__Author__Group__0 : rule__Author__Group__0__Impl rule__Author__Group__1 ;
    public final void rule__Author__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:809:1: ( rule__Author__Group__0__Impl rule__Author__Group__1 )
            // InternalMyDsl.g:810:2: rule__Author__Group__0__Impl rule__Author__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:817:1: rule__Author__Group__0__Impl : ( ( rule__Author__NameAssignment_0 ) ) ;
    public final void rule__Author__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:821:1: ( ( ( rule__Author__NameAssignment_0 ) ) )
            // InternalMyDsl.g:822:1: ( ( rule__Author__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:822:1: ( ( rule__Author__NameAssignment_0 ) )
            // InternalMyDsl.g:823:2: ( rule__Author__NameAssignment_0 )
            {
             before(grammarAccess.getAuthorAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:824:2: ( rule__Author__NameAssignment_0 )
            // InternalMyDsl.g:824:3: rule__Author__NameAssignment_0
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
    // InternalMyDsl.g:832:1: rule__Author__Group__1 : rule__Author__Group__1__Impl ;
    public final void rule__Author__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:836:1: ( rule__Author__Group__1__Impl )
            // InternalMyDsl.g:837:2: rule__Author__Group__1__Impl
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
    // InternalMyDsl.g:843:1: rule__Author__Group__1__Impl : ( ( rule__Author__EmailAssignment_1 ) ) ;
    public final void rule__Author__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:847:1: ( ( ( rule__Author__EmailAssignment_1 ) ) )
            // InternalMyDsl.g:848:1: ( ( rule__Author__EmailAssignment_1 ) )
            {
            // InternalMyDsl.g:848:1: ( ( rule__Author__EmailAssignment_1 ) )
            // InternalMyDsl.g:849:2: ( rule__Author__EmailAssignment_1 )
            {
             before(grammarAccess.getAuthorAccess().getEmailAssignment_1()); 
            // InternalMyDsl.g:850:2: ( rule__Author__EmailAssignment_1 )
            // InternalMyDsl.g:850:3: rule__Author__EmailAssignment_1
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


    // $ANTLR start "rule__Recipe__Group__0"
    // InternalMyDsl.g:859:1: rule__Recipe__Group__0 : rule__Recipe__Group__0__Impl rule__Recipe__Group__1 ;
    public final void rule__Recipe__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:863:1: ( rule__Recipe__Group__0__Impl rule__Recipe__Group__1 )
            // InternalMyDsl.g:864:2: rule__Recipe__Group__0__Impl rule__Recipe__Group__1
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
    // InternalMyDsl.g:871:1: rule__Recipe__Group__0__Impl : ( ( rule__Recipe__NameAssignment_0 ) ) ;
    public final void rule__Recipe__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:875:1: ( ( ( rule__Recipe__NameAssignment_0 ) ) )
            // InternalMyDsl.g:876:1: ( ( rule__Recipe__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:876:1: ( ( rule__Recipe__NameAssignment_0 ) )
            // InternalMyDsl.g:877:2: ( rule__Recipe__NameAssignment_0 )
            {
             before(grammarAccess.getRecipeAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:878:2: ( rule__Recipe__NameAssignment_0 )
            // InternalMyDsl.g:878:3: rule__Recipe__NameAssignment_0
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
    // InternalMyDsl.g:886:1: rule__Recipe__Group__1 : rule__Recipe__Group__1__Impl rule__Recipe__Group__2 ;
    public final void rule__Recipe__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:890:1: ( rule__Recipe__Group__1__Impl rule__Recipe__Group__2 )
            // InternalMyDsl.g:891:2: rule__Recipe__Group__1__Impl rule__Recipe__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:898:1: rule__Recipe__Group__1__Impl : ( 'from' ) ;
    public final void rule__Recipe__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:902:1: ( ( 'from' ) )
            // InternalMyDsl.g:903:1: ( 'from' )
            {
            // InternalMyDsl.g:903:1: ( 'from' )
            // InternalMyDsl.g:904:2: 'from'
            {
             before(grammarAccess.getRecipeAccess().getFromKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getFromKeyword_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:913:1: rule__Recipe__Group__2 : rule__Recipe__Group__2__Impl rule__Recipe__Group__3 ;
    public final void rule__Recipe__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:917:1: ( rule__Recipe__Group__2__Impl rule__Recipe__Group__3 )
            // InternalMyDsl.g:918:2: rule__Recipe__Group__2__Impl rule__Recipe__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:925:1: rule__Recipe__Group__2__Impl : ( ( rule__Recipe__AuthorAssignment_2 ) ) ;
    public final void rule__Recipe__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:929:1: ( ( ( rule__Recipe__AuthorAssignment_2 ) ) )
            // InternalMyDsl.g:930:1: ( ( rule__Recipe__AuthorAssignment_2 ) )
            {
            // InternalMyDsl.g:930:1: ( ( rule__Recipe__AuthorAssignment_2 ) )
            // InternalMyDsl.g:931:2: ( rule__Recipe__AuthorAssignment_2 )
            {
             before(grammarAccess.getRecipeAccess().getAuthorAssignment_2()); 
            // InternalMyDsl.g:932:2: ( rule__Recipe__AuthorAssignment_2 )
            // InternalMyDsl.g:932:3: rule__Recipe__AuthorAssignment_2
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
    // InternalMyDsl.g:940:1: rule__Recipe__Group__3 : rule__Recipe__Group__3__Impl rule__Recipe__Group__4 ;
    public final void rule__Recipe__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:944:1: ( rule__Recipe__Group__3__Impl rule__Recipe__Group__4 )
            // InternalMyDsl.g:945:2: rule__Recipe__Group__3__Impl rule__Recipe__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:952:1: rule__Recipe__Group__3__Impl : ( ',' ) ;
    public final void rule__Recipe__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:956:1: ( ( ',' ) )
            // InternalMyDsl.g:957:1: ( ',' )
            {
            // InternalMyDsl.g:957:1: ( ',' )
            // InternalMyDsl.g:958:2: ','
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
    // InternalMyDsl.g:967:1: rule__Recipe__Group__4 : rule__Recipe__Group__4__Impl rule__Recipe__Group__5 ;
    public final void rule__Recipe__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:971:1: ( rule__Recipe__Group__4__Impl rule__Recipe__Group__5 )
            // InternalMyDsl.g:972:2: rule__Recipe__Group__4__Impl rule__Recipe__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:979:1: rule__Recipe__Group__4__Impl : ( ( rule__Recipe__VeganAssignment_4 ) ) ;
    public final void rule__Recipe__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:983:1: ( ( ( rule__Recipe__VeganAssignment_4 ) ) )
            // InternalMyDsl.g:984:1: ( ( rule__Recipe__VeganAssignment_4 ) )
            {
            // InternalMyDsl.g:984:1: ( ( rule__Recipe__VeganAssignment_4 ) )
            // InternalMyDsl.g:985:2: ( rule__Recipe__VeganAssignment_4 )
            {
             before(grammarAccess.getRecipeAccess().getVeganAssignment_4()); 
            // InternalMyDsl.g:986:2: ( rule__Recipe__VeganAssignment_4 )
            // InternalMyDsl.g:986:3: rule__Recipe__VeganAssignment_4
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
    // InternalMyDsl.g:994:1: rule__Recipe__Group__5 : rule__Recipe__Group__5__Impl rule__Recipe__Group__6 ;
    public final void rule__Recipe__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:998:1: ( rule__Recipe__Group__5__Impl rule__Recipe__Group__6 )
            // InternalMyDsl.g:999:2: rule__Recipe__Group__5__Impl rule__Recipe__Group__6
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
    // InternalMyDsl.g:1006:1: rule__Recipe__Group__5__Impl : ( ',' ) ;
    public final void rule__Recipe__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1010:1: ( ( ',' ) )
            // InternalMyDsl.g:1011:1: ( ',' )
            {
            // InternalMyDsl.g:1011:1: ( ',' )
            // InternalMyDsl.g:1012:2: ','
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
    // InternalMyDsl.g:1021:1: rule__Recipe__Group__6 : rule__Recipe__Group__6__Impl rule__Recipe__Group__7 ;
    public final void rule__Recipe__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1025:1: ( rule__Recipe__Group__6__Impl rule__Recipe__Group__7 )
            // InternalMyDsl.g:1026:2: rule__Recipe__Group__6__Impl rule__Recipe__Group__7
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:1033:1: rule__Recipe__Group__6__Impl : ( ( rule__Recipe__DurationAssignment_6 ) ) ;
    public final void rule__Recipe__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1037:1: ( ( ( rule__Recipe__DurationAssignment_6 ) ) )
            // InternalMyDsl.g:1038:1: ( ( rule__Recipe__DurationAssignment_6 ) )
            {
            // InternalMyDsl.g:1038:1: ( ( rule__Recipe__DurationAssignment_6 ) )
            // InternalMyDsl.g:1039:2: ( rule__Recipe__DurationAssignment_6 )
            {
             before(grammarAccess.getRecipeAccess().getDurationAssignment_6()); 
            // InternalMyDsl.g:1040:2: ( rule__Recipe__DurationAssignment_6 )
            // InternalMyDsl.g:1040:3: rule__Recipe__DurationAssignment_6
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
    // InternalMyDsl.g:1048:1: rule__Recipe__Group__7 : rule__Recipe__Group__7__Impl rule__Recipe__Group__8 ;
    public final void rule__Recipe__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1052:1: ( rule__Recipe__Group__7__Impl rule__Recipe__Group__8 )
            // InternalMyDsl.g:1053:2: rule__Recipe__Group__7__Impl rule__Recipe__Group__8
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:1060:1: rule__Recipe__Group__7__Impl : ( 'min' ) ;
    public final void rule__Recipe__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1064:1: ( ( 'min' ) )
            // InternalMyDsl.g:1065:1: ( 'min' )
            {
            // InternalMyDsl.g:1065:1: ( 'min' )
            // InternalMyDsl.g:1066:2: 'min'
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
    // InternalMyDsl.g:1075:1: rule__Recipe__Group__8 : rule__Recipe__Group__8__Impl rule__Recipe__Group__9 ;
    public final void rule__Recipe__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1079:1: ( rule__Recipe__Group__8__Impl rule__Recipe__Group__9 )
            // InternalMyDsl.g:1080:2: rule__Recipe__Group__8__Impl rule__Recipe__Group__9
            {
            pushFollow(FOLLOW_14);
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
    // InternalMyDsl.g:1087:1: rule__Recipe__Group__8__Impl : ( ',' ) ;
    public final void rule__Recipe__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1091:1: ( ( ',' ) )
            // InternalMyDsl.g:1092:1: ( ',' )
            {
            // InternalMyDsl.g:1092:1: ( ',' )
            // InternalMyDsl.g:1093:2: ','
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
    // InternalMyDsl.g:1102:1: rule__Recipe__Group__9 : rule__Recipe__Group__9__Impl rule__Recipe__Group__10 ;
    public final void rule__Recipe__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1106:1: ( rule__Recipe__Group__9__Impl rule__Recipe__Group__10 )
            // InternalMyDsl.g:1107:2: rule__Recipe__Group__9__Impl rule__Recipe__Group__10
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:1114:1: rule__Recipe__Group__9__Impl : ( ( rule__Recipe__DifficultyAssignment_9 ) ) ;
    public final void rule__Recipe__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1118:1: ( ( ( rule__Recipe__DifficultyAssignment_9 ) ) )
            // InternalMyDsl.g:1119:1: ( ( rule__Recipe__DifficultyAssignment_9 ) )
            {
            // InternalMyDsl.g:1119:1: ( ( rule__Recipe__DifficultyAssignment_9 ) )
            // InternalMyDsl.g:1120:2: ( rule__Recipe__DifficultyAssignment_9 )
            {
             before(grammarAccess.getRecipeAccess().getDifficultyAssignment_9()); 
            // InternalMyDsl.g:1121:2: ( rule__Recipe__DifficultyAssignment_9 )
            // InternalMyDsl.g:1121:3: rule__Recipe__DifficultyAssignment_9
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
    // InternalMyDsl.g:1129:1: rule__Recipe__Group__10 : rule__Recipe__Group__10__Impl rule__Recipe__Group__11 ;
    public final void rule__Recipe__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1133:1: ( rule__Recipe__Group__10__Impl rule__Recipe__Group__11 )
            // InternalMyDsl.g:1134:2: rule__Recipe__Group__10__Impl rule__Recipe__Group__11
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:1141:1: rule__Recipe__Group__10__Impl : ( ruleEOL ) ;
    public final void rule__Recipe__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1145:1: ( ( ruleEOL ) )
            // InternalMyDsl.g:1146:1: ( ruleEOL )
            {
            // InternalMyDsl.g:1146:1: ( ruleEOL )
            // InternalMyDsl.g:1147:2: ruleEOL
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
    // InternalMyDsl.g:1156:1: rule__Recipe__Group__11 : rule__Recipe__Group__11__Impl rule__Recipe__Group__12 ;
    public final void rule__Recipe__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1160:1: ( rule__Recipe__Group__11__Impl rule__Recipe__Group__12 )
            // InternalMyDsl.g:1161:2: rule__Recipe__Group__11__Impl rule__Recipe__Group__12
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:1168:1: rule__Recipe__Group__11__Impl : ( ( rule__Recipe__Group_11__0 )? ) ;
    public final void rule__Recipe__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1172:1: ( ( ( rule__Recipe__Group_11__0 )? ) )
            // InternalMyDsl.g:1173:1: ( ( rule__Recipe__Group_11__0 )? )
            {
            // InternalMyDsl.g:1173:1: ( ( rule__Recipe__Group_11__0 )? )
            // InternalMyDsl.g:1174:2: ( rule__Recipe__Group_11__0 )?
            {
             before(grammarAccess.getRecipeAccess().getGroup_11()); 
            // InternalMyDsl.g:1175:2: ( rule__Recipe__Group_11__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==36) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1175:3: rule__Recipe__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Recipe__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRecipeAccess().getGroup_11()); 

            }


            }

        }
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
    // InternalMyDsl.g:1183:1: rule__Recipe__Group__12 : rule__Recipe__Group__12__Impl rule__Recipe__Group__13 ;
    public final void rule__Recipe__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1187:1: ( rule__Recipe__Group__12__Impl rule__Recipe__Group__13 )
            // InternalMyDsl.g:1188:2: rule__Recipe__Group__12__Impl rule__Recipe__Group__13
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:1195:1: rule__Recipe__Group__12__Impl : ( 'Food Categories' ) ;
    public final void rule__Recipe__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1199:1: ( ( 'Food Categories' ) )
            // InternalMyDsl.g:1200:1: ( 'Food Categories' )
            {
            // InternalMyDsl.g:1200:1: ( 'Food Categories' )
            // InternalMyDsl.g:1201:2: 'Food Categories'
            {
             before(grammarAccess.getRecipeAccess().getFoodCategoriesKeyword_12()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getFoodCategoriesKeyword_12()); 

            }


            }

        }
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
    // InternalMyDsl.g:1210:1: rule__Recipe__Group__13 : rule__Recipe__Group__13__Impl rule__Recipe__Group__14 ;
    public final void rule__Recipe__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1214:1: ( rule__Recipe__Group__13__Impl rule__Recipe__Group__14 )
            // InternalMyDsl.g:1215:2: rule__Recipe__Group__13__Impl rule__Recipe__Group__14
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:1222:1: rule__Recipe__Group__13__Impl : ( ruleEOL ) ;
    public final void rule__Recipe__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1226:1: ( ( ruleEOL ) )
            // InternalMyDsl.g:1227:1: ( ruleEOL )
            {
            // InternalMyDsl.g:1227:1: ( ruleEOL )
            // InternalMyDsl.g:1228:2: ruleEOL
            {
             before(grammarAccess.getRecipeAccess().getEOLParserRuleCall_13()); 
            pushFollow(FOLLOW_2);
            ruleEOL();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getEOLParserRuleCall_13()); 

            }


            }

        }
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
    // InternalMyDsl.g:1237:1: rule__Recipe__Group__14 : rule__Recipe__Group__14__Impl rule__Recipe__Group__15 ;
    public final void rule__Recipe__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1241:1: ( rule__Recipe__Group__14__Impl rule__Recipe__Group__15 )
            // InternalMyDsl.g:1242:2: rule__Recipe__Group__14__Impl rule__Recipe__Group__15
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
    // InternalMyDsl.g:1249:1: rule__Recipe__Group__14__Impl : ( ( rule__Recipe__FoodCategoryAssignment_14 ) ) ;
    public final void rule__Recipe__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1253:1: ( ( ( rule__Recipe__FoodCategoryAssignment_14 ) ) )
            // InternalMyDsl.g:1254:1: ( ( rule__Recipe__FoodCategoryAssignment_14 ) )
            {
            // InternalMyDsl.g:1254:1: ( ( rule__Recipe__FoodCategoryAssignment_14 ) )
            // InternalMyDsl.g:1255:2: ( rule__Recipe__FoodCategoryAssignment_14 )
            {
             before(grammarAccess.getRecipeAccess().getFoodCategoryAssignment_14()); 
            // InternalMyDsl.g:1256:2: ( rule__Recipe__FoodCategoryAssignment_14 )
            // InternalMyDsl.g:1256:3: rule__Recipe__FoodCategoryAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__FoodCategoryAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getFoodCategoryAssignment_14()); 

            }


            }

        }
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
    // InternalMyDsl.g:1264:1: rule__Recipe__Group__15 : rule__Recipe__Group__15__Impl rule__Recipe__Group__16 ;
    public final void rule__Recipe__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1268:1: ( rule__Recipe__Group__15__Impl rule__Recipe__Group__16 )
            // InternalMyDsl.g:1269:2: rule__Recipe__Group__15__Impl rule__Recipe__Group__16
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
    // InternalMyDsl.g:1276:1: rule__Recipe__Group__15__Impl : ( ( rule__Recipe__FoodCategoryAssignment_15 )* ) ;
    public final void rule__Recipe__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1280:1: ( ( ( rule__Recipe__FoodCategoryAssignment_15 )* ) )
            // InternalMyDsl.g:1281:1: ( ( rule__Recipe__FoodCategoryAssignment_15 )* )
            {
            // InternalMyDsl.g:1281:1: ( ( rule__Recipe__FoodCategoryAssignment_15 )* )
            // InternalMyDsl.g:1282:2: ( rule__Recipe__FoodCategoryAssignment_15 )*
            {
             before(grammarAccess.getRecipeAccess().getFoodCategoryAssignment_15()); 
            // InternalMyDsl.g:1283:2: ( rule__Recipe__FoodCategoryAssignment_15 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_QSTRING) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1283:3: rule__Recipe__FoodCategoryAssignment_15
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Recipe__FoodCategoryAssignment_15();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getRecipeAccess().getFoodCategoryAssignment_15()); 

            }


            }

        }
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
    // InternalMyDsl.g:1291:1: rule__Recipe__Group__16 : rule__Recipe__Group__16__Impl rule__Recipe__Group__17 ;
    public final void rule__Recipe__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1295:1: ( rule__Recipe__Group__16__Impl rule__Recipe__Group__17 )
            // InternalMyDsl.g:1296:2: rule__Recipe__Group__16__Impl rule__Recipe__Group__17
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:1303:1: rule__Recipe__Group__16__Impl : ( 'Ingredients' ) ;
    public final void rule__Recipe__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1307:1: ( ( 'Ingredients' ) )
            // InternalMyDsl.g:1308:1: ( 'Ingredients' )
            {
            // InternalMyDsl.g:1308:1: ( 'Ingredients' )
            // InternalMyDsl.g:1309:2: 'Ingredients'
            {
             before(grammarAccess.getRecipeAccess().getIngredientsKeyword_16()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getIngredientsKeyword_16()); 

            }


            }

        }
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
    // InternalMyDsl.g:1318:1: rule__Recipe__Group__17 : rule__Recipe__Group__17__Impl rule__Recipe__Group__18 ;
    public final void rule__Recipe__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1322:1: ( rule__Recipe__Group__17__Impl rule__Recipe__Group__18 )
            // InternalMyDsl.g:1323:2: rule__Recipe__Group__17__Impl rule__Recipe__Group__18
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:1330:1: rule__Recipe__Group__17__Impl : ( ruleEOL ) ;
    public final void rule__Recipe__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1334:1: ( ( ruleEOL ) )
            // InternalMyDsl.g:1335:1: ( ruleEOL )
            {
            // InternalMyDsl.g:1335:1: ( ruleEOL )
            // InternalMyDsl.g:1336:2: ruleEOL
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
    // InternalMyDsl.g:1345:1: rule__Recipe__Group__18 : rule__Recipe__Group__18__Impl rule__Recipe__Group__19 ;
    public final void rule__Recipe__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1349:1: ( rule__Recipe__Group__18__Impl rule__Recipe__Group__19 )
            // InternalMyDsl.g:1350:2: rule__Recipe__Group__18__Impl rule__Recipe__Group__19
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:1357:1: rule__Recipe__Group__18__Impl : ( ( rule__Recipe__IngredientAssignment_18 ) ) ;
    public final void rule__Recipe__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1361:1: ( ( ( rule__Recipe__IngredientAssignment_18 ) ) )
            // InternalMyDsl.g:1362:1: ( ( rule__Recipe__IngredientAssignment_18 ) )
            {
            // InternalMyDsl.g:1362:1: ( ( rule__Recipe__IngredientAssignment_18 ) )
            // InternalMyDsl.g:1363:2: ( rule__Recipe__IngredientAssignment_18 )
            {
             before(grammarAccess.getRecipeAccess().getIngredientAssignment_18()); 
            // InternalMyDsl.g:1364:2: ( rule__Recipe__IngredientAssignment_18 )
            // InternalMyDsl.g:1364:3: rule__Recipe__IngredientAssignment_18
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__IngredientAssignment_18();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getIngredientAssignment_18()); 

            }


            }

        }
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
    // InternalMyDsl.g:1372:1: rule__Recipe__Group__19 : rule__Recipe__Group__19__Impl rule__Recipe__Group__20 ;
    public final void rule__Recipe__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1376:1: ( rule__Recipe__Group__19__Impl rule__Recipe__Group__20 )
            // InternalMyDsl.g:1377:2: rule__Recipe__Group__19__Impl rule__Recipe__Group__20
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:1384:1: rule__Recipe__Group__19__Impl : ( ( rule__Recipe__IngredientAssignment_19 )* ) ;
    public final void rule__Recipe__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1388:1: ( ( ( rule__Recipe__IngredientAssignment_19 )* ) )
            // InternalMyDsl.g:1389:1: ( ( rule__Recipe__IngredientAssignment_19 )* )
            {
            // InternalMyDsl.g:1389:1: ( ( rule__Recipe__IngredientAssignment_19 )* )
            // InternalMyDsl.g:1390:2: ( rule__Recipe__IngredientAssignment_19 )*
            {
             before(grammarAccess.getRecipeAccess().getIngredientAssignment_19()); 
            // InternalMyDsl.g:1391:2: ( rule__Recipe__IngredientAssignment_19 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_INGEREDIENTSTRING||LA12_0==39) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:1391:3: rule__Recipe__IngredientAssignment_19
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Recipe__IngredientAssignment_19();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getRecipeAccess().getIngredientAssignment_19()); 

            }


            }

        }
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
    // InternalMyDsl.g:1399:1: rule__Recipe__Group__20 : rule__Recipe__Group__20__Impl rule__Recipe__Group__21 ;
    public final void rule__Recipe__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1403:1: ( rule__Recipe__Group__20__Impl rule__Recipe__Group__21 )
            // InternalMyDsl.g:1404:2: rule__Recipe__Group__20__Impl rule__Recipe__Group__21
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:1411:1: rule__Recipe__Group__20__Impl : ( 'Preparation' ) ;
    public final void rule__Recipe__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1415:1: ( ( 'Preparation' ) )
            // InternalMyDsl.g:1416:1: ( 'Preparation' )
            {
            // InternalMyDsl.g:1416:1: ( 'Preparation' )
            // InternalMyDsl.g:1417:2: 'Preparation'
            {
             before(grammarAccess.getRecipeAccess().getPreparationKeyword_20()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getPreparationKeyword_20()); 

            }


            }

        }
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
    // InternalMyDsl.g:1426:1: rule__Recipe__Group__21 : rule__Recipe__Group__21__Impl rule__Recipe__Group__22 ;
    public final void rule__Recipe__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1430:1: ( rule__Recipe__Group__21__Impl rule__Recipe__Group__22 )
            // InternalMyDsl.g:1431:2: rule__Recipe__Group__21__Impl rule__Recipe__Group__22
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:1438:1: rule__Recipe__Group__21__Impl : ( ruleEOL ) ;
    public final void rule__Recipe__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1442:1: ( ( ruleEOL ) )
            // InternalMyDsl.g:1443:1: ( ruleEOL )
            {
            // InternalMyDsl.g:1443:1: ( ruleEOL )
            // InternalMyDsl.g:1444:2: ruleEOL
            {
             before(grammarAccess.getRecipeAccess().getEOLParserRuleCall_21()); 
            pushFollow(FOLLOW_2);
            ruleEOL();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getEOLParserRuleCall_21()); 

            }


            }

        }
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
    // InternalMyDsl.g:1453:1: rule__Recipe__Group__22 : rule__Recipe__Group__22__Impl rule__Recipe__Group__23 ;
    public final void rule__Recipe__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1457:1: ( rule__Recipe__Group__22__Impl rule__Recipe__Group__23 )
            // InternalMyDsl.g:1458:2: rule__Recipe__Group__22__Impl rule__Recipe__Group__23
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
    // InternalMyDsl.g:1465:1: rule__Recipe__Group__22__Impl : ( ( rule__Recipe__PreparationAssignment_22 ) ) ;
    public final void rule__Recipe__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1469:1: ( ( ( rule__Recipe__PreparationAssignment_22 ) ) )
            // InternalMyDsl.g:1470:1: ( ( rule__Recipe__PreparationAssignment_22 ) )
            {
            // InternalMyDsl.g:1470:1: ( ( rule__Recipe__PreparationAssignment_22 ) )
            // InternalMyDsl.g:1471:2: ( rule__Recipe__PreparationAssignment_22 )
            {
             before(grammarAccess.getRecipeAccess().getPreparationAssignment_22()); 
            // InternalMyDsl.g:1472:2: ( rule__Recipe__PreparationAssignment_22 )
            // InternalMyDsl.g:1472:3: rule__Recipe__PreparationAssignment_22
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__PreparationAssignment_22();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getPreparationAssignment_22()); 

            }


            }

        }
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
    // InternalMyDsl.g:1480:1: rule__Recipe__Group__23 : rule__Recipe__Group__23__Impl rule__Recipe__Group__24 ;
    public final void rule__Recipe__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1484:1: ( rule__Recipe__Group__23__Impl rule__Recipe__Group__24 )
            // InternalMyDsl.g:1485:2: rule__Recipe__Group__23__Impl rule__Recipe__Group__24
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
    // InternalMyDsl.g:1492:1: rule__Recipe__Group__23__Impl : ( ( rule__Recipe__Group_23__0 )? ) ;
    public final void rule__Recipe__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1496:1: ( ( ( rule__Recipe__Group_23__0 )? ) )
            // InternalMyDsl.g:1497:1: ( ( rule__Recipe__Group_23__0 )? )
            {
            // InternalMyDsl.g:1497:1: ( ( rule__Recipe__Group_23__0 )? )
            // InternalMyDsl.g:1498:2: ( rule__Recipe__Group_23__0 )?
            {
             before(grammarAccess.getRecipeAccess().getGroup_23()); 
            // InternalMyDsl.g:1499:2: ( rule__Recipe__Group_23__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==37) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1499:3: rule__Recipe__Group_23__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Recipe__Group_23__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRecipeAccess().getGroup_23()); 

            }


            }

        }
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
    // InternalMyDsl.g:1507:1: rule__Recipe__Group__24 : rule__Recipe__Group__24__Impl ;
    public final void rule__Recipe__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1511:1: ( rule__Recipe__Group__24__Impl )
            // InternalMyDsl.g:1512:2: rule__Recipe__Group__24__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__Group__24__Impl();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:1518:1: rule__Recipe__Group__24__Impl : ( ( rule__Recipe__Group_24__0 )? ) ;
    public final void rule__Recipe__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1522:1: ( ( ( rule__Recipe__Group_24__0 )? ) )
            // InternalMyDsl.g:1523:1: ( ( rule__Recipe__Group_24__0 )? )
            {
            // InternalMyDsl.g:1523:1: ( ( rule__Recipe__Group_24__0 )? )
            // InternalMyDsl.g:1524:2: ( rule__Recipe__Group_24__0 )?
            {
             before(grammarAccess.getRecipeAccess().getGroup_24()); 
            // InternalMyDsl.g:1525:2: ( rule__Recipe__Group_24__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==38) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1525:3: rule__Recipe__Group_24__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Recipe__Group_24__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRecipeAccess().getGroup_24()); 

            }


            }

        }
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


    // $ANTLR start "rule__Recipe__Group_11__0"
    // InternalMyDsl.g:1534:1: rule__Recipe__Group_11__0 : rule__Recipe__Group_11__0__Impl rule__Recipe__Group_11__1 ;
    public final void rule__Recipe__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1538:1: ( rule__Recipe__Group_11__0__Impl rule__Recipe__Group_11__1 )
            // InternalMyDsl.g:1539:2: rule__Recipe__Group_11__0__Impl rule__Recipe__Group_11__1
            {
            pushFollow(FOLLOW_4);
            rule__Recipe__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_11__0"


    // $ANTLR start "rule__Recipe__Group_11__0__Impl"
    // InternalMyDsl.g:1546:1: rule__Recipe__Group_11__0__Impl : ( 'Kitchen Utensils' ) ;
    public final void rule__Recipe__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1550:1: ( ( 'Kitchen Utensils' ) )
            // InternalMyDsl.g:1551:1: ( 'Kitchen Utensils' )
            {
            // InternalMyDsl.g:1551:1: ( 'Kitchen Utensils' )
            // InternalMyDsl.g:1552:2: 'Kitchen Utensils'
            {
             before(grammarAccess.getRecipeAccess().getKitchenUtensilsKeyword_11_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getKitchenUtensilsKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_11__0__Impl"


    // $ANTLR start "rule__Recipe__Group_11__1"
    // InternalMyDsl.g:1561:1: rule__Recipe__Group_11__1 : rule__Recipe__Group_11__1__Impl rule__Recipe__Group_11__2 ;
    public final void rule__Recipe__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1565:1: ( rule__Recipe__Group_11__1__Impl rule__Recipe__Group_11__2 )
            // InternalMyDsl.g:1566:2: rule__Recipe__Group_11__1__Impl rule__Recipe__Group_11__2
            {
            pushFollow(FOLLOW_8);
            rule__Recipe__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group_11__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_11__1"


    // $ANTLR start "rule__Recipe__Group_11__1__Impl"
    // InternalMyDsl.g:1573:1: rule__Recipe__Group_11__1__Impl : ( ruleEOL ) ;
    public final void rule__Recipe__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1577:1: ( ( ruleEOL ) )
            // InternalMyDsl.g:1578:1: ( ruleEOL )
            {
            // InternalMyDsl.g:1578:1: ( ruleEOL )
            // InternalMyDsl.g:1579:2: ruleEOL
            {
             before(grammarAccess.getRecipeAccess().getEOLParserRuleCall_11_1()); 
            pushFollow(FOLLOW_2);
            ruleEOL();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getEOLParserRuleCall_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_11__1__Impl"


    // $ANTLR start "rule__Recipe__Group_11__2"
    // InternalMyDsl.g:1588:1: rule__Recipe__Group_11__2 : rule__Recipe__Group_11__2__Impl rule__Recipe__Group_11__3 ;
    public final void rule__Recipe__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1592:1: ( rule__Recipe__Group_11__2__Impl rule__Recipe__Group_11__3 )
            // InternalMyDsl.g:1593:2: rule__Recipe__Group_11__2__Impl rule__Recipe__Group_11__3
            {
            pushFollow(FOLLOW_8);
            rule__Recipe__Group_11__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group_11__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_11__2"


    // $ANTLR start "rule__Recipe__Group_11__2__Impl"
    // InternalMyDsl.g:1600:1: rule__Recipe__Group_11__2__Impl : ( ( rule__Recipe__KitchenUtensilsAssignment_11_2 ) ) ;
    public final void rule__Recipe__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1604:1: ( ( ( rule__Recipe__KitchenUtensilsAssignment_11_2 ) ) )
            // InternalMyDsl.g:1605:1: ( ( rule__Recipe__KitchenUtensilsAssignment_11_2 ) )
            {
            // InternalMyDsl.g:1605:1: ( ( rule__Recipe__KitchenUtensilsAssignment_11_2 ) )
            // InternalMyDsl.g:1606:2: ( rule__Recipe__KitchenUtensilsAssignment_11_2 )
            {
             before(grammarAccess.getRecipeAccess().getKitchenUtensilsAssignment_11_2()); 
            // InternalMyDsl.g:1607:2: ( rule__Recipe__KitchenUtensilsAssignment_11_2 )
            // InternalMyDsl.g:1607:3: rule__Recipe__KitchenUtensilsAssignment_11_2
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__KitchenUtensilsAssignment_11_2();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getKitchenUtensilsAssignment_11_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_11__2__Impl"


    // $ANTLR start "rule__Recipe__Group_11__3"
    // InternalMyDsl.g:1615:1: rule__Recipe__Group_11__3 : rule__Recipe__Group_11__3__Impl ;
    public final void rule__Recipe__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1619:1: ( rule__Recipe__Group_11__3__Impl )
            // InternalMyDsl.g:1620:2: rule__Recipe__Group_11__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__Group_11__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_11__3"


    // $ANTLR start "rule__Recipe__Group_11__3__Impl"
    // InternalMyDsl.g:1626:1: rule__Recipe__Group_11__3__Impl : ( ( rule__Recipe__KitchenUtensilsAssignment_11_3 )* ) ;
    public final void rule__Recipe__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1630:1: ( ( ( rule__Recipe__KitchenUtensilsAssignment_11_3 )* ) )
            // InternalMyDsl.g:1631:1: ( ( rule__Recipe__KitchenUtensilsAssignment_11_3 )* )
            {
            // InternalMyDsl.g:1631:1: ( ( rule__Recipe__KitchenUtensilsAssignment_11_3 )* )
            // InternalMyDsl.g:1632:2: ( rule__Recipe__KitchenUtensilsAssignment_11_3 )*
            {
             before(grammarAccess.getRecipeAccess().getKitchenUtensilsAssignment_11_3()); 
            // InternalMyDsl.g:1633:2: ( rule__Recipe__KitchenUtensilsAssignment_11_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_QSTRING) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:1633:3: rule__Recipe__KitchenUtensilsAssignment_11_3
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Recipe__KitchenUtensilsAssignment_11_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getRecipeAccess().getKitchenUtensilsAssignment_11_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_11__3__Impl"


    // $ANTLR start "rule__Recipe__Group_23__0"
    // InternalMyDsl.g:1642:1: rule__Recipe__Group_23__0 : rule__Recipe__Group_23__0__Impl rule__Recipe__Group_23__1 ;
    public final void rule__Recipe__Group_23__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1646:1: ( rule__Recipe__Group_23__0__Impl rule__Recipe__Group_23__1 )
            // InternalMyDsl.g:1647:2: rule__Recipe__Group_23__0__Impl rule__Recipe__Group_23__1
            {
            pushFollow(FOLLOW_4);
            rule__Recipe__Group_23__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group_23__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_23__0"


    // $ANTLR start "rule__Recipe__Group_23__0__Impl"
    // InternalMyDsl.g:1654:1: rule__Recipe__Group_23__0__Impl : ( 'Video' ) ;
    public final void rule__Recipe__Group_23__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1658:1: ( ( 'Video' ) )
            // InternalMyDsl.g:1659:1: ( 'Video' )
            {
            // InternalMyDsl.g:1659:1: ( 'Video' )
            // InternalMyDsl.g:1660:2: 'Video'
            {
             before(grammarAccess.getRecipeAccess().getVideoKeyword_23_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getVideoKeyword_23_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_23__0__Impl"


    // $ANTLR start "rule__Recipe__Group_23__1"
    // InternalMyDsl.g:1669:1: rule__Recipe__Group_23__1 : rule__Recipe__Group_23__1__Impl rule__Recipe__Group_23__2 ;
    public final void rule__Recipe__Group_23__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1673:1: ( rule__Recipe__Group_23__1__Impl rule__Recipe__Group_23__2 )
            // InternalMyDsl.g:1674:2: rule__Recipe__Group_23__1__Impl rule__Recipe__Group_23__2
            {
            pushFollow(FOLLOW_22);
            rule__Recipe__Group_23__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group_23__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_23__1"


    // $ANTLR start "rule__Recipe__Group_23__1__Impl"
    // InternalMyDsl.g:1681:1: rule__Recipe__Group_23__1__Impl : ( ruleEOL ) ;
    public final void rule__Recipe__Group_23__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1685:1: ( ( ruleEOL ) )
            // InternalMyDsl.g:1686:1: ( ruleEOL )
            {
            // InternalMyDsl.g:1686:1: ( ruleEOL )
            // InternalMyDsl.g:1687:2: ruleEOL
            {
             before(grammarAccess.getRecipeAccess().getEOLParserRuleCall_23_1()); 
            pushFollow(FOLLOW_2);
            ruleEOL();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getEOLParserRuleCall_23_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_23__1__Impl"


    // $ANTLR start "rule__Recipe__Group_23__2"
    // InternalMyDsl.g:1696:1: rule__Recipe__Group_23__2 : rule__Recipe__Group_23__2__Impl rule__Recipe__Group_23__3 ;
    public final void rule__Recipe__Group_23__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1700:1: ( rule__Recipe__Group_23__2__Impl rule__Recipe__Group_23__3 )
            // InternalMyDsl.g:1701:2: rule__Recipe__Group_23__2__Impl rule__Recipe__Group_23__3
            {
            pushFollow(FOLLOW_4);
            rule__Recipe__Group_23__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group_23__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_23__2"


    // $ANTLR start "rule__Recipe__Group_23__2__Impl"
    // InternalMyDsl.g:1708:1: rule__Recipe__Group_23__2__Impl : ( ( rule__Recipe__VideoAssignment_23_2 ) ) ;
    public final void rule__Recipe__Group_23__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1712:1: ( ( ( rule__Recipe__VideoAssignment_23_2 ) ) )
            // InternalMyDsl.g:1713:1: ( ( rule__Recipe__VideoAssignment_23_2 ) )
            {
            // InternalMyDsl.g:1713:1: ( ( rule__Recipe__VideoAssignment_23_2 ) )
            // InternalMyDsl.g:1714:2: ( rule__Recipe__VideoAssignment_23_2 )
            {
             before(grammarAccess.getRecipeAccess().getVideoAssignment_23_2()); 
            // InternalMyDsl.g:1715:2: ( rule__Recipe__VideoAssignment_23_2 )
            // InternalMyDsl.g:1715:3: rule__Recipe__VideoAssignment_23_2
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__VideoAssignment_23_2();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getVideoAssignment_23_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_23__2__Impl"


    // $ANTLR start "rule__Recipe__Group_23__3"
    // InternalMyDsl.g:1723:1: rule__Recipe__Group_23__3 : rule__Recipe__Group_23__3__Impl ;
    public final void rule__Recipe__Group_23__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1727:1: ( rule__Recipe__Group_23__3__Impl )
            // InternalMyDsl.g:1728:2: rule__Recipe__Group_23__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__Group_23__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_23__3"


    // $ANTLR start "rule__Recipe__Group_23__3__Impl"
    // InternalMyDsl.g:1734:1: rule__Recipe__Group_23__3__Impl : ( ruleEOL ) ;
    public final void rule__Recipe__Group_23__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1738:1: ( ( ruleEOL ) )
            // InternalMyDsl.g:1739:1: ( ruleEOL )
            {
            // InternalMyDsl.g:1739:1: ( ruleEOL )
            // InternalMyDsl.g:1740:2: ruleEOL
            {
             before(grammarAccess.getRecipeAccess().getEOLParserRuleCall_23_3()); 
            pushFollow(FOLLOW_2);
            ruleEOL();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getEOLParserRuleCall_23_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_23__3__Impl"


    // $ANTLR start "rule__Recipe__Group_24__0"
    // InternalMyDsl.g:1750:1: rule__Recipe__Group_24__0 : rule__Recipe__Group_24__0__Impl rule__Recipe__Group_24__1 ;
    public final void rule__Recipe__Group_24__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1754:1: ( rule__Recipe__Group_24__0__Impl rule__Recipe__Group_24__1 )
            // InternalMyDsl.g:1755:2: rule__Recipe__Group_24__0__Impl rule__Recipe__Group_24__1
            {
            pushFollow(FOLLOW_4);
            rule__Recipe__Group_24__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group_24__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_24__0"


    // $ANTLR start "rule__Recipe__Group_24__0__Impl"
    // InternalMyDsl.g:1762:1: rule__Recipe__Group_24__0__Impl : ( 'Ratings' ) ;
    public final void rule__Recipe__Group_24__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1766:1: ( ( 'Ratings' ) )
            // InternalMyDsl.g:1767:1: ( 'Ratings' )
            {
            // InternalMyDsl.g:1767:1: ( 'Ratings' )
            // InternalMyDsl.g:1768:2: 'Ratings'
            {
             before(grammarAccess.getRecipeAccess().getRatingsKeyword_24_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getRatingsKeyword_24_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_24__0__Impl"


    // $ANTLR start "rule__Recipe__Group_24__1"
    // InternalMyDsl.g:1777:1: rule__Recipe__Group_24__1 : rule__Recipe__Group_24__1__Impl rule__Recipe__Group_24__2 ;
    public final void rule__Recipe__Group_24__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1781:1: ( rule__Recipe__Group_24__1__Impl rule__Recipe__Group_24__2 )
            // InternalMyDsl.g:1782:2: rule__Recipe__Group_24__1__Impl rule__Recipe__Group_24__2
            {
            pushFollow(FOLLOW_12);
            rule__Recipe__Group_24__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group_24__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_24__1"


    // $ANTLR start "rule__Recipe__Group_24__1__Impl"
    // InternalMyDsl.g:1789:1: rule__Recipe__Group_24__1__Impl : ( ruleEOL ) ;
    public final void rule__Recipe__Group_24__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1793:1: ( ( ruleEOL ) )
            // InternalMyDsl.g:1794:1: ( ruleEOL )
            {
            // InternalMyDsl.g:1794:1: ( ruleEOL )
            // InternalMyDsl.g:1795:2: ruleEOL
            {
             before(grammarAccess.getRecipeAccess().getEOLParserRuleCall_24_1()); 
            pushFollow(FOLLOW_2);
            ruleEOL();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getEOLParserRuleCall_24_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_24__1__Impl"


    // $ANTLR start "rule__Recipe__Group_24__2"
    // InternalMyDsl.g:1804:1: rule__Recipe__Group_24__2 : rule__Recipe__Group_24__2__Impl rule__Recipe__Group_24__3 ;
    public final void rule__Recipe__Group_24__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1808:1: ( rule__Recipe__Group_24__2__Impl rule__Recipe__Group_24__3 )
            // InternalMyDsl.g:1809:2: rule__Recipe__Group_24__2__Impl rule__Recipe__Group_24__3
            {
            pushFollow(FOLLOW_12);
            rule__Recipe__Group_24__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group_24__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_24__2"


    // $ANTLR start "rule__Recipe__Group_24__2__Impl"
    // InternalMyDsl.g:1816:1: rule__Recipe__Group_24__2__Impl : ( ( rule__Recipe__RatingsAssignment_24_2 ) ) ;
    public final void rule__Recipe__Group_24__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1820:1: ( ( ( rule__Recipe__RatingsAssignment_24_2 ) ) )
            // InternalMyDsl.g:1821:1: ( ( rule__Recipe__RatingsAssignment_24_2 ) )
            {
            // InternalMyDsl.g:1821:1: ( ( rule__Recipe__RatingsAssignment_24_2 ) )
            // InternalMyDsl.g:1822:2: ( rule__Recipe__RatingsAssignment_24_2 )
            {
             before(grammarAccess.getRecipeAccess().getRatingsAssignment_24_2()); 
            // InternalMyDsl.g:1823:2: ( rule__Recipe__RatingsAssignment_24_2 )
            // InternalMyDsl.g:1823:3: rule__Recipe__RatingsAssignment_24_2
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__RatingsAssignment_24_2();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getRatingsAssignment_24_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_24__2__Impl"


    // $ANTLR start "rule__Recipe__Group_24__3"
    // InternalMyDsl.g:1831:1: rule__Recipe__Group_24__3 : rule__Recipe__Group_24__3__Impl ;
    public final void rule__Recipe__Group_24__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1835:1: ( rule__Recipe__Group_24__3__Impl )
            // InternalMyDsl.g:1836:2: rule__Recipe__Group_24__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__Group_24__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_24__3"


    // $ANTLR start "rule__Recipe__Group_24__3__Impl"
    // InternalMyDsl.g:1842:1: rule__Recipe__Group_24__3__Impl : ( ( rule__Recipe__RatingsAssignment_24_3 )* ) ;
    public final void rule__Recipe__Group_24__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1846:1: ( ( ( rule__Recipe__RatingsAssignment_24_3 )* ) )
            // InternalMyDsl.g:1847:1: ( ( rule__Recipe__RatingsAssignment_24_3 )* )
            {
            // InternalMyDsl.g:1847:1: ( ( rule__Recipe__RatingsAssignment_24_3 )* )
            // InternalMyDsl.g:1848:2: ( rule__Recipe__RatingsAssignment_24_3 )*
            {
             before(grammarAccess.getRecipeAccess().getRatingsAssignment_24_3()); 
            // InternalMyDsl.g:1849:2: ( rule__Recipe__RatingsAssignment_24_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_INT) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyDsl.g:1849:3: rule__Recipe__RatingsAssignment_24_3
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Recipe__RatingsAssignment_24_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getRecipeAccess().getRatingsAssignment_24_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_24__3__Impl"


    // $ANTLR start "rule__Ingredient__Group__0"
    // InternalMyDsl.g:1858:1: rule__Ingredient__Group__0 : rule__Ingredient__Group__0__Impl rule__Ingredient__Group__1 ;
    public final void rule__Ingredient__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1862:1: ( rule__Ingredient__Group__0__Impl rule__Ingredient__Group__1 )
            // InternalMyDsl.g:1863:2: rule__Ingredient__Group__0__Impl rule__Ingredient__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:1870:1: rule__Ingredient__Group__0__Impl : ( ( rule__Ingredient__Alternatives_0 ) ) ;
    public final void rule__Ingredient__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1874:1: ( ( ( rule__Ingredient__Alternatives_0 ) ) )
            // InternalMyDsl.g:1875:1: ( ( rule__Ingredient__Alternatives_0 ) )
            {
            // InternalMyDsl.g:1875:1: ( ( rule__Ingredient__Alternatives_0 ) )
            // InternalMyDsl.g:1876:2: ( rule__Ingredient__Alternatives_0 )
            {
             before(grammarAccess.getIngredientAccess().getAlternatives_0()); 
            // InternalMyDsl.g:1877:2: ( rule__Ingredient__Alternatives_0 )
            // InternalMyDsl.g:1877:3: rule__Ingredient__Alternatives_0
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
    // InternalMyDsl.g:1885:1: rule__Ingredient__Group__1 : rule__Ingredient__Group__1__Impl ;
    public final void rule__Ingredient__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1889:1: ( rule__Ingredient__Group__1__Impl )
            // InternalMyDsl.g:1890:2: rule__Ingredient__Group__1__Impl
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
    // InternalMyDsl.g:1896:1: rule__Ingredient__Group__1__Impl : ( ruleEOL ) ;
    public final void rule__Ingredient__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1900:1: ( ( ruleEOL ) )
            // InternalMyDsl.g:1901:1: ( ruleEOL )
            {
            // InternalMyDsl.g:1901:1: ( ruleEOL )
            // InternalMyDsl.g:1902:2: ruleEOL
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
    // InternalMyDsl.g:1912:1: rule__Ingredient__Group_0_0__0 : rule__Ingredient__Group_0_0__0__Impl rule__Ingredient__Group_0_0__1 ;
    public final void rule__Ingredient__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1916:1: ( rule__Ingredient__Group_0_0__0__Impl rule__Ingredient__Group_0_0__1 )
            // InternalMyDsl.g:1917:2: rule__Ingredient__Group_0_0__0__Impl rule__Ingredient__Group_0_0__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:1924:1: rule__Ingredient__Group_0_0__0__Impl : ( '--' ) ;
    public final void rule__Ingredient__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1928:1: ( ( '--' ) )
            // InternalMyDsl.g:1929:1: ( '--' )
            {
            // InternalMyDsl.g:1929:1: ( '--' )
            // InternalMyDsl.g:1930:2: '--'
            {
             before(grammarAccess.getIngredientAccess().getHyphenMinusHyphenMinusKeyword_0_0_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getIngredientAccess().getHyphenMinusHyphenMinusKeyword_0_0_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:1939:1: rule__Ingredient__Group_0_0__1 : rule__Ingredient__Group_0_0__1__Impl ;
    public final void rule__Ingredient__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1943:1: ( rule__Ingredient__Group_0_0__1__Impl )
            // InternalMyDsl.g:1944:2: rule__Ingredient__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__Group_0_0__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:1950:1: rule__Ingredient__Group_0_0__1__Impl : ( ( rule__Ingredient__RecipeAssignment_0_0_1 ) ) ;
    public final void rule__Ingredient__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1954:1: ( ( ( rule__Ingredient__RecipeAssignment_0_0_1 ) ) )
            // InternalMyDsl.g:1955:1: ( ( rule__Ingredient__RecipeAssignment_0_0_1 ) )
            {
            // InternalMyDsl.g:1955:1: ( ( rule__Ingredient__RecipeAssignment_0_0_1 ) )
            // InternalMyDsl.g:1956:2: ( rule__Ingredient__RecipeAssignment_0_0_1 )
            {
             before(grammarAccess.getIngredientAccess().getRecipeAssignment_0_0_1()); 
            // InternalMyDsl.g:1957:2: ( rule__Ingredient__RecipeAssignment_0_0_1 )
            // InternalMyDsl.g:1957:3: rule__Ingredient__RecipeAssignment_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__RecipeAssignment_0_0_1();

            state._fsp--;


            }

             after(grammarAccess.getIngredientAccess().getRecipeAssignment_0_0_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Ingredient__Group_0_1__0"
    // InternalMyDsl.g:1966:1: rule__Ingredient__Group_0_1__0 : rule__Ingredient__Group_0_1__0__Impl rule__Ingredient__Group_0_1__1 ;
    public final void rule__Ingredient__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1970:1: ( rule__Ingredient__Group_0_1__0__Impl rule__Ingredient__Group_0_1__1 )
            // InternalMyDsl.g:1971:2: rule__Ingredient__Group_0_1__0__Impl rule__Ingredient__Group_0_1__1
            {
            pushFollow(FOLLOW_12);
            rule__Ingredient__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredient__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group_0_1__0"


    // $ANTLR start "rule__Ingredient__Group_0_1__0__Impl"
    // InternalMyDsl.g:1978:1: rule__Ingredient__Group_0_1__0__Impl : ( ( rule__Ingredient__NameAssignment_0_1_0 ) ) ;
    public final void rule__Ingredient__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1982:1: ( ( ( rule__Ingredient__NameAssignment_0_1_0 ) ) )
            // InternalMyDsl.g:1983:1: ( ( rule__Ingredient__NameAssignment_0_1_0 ) )
            {
            // InternalMyDsl.g:1983:1: ( ( rule__Ingredient__NameAssignment_0_1_0 ) )
            // InternalMyDsl.g:1984:2: ( rule__Ingredient__NameAssignment_0_1_0 )
            {
             before(grammarAccess.getIngredientAccess().getNameAssignment_0_1_0()); 
            // InternalMyDsl.g:1985:2: ( rule__Ingredient__NameAssignment_0_1_0 )
            // InternalMyDsl.g:1985:3: rule__Ingredient__NameAssignment_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__NameAssignment_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getIngredientAccess().getNameAssignment_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group_0_1__0__Impl"


    // $ANTLR start "rule__Ingredient__Group_0_1__1"
    // InternalMyDsl.g:1993:1: rule__Ingredient__Group_0_1__1 : rule__Ingredient__Group_0_1__1__Impl rule__Ingredient__Group_0_1__2 ;
    public final void rule__Ingredient__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1997:1: ( rule__Ingredient__Group_0_1__1__Impl rule__Ingredient__Group_0_1__2 )
            // InternalMyDsl.g:1998:2: rule__Ingredient__Group_0_1__1__Impl rule__Ingredient__Group_0_1__2
            {
            pushFollow(FOLLOW_23);
            rule__Ingredient__Group_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredient__Group_0_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group_0_1__1"


    // $ANTLR start "rule__Ingredient__Group_0_1__1__Impl"
    // InternalMyDsl.g:2005:1: rule__Ingredient__Group_0_1__1__Impl : ( ( rule__Ingredient__AmountAssignment_0_1_1 ) ) ;
    public final void rule__Ingredient__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2009:1: ( ( ( rule__Ingredient__AmountAssignment_0_1_1 ) ) )
            // InternalMyDsl.g:2010:1: ( ( rule__Ingredient__AmountAssignment_0_1_1 ) )
            {
            // InternalMyDsl.g:2010:1: ( ( rule__Ingredient__AmountAssignment_0_1_1 ) )
            // InternalMyDsl.g:2011:2: ( rule__Ingredient__AmountAssignment_0_1_1 )
            {
             before(grammarAccess.getIngredientAccess().getAmountAssignment_0_1_1()); 
            // InternalMyDsl.g:2012:2: ( rule__Ingredient__AmountAssignment_0_1_1 )
            // InternalMyDsl.g:2012:3: rule__Ingredient__AmountAssignment_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__AmountAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getIngredientAccess().getAmountAssignment_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group_0_1__1__Impl"


    // $ANTLR start "rule__Ingredient__Group_0_1__2"
    // InternalMyDsl.g:2020:1: rule__Ingredient__Group_0_1__2 : rule__Ingredient__Group_0_1__2__Impl rule__Ingredient__Group_0_1__3 ;
    public final void rule__Ingredient__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2024:1: ( rule__Ingredient__Group_0_1__2__Impl rule__Ingredient__Group_0_1__3 )
            // InternalMyDsl.g:2025:2: rule__Ingredient__Group_0_1__2__Impl rule__Ingredient__Group_0_1__3
            {
            pushFollow(FOLLOW_10);
            rule__Ingredient__Group_0_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredient__Group_0_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group_0_1__2"


    // $ANTLR start "rule__Ingredient__Group_0_1__2__Impl"
    // InternalMyDsl.g:2032:1: rule__Ingredient__Group_0_1__2__Impl : ( ( rule__Ingredient__UnitAssignment_0_1_2 ) ) ;
    public final void rule__Ingredient__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2036:1: ( ( ( rule__Ingredient__UnitAssignment_0_1_2 ) ) )
            // InternalMyDsl.g:2037:1: ( ( rule__Ingredient__UnitAssignment_0_1_2 ) )
            {
            // InternalMyDsl.g:2037:1: ( ( rule__Ingredient__UnitAssignment_0_1_2 ) )
            // InternalMyDsl.g:2038:2: ( rule__Ingredient__UnitAssignment_0_1_2 )
            {
             before(grammarAccess.getIngredientAccess().getUnitAssignment_0_1_2()); 
            // InternalMyDsl.g:2039:2: ( rule__Ingredient__UnitAssignment_0_1_2 )
            // InternalMyDsl.g:2039:3: rule__Ingredient__UnitAssignment_0_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__UnitAssignment_0_1_2();

            state._fsp--;


            }

             after(grammarAccess.getIngredientAccess().getUnitAssignment_0_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group_0_1__2__Impl"


    // $ANTLR start "rule__Ingredient__Group_0_1__3"
    // InternalMyDsl.g:2047:1: rule__Ingredient__Group_0_1__3 : rule__Ingredient__Group_0_1__3__Impl rule__Ingredient__Group_0_1__4 ;
    public final void rule__Ingredient__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2051:1: ( rule__Ingredient__Group_0_1__3__Impl rule__Ingredient__Group_0_1__4 )
            // InternalMyDsl.g:2052:2: rule__Ingredient__Group_0_1__3__Impl rule__Ingredient__Group_0_1__4
            {
            pushFollow(FOLLOW_11);
            rule__Ingredient__Group_0_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredient__Group_0_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group_0_1__3"


    // $ANTLR start "rule__Ingredient__Group_0_1__3__Impl"
    // InternalMyDsl.g:2059:1: rule__Ingredient__Group_0_1__3__Impl : ( ',' ) ;
    public final void rule__Ingredient__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2063:1: ( ( ',' ) )
            // InternalMyDsl.g:2064:1: ( ',' )
            {
            // InternalMyDsl.g:2064:1: ( ',' )
            // InternalMyDsl.g:2065:2: ','
            {
             before(grammarAccess.getIngredientAccess().getCommaKeyword_0_1_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getIngredientAccess().getCommaKeyword_0_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group_0_1__3__Impl"


    // $ANTLR start "rule__Ingredient__Group_0_1__4"
    // InternalMyDsl.g:2074:1: rule__Ingredient__Group_0_1__4 : rule__Ingredient__Group_0_1__4__Impl ;
    public final void rule__Ingredient__Group_0_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2078:1: ( rule__Ingredient__Group_0_1__4__Impl )
            // InternalMyDsl.g:2079:2: rule__Ingredient__Group_0_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__Group_0_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group_0_1__4"


    // $ANTLR start "rule__Ingredient__Group_0_1__4__Impl"
    // InternalMyDsl.g:2085:1: rule__Ingredient__Group_0_1__4__Impl : ( ( rule__Ingredient__VeganismLevelAssignment_0_1_4 ) ) ;
    public final void rule__Ingredient__Group_0_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2089:1: ( ( ( rule__Ingredient__VeganismLevelAssignment_0_1_4 ) ) )
            // InternalMyDsl.g:2090:1: ( ( rule__Ingredient__VeganismLevelAssignment_0_1_4 ) )
            {
            // InternalMyDsl.g:2090:1: ( ( rule__Ingredient__VeganismLevelAssignment_0_1_4 ) )
            // InternalMyDsl.g:2091:2: ( rule__Ingredient__VeganismLevelAssignment_0_1_4 )
            {
             before(grammarAccess.getIngredientAccess().getVeganismLevelAssignment_0_1_4()); 
            // InternalMyDsl.g:2092:2: ( rule__Ingredient__VeganismLevelAssignment_0_1_4 )
            // InternalMyDsl.g:2092:3: rule__Ingredient__VeganismLevelAssignment_0_1_4
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__VeganismLevelAssignment_0_1_4();

            state._fsp--;


            }

             after(grammarAccess.getIngredientAccess().getVeganismLevelAssignment_0_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group_0_1__4__Impl"


    // $ANTLR start "rule__ListElement__Group__0"
    // InternalMyDsl.g:2101:1: rule__ListElement__Group__0 : rule__ListElement__Group__0__Impl rule__ListElement__Group__1 ;
    public final void rule__ListElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2105:1: ( rule__ListElement__Group__0__Impl rule__ListElement__Group__1 )
            // InternalMyDsl.g:2106:2: rule__ListElement__Group__0__Impl rule__ListElement__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__ListElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListElement__Group__0"


    // $ANTLR start "rule__ListElement__Group__0__Impl"
    // InternalMyDsl.g:2113:1: rule__ListElement__Group__0__Impl : ( ( rule__ListElement__OrderAssignment_0 ) ) ;
    public final void rule__ListElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2117:1: ( ( ( rule__ListElement__OrderAssignment_0 ) ) )
            // InternalMyDsl.g:2118:1: ( ( rule__ListElement__OrderAssignment_0 ) )
            {
            // InternalMyDsl.g:2118:1: ( ( rule__ListElement__OrderAssignment_0 ) )
            // InternalMyDsl.g:2119:2: ( rule__ListElement__OrderAssignment_0 )
            {
             before(grammarAccess.getListElementAccess().getOrderAssignment_0()); 
            // InternalMyDsl.g:2120:2: ( rule__ListElement__OrderAssignment_0 )
            // InternalMyDsl.g:2120:3: rule__ListElement__OrderAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ListElement__OrderAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getListElementAccess().getOrderAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListElement__Group__0__Impl"


    // $ANTLR start "rule__ListElement__Group__1"
    // InternalMyDsl.g:2128:1: rule__ListElement__Group__1 : rule__ListElement__Group__1__Impl rule__ListElement__Group__2 ;
    public final void rule__ListElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2132:1: ( rule__ListElement__Group__1__Impl rule__ListElement__Group__2 )
            // InternalMyDsl.g:2133:2: rule__ListElement__Group__1__Impl rule__ListElement__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__ListElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListElement__Group__1"


    // $ANTLR start "rule__ListElement__Group__1__Impl"
    // InternalMyDsl.g:2140:1: rule__ListElement__Group__1__Impl : ( ')' ) ;
    public final void rule__ListElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2144:1: ( ( ')' ) )
            // InternalMyDsl.g:2145:1: ( ')' )
            {
            // InternalMyDsl.g:2145:1: ( ')' )
            // InternalMyDsl.g:2146:2: ')'
            {
             before(grammarAccess.getListElementAccess().getRightParenthesisKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getListElementAccess().getRightParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListElement__Group__1__Impl"


    // $ANTLR start "rule__ListElement__Group__2"
    // InternalMyDsl.g:2155:1: rule__ListElement__Group__2 : rule__ListElement__Group__2__Impl ;
    public final void rule__ListElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2159:1: ( rule__ListElement__Group__2__Impl )
            // InternalMyDsl.g:2160:2: rule__ListElement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListElement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListElement__Group__2"


    // $ANTLR start "rule__ListElement__Group__2__Impl"
    // InternalMyDsl.g:2166:1: rule__ListElement__Group__2__Impl : ( ( rule__ListElement__CommentAssignment_2 ) ) ;
    public final void rule__ListElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2170:1: ( ( ( rule__ListElement__CommentAssignment_2 ) ) )
            // InternalMyDsl.g:2171:1: ( ( rule__ListElement__CommentAssignment_2 ) )
            {
            // InternalMyDsl.g:2171:1: ( ( rule__ListElement__CommentAssignment_2 ) )
            // InternalMyDsl.g:2172:2: ( rule__ListElement__CommentAssignment_2 )
            {
             before(grammarAccess.getListElementAccess().getCommentAssignment_2()); 
            // InternalMyDsl.g:2173:2: ( rule__ListElement__CommentAssignment_2 )
            // InternalMyDsl.g:2173:3: rule__ListElement__CommentAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ListElement__CommentAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getListElementAccess().getCommentAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListElement__Group__2__Impl"


    // $ANTLR start "rule__Rating__Group__0"
    // InternalMyDsl.g:2182:1: rule__Rating__Group__0 : rule__Rating__Group__0__Impl rule__Rating__Group__1 ;
    public final void rule__Rating__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2186:1: ( rule__Rating__Group__0__Impl rule__Rating__Group__1 )
            // InternalMyDsl.g:2187:2: rule__Rating__Group__0__Impl rule__Rating__Group__1
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
    // InternalMyDsl.g:2194:1: rule__Rating__Group__0__Impl : ( ( rule__Rating__StarsAssignment_0 ) ) ;
    public final void rule__Rating__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2198:1: ( ( ( rule__Rating__StarsAssignment_0 ) ) )
            // InternalMyDsl.g:2199:1: ( ( rule__Rating__StarsAssignment_0 ) )
            {
            // InternalMyDsl.g:2199:1: ( ( rule__Rating__StarsAssignment_0 ) )
            // InternalMyDsl.g:2200:2: ( rule__Rating__StarsAssignment_0 )
            {
             before(grammarAccess.getRatingAccess().getStarsAssignment_0()); 
            // InternalMyDsl.g:2201:2: ( rule__Rating__StarsAssignment_0 )
            // InternalMyDsl.g:2201:3: rule__Rating__StarsAssignment_0
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
    // InternalMyDsl.g:2209:1: rule__Rating__Group__1 : rule__Rating__Group__1__Impl rule__Rating__Group__2 ;
    public final void rule__Rating__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2213:1: ( rule__Rating__Group__1__Impl rule__Rating__Group__2 )
            // InternalMyDsl.g:2214:2: rule__Rating__Group__1__Impl rule__Rating__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:2221:1: rule__Rating__Group__1__Impl : ( ( rule__Rating__CommentAssignment_1 ) ) ;
    public final void rule__Rating__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2225:1: ( ( ( rule__Rating__CommentAssignment_1 ) ) )
            // InternalMyDsl.g:2226:1: ( ( rule__Rating__CommentAssignment_1 ) )
            {
            // InternalMyDsl.g:2226:1: ( ( rule__Rating__CommentAssignment_1 ) )
            // InternalMyDsl.g:2227:2: ( rule__Rating__CommentAssignment_1 )
            {
             before(grammarAccess.getRatingAccess().getCommentAssignment_1()); 
            // InternalMyDsl.g:2228:2: ( rule__Rating__CommentAssignment_1 )
            // InternalMyDsl.g:2228:3: rule__Rating__CommentAssignment_1
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
    // InternalMyDsl.g:2236:1: rule__Rating__Group__2 : rule__Rating__Group__2__Impl rule__Rating__Group__3 ;
    public final void rule__Rating__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2240:1: ( rule__Rating__Group__2__Impl rule__Rating__Group__3 )
            // InternalMyDsl.g:2241:2: rule__Rating__Group__2__Impl rule__Rating__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:2248:1: rule__Rating__Group__2__Impl : ( 'from' ) ;
    public final void rule__Rating__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2252:1: ( ( 'from' ) )
            // InternalMyDsl.g:2253:1: ( 'from' )
            {
            // InternalMyDsl.g:2253:1: ( 'from' )
            // InternalMyDsl.g:2254:2: 'from'
            {
             before(grammarAccess.getRatingAccess().getFromKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getRatingAccess().getFromKeyword_2()); 

            }


            }

        }
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
    // InternalMyDsl.g:2263:1: rule__Rating__Group__3 : rule__Rating__Group__3__Impl rule__Rating__Group__4 ;
    public final void rule__Rating__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2267:1: ( rule__Rating__Group__3__Impl rule__Rating__Group__4 )
            // InternalMyDsl.g:2268:2: rule__Rating__Group__3__Impl rule__Rating__Group__4
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
    // InternalMyDsl.g:2275:1: rule__Rating__Group__3__Impl : ( ( rule__Rating__AuthorAssignment_3 ) ) ;
    public final void rule__Rating__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2279:1: ( ( ( rule__Rating__AuthorAssignment_3 ) ) )
            // InternalMyDsl.g:2280:1: ( ( rule__Rating__AuthorAssignment_3 ) )
            {
            // InternalMyDsl.g:2280:1: ( ( rule__Rating__AuthorAssignment_3 ) )
            // InternalMyDsl.g:2281:2: ( rule__Rating__AuthorAssignment_3 )
            {
             before(grammarAccess.getRatingAccess().getAuthorAssignment_3()); 
            // InternalMyDsl.g:2282:2: ( rule__Rating__AuthorAssignment_3 )
            // InternalMyDsl.g:2282:3: rule__Rating__AuthorAssignment_3
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
    // InternalMyDsl.g:2290:1: rule__Rating__Group__4 : rule__Rating__Group__4__Impl ;
    public final void rule__Rating__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2294:1: ( rule__Rating__Group__4__Impl )
            // InternalMyDsl.g:2295:2: rule__Rating__Group__4__Impl
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
    // InternalMyDsl.g:2301:1: rule__Rating__Group__4__Impl : ( ruleEOL ) ;
    public final void rule__Rating__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2305:1: ( ( ruleEOL ) )
            // InternalMyDsl.g:2306:1: ( ruleEOL )
            {
            // InternalMyDsl.g:2306:1: ( ruleEOL )
            // InternalMyDsl.g:2307:2: ruleEOL
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


    // $ANTLR start "rule__RecipeManager__AuthorsAssignment_2"
    // InternalMyDsl.g:2317:1: rule__RecipeManager__AuthorsAssignment_2 : ( ruleAuthor ) ;
    public final void rule__RecipeManager__AuthorsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2321:1: ( ( ruleAuthor ) )
            // InternalMyDsl.g:2322:2: ( ruleAuthor )
            {
            // InternalMyDsl.g:2322:2: ( ruleAuthor )
            // InternalMyDsl.g:2323:3: ruleAuthor
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
    // InternalMyDsl.g:2332:1: rule__RecipeManager__AuthorsAssignment_3 : ( ruleAuthor ) ;
    public final void rule__RecipeManager__AuthorsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2336:1: ( ( ruleAuthor ) )
            // InternalMyDsl.g:2337:2: ( ruleAuthor )
            {
            // InternalMyDsl.g:2337:2: ( ruleAuthor )
            // InternalMyDsl.g:2338:3: ruleAuthor
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
    // InternalMyDsl.g:2347:1: rule__RecipeManager__RecipesAssignment_4_2 : ( ruleRecipe ) ;
    public final void rule__RecipeManager__RecipesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2351:1: ( ( ruleRecipe ) )
            // InternalMyDsl.g:2352:2: ( ruleRecipe )
            {
            // InternalMyDsl.g:2352:2: ( ruleRecipe )
            // InternalMyDsl.g:2353:3: ruleRecipe
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
    // InternalMyDsl.g:2362:1: rule__RecipeManager__RecipesAssignment_4_3 : ( ruleRecipe ) ;
    public final void rule__RecipeManager__RecipesAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2366:1: ( ( ruleRecipe ) )
            // InternalMyDsl.g:2367:2: ( ruleRecipe )
            {
            // InternalMyDsl.g:2367:2: ( ruleRecipe )
            // InternalMyDsl.g:2368:3: ruleRecipe
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
    // InternalMyDsl.g:2377:1: rule__Author__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Author__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2381:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2382:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2382:2: ( RULE_ID )
            // InternalMyDsl.g:2383:3: RULE_ID
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
    // InternalMyDsl.g:2392:1: rule__Author__EmailAssignment_1 : ( RULE_QSTRING ) ;
    public final void rule__Author__EmailAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2396:1: ( ( RULE_QSTRING ) )
            // InternalMyDsl.g:2397:2: ( RULE_QSTRING )
            {
            // InternalMyDsl.g:2397:2: ( RULE_QSTRING )
            // InternalMyDsl.g:2398:3: RULE_QSTRING
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


    // $ANTLR start "rule__Recipe__NameAssignment_0"
    // InternalMyDsl.g:2407:1: rule__Recipe__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Recipe__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2411:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2412:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2412:2: ( RULE_ID )
            // InternalMyDsl.g:2413:3: RULE_ID
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
    // InternalMyDsl.g:2422:1: rule__Recipe__AuthorAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Recipe__AuthorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2426:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2427:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2427:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2428:3: ( RULE_ID )
            {
             before(grammarAccess.getRecipeAccess().getAuthorAuthorCrossReference_2_0()); 
            // InternalMyDsl.g:2429:3: ( RULE_ID )
            // InternalMyDsl.g:2430:4: RULE_ID
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
    // InternalMyDsl.g:2441:1: rule__Recipe__VeganAssignment_4 : ( ruleVeganismLevel ) ;
    public final void rule__Recipe__VeganAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2445:1: ( ( ruleVeganismLevel ) )
            // InternalMyDsl.g:2446:2: ( ruleVeganismLevel )
            {
            // InternalMyDsl.g:2446:2: ( ruleVeganismLevel )
            // InternalMyDsl.g:2447:3: ruleVeganismLevel
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
    // InternalMyDsl.g:2456:1: rule__Recipe__DurationAssignment_6 : ( RULE_INT ) ;
    public final void rule__Recipe__DurationAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2460:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2461:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2461:2: ( RULE_INT )
            // InternalMyDsl.g:2462:3: RULE_INT
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
    // InternalMyDsl.g:2471:1: rule__Recipe__DifficultyAssignment_9 : ( ruleDifficultyLevel ) ;
    public final void rule__Recipe__DifficultyAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2475:1: ( ( ruleDifficultyLevel ) )
            // InternalMyDsl.g:2476:2: ( ruleDifficultyLevel )
            {
            // InternalMyDsl.g:2476:2: ( ruleDifficultyLevel )
            // InternalMyDsl.g:2477:3: ruleDifficultyLevel
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


    // $ANTLR start "rule__Recipe__KitchenUtensilsAssignment_11_2"
    // InternalMyDsl.g:2486:1: rule__Recipe__KitchenUtensilsAssignment_11_2 : ( ruleKitchenUtensil ) ;
    public final void rule__Recipe__KitchenUtensilsAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2490:1: ( ( ruleKitchenUtensil ) )
            // InternalMyDsl.g:2491:2: ( ruleKitchenUtensil )
            {
            // InternalMyDsl.g:2491:2: ( ruleKitchenUtensil )
            // InternalMyDsl.g:2492:3: ruleKitchenUtensil
            {
             before(grammarAccess.getRecipeAccess().getKitchenUtensilsKitchenUtensilParserRuleCall_11_2_0()); 
            pushFollow(FOLLOW_2);
            ruleKitchenUtensil();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getKitchenUtensilsKitchenUtensilParserRuleCall_11_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__KitchenUtensilsAssignment_11_2"


    // $ANTLR start "rule__Recipe__KitchenUtensilsAssignment_11_3"
    // InternalMyDsl.g:2501:1: rule__Recipe__KitchenUtensilsAssignment_11_3 : ( ruleKitchenUtensil ) ;
    public final void rule__Recipe__KitchenUtensilsAssignment_11_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2505:1: ( ( ruleKitchenUtensil ) )
            // InternalMyDsl.g:2506:2: ( ruleKitchenUtensil )
            {
            // InternalMyDsl.g:2506:2: ( ruleKitchenUtensil )
            // InternalMyDsl.g:2507:3: ruleKitchenUtensil
            {
             before(grammarAccess.getRecipeAccess().getKitchenUtensilsKitchenUtensilParserRuleCall_11_3_0()); 
            pushFollow(FOLLOW_2);
            ruleKitchenUtensil();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getKitchenUtensilsKitchenUtensilParserRuleCall_11_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__KitchenUtensilsAssignment_11_3"


    // $ANTLR start "rule__Recipe__FoodCategoryAssignment_14"
    // InternalMyDsl.g:2516:1: rule__Recipe__FoodCategoryAssignment_14 : ( ruleFoodCategory ) ;
    public final void rule__Recipe__FoodCategoryAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2520:1: ( ( ruleFoodCategory ) )
            // InternalMyDsl.g:2521:2: ( ruleFoodCategory )
            {
            // InternalMyDsl.g:2521:2: ( ruleFoodCategory )
            // InternalMyDsl.g:2522:3: ruleFoodCategory
            {
             before(grammarAccess.getRecipeAccess().getFoodCategoryFoodCategoryParserRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            ruleFoodCategory();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getFoodCategoryFoodCategoryParserRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__FoodCategoryAssignment_14"


    // $ANTLR start "rule__Recipe__FoodCategoryAssignment_15"
    // InternalMyDsl.g:2531:1: rule__Recipe__FoodCategoryAssignment_15 : ( ruleFoodCategory ) ;
    public final void rule__Recipe__FoodCategoryAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2535:1: ( ( ruleFoodCategory ) )
            // InternalMyDsl.g:2536:2: ( ruleFoodCategory )
            {
            // InternalMyDsl.g:2536:2: ( ruleFoodCategory )
            // InternalMyDsl.g:2537:3: ruleFoodCategory
            {
             before(grammarAccess.getRecipeAccess().getFoodCategoryFoodCategoryParserRuleCall_15_0()); 
            pushFollow(FOLLOW_2);
            ruleFoodCategory();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getFoodCategoryFoodCategoryParserRuleCall_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__FoodCategoryAssignment_15"


    // $ANTLR start "rule__Recipe__IngredientAssignment_18"
    // InternalMyDsl.g:2546:1: rule__Recipe__IngredientAssignment_18 : ( ruleIngredient ) ;
    public final void rule__Recipe__IngredientAssignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2550:1: ( ( ruleIngredient ) )
            // InternalMyDsl.g:2551:2: ( ruleIngredient )
            {
            // InternalMyDsl.g:2551:2: ( ruleIngredient )
            // InternalMyDsl.g:2552:3: ruleIngredient
            {
             before(grammarAccess.getRecipeAccess().getIngredientIngredientParserRuleCall_18_0()); 
            pushFollow(FOLLOW_2);
            ruleIngredient();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getIngredientIngredientParserRuleCall_18_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__IngredientAssignment_18"


    // $ANTLR start "rule__Recipe__IngredientAssignment_19"
    // InternalMyDsl.g:2561:1: rule__Recipe__IngredientAssignment_19 : ( ruleIngredient ) ;
    public final void rule__Recipe__IngredientAssignment_19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2565:1: ( ( ruleIngredient ) )
            // InternalMyDsl.g:2566:2: ( ruleIngredient )
            {
            // InternalMyDsl.g:2566:2: ( ruleIngredient )
            // InternalMyDsl.g:2567:3: ruleIngredient
            {
             before(grammarAccess.getRecipeAccess().getIngredientIngredientParserRuleCall_19_0()); 
            pushFollow(FOLLOW_2);
            ruleIngredient();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getIngredientIngredientParserRuleCall_19_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__IngredientAssignment_19"


    // $ANTLR start "rule__Recipe__PreparationAssignment_22"
    // InternalMyDsl.g:2576:1: rule__Recipe__PreparationAssignment_22 : ( ruleList ) ;
    public final void rule__Recipe__PreparationAssignment_22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2580:1: ( ( ruleList ) )
            // InternalMyDsl.g:2581:2: ( ruleList )
            {
            // InternalMyDsl.g:2581:2: ( ruleList )
            // InternalMyDsl.g:2582:3: ruleList
            {
             before(grammarAccess.getRecipeAccess().getPreparationListParserRuleCall_22_0()); 
            pushFollow(FOLLOW_2);
            ruleList();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getPreparationListParserRuleCall_22_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__PreparationAssignment_22"


    // $ANTLR start "rule__Recipe__VideoAssignment_23_2"
    // InternalMyDsl.g:2591:1: rule__Recipe__VideoAssignment_23_2 : ( ruleVideo ) ;
    public final void rule__Recipe__VideoAssignment_23_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2595:1: ( ( ruleVideo ) )
            // InternalMyDsl.g:2596:2: ( ruleVideo )
            {
            // InternalMyDsl.g:2596:2: ( ruleVideo )
            // InternalMyDsl.g:2597:3: ruleVideo
            {
             before(grammarAccess.getRecipeAccess().getVideoVideoParserRuleCall_23_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVideo();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getVideoVideoParserRuleCall_23_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__VideoAssignment_23_2"


    // $ANTLR start "rule__Recipe__RatingsAssignment_24_2"
    // InternalMyDsl.g:2606:1: rule__Recipe__RatingsAssignment_24_2 : ( ruleRating ) ;
    public final void rule__Recipe__RatingsAssignment_24_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2610:1: ( ( ruleRating ) )
            // InternalMyDsl.g:2611:2: ( ruleRating )
            {
            // InternalMyDsl.g:2611:2: ( ruleRating )
            // InternalMyDsl.g:2612:3: ruleRating
            {
             before(grammarAccess.getRecipeAccess().getRatingsRatingParserRuleCall_24_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRating();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getRatingsRatingParserRuleCall_24_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__RatingsAssignment_24_2"


    // $ANTLR start "rule__Recipe__RatingsAssignment_24_3"
    // InternalMyDsl.g:2621:1: rule__Recipe__RatingsAssignment_24_3 : ( ruleRating ) ;
    public final void rule__Recipe__RatingsAssignment_24_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2625:1: ( ( ruleRating ) )
            // InternalMyDsl.g:2626:2: ( ruleRating )
            {
            // InternalMyDsl.g:2626:2: ( ruleRating )
            // InternalMyDsl.g:2627:3: ruleRating
            {
             before(grammarAccess.getRecipeAccess().getRatingsRatingParserRuleCall_24_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRating();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getRatingsRatingParserRuleCall_24_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__RatingsAssignment_24_3"


    // $ANTLR start "rule__KitchenUtensil__NameAssignment"
    // InternalMyDsl.g:2636:1: rule__KitchenUtensil__NameAssignment : ( RULE_QSTRING ) ;
    public final void rule__KitchenUtensil__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2640:1: ( ( RULE_QSTRING ) )
            // InternalMyDsl.g:2641:2: ( RULE_QSTRING )
            {
            // InternalMyDsl.g:2641:2: ( RULE_QSTRING )
            // InternalMyDsl.g:2642:3: RULE_QSTRING
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
    // InternalMyDsl.g:2651:1: rule__DifficultyLevel__NameAssignment : ( ( rule__DifficultyLevel__NameAlternatives_0 ) ) ;
    public final void rule__DifficultyLevel__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2655:1: ( ( ( rule__DifficultyLevel__NameAlternatives_0 ) ) )
            // InternalMyDsl.g:2656:2: ( ( rule__DifficultyLevel__NameAlternatives_0 ) )
            {
            // InternalMyDsl.g:2656:2: ( ( rule__DifficultyLevel__NameAlternatives_0 ) )
            // InternalMyDsl.g:2657:3: ( rule__DifficultyLevel__NameAlternatives_0 )
            {
             before(grammarAccess.getDifficultyLevelAccess().getNameAlternatives_0()); 
            // InternalMyDsl.g:2658:3: ( rule__DifficultyLevel__NameAlternatives_0 )
            // InternalMyDsl.g:2658:4: rule__DifficultyLevel__NameAlternatives_0
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
    // InternalMyDsl.g:2666:1: rule__FoodCategory__NameAssignment : ( RULE_QSTRING ) ;
    public final void rule__FoodCategory__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2670:1: ( ( RULE_QSTRING ) )
            // InternalMyDsl.g:2671:2: ( RULE_QSTRING )
            {
            // InternalMyDsl.g:2671:2: ( RULE_QSTRING )
            // InternalMyDsl.g:2672:3: RULE_QSTRING
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


    // $ANTLR start "rule__Ingredient__RecipeAssignment_0_0_1"
    // InternalMyDsl.g:2681:1: rule__Ingredient__RecipeAssignment_0_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__Ingredient__RecipeAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2685:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2686:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2686:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2687:3: ( RULE_ID )
            {
             before(grammarAccess.getIngredientAccess().getRecipeRecipeCrossReference_0_0_1_0()); 
            // InternalMyDsl.g:2688:3: ( RULE_ID )
            // InternalMyDsl.g:2689:4: RULE_ID
            {
             before(grammarAccess.getIngredientAccess().getRecipeRecipeIDTerminalRuleCall_0_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIngredientAccess().getRecipeRecipeIDTerminalRuleCall_0_0_1_0_1()); 

            }

             after(grammarAccess.getIngredientAccess().getRecipeRecipeCrossReference_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__RecipeAssignment_0_0_1"


    // $ANTLR start "rule__Ingredient__NameAssignment_0_1_0"
    // InternalMyDsl.g:2700:1: rule__Ingredient__NameAssignment_0_1_0 : ( RULE_INGEREDIENTSTRING ) ;
    public final void rule__Ingredient__NameAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2704:1: ( ( RULE_INGEREDIENTSTRING ) )
            // InternalMyDsl.g:2705:2: ( RULE_INGEREDIENTSTRING )
            {
            // InternalMyDsl.g:2705:2: ( RULE_INGEREDIENTSTRING )
            // InternalMyDsl.g:2706:3: RULE_INGEREDIENTSTRING
            {
             before(grammarAccess.getIngredientAccess().getNameINGEREDIENTSTRINGTerminalRuleCall_0_1_0_0()); 
            match(input,RULE_INGEREDIENTSTRING,FOLLOW_2); 
             after(grammarAccess.getIngredientAccess().getNameINGEREDIENTSTRINGTerminalRuleCall_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__NameAssignment_0_1_0"


    // $ANTLR start "rule__Ingredient__AmountAssignment_0_1_1"
    // InternalMyDsl.g:2715:1: rule__Ingredient__AmountAssignment_0_1_1 : ( RULE_INT ) ;
    public final void rule__Ingredient__AmountAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2719:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2720:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2720:2: ( RULE_INT )
            // InternalMyDsl.g:2721:3: RULE_INT
            {
             before(grammarAccess.getIngredientAccess().getAmountINTTerminalRuleCall_0_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIngredientAccess().getAmountINTTerminalRuleCall_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__AmountAssignment_0_1_1"


    // $ANTLR start "rule__Ingredient__UnitAssignment_0_1_2"
    // InternalMyDsl.g:2730:1: rule__Ingredient__UnitAssignment_0_1_2 : ( ruleUnit ) ;
    public final void rule__Ingredient__UnitAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2734:1: ( ( ruleUnit ) )
            // InternalMyDsl.g:2735:2: ( ruleUnit )
            {
            // InternalMyDsl.g:2735:2: ( ruleUnit )
            // InternalMyDsl.g:2736:3: ruleUnit
            {
             before(grammarAccess.getIngredientAccess().getUnitUnitParserRuleCall_0_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnit();

            state._fsp--;

             after(grammarAccess.getIngredientAccess().getUnitUnitParserRuleCall_0_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__UnitAssignment_0_1_2"


    // $ANTLR start "rule__Ingredient__VeganismLevelAssignment_0_1_4"
    // InternalMyDsl.g:2745:1: rule__Ingredient__VeganismLevelAssignment_0_1_4 : ( ruleVeganismLevel ) ;
    public final void rule__Ingredient__VeganismLevelAssignment_0_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2749:1: ( ( ruleVeganismLevel ) )
            // InternalMyDsl.g:2750:2: ( ruleVeganismLevel )
            {
            // InternalMyDsl.g:2750:2: ( ruleVeganismLevel )
            // InternalMyDsl.g:2751:3: ruleVeganismLevel
            {
             before(grammarAccess.getIngredientAccess().getVeganismLevelVeganismLevelParserRuleCall_0_1_4_0()); 
            pushFollow(FOLLOW_2);
            ruleVeganismLevel();

            state._fsp--;

             after(grammarAccess.getIngredientAccess().getVeganismLevelVeganismLevelParserRuleCall_0_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__VeganismLevelAssignment_0_1_4"


    // $ANTLR start "rule__List__ElementsAssignment"
    // InternalMyDsl.g:2760:1: rule__List__ElementsAssignment : ( ruleListElement ) ;
    public final void rule__List__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2764:1: ( ( ruleListElement ) )
            // InternalMyDsl.g:2765:2: ( ruleListElement )
            {
            // InternalMyDsl.g:2765:2: ( ruleListElement )
            // InternalMyDsl.g:2766:3: ruleListElement
            {
             before(grammarAccess.getListAccess().getElementsListElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleListElement();

            state._fsp--;

             after(grammarAccess.getListAccess().getElementsListElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__ElementsAssignment"


    // $ANTLR start "rule__ListElement__OrderAssignment_0"
    // InternalMyDsl.g:2775:1: rule__ListElement__OrderAssignment_0 : ( RULE_INT ) ;
    public final void rule__ListElement__OrderAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2779:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2780:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2780:2: ( RULE_INT )
            // InternalMyDsl.g:2781:3: RULE_INT
            {
             before(grammarAccess.getListElementAccess().getOrderINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getListElementAccess().getOrderINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListElement__OrderAssignment_0"


    // $ANTLR start "rule__ListElement__CommentAssignment_2"
    // InternalMyDsl.g:2790:1: rule__ListElement__CommentAssignment_2 : ( RULE_QSTRING ) ;
    public final void rule__ListElement__CommentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2794:1: ( ( RULE_QSTRING ) )
            // InternalMyDsl.g:2795:2: ( RULE_QSTRING )
            {
            // InternalMyDsl.g:2795:2: ( RULE_QSTRING )
            // InternalMyDsl.g:2796:3: RULE_QSTRING
            {
             before(grammarAccess.getListElementAccess().getCommentQSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_QSTRING,FOLLOW_2); 
             after(grammarAccess.getListElementAccess().getCommentQSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListElement__CommentAssignment_2"


    // $ANTLR start "rule__Video__NameAssignment"
    // InternalMyDsl.g:2805:1: rule__Video__NameAssignment : ( RULE_STRING ) ;
    public final void rule__Video__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2809:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2810:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2810:2: ( RULE_STRING )
            // InternalMyDsl.g:2811:3: RULE_STRING
            {
             before(grammarAccess.getVideoAccess().getNameSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVideoAccess().getNameSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__NameAssignment"


    // $ANTLR start "rule__Rating__StarsAssignment_0"
    // InternalMyDsl.g:2820:1: rule__Rating__StarsAssignment_0 : ( RULE_INT ) ;
    public final void rule__Rating__StarsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2824:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2825:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2825:2: ( RULE_INT )
            // InternalMyDsl.g:2826:3: RULE_INT
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
    // InternalMyDsl.g:2835:1: rule__Rating__CommentAssignment_1 : ( RULE_QSTRING ) ;
    public final void rule__Rating__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2839:1: ( ( RULE_QSTRING ) )
            // InternalMyDsl.g:2840:2: ( RULE_QSTRING )
            {
            // InternalMyDsl.g:2840:2: ( RULE_QSTRING )
            // InternalMyDsl.g:2841:3: RULE_QSTRING
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
    // InternalMyDsl.g:2850:1: rule__Rating__AuthorAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Rating__AuthorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2854:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2855:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2855:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2856:3: ( RULE_ID )
            {
             before(grammarAccess.getRatingAccess().getAuthorAuthorCrossReference_3_0()); 
            // InternalMyDsl.g:2857:3: ( RULE_ID )
            // InternalMyDsl.g:2858:4: RULE_ID
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000001200000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000400000080L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000008000000200L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000008800000200L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000008000000202L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000000FF00000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000010000000000L});

}