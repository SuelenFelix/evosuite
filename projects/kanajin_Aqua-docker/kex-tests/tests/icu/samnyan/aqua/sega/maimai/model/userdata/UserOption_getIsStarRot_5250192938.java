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

public class UserOption_getIsStarRot_5250192938 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53193;

    public UserOption_getIsStarRot_5250192938() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term53199 = new Long(-78240609295693193L);
        term53193 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term53195 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term53197 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term53213 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53214 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53218 = newInstance(Class.forName("java.time.LocalTime"));
        Object term53223 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53224 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53228 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term53193, term53193.getClass(), "id", 2990264647913003810L);
        setLongField(term53195, term53195.getClass(), "id", -2195794659127490022L);
        setLongField(term53197, term53197.getClass(), "id", 6142089107139955834L);
        setField(term53197, term53197.getClass(), "extId", term53199);
        setField(term53197, term53197.getClass(), "luid", "RFbJNwiLtv");
        setIntField(term53214, term53214.getClass(), "year", 2021);
        setShortField(term53214, term53214.getClass(), "month", (short) 11);
        setShortField(term53214, term53214.getClass(), "day", (short) 19);
        setField(term53213, term53213.getClass(), "date", term53214);
        setByteField(term53218, term53218.getClass(), "hour", (byte) 4);
        setByteField(term53218, term53218.getClass(), "minute", (byte) 39);
        setByteField(term53218, term53218.getClass(), "second", (byte) 43);
        setIntField(term53218, term53218.getClass(), "nano", 638695514);
        setField(term53213, term53213.getClass(), "time", term53218);
        setField(term53197, term53197.getClass(), "registerTime", term53213);
        setIntField(term53224, term53224.getClass(), "year", 2015);
        setShortField(term53224, term53224.getClass(), "month", (short) 10);
        setShortField(term53224, term53224.getClass(), "day", (short) 4);
        setField(term53223, term53223.getClass(), "date", term53224);
        setByteField(term53228, term53228.getClass(), "hour", (byte) 1);
        setByteField(term53228, term53228.getClass(), "minute", (byte) 29);
        setByteField(term53228, term53228.getClass(), "second", (byte) 20);
        setIntField(term53228, term53228.getClass(), "nano", 558273892);
        setField(term53223, term53223.getClass(), "time", term53228);
        setField(term53197, term53197.getClass(), "accessTime", term53223);
        setField(term53195, term53195.getClass(), "card", term53197);
        setIntField(term53195, term53195.getClass(), "lastDataVersion", 180900029);
        setField(term53195, term53195.getClass(), "userName", "eCxWMOpomA");
        setIntField(term53195, term53195.getClass(), "point", 1084899159);
        setIntField(term53195, term53195.getClass(), "totalPoint", -613970307);
        setIntField(term53195, term53195.getClass(), "iconId", 2045590105);
        setIntField(term53195, term53195.getClass(), "nameplateId", -2052631286);
        setIntField(term53195, term53195.getClass(), "frameId", -1474168411);
        setIntField(term53195, term53195.getClass(), "trophyId", -233688868);
        setIntField(term53195, term53195.getClass(), "playCount", 1222014341);
        setIntField(term53195, term53195.getClass(), "playVsCount", -2043344667);
        setIntField(term53195, term53195.getClass(), "playSyncCount", 1173313312);
        setIntField(term53195, term53195.getClass(), "winCount", 1956926414);
        setIntField(term53195, term53195.getClass(), "helpCount", -1787169684);
        setIntField(term53195, term53195.getClass(), "comboCount", 1564406673);
        setIntField(term53195, term53195.getClass(), "feverCount", 1505760902);
        setIntField(term53195, term53195.getClass(), "totalHiScore", 1276810708);
        setIntField(term53195, term53195.getClass(), "totalEasyHighScore", -375398621);
        setIntField(term53195, term53195.getClass(), "totalBasicHighScore", 856069240);
        setIntField(term53195, term53195.getClass(), "totalAdvancedHighScore", 1617630705);
        setIntField(term53195, term53195.getClass(), "totalExpertHighScore", -2035560140);
        setIntField(term53195, term53195.getClass(), "totalMasterHighScore", 532665626);
        setIntField(term53195, term53195.getClass(), "totalReMasterHighScore", 1052620858);
        setIntField(term53195, term53195.getClass(), "totalHighSync", 784368731);
        setIntField(term53195, term53195.getClass(), "totalEasySync", -325400272);
        setIntField(term53195, term53195.getClass(), "totalBasicSync", -439065543);
        setIntField(term53195, term53195.getClass(), "totalAdvancedSync", -2067100921);
        setIntField(term53195, term53195.getClass(), "totalExpertSync", -630380701);
        setIntField(term53195, term53195.getClass(), "totalMasterSync", -1571228038);
        setIntField(term53195, term53195.getClass(), "totalReMasterSync", 483151429);
        setIntField(term53195, term53195.getClass(), "playerRating", -292946895);
        setIntField(term53195, term53195.getClass(), "highestRating", -1582974640);
        setIntField(term53195, term53195.getClass(), "rankAuthTailId", -425384218);
        setField(term53195, term53195.getClass(), "eventWatchedDate", "pkQawlBtEF");
        setField(term53195, term53195.getClass(), "webLimitDate", "rdKTcvHHnV");
        setIntField(term53195, term53195.getClass(), "challengeTrackPhase", -1593819000);
        setIntField(term53195, term53195.getClass(), "firstPlayBits", -358856964);
        setField(term53195, term53195.getClass(), "lastPlayDate", "ELfUfLbXZf");
        setIntField(term53195, term53195.getClass(), "lastPlaceId", -367287466);
        setField(term53195, term53195.getClass(), "lastPlaceName", "SAglaHkagn");
        setIntField(term53195, term53195.getClass(), "lastRegionId", 784852065);
        setField(term53195, term53195.getClass(), "lastRegionName", "eZGxUfdoFn");
        setField(term53195, term53195.getClass(), "lastClientId", "yCWSlaOrSv");
        setField(term53195, term53195.getClass(), "lastCountryCode", "PFpWKxDIRz");
        setIntField(term53195, term53195.getClass(), "eventPoint", 358212017);
        setIntField(term53195, term53195.getClass(), "totalLv", -1993296712);
        setIntField(term53195, term53195.getClass(), "lastLoginBonusDay", -1609787368);
        setIntField(term53195, term53195.getClass(), "lastSurvivalBonusDay", -1900357855);
        setIntField(term53195, term53195.getClass(), "loginBonusLv", 1044601336);
        setField(term53193, term53193.getClass(), "user", term53195);
        setIntField(term53193, term53193.getClass(), "soudEffect", 562228242);
        setIntField(term53193, term53193.getClass(), "mirrorMode", 995283566);
        setIntField(term53193, term53193.getClass(), "guideSpeed", 1311217437);
        setIntField(term53193, term53193.getClass(), "bgInfo", 289716613);
        setIntField(term53193, term53193.getClass(), "brightness", 2114806182);
        setIntField(term53193, term53193.getClass(), "isStarRot", 41155687);
        setIntField(term53193, term53193.getClass(), "breakSe", 1224581311);
        setIntField(term53193, term53193.getClass(), "slideSe", 1017569554);
        setIntField(term53193, term53193.getClass(), "hardJudge", -1457930793);
        setIntField(term53193, term53193.getClass(), "isTagJump", -1761017199);
        setIntField(term53193, term53193.getClass(), "breakSeVol", -1171889960);
        setIntField(term53193, term53193.getClass(), "slideSeVol", -708194098);
        setIntField(term53193, term53193.getClass(), "isUpperDisp", 613501922);
        setIntField(term53193, term53193.getClass(), "trackSkip", -1145481353);
        setIntField(term53193, term53193.getClass(), "optionMode", -69628972);
        setIntField(term53193, term53193.getClass(), "simpleOptionParam", 2136375684);
        setIntField(term53193, term53193.getClass(), "adjustTiming", 1534903857);
        setIntField(term53193, term53193.getClass(), "dispTiming", -1364694166);
        setIntField(term53193, term53193.getClass(), "timingPos", -1031588818);
        setIntField(term53193, term53193.getClass(), "ansVol", -2142065668);
        setIntField(term53193, term53193.getClass(), "noteVol", -1027337235);
        setIntField(term53193, term53193.getClass(), "dmgVol", 2078039172);
        setIntField(term53193, term53193.getClass(), "appealFlame", 810570789);
        setIntField(term53193, term53193.getClass(), "isFeverDisp", 1688150689);
        setIntField(term53193, term53193.getClass(), "dispJudge", -1900819498);
        setIntField(term53193, term53193.getClass(), "judgePos", -1374608663);
        setIntField(term53193, term53193.getClass(), "ratingGuard", -1618100560);
        setIntField(term53193, term53193.getClass(), "selectChara", 751804772);
        setIntField(term53193, term53193.getClass(), "sortType", 1423413334);
        setIntField(term53193, term53193.getClass(), "filterGenre", -1579434672);
        setIntField(term53193, term53193.getClass(), "filterLevel", 609266606);
        setIntField(term53193, term53193.getClass(), "filterRank", 1221933023);
        setIntField(term53193, term53193.getClass(), "filterVersion", -216688430);
        setIntField(term53193, term53193.getClass(), "filterRec", 456466881);
        setIntField(term53193, term53193.getClass(), "filterFullCombo", -106998943);
        setIntField(term53193, term53193.getClass(), "filterAllPerfect", 1961013692);
        setIntField(term53193, term53193.getClass(), "filterDifficulty", -957809597);
        setIntField(term53193, term53193.getClass(), "filterFullSync", 1086125728);
        setIntField(term53193, term53193.getClass(), "filterReMaster", 1992510749);
        setIntField(term53193, term53193.getClass(), "filterMaxFever", -1803247273);
        setIntField(term53193, term53193.getClass(), "finalSelectId", -1755475707);
        setIntField(term53193, term53193.getClass(), "finalSelectCategory", -1233102871);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIsStarRot", argTypes, term53193, args);
    }

};


