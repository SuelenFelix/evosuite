package icu.samnyan.aqua.sega.maimai.model.userdata;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class UserOption_setSlideSeVol_24708253458 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68881;
     Object term69099;

    public UserOption_setSlideSeVol_24708253458() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term68887 = new Long(8107921244631636572L);
        term68881 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term68883 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term68885 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term68901 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term68902 = newInstance(Class.forName("java.time.LocalDate"));
        Object term68906 = newInstance(Class.forName("java.time.LocalTime"));
        Object term68911 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term68912 = newInstance(Class.forName("java.time.LocalDate"));
        Object term68916 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term68881, term68881.getClass(), "id", 6462632207326555041L);
        setLongField(term68883, term68883.getClass(), "id", -3188913050877092148L);
        setLongField(term68885, term68885.getClass(), "id", -6759247883224780481L);
        setField(term68885, term68885.getClass(), "extId", term68887);
        setField(term68885, term68885.getClass(), "luid", "twDnEqZglX");
        setIntField(term68902, term68902.getClass(), "year", 2023);
        setShortField(term68902, term68902.getClass(), "month", (short) 1);
        setShortField(term68902, term68902.getClass(), "day", (short) 10);
        setField(term68901, term68901.getClass(), "date", term68902);
        setByteField(term68906, term68906.getClass(), "hour", (byte) 2);
        setByteField(term68906, term68906.getClass(), "minute", (byte) 12);
        setByteField(term68906, term68906.getClass(), "second", (byte) 45);
        setIntField(term68906, term68906.getClass(), "nano", 793047168);
        setField(term68901, term68901.getClass(), "time", term68906);
        setField(term68885, term68885.getClass(), "registerTime", term68901);
        setIntField(term68912, term68912.getClass(), "year", 2028);
        setShortField(term68912, term68912.getClass(), "month", (short) 6);
        setShortField(term68912, term68912.getClass(), "day", (short) 12);
        setField(term68911, term68911.getClass(), "date", term68912);
        setByteField(term68916, term68916.getClass(), "hour", (byte) 9);
        setByteField(term68916, term68916.getClass(), "minute", (byte) 39);
        setByteField(term68916, term68916.getClass(), "second", (byte) 7);
        setIntField(term68916, term68916.getClass(), "nano", 950068890);
        setField(term68911, term68911.getClass(), "time", term68916);
        setField(term68885, term68885.getClass(), "accessTime", term68911);
        setField(term68883, term68883.getClass(), "card", term68885);
        setIntField(term68883, term68883.getClass(), "lastDataVersion", -1632149194);
        setField(term68883, term68883.getClass(), "userName", "TWzZFATLAj");
        setIntField(term68883, term68883.getClass(), "point", -741353227);
        setIntField(term68883, term68883.getClass(), "totalPoint", -1211689558);
        setIntField(term68883, term68883.getClass(), "iconId", 318737566);
        setIntField(term68883, term68883.getClass(), "nameplateId", -106759249);
        setIntField(term68883, term68883.getClass(), "frameId", -1013531363);
        setIntField(term68883, term68883.getClass(), "trophyId", 1995440429);
        setIntField(term68883, term68883.getClass(), "playCount", -2048810677);
        setIntField(term68883, term68883.getClass(), "playVsCount", 1754415460);
        setIntField(term68883, term68883.getClass(), "playSyncCount", 2123228484);
        setIntField(term68883, term68883.getClass(), "winCount", 2086821771);
        setIntField(term68883, term68883.getClass(), "helpCount", 1148090074);
        setIntField(term68883, term68883.getClass(), "comboCount", 1314246472);
        setIntField(term68883, term68883.getClass(), "feverCount", -1940733744);
        setIntField(term68883, term68883.getClass(), "totalHiScore", 813004922);
        setIntField(term68883, term68883.getClass(), "totalEasyHighScore", 1040865837);
        setIntField(term68883, term68883.getClass(), "totalBasicHighScore", -462903820);
        setIntField(term68883, term68883.getClass(), "totalAdvancedHighScore", -1257429974);
        setIntField(term68883, term68883.getClass(), "totalExpertHighScore", -1004528891);
        setIntField(term68883, term68883.getClass(), "totalMasterHighScore", 851896454);
        setIntField(term68883, term68883.getClass(), "totalReMasterHighScore", -443182574);
        setIntField(term68883, term68883.getClass(), "totalHighSync", 970363720);
        setIntField(term68883, term68883.getClass(), "totalEasySync", 442783372);
        setIntField(term68883, term68883.getClass(), "totalBasicSync", -433426890);
        setIntField(term68883, term68883.getClass(), "totalAdvancedSync", -1310705922);
        setIntField(term68883, term68883.getClass(), "totalExpertSync", -2051858041);
        setIntField(term68883, term68883.getClass(), "totalMasterSync", -355516401);
        setIntField(term68883, term68883.getClass(), "totalReMasterSync", 1837235354);
        setIntField(term68883, term68883.getClass(), "playerRating", 1008836521);
        setIntField(term68883, term68883.getClass(), "highestRating", 1301805757);
        setIntField(term68883, term68883.getClass(), "rankAuthTailId", -103200853);
        setField(term68883, term68883.getClass(), "eventWatchedDate", "QjsqHrtVMY");
        setField(term68883, term68883.getClass(), "webLimitDate", "PlQZGGhnZK");
        setIntField(term68883, term68883.getClass(), "challengeTrackPhase", 191523655);
        setIntField(term68883, term68883.getClass(), "firstPlayBits", -832407103);
        setField(term68883, term68883.getClass(), "lastPlayDate", "sTtLCWDEPO");
        setIntField(term68883, term68883.getClass(), "lastPlaceId", -114759282);
        setField(term68883, term68883.getClass(), "lastPlaceName", "UGMtNRjhnC");
        setIntField(term68883, term68883.getClass(), "lastRegionId", -1514675613);
        setField(term68883, term68883.getClass(), "lastRegionName", "oTnPmmIphJ");
        setField(term68883, term68883.getClass(), "lastClientId", "vTgJolwQXF");
        setField(term68883, term68883.getClass(), "lastCountryCode", "QuNSfeKtAH");
        setIntField(term68883, term68883.getClass(), "eventPoint", -62146428);
        setIntField(term68883, term68883.getClass(), "totalLv", 1979408142);
        setIntField(term68883, term68883.getClass(), "lastLoginBonusDay", 244805374);
        setIntField(term68883, term68883.getClass(), "lastSurvivalBonusDay", 1475972131);
        setIntField(term68883, term68883.getClass(), "loginBonusLv", 1397062904);
        setField(term68881, term68881.getClass(), "user", term68883);
        setIntField(term68881, term68881.getClass(), "soudEffect", 1176883487);
        setIntField(term68881, term68881.getClass(), "mirrorMode", -6078648);
        setIntField(term68881, term68881.getClass(), "guideSpeed", 709977602);
        setIntField(term68881, term68881.getClass(), "bgInfo", -205363548);
        setIntField(term68881, term68881.getClass(), "brightness", 221170469);
        setIntField(term68881, term68881.getClass(), "isStarRot", -177915923);
        setIntField(term68881, term68881.getClass(), "breakSe", 931656903);
        setIntField(term68881, term68881.getClass(), "slideSe", 1825828626);
        setIntField(term68881, term68881.getClass(), "hardJudge", 807800350);
        setIntField(term68881, term68881.getClass(), "isTagJump", 1099637519);
        setIntField(term68881, term68881.getClass(), "breakSeVol", 1826276270);
        setIntField(term68881, term68881.getClass(), "slideSeVol", 265732302);
        setIntField(term68881, term68881.getClass(), "isUpperDisp", 552831797);
        setIntField(term68881, term68881.getClass(), "trackSkip", -1355031554);
        setIntField(term68881, term68881.getClass(), "optionMode", 74248043);
        setIntField(term68881, term68881.getClass(), "simpleOptionParam", -822902763);
        setIntField(term68881, term68881.getClass(), "adjustTiming", -311521176);
        setIntField(term68881, term68881.getClass(), "dispTiming", -1589597933);
        setIntField(term68881, term68881.getClass(), "timingPos", 721870191);
        setIntField(term68881, term68881.getClass(), "ansVol", -115938612);
        setIntField(term68881, term68881.getClass(), "noteVol", 1101568875);
        setIntField(term68881, term68881.getClass(), "dmgVol", 1737088701);
        setIntField(term68881, term68881.getClass(), "appealFlame", 1115923305);
        setIntField(term68881, term68881.getClass(), "isFeverDisp", -1288207437);
        setIntField(term68881, term68881.getClass(), "dispJudge", -1906837813);
        setIntField(term68881, term68881.getClass(), "judgePos", 2029133784);
        setIntField(term68881, term68881.getClass(), "ratingGuard", 187622159);
        setIntField(term68881, term68881.getClass(), "selectChara", 2037267674);
        setIntField(term68881, term68881.getClass(), "sortType", -462650026);
        setIntField(term68881, term68881.getClass(), "filterGenre", -662384827);
        setIntField(term68881, term68881.getClass(), "filterLevel", 423501341);
        setIntField(term68881, term68881.getClass(), "filterRank", 281728339);
        setIntField(term68881, term68881.getClass(), "filterVersion", 849043386);
        setIntField(term68881, term68881.getClass(), "filterRec", 1153533622);
        setIntField(term68881, term68881.getClass(), "filterFullCombo", -188954978);
        setIntField(term68881, term68881.getClass(), "filterAllPerfect", 740548136);
        setIntField(term68881, term68881.getClass(), "filterDifficulty", 2136221804);
        setIntField(term68881, term68881.getClass(), "filterFullSync", 1553966793);
        setIntField(term68881, term68881.getClass(), "filterReMaster", 972197737);
        setIntField(term68881, term68881.getClass(), "filterMaxFever", -710042993);
        setIntField(term68881, term68881.getClass(), "finalSelectId", 861747659);
        setIntField(term68881, term68881.getClass(), "finalSelectCategory", 1991398488);
        term69099 = new Integer(-356531986);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term69099;
        callMethod(klass, "setSlideSeVol", argTypes, term68881, args);
    }

};


