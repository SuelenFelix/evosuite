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

public class UserOption_setIsStarRot_200183905352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67021;
     Object term67239;

    public UserOption_setIsStarRot_200183905352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term67027 = new Long(-1592696983130738594L);
        term67021 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term67023 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term67025 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term67041 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term67042 = newInstance(Class.forName("java.time.LocalDate"));
        Object term67046 = newInstance(Class.forName("java.time.LocalTime"));
        Object term67051 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term67052 = newInstance(Class.forName("java.time.LocalDate"));
        Object term67056 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term67021, term67021.getClass(), "id", 5160033404788124731L);
        setLongField(term67023, term67023.getClass(), "id", 5071015720043054072L);
        setLongField(term67025, term67025.getClass(), "id", -7006877527579112761L);
        setField(term67025, term67025.getClass(), "extId", term67027);
        setField(term67025, term67025.getClass(), "luid", "JbtvoXZZHr");
        setIntField(term67042, term67042.getClass(), "year", 2015);
        setShortField(term67042, term67042.getClass(), "month", (short) 7);
        setShortField(term67042, term67042.getClass(), "day", (short) 16);
        setField(term67041, term67041.getClass(), "date", term67042);
        setByteField(term67046, term67046.getClass(), "hour", (byte) 15);
        setByteField(term67046, term67046.getClass(), "minute", (byte) 28);
        setByteField(term67046, term67046.getClass(), "second", (byte) 35);
        setIntField(term67046, term67046.getClass(), "nano", 374805749);
        setField(term67041, term67041.getClass(), "time", term67046);
        setField(term67025, term67025.getClass(), "registerTime", term67041);
        setIntField(term67052, term67052.getClass(), "year", 2021);
        setShortField(term67052, term67052.getClass(), "month", (short) 6);
        setShortField(term67052, term67052.getClass(), "day", (short) 19);
        setField(term67051, term67051.getClass(), "date", term67052);
        setByteField(term67056, term67056.getClass(), "hour", (byte) 17);
        setByteField(term67056, term67056.getClass(), "minute", (byte) 58);
        setByteField(term67056, term67056.getClass(), "second", (byte) 4);
        setIntField(term67056, term67056.getClass(), "nano", 753905173);
        setField(term67051, term67051.getClass(), "time", term67056);
        setField(term67025, term67025.getClass(), "accessTime", term67051);
        setField(term67023, term67023.getClass(), "card", term67025);
        setIntField(term67023, term67023.getClass(), "lastDataVersion", 2106266461);
        setField(term67023, term67023.getClass(), "userName", "eMlkqCfrnK");
        setIntField(term67023, term67023.getClass(), "point", 994139397);
        setIntField(term67023, term67023.getClass(), "totalPoint", -1851045959);
        setIntField(term67023, term67023.getClass(), "iconId", 2000289703);
        setIntField(term67023, term67023.getClass(), "nameplateId", -1629394268);
        setIntField(term67023, term67023.getClass(), "frameId", -1898311415);
        setIntField(term67023, term67023.getClass(), "trophyId", -139938289);
        setIntField(term67023, term67023.getClass(), "playCount", 495686607);
        setIntField(term67023, term67023.getClass(), "playVsCount", -1842004522);
        setIntField(term67023, term67023.getClass(), "playSyncCount", -2081738821);
        setIntField(term67023, term67023.getClass(), "winCount", -791069487);
        setIntField(term67023, term67023.getClass(), "helpCount", 2040131935);
        setIntField(term67023, term67023.getClass(), "comboCount", -1183833390);
        setIntField(term67023, term67023.getClass(), "feverCount", -479335978);
        setIntField(term67023, term67023.getClass(), "totalHiScore", 1628406480);
        setIntField(term67023, term67023.getClass(), "totalEasyHighScore", -282271093);
        setIntField(term67023, term67023.getClass(), "totalBasicHighScore", -1014876011);
        setIntField(term67023, term67023.getClass(), "totalAdvancedHighScore", -1030632367);
        setIntField(term67023, term67023.getClass(), "totalExpertHighScore", -566251622);
        setIntField(term67023, term67023.getClass(), "totalMasterHighScore", -2094377383);
        setIntField(term67023, term67023.getClass(), "totalReMasterHighScore", 955822338);
        setIntField(term67023, term67023.getClass(), "totalHighSync", -1756659503);
        setIntField(term67023, term67023.getClass(), "totalEasySync", 1965003991);
        setIntField(term67023, term67023.getClass(), "totalBasicSync", -1725442005);
        setIntField(term67023, term67023.getClass(), "totalAdvancedSync", 2026681061);
        setIntField(term67023, term67023.getClass(), "totalExpertSync", -1893031586);
        setIntField(term67023, term67023.getClass(), "totalMasterSync", -1605006859);
        setIntField(term67023, term67023.getClass(), "totalReMasterSync", -555520867);
        setIntField(term67023, term67023.getClass(), "playerRating", -55584715);
        setIntField(term67023, term67023.getClass(), "highestRating", -1140026535);
        setIntField(term67023, term67023.getClass(), "rankAuthTailId", 1380376071);
        setField(term67023, term67023.getClass(), "eventWatchedDate", "HCiwohQDUV");
        setField(term67023, term67023.getClass(), "webLimitDate", "RRWTUIdKkl");
        setIntField(term67023, term67023.getClass(), "challengeTrackPhase", 1236068241);
        setIntField(term67023, term67023.getClass(), "firstPlayBits", -1800680295);
        setField(term67023, term67023.getClass(), "lastPlayDate", "pBnfJsGPNO");
        setIntField(term67023, term67023.getClass(), "lastPlaceId", 2033032621);
        setField(term67023, term67023.getClass(), "lastPlaceName", "hzaRTeUQpV");
        setIntField(term67023, term67023.getClass(), "lastRegionId", -415169558);
        setField(term67023, term67023.getClass(), "lastRegionName", "RlIgxHiNOB");
        setField(term67023, term67023.getClass(), "lastClientId", "kSpBCSqyfl");
        setField(term67023, term67023.getClass(), "lastCountryCode", "OUrtbTvuiW");
        setIntField(term67023, term67023.getClass(), "eventPoint", 415633287);
        setIntField(term67023, term67023.getClass(), "totalLv", 859754541);
        setIntField(term67023, term67023.getClass(), "lastLoginBonusDay", 1970843205);
        setIntField(term67023, term67023.getClass(), "lastSurvivalBonusDay", -741942103);
        setIntField(term67023, term67023.getClass(), "loginBonusLv", -917429711);
        setField(term67021, term67021.getClass(), "user", term67023);
        setIntField(term67021, term67021.getClass(), "soudEffect", -1518919035);
        setIntField(term67021, term67021.getClass(), "mirrorMode", -653688131);
        setIntField(term67021, term67021.getClass(), "guideSpeed", 729662498);
        setIntField(term67021, term67021.getClass(), "bgInfo", 1640664646);
        setIntField(term67021, term67021.getClass(), "brightness", 975935985);
        setIntField(term67021, term67021.getClass(), "isStarRot", -1159976869);
        setIntField(term67021, term67021.getClass(), "breakSe", -154385431);
        setIntField(term67021, term67021.getClass(), "slideSe", 495187606);
        setIntField(term67021, term67021.getClass(), "hardJudge", 2022697730);
        setIntField(term67021, term67021.getClass(), "isTagJump", 2078279488);
        setIntField(term67021, term67021.getClass(), "breakSeVol", -2114547605);
        setIntField(term67021, term67021.getClass(), "slideSeVol", 1231278686);
        setIntField(term67021, term67021.getClass(), "isUpperDisp", -314088371);
        setIntField(term67021, term67021.getClass(), "trackSkip", -44831526);
        setIntField(term67021, term67021.getClass(), "optionMode", 1856189526);
        setIntField(term67021, term67021.getClass(), "simpleOptionParam", -1550958883);
        setIntField(term67021, term67021.getClass(), "adjustTiming", 503390830);
        setIntField(term67021, term67021.getClass(), "dispTiming", 481544604);
        setIntField(term67021, term67021.getClass(), "timingPos", 175410744);
        setIntField(term67021, term67021.getClass(), "ansVol", 751883814);
        setIntField(term67021, term67021.getClass(), "noteVol", 2060779599);
        setIntField(term67021, term67021.getClass(), "dmgVol", 1859655153);
        setIntField(term67021, term67021.getClass(), "appealFlame", -653654938);
        setIntField(term67021, term67021.getClass(), "isFeverDisp", -1913348296);
        setIntField(term67021, term67021.getClass(), "dispJudge", -901199958);
        setIntField(term67021, term67021.getClass(), "judgePos", 426906221);
        setIntField(term67021, term67021.getClass(), "ratingGuard", 394662686);
        setIntField(term67021, term67021.getClass(), "selectChara", -910791861);
        setIntField(term67021, term67021.getClass(), "sortType", -178690612);
        setIntField(term67021, term67021.getClass(), "filterGenre", -1794156731);
        setIntField(term67021, term67021.getClass(), "filterLevel", 1642371312);
        setIntField(term67021, term67021.getClass(), "filterRank", 1331115116);
        setIntField(term67021, term67021.getClass(), "filterVersion", 744237210);
        setIntField(term67021, term67021.getClass(), "filterRec", 1971480321);
        setIntField(term67021, term67021.getClass(), "filterFullCombo", 1363084633);
        setIntField(term67021, term67021.getClass(), "filterAllPerfect", -692367029);
        setIntField(term67021, term67021.getClass(), "filterDifficulty", 1212696537);
        setIntField(term67021, term67021.getClass(), "filterFullSync", 1781872751);
        setIntField(term67021, term67021.getClass(), "filterReMaster", -1949151824);
        setIntField(term67021, term67021.getClass(), "filterMaxFever", 120099411);
        setIntField(term67021, term67021.getClass(), "finalSelectId", -1103544663);
        setIntField(term67021, term67021.getClass(), "finalSelectCategory", 113634266);
        term67239 = new Integer(510970949);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term67239;
        callMethod(klass, "setIsStarRot", argTypes, term67021, args);
    }

};


