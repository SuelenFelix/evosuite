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

public class UserOption_setIsUpperDisp_21368276459 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69191;
     Object term69409;

    public UserOption_setIsUpperDisp_21368276459() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term69197 = new Long(-7904053112604879960L);
        term69191 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term69193 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term69195 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term69211 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term69212 = newInstance(Class.forName("java.time.LocalDate"));
        Object term69216 = newInstance(Class.forName("java.time.LocalTime"));
        Object term69221 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term69222 = newInstance(Class.forName("java.time.LocalDate"));
        Object term69226 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term69191, term69191.getClass(), "id", -3724162247917461536L);
        setLongField(term69193, term69193.getClass(), "id", 7893661350133453338L);
        setLongField(term69195, term69195.getClass(), "id", 9056245012917372169L);
        setField(term69195, term69195.getClass(), "extId", term69197);
        setField(term69195, term69195.getClass(), "luid", "vFhRdscfFA");
        setIntField(term69212, term69212.getClass(), "year", 2018);
        setShortField(term69212, term69212.getClass(), "month", (short) 4);
        setShortField(term69212, term69212.getClass(), "day", (short) 7);
        setField(term69211, term69211.getClass(), "date", term69212);
        setByteField(term69216, term69216.getClass(), "hour", (byte) 22);
        setByteField(term69216, term69216.getClass(), "minute", (byte) 6);
        setByteField(term69216, term69216.getClass(), "second", (byte) 38);
        setIntField(term69216, term69216.getClass(), "nano", 958732191);
        setField(term69211, term69211.getClass(), "time", term69216);
        setField(term69195, term69195.getClass(), "registerTime", term69211);
        setIntField(term69222, term69222.getClass(), "year", 2017);
        setShortField(term69222, term69222.getClass(), "month", (short) 7);
        setShortField(term69222, term69222.getClass(), "day", (short) 25);
        setField(term69221, term69221.getClass(), "date", term69222);
        setByteField(term69226, term69226.getClass(), "hour", (byte) 20);
        setByteField(term69226, term69226.getClass(), "minute", (byte) 19);
        setByteField(term69226, term69226.getClass(), "second", (byte) 55);
        setIntField(term69226, term69226.getClass(), "nano", 617531786);
        setField(term69221, term69221.getClass(), "time", term69226);
        setField(term69195, term69195.getClass(), "accessTime", term69221);
        setField(term69193, term69193.getClass(), "card", term69195);
        setIntField(term69193, term69193.getClass(), "lastDataVersion", 606220124);
        setField(term69193, term69193.getClass(), "userName", "ZmfocrvaII");
        setIntField(term69193, term69193.getClass(), "point", -1383984508);
        setIntField(term69193, term69193.getClass(), "totalPoint", -604080370);
        setIntField(term69193, term69193.getClass(), "iconId", -958163406);
        setIntField(term69193, term69193.getClass(), "nameplateId", 1073272246);
        setIntField(term69193, term69193.getClass(), "frameId", -393108425);
        setIntField(term69193, term69193.getClass(), "trophyId", -1491497666);
        setIntField(term69193, term69193.getClass(), "playCount", 501016087);
        setIntField(term69193, term69193.getClass(), "playVsCount", -1697577715);
        setIntField(term69193, term69193.getClass(), "playSyncCount", -1600100261);
        setIntField(term69193, term69193.getClass(), "winCount", -96376593);
        setIntField(term69193, term69193.getClass(), "helpCount", -782918431);
        setIntField(term69193, term69193.getClass(), "comboCount", 68274251);
        setIntField(term69193, term69193.getClass(), "feverCount", -446931106);
        setIntField(term69193, term69193.getClass(), "totalHiScore", 831138363);
        setIntField(term69193, term69193.getClass(), "totalEasyHighScore", -1626486283);
        setIntField(term69193, term69193.getClass(), "totalBasicHighScore", -116608439);
        setIntField(term69193, term69193.getClass(), "totalAdvancedHighScore", -1820369393);
        setIntField(term69193, term69193.getClass(), "totalExpertHighScore", 1514212056);
        setIntField(term69193, term69193.getClass(), "totalMasterHighScore", -1119664670);
        setIntField(term69193, term69193.getClass(), "totalReMasterHighScore", -537451132);
        setIntField(term69193, term69193.getClass(), "totalHighSync", -1722921664);
        setIntField(term69193, term69193.getClass(), "totalEasySync", -1820864777);
        setIntField(term69193, term69193.getClass(), "totalBasicSync", 417281189);
        setIntField(term69193, term69193.getClass(), "totalAdvancedSync", 1929634576);
        setIntField(term69193, term69193.getClass(), "totalExpertSync", -405127258);
        setIntField(term69193, term69193.getClass(), "totalMasterSync", 647360332);
        setIntField(term69193, term69193.getClass(), "totalReMasterSync", 1501751336);
        setIntField(term69193, term69193.getClass(), "playerRating", 1460802763);
        setIntField(term69193, term69193.getClass(), "highestRating", 1587708420);
        setIntField(term69193, term69193.getClass(), "rankAuthTailId", -1895182227);
        setField(term69193, term69193.getClass(), "eventWatchedDate", "LTbQXrGKuA");
        setField(term69193, term69193.getClass(), "webLimitDate", "gzmGmDALUv");
        setIntField(term69193, term69193.getClass(), "challengeTrackPhase", 958523148);
        setIntField(term69193, term69193.getClass(), "firstPlayBits", -16365866);
        setField(term69193, term69193.getClass(), "lastPlayDate", "ZRoptBRTDM");
        setIntField(term69193, term69193.getClass(), "lastPlaceId", 394594696);
        setField(term69193, term69193.getClass(), "lastPlaceName", "vVVFChfeBQ");
        setIntField(term69193, term69193.getClass(), "lastRegionId", 1325767520);
        setField(term69193, term69193.getClass(), "lastRegionName", "aASfcqfBbh");
        setField(term69193, term69193.getClass(), "lastClientId", "DwpOIkpRFT");
        setField(term69193, term69193.getClass(), "lastCountryCode", "LPlTDoLrUy");
        setIntField(term69193, term69193.getClass(), "eventPoint", -1016128601);
        setIntField(term69193, term69193.getClass(), "totalLv", -1791687615);
        setIntField(term69193, term69193.getClass(), "lastLoginBonusDay", 534570101);
        setIntField(term69193, term69193.getClass(), "lastSurvivalBonusDay", 702057326);
        setIntField(term69193, term69193.getClass(), "loginBonusLv", 20934480);
        setField(term69191, term69191.getClass(), "user", term69193);
        setIntField(term69191, term69191.getClass(), "soudEffect", -1500640507);
        setIntField(term69191, term69191.getClass(), "mirrorMode", -1484484351);
        setIntField(term69191, term69191.getClass(), "guideSpeed", 338609469);
        setIntField(term69191, term69191.getClass(), "bgInfo", 1029985753);
        setIntField(term69191, term69191.getClass(), "brightness", -491631818);
        setIntField(term69191, term69191.getClass(), "isStarRot", -378773888);
        setIntField(term69191, term69191.getClass(), "breakSe", 479136541);
        setIntField(term69191, term69191.getClass(), "slideSe", 128257372);
        setIntField(term69191, term69191.getClass(), "hardJudge", 269362552);
        setIntField(term69191, term69191.getClass(), "isTagJump", -640467775);
        setIntField(term69191, term69191.getClass(), "breakSeVol", -1945181535);
        setIntField(term69191, term69191.getClass(), "slideSeVol", -140143046);
        setIntField(term69191, term69191.getClass(), "isUpperDisp", -1498112846);
        setIntField(term69191, term69191.getClass(), "trackSkip", -298672713);
        setIntField(term69191, term69191.getClass(), "optionMode", 766181234);
        setIntField(term69191, term69191.getClass(), "simpleOptionParam", -789141664);
        setIntField(term69191, term69191.getClass(), "adjustTiming", -1487966462);
        setIntField(term69191, term69191.getClass(), "dispTiming", -254522021);
        setIntField(term69191, term69191.getClass(), "timingPos", -1019541665);
        setIntField(term69191, term69191.getClass(), "ansVol", 1803166412);
        setIntField(term69191, term69191.getClass(), "noteVol", -1337767440);
        setIntField(term69191, term69191.getClass(), "dmgVol", -1072471087);
        setIntField(term69191, term69191.getClass(), "appealFlame", 1054147511);
        setIntField(term69191, term69191.getClass(), "isFeverDisp", -872690097);
        setIntField(term69191, term69191.getClass(), "dispJudge", -110719515);
        setIntField(term69191, term69191.getClass(), "judgePos", 1974973897);
        setIntField(term69191, term69191.getClass(), "ratingGuard", -1698854);
        setIntField(term69191, term69191.getClass(), "selectChara", 1352029332);
        setIntField(term69191, term69191.getClass(), "sortType", 1637635293);
        setIntField(term69191, term69191.getClass(), "filterGenre", -1074960601);
        setIntField(term69191, term69191.getClass(), "filterLevel", -1987365619);
        setIntField(term69191, term69191.getClass(), "filterRank", 662229600);
        setIntField(term69191, term69191.getClass(), "filterVersion", -1332957093);
        setIntField(term69191, term69191.getClass(), "filterRec", 424707046);
        setIntField(term69191, term69191.getClass(), "filterFullCombo", 1963864974);
        setIntField(term69191, term69191.getClass(), "filterAllPerfect", 1696691227);
        setIntField(term69191, term69191.getClass(), "filterDifficulty", 1691243165);
        setIntField(term69191, term69191.getClass(), "filterFullSync", 312394553);
        setIntField(term69191, term69191.getClass(), "filterReMaster", -1525147416);
        setIntField(term69191, term69191.getClass(), "filterMaxFever", -1385830514);
        setIntField(term69191, term69191.getClass(), "finalSelectId", 459609873);
        setIntField(term69191, term69191.getClass(), "finalSelectCategory", 1965021427);
        term69409 = new Integer(1701555080);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term69409;
        callMethod(klass, "setIsUpperDisp", argTypes, term69191, args);
    }

};


