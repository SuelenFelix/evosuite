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

public class UserOption_setFinalSelectId_42591987187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77871;
     Object term78089;

    public UserOption_setFinalSelectId_42591987187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term77877 = new Long(-2187638136407967948L);
        term77871 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term77873 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term77875 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term77891 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term77892 = newInstance(Class.forName("java.time.LocalDate"));
        Object term77896 = newInstance(Class.forName("java.time.LocalTime"));
        Object term77901 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term77902 = newInstance(Class.forName("java.time.LocalDate"));
        Object term77906 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term77871, term77871.getClass(), "id", 4903104596895674146L);
        setLongField(term77873, term77873.getClass(), "id", 3410093279424884335L);
        setLongField(term77875, term77875.getClass(), "id", -8848853088235282046L);
        setField(term77875, term77875.getClass(), "extId", term77877);
        setField(term77875, term77875.getClass(), "luid", "zTMIjtwMQL");
        setIntField(term77892, term77892.getClass(), "year", 2013);
        setShortField(term77892, term77892.getClass(), "month", (short) 5);
        setShortField(term77892, term77892.getClass(), "day", (short) 9);
        setField(term77891, term77891.getClass(), "date", term77892);
        setByteField(term77896, term77896.getClass(), "hour", (byte) 21);
        setByteField(term77896, term77896.getClass(), "minute", (byte) 29);
        setByteField(term77896, term77896.getClass(), "second", (byte) 31);
        setIntField(term77896, term77896.getClass(), "nano", 674914044);
        setField(term77891, term77891.getClass(), "time", term77896);
        setField(term77875, term77875.getClass(), "registerTime", term77891);
        setIntField(term77902, term77902.getClass(), "year", 2029);
        setShortField(term77902, term77902.getClass(), "month", (short) 10);
        setShortField(term77902, term77902.getClass(), "day", (short) 7);
        setField(term77901, term77901.getClass(), "date", term77902);
        setByteField(term77906, term77906.getClass(), "hour", (byte) 8);
        setByteField(term77906, term77906.getClass(), "minute", (byte) 43);
        setByteField(term77906, term77906.getClass(), "second", (byte) 49);
        setIntField(term77906, term77906.getClass(), "nano", 733700043);
        setField(term77901, term77901.getClass(), "time", term77906);
        setField(term77875, term77875.getClass(), "accessTime", term77901);
        setField(term77873, term77873.getClass(), "card", term77875);
        setIntField(term77873, term77873.getClass(), "lastDataVersion", 1846059754);
        setField(term77873, term77873.getClass(), "userName", "cjJhlsbSLZ");
        setIntField(term77873, term77873.getClass(), "point", -1186201039);
        setIntField(term77873, term77873.getClass(), "totalPoint", 1037901538);
        setIntField(term77873, term77873.getClass(), "iconId", -1215744049);
        setIntField(term77873, term77873.getClass(), "nameplateId", 1349434177);
        setIntField(term77873, term77873.getClass(), "frameId", -1144155182);
        setIntField(term77873, term77873.getClass(), "trophyId", -2139395961);
        setIntField(term77873, term77873.getClass(), "playCount", 1129939960);
        setIntField(term77873, term77873.getClass(), "playVsCount", 1940453285);
        setIntField(term77873, term77873.getClass(), "playSyncCount", 318563460);
        setIntField(term77873, term77873.getClass(), "winCount", -2020067684);
        setIntField(term77873, term77873.getClass(), "helpCount", 1415751361);
        setIntField(term77873, term77873.getClass(), "comboCount", 1812325636);
        setIntField(term77873, term77873.getClass(), "feverCount", 1867850244);
        setIntField(term77873, term77873.getClass(), "totalHiScore", 1005070200);
        setIntField(term77873, term77873.getClass(), "totalEasyHighScore", 1460231572);
        setIntField(term77873, term77873.getClass(), "totalBasicHighScore", -974042047);
        setIntField(term77873, term77873.getClass(), "totalAdvancedHighScore", -547386330);
        setIntField(term77873, term77873.getClass(), "totalExpertHighScore", -223547211);
        setIntField(term77873, term77873.getClass(), "totalMasterHighScore", 1946453460);
        setIntField(term77873, term77873.getClass(), "totalReMasterHighScore", -2120862173);
        setIntField(term77873, term77873.getClass(), "totalHighSync", 1076648881);
        setIntField(term77873, term77873.getClass(), "totalEasySync", -2100263353);
        setIntField(term77873, term77873.getClass(), "totalBasicSync", 1350088807);
        setIntField(term77873, term77873.getClass(), "totalAdvancedSync", -2113357167);
        setIntField(term77873, term77873.getClass(), "totalExpertSync", 1043903367);
        setIntField(term77873, term77873.getClass(), "totalMasterSync", -1029497137);
        setIntField(term77873, term77873.getClass(), "totalReMasterSync", 624138612);
        setIntField(term77873, term77873.getClass(), "playerRating", 1004605180);
        setIntField(term77873, term77873.getClass(), "highestRating", -413138935);
        setIntField(term77873, term77873.getClass(), "rankAuthTailId", 797223217);
        setField(term77873, term77873.getClass(), "eventWatchedDate", "BvcBilSFZf");
        setField(term77873, term77873.getClass(), "webLimitDate", "ppUmoMssug");
        setIntField(term77873, term77873.getClass(), "challengeTrackPhase", 501604461);
        setIntField(term77873, term77873.getClass(), "firstPlayBits", 1070893083);
        setField(term77873, term77873.getClass(), "lastPlayDate", "FcponInvBb");
        setIntField(term77873, term77873.getClass(), "lastPlaceId", -814126919);
        setField(term77873, term77873.getClass(), "lastPlaceName", "IFOOxmFxbX");
        setIntField(term77873, term77873.getClass(), "lastRegionId", -197687453);
        setField(term77873, term77873.getClass(), "lastRegionName", "aDEuPKrSZt");
        setField(term77873, term77873.getClass(), "lastClientId", "aDhkmoCCUK");
        setField(term77873, term77873.getClass(), "lastCountryCode", "ibnuoVVkVm");
        setIntField(term77873, term77873.getClass(), "eventPoint", 1906793551);
        setIntField(term77873, term77873.getClass(), "totalLv", 762348254);
        setIntField(term77873, term77873.getClass(), "lastLoginBonusDay", -1339541472);
        setIntField(term77873, term77873.getClass(), "lastSurvivalBonusDay", -1339841912);
        setIntField(term77873, term77873.getClass(), "loginBonusLv", 1493202984);
        setField(term77871, term77871.getClass(), "user", term77873);
        setIntField(term77871, term77871.getClass(), "soudEffect", -1545181029);
        setIntField(term77871, term77871.getClass(), "mirrorMode", 863002097);
        setIntField(term77871, term77871.getClass(), "guideSpeed", 1454255164);
        setIntField(term77871, term77871.getClass(), "bgInfo", 258540505);
        setIntField(term77871, term77871.getClass(), "brightness", -636009842);
        setIntField(term77871, term77871.getClass(), "isStarRot", -1643221139);
        setIntField(term77871, term77871.getClass(), "breakSe", -616849103);
        setIntField(term77871, term77871.getClass(), "slideSe", -1763424995);
        setIntField(term77871, term77871.getClass(), "hardJudge", 1191219328);
        setIntField(term77871, term77871.getClass(), "isTagJump", 1420085769);
        setIntField(term77871, term77871.getClass(), "breakSeVol", -1716068102);
        setIntField(term77871, term77871.getClass(), "slideSeVol", 1751028937);
        setIntField(term77871, term77871.getClass(), "isUpperDisp", -946645308);
        setIntField(term77871, term77871.getClass(), "trackSkip", -1547322289);
        setIntField(term77871, term77871.getClass(), "optionMode", 231829287);
        setIntField(term77871, term77871.getClass(), "simpleOptionParam", -1963914155);
        setIntField(term77871, term77871.getClass(), "adjustTiming", -1038510230);
        setIntField(term77871, term77871.getClass(), "dispTiming", -788735743);
        setIntField(term77871, term77871.getClass(), "timingPos", 1373516177);
        setIntField(term77871, term77871.getClass(), "ansVol", 1802766234);
        setIntField(term77871, term77871.getClass(), "noteVol", 685615791);
        setIntField(term77871, term77871.getClass(), "dmgVol", -1200105341);
        setIntField(term77871, term77871.getClass(), "appealFlame", 2053718006);
        setIntField(term77871, term77871.getClass(), "isFeverDisp", -183402787);
        setIntField(term77871, term77871.getClass(), "dispJudge", -519427406);
        setIntField(term77871, term77871.getClass(), "judgePos", 705801338);
        setIntField(term77871, term77871.getClass(), "ratingGuard", 2059704519);
        setIntField(term77871, term77871.getClass(), "selectChara", -686523125);
        setIntField(term77871, term77871.getClass(), "sortType", -554670483);
        setIntField(term77871, term77871.getClass(), "filterGenre", -813127249);
        setIntField(term77871, term77871.getClass(), "filterLevel", 703254336);
        setIntField(term77871, term77871.getClass(), "filterRank", 339949126);
        setIntField(term77871, term77871.getClass(), "filterVersion", 1498320866);
        setIntField(term77871, term77871.getClass(), "filterRec", -1093473223);
        setIntField(term77871, term77871.getClass(), "filterFullCombo", -342489415);
        setIntField(term77871, term77871.getClass(), "filterAllPerfect", 820347552);
        setIntField(term77871, term77871.getClass(), "filterDifficulty", 1494096276);
        setIntField(term77871, term77871.getClass(), "filterFullSync", 1964136923);
        setIntField(term77871, term77871.getClass(), "filterReMaster", -1334128836);
        setIntField(term77871, term77871.getClass(), "filterMaxFever", -562970331);
        setIntField(term77871, term77871.getClass(), "finalSelectId", -444205256);
        setIntField(term77871, term77871.getClass(), "finalSelectCategory", -220469590);
        term78089 = new Integer(-2021935274);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term78089;
        callMethod(klass, "setFinalSelectId", argTypes, term77871, args);
    }

};


