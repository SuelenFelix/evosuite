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

public class UserOption_hashCode_129928885791 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79109;

    public UserOption_hashCode_129928885791() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term79115 = new Long(8000844860910174690L);
        term79109 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term79111 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term79113 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term79129 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term79130 = newInstance(Class.forName("java.time.LocalDate"));
        Object term79134 = newInstance(Class.forName("java.time.LocalTime"));
        Object term79139 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term79140 = newInstance(Class.forName("java.time.LocalDate"));
        Object term79144 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term79109, term79109.getClass(), "id", -7755863896540616668L);
        setLongField(term79111, term79111.getClass(), "id", 6762397834421232825L);
        setLongField(term79113, term79113.getClass(), "id", -5414076154478910734L);
        setField(term79113, term79113.getClass(), "extId", term79115);
        setField(term79113, term79113.getClass(), "luid", "ruqGjVRVlD");
        setIntField(term79130, term79130.getClass(), "year", 2028);
        setShortField(term79130, term79130.getClass(), "month", (short) 4);
        setShortField(term79130, term79130.getClass(), "day", (short) 9);
        setField(term79129, term79129.getClass(), "date", term79130);
        setByteField(term79134, term79134.getClass(), "hour", (byte) 16);
        setByteField(term79134, term79134.getClass(), "minute", (byte) 26);
        setByteField(term79134, term79134.getClass(), "second", (byte) 35);
        setIntField(term79134, term79134.getClass(), "nano", 546233932);
        setField(term79129, term79129.getClass(), "time", term79134);
        setField(term79113, term79113.getClass(), "registerTime", term79129);
        setIntField(term79140, term79140.getClass(), "year", 2022);
        setShortField(term79140, term79140.getClass(), "month", (short) 3);
        setShortField(term79140, term79140.getClass(), "day", (short) 19);
        setField(term79139, term79139.getClass(), "date", term79140);
        setByteField(term79144, term79144.getClass(), "hour", (byte) 6);
        setByteField(term79144, term79144.getClass(), "minute", (byte) 55);
        setByteField(term79144, term79144.getClass(), "second", (byte) 49);
        setIntField(term79144, term79144.getClass(), "nano", 478088059);
        setField(term79139, term79139.getClass(), "time", term79144);
        setField(term79113, term79113.getClass(), "accessTime", term79139);
        setField(term79111, term79111.getClass(), "card", term79113);
        setIntField(term79111, term79111.getClass(), "lastDataVersion", -1261010343);
        setField(term79111, term79111.getClass(), "userName", "oeoFYkQLVk");
        setIntField(term79111, term79111.getClass(), "point", 1984896780);
        setIntField(term79111, term79111.getClass(), "totalPoint", -482873835);
        setIntField(term79111, term79111.getClass(), "iconId", 1213800877);
        setIntField(term79111, term79111.getClass(), "nameplateId", -658645058);
        setIntField(term79111, term79111.getClass(), "frameId", -349157116);
        setIntField(term79111, term79111.getClass(), "trophyId", -790775583);
        setIntField(term79111, term79111.getClass(), "playCount", -1319126503);
        setIntField(term79111, term79111.getClass(), "playVsCount", -371812839);
        setIntField(term79111, term79111.getClass(), "playSyncCount", 542692617);
        setIntField(term79111, term79111.getClass(), "winCount", 959155617);
        setIntField(term79111, term79111.getClass(), "helpCount", -840195648);
        setIntField(term79111, term79111.getClass(), "comboCount", 566535777);
        setIntField(term79111, term79111.getClass(), "feverCount", 1669758643);
        setIntField(term79111, term79111.getClass(), "totalHiScore", 1938227934);
        setIntField(term79111, term79111.getClass(), "totalEasyHighScore", 2375511);
        setIntField(term79111, term79111.getClass(), "totalBasicHighScore", 146251900);
        setIntField(term79111, term79111.getClass(), "totalAdvancedHighScore", -1769798624);
        setIntField(term79111, term79111.getClass(), "totalExpertHighScore", -333409553);
        setIntField(term79111, term79111.getClass(), "totalMasterHighScore", -909169582);
        setIntField(term79111, term79111.getClass(), "totalReMasterHighScore", -1045127984);
        setIntField(term79111, term79111.getClass(), "totalHighSync", -1924242957);
        setIntField(term79111, term79111.getClass(), "totalEasySync", -108346962);
        setIntField(term79111, term79111.getClass(), "totalBasicSync", 1669003913);
        setIntField(term79111, term79111.getClass(), "totalAdvancedSync", 1083030297);
        setIntField(term79111, term79111.getClass(), "totalExpertSync", 669141919);
        setIntField(term79111, term79111.getClass(), "totalMasterSync", 1236363631);
        setIntField(term79111, term79111.getClass(), "totalReMasterSync", -639750119);
        setIntField(term79111, term79111.getClass(), "playerRating", 265435772);
        setIntField(term79111, term79111.getClass(), "highestRating", -646028316);
        setIntField(term79111, term79111.getClass(), "rankAuthTailId", -1983618258);
        setField(term79111, term79111.getClass(), "eventWatchedDate", "fibZqjUmdU");
        setField(term79111, term79111.getClass(), "webLimitDate", "DvLIPKnbCV");
        setIntField(term79111, term79111.getClass(), "challengeTrackPhase", -2016436856);
        setIntField(term79111, term79111.getClass(), "firstPlayBits", -31490340);
        setField(term79111, term79111.getClass(), "lastPlayDate", "QwAMZyCIhS");
        setIntField(term79111, term79111.getClass(), "lastPlaceId", 6355353);
        setField(term79111, term79111.getClass(), "lastPlaceName", "TnLDXZoBoo");
        setIntField(term79111, term79111.getClass(), "lastRegionId", -1238893049);
        setField(term79111, term79111.getClass(), "lastRegionName", "RQTElJrtwb");
        setField(term79111, term79111.getClass(), "lastClientId", "hFvoVHxToy");
        setField(term79111, term79111.getClass(), "lastCountryCode", "ZybsWgYCUR");
        setIntField(term79111, term79111.getClass(), "eventPoint", -504663508);
        setIntField(term79111, term79111.getClass(), "totalLv", -1477666963);
        setIntField(term79111, term79111.getClass(), "lastLoginBonusDay", -725070676);
        setIntField(term79111, term79111.getClass(), "lastSurvivalBonusDay", 431028714);
        setIntField(term79111, term79111.getClass(), "loginBonusLv", 1011528396);
        setField(term79109, term79109.getClass(), "user", term79111);
        setIntField(term79109, term79109.getClass(), "soudEffect", 309271174);
        setIntField(term79109, term79109.getClass(), "mirrorMode", 2035588967);
        setIntField(term79109, term79109.getClass(), "guideSpeed", 1167653262);
        setIntField(term79109, term79109.getClass(), "bgInfo", -1595345273);
        setIntField(term79109, term79109.getClass(), "brightness", 919694010);
        setIntField(term79109, term79109.getClass(), "isStarRot", 161716212);
        setIntField(term79109, term79109.getClass(), "breakSe", 1089707941);
        setIntField(term79109, term79109.getClass(), "slideSe", 1085181428);
        setIntField(term79109, term79109.getClass(), "hardJudge", -1881163480);
        setIntField(term79109, term79109.getClass(), "isTagJump", 1518450211);
        setIntField(term79109, term79109.getClass(), "breakSeVol", 1446759250);
        setIntField(term79109, term79109.getClass(), "slideSeVol", 802388106);
        setIntField(term79109, term79109.getClass(), "isUpperDisp", 684874002);
        setIntField(term79109, term79109.getClass(), "trackSkip", 1905713513);
        setIntField(term79109, term79109.getClass(), "optionMode", 1930667991);
        setIntField(term79109, term79109.getClass(), "simpleOptionParam", 1253166146);
        setIntField(term79109, term79109.getClass(), "adjustTiming", -684640084);
        setIntField(term79109, term79109.getClass(), "dispTiming", -985705685);
        setIntField(term79109, term79109.getClass(), "timingPos", 684295059);
        setIntField(term79109, term79109.getClass(), "ansVol", -2006682758);
        setIntField(term79109, term79109.getClass(), "noteVol", -852126922);
        setIntField(term79109, term79109.getClass(), "dmgVol", -661495492);
        setIntField(term79109, term79109.getClass(), "appealFlame", 1591648810);
        setIntField(term79109, term79109.getClass(), "isFeverDisp", -17210084);
        setIntField(term79109, term79109.getClass(), "dispJudge", 2060202060);
        setIntField(term79109, term79109.getClass(), "judgePos", 1202515108);
        setIntField(term79109, term79109.getClass(), "ratingGuard", -2098430459);
        setIntField(term79109, term79109.getClass(), "selectChara", 801946367);
        setIntField(term79109, term79109.getClass(), "sortType", 1118553212);
        setIntField(term79109, term79109.getClass(), "filterGenre", 1567455395);
        setIntField(term79109, term79109.getClass(), "filterLevel", -166187779);
        setIntField(term79109, term79109.getClass(), "filterRank", 1007962765);
        setIntField(term79109, term79109.getClass(), "filterVersion", 874006297);
        setIntField(term79109, term79109.getClass(), "filterRec", -1574162955);
        setIntField(term79109, term79109.getClass(), "filterFullCombo", 520805458);
        setIntField(term79109, term79109.getClass(), "filterAllPerfect", -1476811867);
        setIntField(term79109, term79109.getClass(), "filterDifficulty", 707088718);
        setIntField(term79109, term79109.getClass(), "filterFullSync", -891728298);
        setIntField(term79109, term79109.getClass(), "filterReMaster", -1956538399);
        setIntField(term79109, term79109.getClass(), "filterMaxFever", -1071998527);
        setIntField(term79109, term79109.getClass(), "finalSelectId", 601283189);
        setIntField(term79109, term79109.getClass(), "finalSelectCategory", 496032839);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term79109, args);
    }

};


