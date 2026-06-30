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

public class UserOption_getOptionMode_31883419617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55965;

    public UserOption_getOptionMode_31883419617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term55971 = new Long(-8327432141027603933L);
        term55965 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term55967 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term55969 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term55985 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term55986 = newInstance(Class.forName("java.time.LocalDate"));
        Object term55990 = newInstance(Class.forName("java.time.LocalTime"));
        Object term55995 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term55996 = newInstance(Class.forName("java.time.LocalDate"));
        Object term56000 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term55965, term55965.getClass(), "id", -6237686742902369498L);
        setLongField(term55967, term55967.getClass(), "id", -2286229228641472715L);
        setLongField(term55969, term55969.getClass(), "id", 7464122056779140588L);
        setField(term55969, term55969.getClass(), "extId", term55971);
        setField(term55969, term55969.getClass(), "luid", "sWJHIWZMuX");
        setIntField(term55986, term55986.getClass(), "year", 2029);
        setShortField(term55986, term55986.getClass(), "month", (short) 2);
        setShortField(term55986, term55986.getClass(), "day", (short) 4);
        setField(term55985, term55985.getClass(), "date", term55986);
        setByteField(term55990, term55990.getClass(), "hour", (byte) 18);
        setByteField(term55990, term55990.getClass(), "minute", (byte) 31);
        setByteField(term55990, term55990.getClass(), "second", (byte) 27);
        setIntField(term55990, term55990.getClass(), "nano", 737016275);
        setField(term55985, term55985.getClass(), "time", term55990);
        setField(term55969, term55969.getClass(), "registerTime", term55985);
        setIntField(term55996, term55996.getClass(), "year", 2022);
        setShortField(term55996, term55996.getClass(), "month", (short) 3);
        setShortField(term55996, term55996.getClass(), "day", (short) 27);
        setField(term55995, term55995.getClass(), "date", term55996);
        setByteField(term56000, term56000.getClass(), "hour", (byte) 18);
        setByteField(term56000, term56000.getClass(), "minute", (byte) 52);
        setByteField(term56000, term56000.getClass(), "second", (byte) 30);
        setIntField(term56000, term56000.getClass(), "nano", 610437590);
        setField(term55995, term55995.getClass(), "time", term56000);
        setField(term55969, term55969.getClass(), "accessTime", term55995);
        setField(term55967, term55967.getClass(), "card", term55969);
        setIntField(term55967, term55967.getClass(), "lastDataVersion", 988952771);
        setField(term55967, term55967.getClass(), "userName", "PwMdJRwzDW");
        setIntField(term55967, term55967.getClass(), "point", 860466584);
        setIntField(term55967, term55967.getClass(), "totalPoint", -1230615258);
        setIntField(term55967, term55967.getClass(), "iconId", -1230485683);
        setIntField(term55967, term55967.getClass(), "nameplateId", -341831994);
        setIntField(term55967, term55967.getClass(), "frameId", -190607004);
        setIntField(term55967, term55967.getClass(), "trophyId", 1193989353);
        setIntField(term55967, term55967.getClass(), "playCount", 701908779);
        setIntField(term55967, term55967.getClass(), "playVsCount", -1681756654);
        setIntField(term55967, term55967.getClass(), "playSyncCount", -872888112);
        setIntField(term55967, term55967.getClass(), "winCount", 893339147);
        setIntField(term55967, term55967.getClass(), "helpCount", 1550463846);
        setIntField(term55967, term55967.getClass(), "comboCount", 693808687);
        setIntField(term55967, term55967.getClass(), "feverCount", -1713920125);
        setIntField(term55967, term55967.getClass(), "totalHiScore", -242270358);
        setIntField(term55967, term55967.getClass(), "totalEasyHighScore", 1299600213);
        setIntField(term55967, term55967.getClass(), "totalBasicHighScore", 1067527367);
        setIntField(term55967, term55967.getClass(), "totalAdvancedHighScore", 74605400);
        setIntField(term55967, term55967.getClass(), "totalExpertHighScore", 642608767);
        setIntField(term55967, term55967.getClass(), "totalMasterHighScore", 1819464978);
        setIntField(term55967, term55967.getClass(), "totalReMasterHighScore", -1556266779);
        setIntField(term55967, term55967.getClass(), "totalHighSync", 2078431621);
        setIntField(term55967, term55967.getClass(), "totalEasySync", -316254290);
        setIntField(term55967, term55967.getClass(), "totalBasicSync", 923308344);
        setIntField(term55967, term55967.getClass(), "totalAdvancedSync", -30626466);
        setIntField(term55967, term55967.getClass(), "totalExpertSync", 393740799);
        setIntField(term55967, term55967.getClass(), "totalMasterSync", -148451361);
        setIntField(term55967, term55967.getClass(), "totalReMasterSync", -1277311250);
        setIntField(term55967, term55967.getClass(), "playerRating", -443857266);
        setIntField(term55967, term55967.getClass(), "highestRating", 1150039325);
        setIntField(term55967, term55967.getClass(), "rankAuthTailId", 1805122380);
        setField(term55967, term55967.getClass(), "eventWatchedDate", "sMiHxgXUuN");
        setField(term55967, term55967.getClass(), "webLimitDate", "oVChCWWDag");
        setIntField(term55967, term55967.getClass(), "challengeTrackPhase", -1062988764);
        setIntField(term55967, term55967.getClass(), "firstPlayBits", 2034417479);
        setField(term55967, term55967.getClass(), "lastPlayDate", "EteTxkDxin");
        setIntField(term55967, term55967.getClass(), "lastPlaceId", 1064150907);
        setField(term55967, term55967.getClass(), "lastPlaceName", "mKgLwPdYbY");
        setIntField(term55967, term55967.getClass(), "lastRegionId", -1331960420);
        setField(term55967, term55967.getClass(), "lastRegionName", "zqykonsLIo");
        setField(term55967, term55967.getClass(), "lastClientId", "KoPzTuvIeK");
        setField(term55967, term55967.getClass(), "lastCountryCode", "SMoWUILIhn");
        setIntField(term55967, term55967.getClass(), "eventPoint", -1210634724);
        setIntField(term55967, term55967.getClass(), "totalLv", -508178169);
        setIntField(term55967, term55967.getClass(), "lastLoginBonusDay", -2091925472);
        setIntField(term55967, term55967.getClass(), "lastSurvivalBonusDay", 1232275249);
        setIntField(term55967, term55967.getClass(), "loginBonusLv", 1267736108);
        setField(term55965, term55965.getClass(), "user", term55967);
        setIntField(term55965, term55965.getClass(), "soudEffect", 1090073448);
        setIntField(term55965, term55965.getClass(), "mirrorMode", 1691233507);
        setIntField(term55965, term55965.getClass(), "guideSpeed", 1543785405);
        setIntField(term55965, term55965.getClass(), "bgInfo", -20379967);
        setIntField(term55965, term55965.getClass(), "brightness", 1331697372);
        setIntField(term55965, term55965.getClass(), "isStarRot", 636147978);
        setIntField(term55965, term55965.getClass(), "breakSe", -154767845);
        setIntField(term55965, term55965.getClass(), "slideSe", 296334503);
        setIntField(term55965, term55965.getClass(), "hardJudge", -1521936744);
        setIntField(term55965, term55965.getClass(), "isTagJump", 681716275);
        setIntField(term55965, term55965.getClass(), "breakSeVol", -1564295844);
        setIntField(term55965, term55965.getClass(), "slideSeVol", 808812678);
        setIntField(term55965, term55965.getClass(), "isUpperDisp", -1317808688);
        setIntField(term55965, term55965.getClass(), "trackSkip", -1064589449);
        setIntField(term55965, term55965.getClass(), "optionMode", 1213636383);
        setIntField(term55965, term55965.getClass(), "simpleOptionParam", -1321778001);
        setIntField(term55965, term55965.getClass(), "adjustTiming", 183942181);
        setIntField(term55965, term55965.getClass(), "dispTiming", 851144395);
        setIntField(term55965, term55965.getClass(), "timingPos", -1579523291);
        setIntField(term55965, term55965.getClass(), "ansVol", -1378850024);
        setIntField(term55965, term55965.getClass(), "noteVol", 1668253019);
        setIntField(term55965, term55965.getClass(), "dmgVol", 125508778);
        setIntField(term55965, term55965.getClass(), "appealFlame", -358007773);
        setIntField(term55965, term55965.getClass(), "isFeverDisp", -321103963);
        setIntField(term55965, term55965.getClass(), "dispJudge", 8427599);
        setIntField(term55965, term55965.getClass(), "judgePos", 565643760);
        setIntField(term55965, term55965.getClass(), "ratingGuard", -999329318);
        setIntField(term55965, term55965.getClass(), "selectChara", 1219080873);
        setIntField(term55965, term55965.getClass(), "sortType", -1369941721);
        setIntField(term55965, term55965.getClass(), "filterGenre", 1986462729);
        setIntField(term55965, term55965.getClass(), "filterLevel", 1566646372);
        setIntField(term55965, term55965.getClass(), "filterRank", 1570723755);
        setIntField(term55965, term55965.getClass(), "filterVersion", 1595861707);
        setIntField(term55965, term55965.getClass(), "filterRec", 2030560074);
        setIntField(term55965, term55965.getClass(), "filterFullCombo", 961353937);
        setIntField(term55965, term55965.getClass(), "filterAllPerfect", 2105207916);
        setIntField(term55965, term55965.getClass(), "filterDifficulty", -1476783213);
        setIntField(term55965, term55965.getClass(), "filterFullSync", -1012030562);
        setIntField(term55965, term55965.getClass(), "filterReMaster", -224086286);
        setIntField(term55965, term55965.getClass(), "filterMaxFever", -516725720);
        setIntField(term55965, term55965.getClass(), "finalSelectId", 2065578304);
        setIntField(term55965, term55965.getClass(), "finalSelectCategory", 1871438692);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOptionMode", argTypes, term55965, args);
    }

};


