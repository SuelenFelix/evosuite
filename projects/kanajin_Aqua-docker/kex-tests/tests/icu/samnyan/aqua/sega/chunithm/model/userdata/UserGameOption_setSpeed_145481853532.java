package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class UserGameOption_setSpeed_145481853532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63559;
     Object term63859;

    public UserGameOption_setSpeed_145481853532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term63565 = new Long(-6950146046121430355L);
        term63559 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption"));
        Object term63561 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term63563 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term63579 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term63580 = newInstance(Class.forName("java.time.LocalDate"));
        Object term63584 = newInstance(Class.forName("java.time.LocalTime"));
        Object term63589 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term63590 = newInstance(Class.forName("java.time.LocalDate"));
        Object term63594 = newInstance(Class.forName("java.time.LocalTime"));
        Object term63611 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term63612 = newInstance(Class.forName("java.time.LocalDate"));
        Object term63616 = newInstance(Class.forName("java.time.LocalTime"));
        Object term63672 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term63673 = newInstance(Class.forName("java.time.LocalDate"));
        Object term63677 = newInstance(Class.forName("java.time.LocalTime"));
        Object term63720 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term63721 = newInstance(Class.forName("java.time.LocalDate"));
        Object term63725 = newInstance(Class.forName("java.time.LocalTime"));
        Object term63766 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term63767 = newInstance(Class.forName("java.time.LocalDate"));
        Object term63771 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term63559, term63559.getClass(), "id", 8115348150286567116L);
        setLongField(term63561, term63561.getClass(), "id", 6549453781602844135L);
        setLongField(term63563, term63563.getClass(), "id", -7858384696957926965L);
        setField(term63563, term63563.getClass(), "extId", term63565);
        setField(term63563, term63563.getClass(), "luid", "gNeMyGSVIG");
        setIntField(term63580, term63580.getClass(), "year", 2025);
        setShortField(term63580, term63580.getClass(), "month", (short) 2);
        setShortField(term63580, term63580.getClass(), "day", (short) 15);
        setField(term63579, term63579.getClass(), "date", term63580);
        setByteField(term63584, term63584.getClass(), "hour", (byte) 4);
        setByteField(term63584, term63584.getClass(), "minute", (byte) 17);
        setByteField(term63584, term63584.getClass(), "second", (byte) 28);
        setIntField(term63584, term63584.getClass(), "nano", 251651317);
        setField(term63579, term63579.getClass(), "time", term63584);
        setField(term63563, term63563.getClass(), "registerTime", term63579);
        setIntField(term63590, term63590.getClass(), "year", 2011);
        setShortField(term63590, term63590.getClass(), "month", (short) 7);
        setShortField(term63590, term63590.getClass(), "day", (short) 19);
        setField(term63589, term63589.getClass(), "date", term63590);
        setByteField(term63594, term63594.getClass(), "hour", (byte) 13);
        setByteField(term63594, term63594.getClass(), "minute", (byte) 52);
        setByteField(term63594, term63594.getClass(), "second", (byte) 13);
        setIntField(term63594, term63594.getClass(), "nano", 952032021);
        setField(term63589, term63589.getClass(), "time", term63594);
        setField(term63563, term63563.getClass(), "accessTime", term63589);
        setField(term63561, term63561.getClass(), "card", term63563);
        setField(term63561, term63561.getClass(), "userName", "qxEkaqdKPG");
        setIntField(term63612, term63612.getClass(), "year", 2015);
        setShortField(term63612, term63612.getClass(), "month", (short) 6);
        setShortField(term63612, term63612.getClass(), "day", (short) 29);
        setField(term63611, term63611.getClass(), "date", term63612);
        setByteField(term63616, term63616.getClass(), "hour", (byte) 15);
        setByteField(term63616, term63616.getClass(), "minute", (byte) 4);
        setByteField(term63616, term63616.getClass(), "second", (byte) 16);
        setIntField(term63616, term63616.getClass(), "nano", 322383816);
        setField(term63611, term63611.getClass(), "time", term63616);
        setField(term63561, term63561.getClass(), "lastLoginDate", term63611);
        setBooleanField(term63561, term63561.getClass(), "isWebJoin", true);
        setField(term63561, term63561.getClass(), "webLimitDate", "VclIptmKrF");
        setIntField(term63561, term63561.getClass(), "level", -1469393277);
        setIntField(term63561, term63561.getClass(), "reincarnationNum", 1311573269);
        setField(term63561, term63561.getClass(), "exp", "wcTeSHCZwz");
        setLongField(term63561, term63561.getClass(), "point", -7639406314873940496L);
        setLongField(term63561, term63561.getClass(), "totalPoint", -5550345592284314693L);
        setIntField(term63561, term63561.getClass(), "playCount", 1393744942);
        setIntField(term63561, term63561.getClass(), "multiPlayCount", 528056114);
        setIntField(term63561, term63561.getClass(), "multiWinCount", 1730452667);
        setIntField(term63561, term63561.getClass(), "requestResCount", 760722690);
        setIntField(term63561, term63561.getClass(), "acceptResCount", -714009282);
        setIntField(term63561, term63561.getClass(), "successResCount", -1506023567);
        setIntField(term63561, term63561.getClass(), "playerRating", 172275665);
        setIntField(term63561, term63561.getClass(), "highestRating", 1472271840);
        setIntField(term63561, term63561.getClass(), "nameplateId", -2050302351);
        setIntField(term63561, term63561.getClass(), "frameId", 1778549764);
        setIntField(term63561, term63561.getClass(), "characterId", 456140800);
        setIntField(term63561, term63561.getClass(), "trophyId", -80072701);
        setIntField(term63561, term63561.getClass(), "playedTutorialBit", -224845635);
        setIntField(term63561, term63561.getClass(), "firstTutorialCancelNum", 115902179);
        setIntField(term63561, term63561.getClass(), "masterTutorialCancelNum", 930979700);
        setIntField(term63561, term63561.getClass(), "totalRepertoireCount", 630565003);
        setIntField(term63561, term63561.getClass(), "totalMapNum", -1966988507);
        setLongField(term63561, term63561.getClass(), "totalHiScore", -5478680438603251116L);
        setLongField(term63561, term63561.getClass(), "totalBasicHighScore", 3362279702053141081L);
        setLongField(term63561, term63561.getClass(), "totalAdvancedHighScore", -58248142535266417L);
        setLongField(term63561, term63561.getClass(), "totalExpertHighScore", 370832762515262203L);
        setLongField(term63561, term63561.getClass(), "totalMasterHighScore", 6931806194311088657L);
        setIntField(term63673, term63673.getClass(), "year", 2029);
        setShortField(term63673, term63673.getClass(), "month", (short) 6);
        setShortField(term63673, term63673.getClass(), "day", (short) 10);
        setField(term63672, term63672.getClass(), "date", term63673);
        setByteField(term63677, term63677.getClass(), "hour", (byte) 10);
        setByteField(term63677, term63677.getClass(), "minute", (byte) 16);
        setByteField(term63677, term63677.getClass(), "second", (byte) 3);
        setIntField(term63677, term63677.getClass(), "nano", 695609423);
        setField(term63672, term63672.getClass(), "time", term63677);
        setField(term63561, term63561.getClass(), "eventWatchedDate", term63672);
        setIntField(term63561, term63561.getClass(), "friendCount", -1089838622);
        setBooleanField(term63561, term63561.getClass(), "isMaimai", true);
        setField(term63561, term63561.getClass(), "firstGameId", "fxxnbYOiZZ");
        setField(term63561, term63561.getClass(), "firstRomVersion", "CTnRYaYXia");
        setField(term63561, term63561.getClass(), "firstDataVersion", "SUIYUFtCCe");
        setIntField(term63721, term63721.getClass(), "year", 2021);
        setShortField(term63721, term63721.getClass(), "month", (short) 2);
        setShortField(term63721, term63721.getClass(), "day", (short) 24);
        setField(term63720, term63720.getClass(), "date", term63721);
        setByteField(term63725, term63725.getClass(), "hour", (byte) 2);
        setByteField(term63725, term63725.getClass(), "minute", (byte) 4);
        setByteField(term63725, term63725.getClass(), "second", (byte) 26);
        setIntField(term63725, term63725.getClass(), "nano", 423826252);
        setField(term63720, term63720.getClass(), "time", term63725);
        setField(term63561, term63561.getClass(), "firstPlayDate", term63720);
        setField(term63561, term63561.getClass(), "lastGameId", "eKCrPCkedw");
        setField(term63561, term63561.getClass(), "lastRomVersion", "VAFSknHLsZ");
        setField(term63561, term63561.getClass(), "lastDataVersion", "MamzBtwhiz");
        setIntField(term63767, term63767.getClass(), "year", 2017);
        setShortField(term63767, term63767.getClass(), "month", (short) 8);
        setShortField(term63767, term63767.getClass(), "day", (short) 15);
        setField(term63766, term63766.getClass(), "date", term63767);
        setByteField(term63771, term63771.getClass(), "hour", (byte) 7);
        setByteField(term63771, term63771.getClass(), "minute", (byte) 47);
        setByteField(term63771, term63771.getClass(), "second", (byte) 20);
        setIntField(term63771, term63771.getClass(), "nano", 749374038);
        setField(term63766, term63766.getClass(), "time", term63771);
        setField(term63561, term63561.getClass(), "lastPlayDate", term63766);
        setIntField(term63561, term63561.getClass(), "lastPlaceId", -937178869);
        setField(term63561, term63561.getClass(), "lastPlaceName", "wVOypfVLsP");
        setField(term63561, term63561.getClass(), "lastRegionId", "pEazBcUUWX");
        setField(term63561, term63561.getClass(), "lastRegionName", "nlvRWrTxvz");
        setField(term63561, term63561.getClass(), "lastAllNetId", "isMKwgUmka");
        setField(term63561, term63561.getClass(), "lastClientId", "pDIyzhDtTy");
        setField(term63559, term63559.getClass(), "user", term63561);
        setIntField(term63559, term63559.getClass(), "bgInfo", -1952449836);
        setIntField(term63559, term63559.getClass(), "fieldColor", -405260008);
        setIntField(term63559, term63559.getClass(), "guideSound", -468459707);
        setIntField(term63559, term63559.getClass(), "soundEffect", -1652639905);
        setIntField(term63559, term63559.getClass(), "guideLine", -1461889742);
        setIntField(term63559, term63559.getClass(), "speed", 1948939030);
        setIntField(term63559, term63559.getClass(), "optionSet", -1707167847);
        setIntField(term63559, term63559.getClass(), "matching", 1083097092);
        setIntField(term63559, term63559.getClass(), "judgePos", -352580386);
        setIntField(term63559, term63559.getClass(), "rating", 1000158617);
        setIntField(term63559, term63559.getClass(), "judgeJustice", 776700097);
        setIntField(term63559, term63559.getClass(), "judgeAttack", -147634418);
        setIntField(term63559, term63559.getClass(), "headphone", 1734729002);
        setIntField(term63559, term63559.getClass(), "playerLevel", 356178482);
        setIntField(term63559, term63559.getClass(), "successTap", 2114777679);
        setIntField(term63559, term63559.getClass(), "successExTap", 877149909);
        setIntField(term63559, term63559.getClass(), "successSlideHold", -649501188);
        setIntField(term63559, term63559.getClass(), "successAir", 2143993585);
        setIntField(term63559, term63559.getClass(), "successFlick", -2067989740);
        setIntField(term63559, term63559.getClass(), "successSkill", 229990395);
        setIntField(term63559, term63559.getClass(), "successTapTimbre", -1374118535);
        setIntField(term63559, term63559.getClass(), "privacy", 2009032714);
        term63859 = new Integer(-1630891015);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term63859;
        callMethod(klass, "setSpeed", argTypes, term63559, args);
    }

};


