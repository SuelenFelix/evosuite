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

public class UserOption_getFilterReMaster_72969523341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63357;

    public UserOption_getFilterReMaster_72969523341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term63363 = new Long(-7698746988132548371L);
        term63357 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term63359 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term63361 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term63377 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term63378 = newInstance(Class.forName("java.time.LocalDate"));
        Object term63382 = newInstance(Class.forName("java.time.LocalTime"));
        Object term63387 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term63388 = newInstance(Class.forName("java.time.LocalDate"));
        Object term63392 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term63357, term63357.getClass(), "id", -7830820957252387854L);
        setLongField(term63359, term63359.getClass(), "id", -8985577692063635272L);
        setLongField(term63361, term63361.getClass(), "id", 6545086285386938562L);
        setField(term63361, term63361.getClass(), "extId", term63363);
        setField(term63361, term63361.getClass(), "luid", "RSuRSjiLvm");
        setIntField(term63378, term63378.getClass(), "year", 2027);
        setShortField(term63378, term63378.getClass(), "month", (short) 3);
        setShortField(term63378, term63378.getClass(), "day", (short) 20);
        setField(term63377, term63377.getClass(), "date", term63378);
        setByteField(term63382, term63382.getClass(), "hour", (byte) 9);
        setByteField(term63382, term63382.getClass(), "minute", (byte) 34);
        setByteField(term63382, term63382.getClass(), "second", (byte) 31);
        setIntField(term63382, term63382.getClass(), "nano", 746182707);
        setField(term63377, term63377.getClass(), "time", term63382);
        setField(term63361, term63361.getClass(), "registerTime", term63377);
        setIntField(term63388, term63388.getClass(), "year", 2018);
        setShortField(term63388, term63388.getClass(), "month", (short) 9);
        setShortField(term63388, term63388.getClass(), "day", (short) 11);
        setField(term63387, term63387.getClass(), "date", term63388);
        setByteField(term63392, term63392.getClass(), "hour", (byte) 18);
        setByteField(term63392, term63392.getClass(), "minute", (byte) 44);
        setByteField(term63392, term63392.getClass(), "second", (byte) 42);
        setIntField(term63392, term63392.getClass(), "nano", 303163100);
        setField(term63387, term63387.getClass(), "time", term63392);
        setField(term63361, term63361.getClass(), "accessTime", term63387);
        setField(term63359, term63359.getClass(), "card", term63361);
        setIntField(term63359, term63359.getClass(), "lastDataVersion", -1541815388);
        setField(term63359, term63359.getClass(), "userName", "aoeNWgMpNx");
        setIntField(term63359, term63359.getClass(), "point", 1831746570);
        setIntField(term63359, term63359.getClass(), "totalPoint", 1122907916);
        setIntField(term63359, term63359.getClass(), "iconId", -349436567);
        setIntField(term63359, term63359.getClass(), "nameplateId", 500313706);
        setIntField(term63359, term63359.getClass(), "frameId", 1386108098);
        setIntField(term63359, term63359.getClass(), "trophyId", 1902248044);
        setIntField(term63359, term63359.getClass(), "playCount", 78847548);
        setIntField(term63359, term63359.getClass(), "playVsCount", 70270034);
        setIntField(term63359, term63359.getClass(), "playSyncCount", -1647216925);
        setIntField(term63359, term63359.getClass(), "winCount", -1854553775);
        setIntField(term63359, term63359.getClass(), "helpCount", -163217614);
        setIntField(term63359, term63359.getClass(), "comboCount", 505508857);
        setIntField(term63359, term63359.getClass(), "feverCount", -379015970);
        setIntField(term63359, term63359.getClass(), "totalHiScore", -1423225080);
        setIntField(term63359, term63359.getClass(), "totalEasyHighScore", 333862631);
        setIntField(term63359, term63359.getClass(), "totalBasicHighScore", -50668397);
        setIntField(term63359, term63359.getClass(), "totalAdvancedHighScore", -259152632);
        setIntField(term63359, term63359.getClass(), "totalExpertHighScore", 1739990377);
        setIntField(term63359, term63359.getClass(), "totalMasterHighScore", -1151136793);
        setIntField(term63359, term63359.getClass(), "totalReMasterHighScore", 879241247);
        setIntField(term63359, term63359.getClass(), "totalHighSync", 1067606467);
        setIntField(term63359, term63359.getClass(), "totalEasySync", -1111900633);
        setIntField(term63359, term63359.getClass(), "totalBasicSync", 113501041);
        setIntField(term63359, term63359.getClass(), "totalAdvancedSync", 1055313115);
        setIntField(term63359, term63359.getClass(), "totalExpertSync", 611928031);
        setIntField(term63359, term63359.getClass(), "totalMasterSync", -1840936599);
        setIntField(term63359, term63359.getClass(), "totalReMasterSync", 962187390);
        setIntField(term63359, term63359.getClass(), "playerRating", -1537949190);
        setIntField(term63359, term63359.getClass(), "highestRating", 1687498557);
        setIntField(term63359, term63359.getClass(), "rankAuthTailId", 1883200409);
        setField(term63359, term63359.getClass(), "eventWatchedDate", "RQvXfSweVs");
        setField(term63359, term63359.getClass(), "webLimitDate", "jGxArBjtep");
        setIntField(term63359, term63359.getClass(), "challengeTrackPhase", -1909739775);
        setIntField(term63359, term63359.getClass(), "firstPlayBits", -1671310444);
        setField(term63359, term63359.getClass(), "lastPlayDate", "dUXsPNSUez");
        setIntField(term63359, term63359.getClass(), "lastPlaceId", 902257077);
        setField(term63359, term63359.getClass(), "lastPlaceName", "PxGDfPOAFS");
        setIntField(term63359, term63359.getClass(), "lastRegionId", -1582930822);
        setField(term63359, term63359.getClass(), "lastRegionName", "dZVxzYEeZe");
        setField(term63359, term63359.getClass(), "lastClientId", "TnCQRmzwPf");
        setField(term63359, term63359.getClass(), "lastCountryCode", "ZGnUKGTWCn");
        setIntField(term63359, term63359.getClass(), "eventPoint", 1105555311);
        setIntField(term63359, term63359.getClass(), "totalLv", -1070743074);
        setIntField(term63359, term63359.getClass(), "lastLoginBonusDay", -897878983);
        setIntField(term63359, term63359.getClass(), "lastSurvivalBonusDay", 2049311616);
        setIntField(term63359, term63359.getClass(), "loginBonusLv", -745539968);
        setField(term63357, term63357.getClass(), "user", term63359);
        setIntField(term63357, term63357.getClass(), "soudEffect", 206348186);
        setIntField(term63357, term63357.getClass(), "mirrorMode", -983562694);
        setIntField(term63357, term63357.getClass(), "guideSpeed", 1376849243);
        setIntField(term63357, term63357.getClass(), "bgInfo", 511751479);
        setIntField(term63357, term63357.getClass(), "brightness", -905042992);
        setIntField(term63357, term63357.getClass(), "isStarRot", 169603914);
        setIntField(term63357, term63357.getClass(), "breakSe", 827545300);
        setIntField(term63357, term63357.getClass(), "slideSe", -111395552);
        setIntField(term63357, term63357.getClass(), "hardJudge", 997974718);
        setIntField(term63357, term63357.getClass(), "isTagJump", 2024272642);
        setIntField(term63357, term63357.getClass(), "breakSeVol", 879794397);
        setIntField(term63357, term63357.getClass(), "slideSeVol", -772320040);
        setIntField(term63357, term63357.getClass(), "isUpperDisp", -1806851572);
        setIntField(term63357, term63357.getClass(), "trackSkip", 686629669);
        setIntField(term63357, term63357.getClass(), "optionMode", 1468334562);
        setIntField(term63357, term63357.getClass(), "simpleOptionParam", 1888899282);
        setIntField(term63357, term63357.getClass(), "adjustTiming", -766362556);
        setIntField(term63357, term63357.getClass(), "dispTiming", 314054661);
        setIntField(term63357, term63357.getClass(), "timingPos", 766314597);
        setIntField(term63357, term63357.getClass(), "ansVol", -826100649);
        setIntField(term63357, term63357.getClass(), "noteVol", 213829504);
        setIntField(term63357, term63357.getClass(), "dmgVol", -1256059099);
        setIntField(term63357, term63357.getClass(), "appealFlame", -1820372279);
        setIntField(term63357, term63357.getClass(), "isFeverDisp", 720068302);
        setIntField(term63357, term63357.getClass(), "dispJudge", 1790767972);
        setIntField(term63357, term63357.getClass(), "judgePos", 780675103);
        setIntField(term63357, term63357.getClass(), "ratingGuard", 714917997);
        setIntField(term63357, term63357.getClass(), "selectChara", 713279805);
        setIntField(term63357, term63357.getClass(), "sortType", -374549938);
        setIntField(term63357, term63357.getClass(), "filterGenre", 1430439880);
        setIntField(term63357, term63357.getClass(), "filterLevel", 1074274300);
        setIntField(term63357, term63357.getClass(), "filterRank", -1533339633);
        setIntField(term63357, term63357.getClass(), "filterVersion", -1306689076);
        setIntField(term63357, term63357.getClass(), "filterRec", 801999249);
        setIntField(term63357, term63357.getClass(), "filterFullCombo", 406290178);
        setIntField(term63357, term63357.getClass(), "filterAllPerfect", 1328284951);
        setIntField(term63357, term63357.getClass(), "filterDifficulty", -490510770);
        setIntField(term63357, term63357.getClass(), "filterFullSync", -1154325713);
        setIntField(term63357, term63357.getClass(), "filterReMaster", -1075315005);
        setIntField(term63357, term63357.getClass(), "filterMaxFever", -34413100);
        setIntField(term63357, term63357.getClass(), "finalSelectId", 1508503068);
        setIntField(term63357, term63357.getClass(), "finalSelectCategory", 915463806);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFilterReMaster", argTypes, term63357, args);
    }

};


