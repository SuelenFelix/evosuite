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

public class UserGameOption_getJudgeAttack_199312508114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55021;

    public UserGameOption_getJudgeAttack_199312508114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term55027 = new Long(-8463029266761149071L);
        term55021 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption"));
        Object term55023 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term55025 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term55041 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term55042 = newInstance(Class.forName("java.time.LocalDate"));
        Object term55046 = newInstance(Class.forName("java.time.LocalTime"));
        Object term55051 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term55052 = newInstance(Class.forName("java.time.LocalDate"));
        Object term55056 = newInstance(Class.forName("java.time.LocalTime"));
        Object term55073 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term55074 = newInstance(Class.forName("java.time.LocalDate"));
        Object term55078 = newInstance(Class.forName("java.time.LocalTime"));
        Object term55134 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term55135 = newInstance(Class.forName("java.time.LocalDate"));
        Object term55139 = newInstance(Class.forName("java.time.LocalTime"));
        Object term55182 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term55183 = newInstance(Class.forName("java.time.LocalDate"));
        Object term55187 = newInstance(Class.forName("java.time.LocalTime"));
        Object term55228 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term55229 = newInstance(Class.forName("java.time.LocalDate"));
        Object term55233 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term55021, term55021.getClass(), "id", 8761438573959719489L);
        setLongField(term55023, term55023.getClass(), "id", -6772311116874630960L);
        setLongField(term55025, term55025.getClass(), "id", 6971596090562280868L);
        setField(term55025, term55025.getClass(), "extId", term55027);
        setField(term55025, term55025.getClass(), "luid", "JlnoFYxLfk");
        setIntField(term55042, term55042.getClass(), "year", 2013);
        setShortField(term55042, term55042.getClass(), "month", (short) 1);
        setShortField(term55042, term55042.getClass(), "day", (short) 25);
        setField(term55041, term55041.getClass(), "date", term55042);
        setByteField(term55046, term55046.getClass(), "hour", (byte) 11);
        setByteField(term55046, term55046.getClass(), "minute", (byte) 5);
        setByteField(term55046, term55046.getClass(), "second", (byte) 35);
        setIntField(term55046, term55046.getClass(), "nano", 914812579);
        setField(term55041, term55041.getClass(), "time", term55046);
        setField(term55025, term55025.getClass(), "registerTime", term55041);
        setIntField(term55052, term55052.getClass(), "year", 2020);
        setShortField(term55052, term55052.getClass(), "month", (short) 11);
        setShortField(term55052, term55052.getClass(), "day", (short) 6);
        setField(term55051, term55051.getClass(), "date", term55052);
        setByteField(term55056, term55056.getClass(), "hour", (byte) 20);
        setByteField(term55056, term55056.getClass(), "minute", (byte) 26);
        setByteField(term55056, term55056.getClass(), "second", (byte) 26);
        setIntField(term55056, term55056.getClass(), "nano", 961202696);
        setField(term55051, term55051.getClass(), "time", term55056);
        setField(term55025, term55025.getClass(), "accessTime", term55051);
        setField(term55023, term55023.getClass(), "card", term55025);
        setField(term55023, term55023.getClass(), "userName", "tMMLkDkFYW");
        setIntField(term55074, term55074.getClass(), "year", 2022);
        setShortField(term55074, term55074.getClass(), "month", (short) 5);
        setShortField(term55074, term55074.getClass(), "day", (short) 26);
        setField(term55073, term55073.getClass(), "date", term55074);
        setByteField(term55078, term55078.getClass(), "hour", (byte) 16);
        setByteField(term55078, term55078.getClass(), "minute", (byte) 7);
        setByteField(term55078, term55078.getClass(), "second", (byte) 6);
        setIntField(term55078, term55078.getClass(), "nano", 65239619);
        setField(term55073, term55073.getClass(), "time", term55078);
        setField(term55023, term55023.getClass(), "lastLoginDate", term55073);
        setBooleanField(term55023, term55023.getClass(), "isWebJoin", true);
        setField(term55023, term55023.getClass(), "webLimitDate", "EYJXMlkLoO");
        setIntField(term55023, term55023.getClass(), "level", 1294282133);
        setIntField(term55023, term55023.getClass(), "reincarnationNum", -1857786332);
        setField(term55023, term55023.getClass(), "exp", "qJtkJJhOSV");
        setLongField(term55023, term55023.getClass(), "point", 7340409588443647231L);
        setLongField(term55023, term55023.getClass(), "totalPoint", 8307567070673352896L);
        setIntField(term55023, term55023.getClass(), "playCount", 1307491791);
        setIntField(term55023, term55023.getClass(), "multiPlayCount", 445813516);
        setIntField(term55023, term55023.getClass(), "multiWinCount", 180030231);
        setIntField(term55023, term55023.getClass(), "requestResCount", 645685543);
        setIntField(term55023, term55023.getClass(), "acceptResCount", -704733432);
        setIntField(term55023, term55023.getClass(), "successResCount", 147233013);
        setIntField(term55023, term55023.getClass(), "playerRating", -828376022);
        setIntField(term55023, term55023.getClass(), "highestRating", -1133227278);
        setIntField(term55023, term55023.getClass(), "nameplateId", -1998106900);
        setIntField(term55023, term55023.getClass(), "frameId", -1628037152);
        setIntField(term55023, term55023.getClass(), "characterId", -1550570392);
        setIntField(term55023, term55023.getClass(), "trophyId", -59951395);
        setIntField(term55023, term55023.getClass(), "playedTutorialBit", -294114307);
        setIntField(term55023, term55023.getClass(), "firstTutorialCancelNum", -745407686);
        setIntField(term55023, term55023.getClass(), "masterTutorialCancelNum", -1183051462);
        setIntField(term55023, term55023.getClass(), "totalRepertoireCount", -572029073);
        setIntField(term55023, term55023.getClass(), "totalMapNum", 1348271533);
        setLongField(term55023, term55023.getClass(), "totalHiScore", 7685476896447838804L);
        setLongField(term55023, term55023.getClass(), "totalBasicHighScore", -7583612555465533678L);
        setLongField(term55023, term55023.getClass(), "totalAdvancedHighScore", -1040140369921518682L);
        setLongField(term55023, term55023.getClass(), "totalExpertHighScore", 4591729712990322550L);
        setLongField(term55023, term55023.getClass(), "totalMasterHighScore", -1013072826351726812L);
        setIntField(term55135, term55135.getClass(), "year", 2021);
        setShortField(term55135, term55135.getClass(), "month", (short) 4);
        setShortField(term55135, term55135.getClass(), "day", (short) 22);
        setField(term55134, term55134.getClass(), "date", term55135);
        setByteField(term55139, term55139.getClass(), "hour", (byte) 4);
        setByteField(term55139, term55139.getClass(), "minute", (byte) 51);
        setByteField(term55139, term55139.getClass(), "second", (byte) 42);
        setIntField(term55139, term55139.getClass(), "nano", 408430084);
        setField(term55134, term55134.getClass(), "time", term55139);
        setField(term55023, term55023.getClass(), "eventWatchedDate", term55134);
        setIntField(term55023, term55023.getClass(), "friendCount", 1234771885);
        setBooleanField(term55023, term55023.getClass(), "isMaimai", true);
        setField(term55023, term55023.getClass(), "firstGameId", "vQbiGKncal");
        setField(term55023, term55023.getClass(), "firstRomVersion", "NTSNSiYeUu");
        setField(term55023, term55023.getClass(), "firstDataVersion", "SBTEFDmQVY");
        setIntField(term55183, term55183.getClass(), "year", 2025);
        setShortField(term55183, term55183.getClass(), "month", (short) 7);
        setShortField(term55183, term55183.getClass(), "day", (short) 31);
        setField(term55182, term55182.getClass(), "date", term55183);
        setByteField(term55187, term55187.getClass(), "hour", (byte) 14);
        setByteField(term55187, term55187.getClass(), "minute", (byte) 45);
        setByteField(term55187, term55187.getClass(), "second", (byte) 16);
        setIntField(term55187, term55187.getClass(), "nano", 864162960);
        setField(term55182, term55182.getClass(), "time", term55187);
        setField(term55023, term55023.getClass(), "firstPlayDate", term55182);
        setField(term55023, term55023.getClass(), "lastGameId", "ohZpRiNDZM");
        setField(term55023, term55023.getClass(), "lastRomVersion", "qEXIxhmUwz");
        setField(term55023, term55023.getClass(), "lastDataVersion", "RlyxtfCqKY");
        setIntField(term55229, term55229.getClass(), "year", 2018);
        setShortField(term55229, term55229.getClass(), "month", (short) 11);
        setShortField(term55229, term55229.getClass(), "day", (short) 5);
        setField(term55228, term55228.getClass(), "date", term55229);
        setByteField(term55233, term55233.getClass(), "hour", (byte) 11);
        setByteField(term55233, term55233.getClass(), "minute", (byte) 27);
        setByteField(term55233, term55233.getClass(), "second", (byte) 20);
        setIntField(term55233, term55233.getClass(), "nano", 980926676);
        setField(term55228, term55228.getClass(), "time", term55233);
        setField(term55023, term55023.getClass(), "lastPlayDate", term55228);
        setIntField(term55023, term55023.getClass(), "lastPlaceId", 1821658782);
        setField(term55023, term55023.getClass(), "lastPlaceName", "kyTUkLCRYm");
        setField(term55023, term55023.getClass(), "lastRegionId", "oAotZgNUFH");
        setField(term55023, term55023.getClass(), "lastRegionName", "TowhQcovXu");
        setField(term55023, term55023.getClass(), "lastAllNetId", "UFGOnIMOzf");
        setField(term55023, term55023.getClass(), "lastClientId", "ySiyRlAQpt");
        setField(term55021, term55021.getClass(), "user", term55023);
        setIntField(term55021, term55021.getClass(), "bgInfo", 871613900);
        setIntField(term55021, term55021.getClass(), "fieldColor", 1322676409);
        setIntField(term55021, term55021.getClass(), "guideSound", -954764876);
        setIntField(term55021, term55021.getClass(), "soundEffect", 1870177323);
        setIntField(term55021, term55021.getClass(), "guideLine", -1027146644);
        setIntField(term55021, term55021.getClass(), "speed", 341013967);
        setIntField(term55021, term55021.getClass(), "optionSet", 1873439089);
        setIntField(term55021, term55021.getClass(), "matching", -1069668783);
        setIntField(term55021, term55021.getClass(), "judgePos", -301450995);
        setIntField(term55021, term55021.getClass(), "rating", 753886838);
        setIntField(term55021, term55021.getClass(), "judgeJustice", -1802788931);
        setIntField(term55021, term55021.getClass(), "judgeAttack", 505497573);
        setIntField(term55021, term55021.getClass(), "headphone", 1848062442);
        setIntField(term55021, term55021.getClass(), "playerLevel", -122481618);
        setIntField(term55021, term55021.getClass(), "successTap", -82929535);
        setIntField(term55021, term55021.getClass(), "successExTap", 1850505181);
        setIntField(term55021, term55021.getClass(), "successSlideHold", 324766253);
        setIntField(term55021, term55021.getClass(), "successAir", -1128978986);
        setIntField(term55021, term55021.getClass(), "successFlick", 192962115);
        setIntField(term55021, term55021.getClass(), "successSkill", 1531205463);
        setIntField(term55021, term55021.getClass(), "successTapTimbre", 586115489);
        setIntField(term55021, term55021.getClass(), "privacy", 1377331021);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJudgeAttack", argTypes, term55021, args);
    }

};


