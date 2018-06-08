package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslLexer extends Lexer {
    public static final int RULE_NEWLINE=7;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
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

    public InternalMyDslLexer() {;} 
    public InternalMyDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:11:7: ( 'authors' )
            // InternalMyDsl.g:11:9: 'authors'
            {
            match("authors"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:12:7: ( 'recipes' )
            // InternalMyDsl.g:12:9: 'recipes'
            {
            match("recipes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13:7: ( ',' )
            // InternalMyDsl.g:13:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:14:7: ( 'von' )
            // InternalMyDsl.g:14:9: 'von'
            {
            match("von"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:15:7: ( 'min' )
            // InternalMyDsl.g:15:9: 'min'
            {
            match("min"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:16:7: ( 'Kitchen Utensils' )
            // InternalMyDsl.g:16:9: 'Kitchen Utensils'
            {
            match("Kitchen Utensils"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:17:7: ( 'Food Categories' )
            // InternalMyDsl.g:17:9: 'Food Categories'
            {
            match("Food Categories"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:18:7: ( 'Ingredients' )
            // InternalMyDsl.g:18:9: 'Ingredients'
            {
            match("Ingredients"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:19:7: ( '- ' )
            // InternalMyDsl.g:19:9: '- '
            {
            match("- "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:20:7: ( 'Ratings' )
            // InternalMyDsl.g:20:9: 'Ratings'
            {
            match("Ratings"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:21:7: ( 'furnace' )
            // InternalMyDsl.g:21:9: 'furnace'
            {
            match("furnace"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:22:7: ( 'stovetop' )
            // InternalMyDsl.g:22:9: 'stovetop'
            {
            match("stovetop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:23:7: ( 'rolling pin' )
            // InternalMyDsl.g:23:9: 'rolling pin'
            {
            match("rolling pin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:24:7: ( 'easy' )
            // InternalMyDsl.g:24:9: 'easy'
            {
            match("easy"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:25:7: ( 'medium' )
            // InternalMyDsl.g:25:9: 'medium'
            {
            match("medium"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:26:7: ( 'hard' )
            // InternalMyDsl.g:26:9: 'hard'
            {
            match("hard"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:27:7: ( 'Vegan' )
            // InternalMyDsl.g:27:9: 'Vegan'
            {
            match("Vegan"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:28:7: ( 'Vegetaric' )
            // InternalMyDsl.g:28:9: 'Vegetaric'
            {
            match("Vegetaric"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:29:7: ( 'Carnivorous' )
            // InternalMyDsl.g:29:9: 'Carnivorous'
            {
            match("Carnivorous"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:30:7: ( 'ml' )
            // InternalMyDsl.g:30:9: 'ml'
            {
            match("ml"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:31:7: ( 'l' )
            // InternalMyDsl.g:31:9: 'l'
            {
            match('l'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:32:7: ( 'g' )
            // InternalMyDsl.g:32:9: 'g'
            {
            match('g'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:33:7: ( 'kg' )
            // InternalMyDsl.g:33:9: 'kg'
            {
            match("kg"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:34:7: ( 'tsp' )
            // InternalMyDsl.g:34:9: 'tsp'
            {
            match("tsp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:35:7: ( 'mg' )
            // InternalMyDsl.g:35:9: 'mg'
            {
            match("mg"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:36:7: ( 'tbsp' )
            // InternalMyDsl.g:36:9: 'tbsp'
            {
            match("tbsp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:37:7: ( 'pcs' )
            // InternalMyDsl.g:37:9: 'pcs'
            {
            match("pcs"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1130:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyDsl.g:1130:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMyDsl.g:1130:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:1130:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMyDsl.g:1130:40: ( ( '\\r' )? '\\n' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\n'||LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:1130:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyDsl.g:1130:41: ( '\\r' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='\r') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalMyDsl.g:1130:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_NEWLINE"
    public final void mRULE_NEWLINE() throws RecognitionException {
        try {
            int _type = RULE_NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1132:14: ( ( '\\r' )? '\\n' )
            // InternalMyDsl.g:1132:16: ( '\\r' )? '\\n'
            {
            // InternalMyDsl.g:1132:16: ( '\\r' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\r') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:1132:16: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NEWLINE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1134:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMyDsl.g:1134:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMyDsl.g:1134:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:1134:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyDsl.g:1134:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1136:10: ( ( '0' .. '9' )+ )
            // InternalMyDsl.g:1136:12: ( '0' .. '9' )+
            {
            // InternalMyDsl.g:1136:12: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:1136:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1138:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMyDsl.g:1138:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMyDsl.g:1138:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"') ) {
                alt10=1;
            }
            else if ( (LA10_0=='\'') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1138:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMyDsl.g:1138:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalMyDsl.g:1138:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:1138:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1138:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMyDsl.g:1138:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalMyDsl.g:1138:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:1138:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1140:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMyDsl.g:1140:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMyDsl.g:1140:24: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='/') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1140:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1142:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMyDsl.g:1142:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMyDsl.g:1142:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1144:16: ( . )
            // InternalMyDsl.g:1144:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalMyDsl.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | RULE_SL_COMMENT | RULE_NEWLINE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=35;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalMyDsl.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalMyDsl.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalMyDsl.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalMyDsl.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalMyDsl.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalMyDsl.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalMyDsl.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalMyDsl.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalMyDsl.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalMyDsl.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalMyDsl.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalMyDsl.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalMyDsl.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalMyDsl.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalMyDsl.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalMyDsl.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalMyDsl.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalMyDsl.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalMyDsl.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalMyDsl.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalMyDsl.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalMyDsl.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalMyDsl.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalMyDsl.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // InternalMyDsl.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // InternalMyDsl.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // InternalMyDsl.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // InternalMyDsl.g:1:172: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 29 :
                // InternalMyDsl.g:1:188: RULE_NEWLINE
                {
                mRULE_NEWLINE(); 

                }
                break;
            case 30 :
                // InternalMyDsl.g:1:201: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 31 :
                // InternalMyDsl.g:1:209: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 32 :
                // InternalMyDsl.g:1:218: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 33 :
                // InternalMyDsl.g:1:230: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 34 :
                // InternalMyDsl.g:1:246: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 35 :
                // InternalMyDsl.g:1:254: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\2\41\1\uffff\5\41\1\37\7\41\1\65\1\66\3\41\1\37\1\75\1\77\1\37\2\uffff\2\37\2\uffff\1\41\1\uffff\2\41\1\uffff\3\41\1\110\1\111\3\41\1\uffff\7\41\2\uffff\1\124\3\41\3\uffff\1\77\3\uffff\3\41\1\133\1\134\1\41\2\uffff\12\41\1\uffff\1\151\1\41\1\153\3\41\2\uffff\7\41\1\166\1\167\3\41\1\uffff\1\173\1\uffff\5\41\1\uffff\4\41\2\uffff\1\u0085\2\41\1\uffff\3\41\1\u008b\5\41\1\uffff\2\41\1\u0093\1\u0094\1\41\1\uffff\2\41\1\u0098\1\u0099\3\41\4\uffff\1\41\2\uffff\1\u009e\3\41\1\uffff\1\u00a2\2\41\1\uffff\1\41\1\u00a6\1\u00a7\2\uffff";
    static final String DFA13_eofS =
        "\u00a8\uffff";
    static final String DFA13_minS =
        "\1\0\1\165\1\145\1\uffff\1\157\1\145\1\151\1\157\1\156\1\40\1\141\1\165\1\164\2\141\1\145\1\141\2\60\1\147\1\142\1\143\1\52\1\12\1\11\1\101\2\uffff\2\0\2\uffff\1\164\1\uffff\1\143\1\154\1\uffff\2\156\1\144\2\60\1\164\1\157\1\147\1\uffff\1\164\1\162\1\157\1\163\1\162\1\147\1\162\2\uffff\1\60\1\160\2\163\3\uffff\1\11\3\uffff\1\150\1\151\1\154\2\60\1\151\2\uffff\1\143\1\144\1\162\1\151\1\156\1\166\1\171\1\144\1\141\1\156\1\uffff\1\60\1\160\1\60\1\157\1\160\1\151\2\uffff\1\165\1\150\1\40\1\145\1\156\1\141\1\145\2\60\1\156\1\164\1\151\1\uffff\1\60\1\uffff\1\162\1\145\1\156\1\155\1\145\1\uffff\1\144\1\147\1\143\1\164\2\uffff\1\60\1\141\1\166\1\uffff\2\163\1\147\1\60\1\156\1\151\1\163\1\145\1\157\1\uffff\1\162\1\157\2\60\1\40\1\uffff\1\40\1\145\2\60\1\160\1\151\1\162\4\uffff\1\156\2\uffff\1\60\1\143\1\157\1\164\1\uffff\1\60\1\165\1\163\1\uffff\1\163\2\60\2\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\165\1\157\1\uffff\1\157\1\154\1\151\1\157\1\156\1\40\1\141\1\165\1\164\2\141\1\145\1\141\2\172\1\147\1\163\1\143\1\57\1\12\1\40\1\172\2\uffff\2\uffff\2\uffff\1\164\1\uffff\1\143\1\154\1\uffff\2\156\1\144\2\172\1\164\1\157\1\147\1\uffff\1\164\1\162\1\157\1\163\1\162\1\147\1\162\2\uffff\1\172\1\160\2\163\3\uffff\1\40\3\uffff\1\150\1\151\1\154\2\172\1\151\2\uffff\1\143\1\144\1\162\1\151\1\156\1\166\1\171\1\144\1\145\1\156\1\uffff\1\172\1\160\1\172\1\157\1\160\1\151\2\uffff\1\165\1\150\1\40\1\145\1\156\1\141\1\145\2\172\1\156\1\164\1\151\1\uffff\1\172\1\uffff\1\162\1\145\1\156\1\155\1\145\1\uffff\1\144\1\147\1\143\1\164\2\uffff\1\172\1\141\1\166\1\uffff\2\163\1\147\1\172\1\156\1\151\1\163\1\145\1\157\1\uffff\1\162\1\157\2\172\1\40\1\uffff\1\40\1\145\2\172\1\160\1\151\1\162\4\uffff\1\156\2\uffff\1\172\1\143\1\157\1\164\1\uffff\1\172\1\165\1\163\1\uffff\1\163\2\172\2\uffff";
    static final String DFA13_acceptS =
        "\3\uffff\1\3\26\uffff\1\36\1\37\2\uffff\1\42\1\43\1\uffff\1\36\2\uffff\1\3\10\uffff\1\11\7\uffff\1\25\1\26\4\uffff\1\34\1\41\1\42\1\uffff\1\35\1\37\1\40\6\uffff\1\24\1\31\12\uffff\1\27\6\uffff\1\4\1\5\14\uffff\1\30\1\uffff\1\33\5\uffff\1\7\4\uffff\1\16\1\20\3\uffff\1\32\11\uffff\1\21\5\uffff\1\17\7\uffff\1\1\1\2\1\15\1\6\1\uffff\1\12\1\13\4\uffff\1\14\3\uffff\1\22\3\uffff\1\10\1\23";
    static final String DFA13_specialS =
        "\1\2\33\uffff\1\0\1\1\u008a\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\37\1\36\1\30\2\37\1\27\22\37\1\36\1\37\1\34\4\37\1\35\4\37\1\3\1\11\1\37\1\26\12\33\7\37\2\32\1\20\2\32\1\7\2\32\1\10\1\32\1\6\6\32\1\12\3\32\1\17\4\32\3\37\1\31\1\32\1\37\1\1\3\32\1\15\1\13\1\22\1\16\2\32\1\23\1\21\1\5\2\32\1\25\1\32\1\2\1\14\1\24\1\32\1\4\4\32\uff85\37",
            "\1\40",
            "\1\42\11\uffff\1\43",
            "",
            "\1\45",
            "\1\47\1\uffff\1\51\1\uffff\1\46\2\uffff\1\50",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\67",
            "\1\71\20\uffff\1\70",
            "\1\72",
            "\1\74\4\uffff\1\73",
            "\1\76",
            "\2\75\2\uffff\1\75\22\uffff\1\75",
            "\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\0\101",
            "\0\101",
            "",
            "",
            "\1\102",
            "",
            "\1\103",
            "\1\104",
            "",
            "\1\105",
            "\1\106",
            "\1\107",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\112",
            "\1\113",
            "\1\114",
            "",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\125",
            "\1\126",
            "\1\127",
            "",
            "",
            "",
            "\2\75\2\uffff\1\75\22\uffff\1\75",
            "",
            "",
            "",
            "\1\130",
            "\1\131",
            "\1\132",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\135",
            "",
            "",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146\3\uffff\1\147",
            "\1\150",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\152",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\154",
            "\1\155",
            "\1\156",
            "",
            "",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\170",
            "\1\171",
            "\1\172",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0086",
            "\1\u0087",
            "",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "",
            "\1\u0091",
            "\1\u0092",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0095",
            "",
            "\1\u0096",
            "\1\u0097",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "",
            "",
            "",
            "",
            "\1\u009d",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00a3",
            "\1\u00a4",
            "",
            "\1\u00a5",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | RULE_SL_COMMENT | RULE_NEWLINE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_28 = input.LA(1);

                        s = -1;
                        if ( ((LA13_28>='\u0000' && LA13_28<='\uFFFF')) ) {s = 65;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_29 = input.LA(1);

                        s = -1;
                        if ( ((LA13_29>='\u0000' && LA13_29<='\uFFFF')) ) {s = 65;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='a') ) {s = 1;}

                        else if ( (LA13_0=='r') ) {s = 2;}

                        else if ( (LA13_0==',') ) {s = 3;}

                        else if ( (LA13_0=='v') ) {s = 4;}

                        else if ( (LA13_0=='m') ) {s = 5;}

                        else if ( (LA13_0=='K') ) {s = 6;}

                        else if ( (LA13_0=='F') ) {s = 7;}

                        else if ( (LA13_0=='I') ) {s = 8;}

                        else if ( (LA13_0=='-') ) {s = 9;}

                        else if ( (LA13_0=='R') ) {s = 10;}

                        else if ( (LA13_0=='f') ) {s = 11;}

                        else if ( (LA13_0=='s') ) {s = 12;}

                        else if ( (LA13_0=='e') ) {s = 13;}

                        else if ( (LA13_0=='h') ) {s = 14;}

                        else if ( (LA13_0=='V') ) {s = 15;}

                        else if ( (LA13_0=='C') ) {s = 16;}

                        else if ( (LA13_0=='l') ) {s = 17;}

                        else if ( (LA13_0=='g') ) {s = 18;}

                        else if ( (LA13_0=='k') ) {s = 19;}

                        else if ( (LA13_0=='t') ) {s = 20;}

                        else if ( (LA13_0=='p') ) {s = 21;}

                        else if ( (LA13_0=='/') ) {s = 22;}

                        else if ( (LA13_0=='\r') ) {s = 23;}

                        else if ( (LA13_0=='\n') ) {s = 24;}

                        else if ( (LA13_0=='^') ) {s = 25;}

                        else if ( ((LA13_0>='A' && LA13_0<='B')||(LA13_0>='D' && LA13_0<='E')||(LA13_0>='G' && LA13_0<='H')||LA13_0=='J'||(LA13_0>='L' && LA13_0<='Q')||(LA13_0>='S' && LA13_0<='U')||(LA13_0>='W' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='b' && LA13_0<='d')||(LA13_0>='i' && LA13_0<='j')||(LA13_0>='n' && LA13_0<='o')||LA13_0=='q'||LA13_0=='u'||(LA13_0>='w' && LA13_0<='z')) ) {s = 26;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 27;}

                        else if ( (LA13_0=='\"') ) {s = 28;}

                        else if ( (LA13_0=='\'') ) {s = 29;}

                        else if ( (LA13_0=='\t'||LA13_0==' ') ) {s = 30;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='+')||LA13_0=='.'||(LA13_0>=':' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||(LA13_0>='{' && LA13_0<='\uFFFF')) ) {s = 31;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}