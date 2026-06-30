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

public class UserOption_getIsFeverDisp_116214598026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58737;

    public UserOption_getIsFeverDisp_116214598026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term58743 = new Long(9205327385733285058L);
        term58737 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term58739 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term58741 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term58757 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58758 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58762 = newInstance(Class.forName("java.time.LocalTime"));
        Object term58767 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58768 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58772 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term58737, term58737.getClass(), "id", 4530705892517898929L);
        setLongField(term58739, term58739.getClass(), "id", 7450734758126089960L);
        setLongField(term58741, term58741.getClass(), "id", 1377567570761089535L);
        setField(term58741, term58741.getClass(), "extId", term58743);
        setField(term58741, term58741.getClass(), "luid", "FzJhDecyvI");
        setIntField(term58758, term58758.getClass(), "year", 2029);
        setShortField(term58758, term58758.getClass(), "month", (short) 10);
        setShortField(term58758, term58758.getClass(), "day", (short) 12);
        setField(term58757, term58757.getClass(), "date", term58758);
        setByteField(term58762, term58762.getClass(), "hour", (byte) 12);
        setByteField(term58762, term58762.getClass(), "minute", (byte) 8);
        setByteField(term58762, term58762.getClass(), "second", (byte) 27);
        setIntField(term58762, term58762.getClass(), "nano", 729635487);
        setField(term58757, term58757.getClass(), "time", term58762);
        setField(term58741, term58741.getClass(), "registerTime", term58757);
        setIntField(term58768, term58768.getClass(), "year", 2015);
        setShortField(term58768, term58768.getClass(), "month", (short) 3);
        setShortField(term58768, term58768.getClass(), "day", (short) 29);
        setField(term58767, term58767.getClass(), "date", term58768);
        setByteField(term58772, term58772.getClass(), "hour", (byte) 23);
        setByteField(term58772, term58772.getClass(), "minute", (byte) 1);
        setByteField(term58772, term58772.getClass(), "second", (byte) 57);
        setIntField(term58772, term58772.getClass(), "nano", 425020447);
        setField(term58767, term58767.getClass(), "time", term58772);
        setField(term58741, term58741.getClass(), "accessTime", term58767);
        setField(term58739, term58739.getClass(), "card", term58741);
        setIntField(term58739, term58739.getClass(), "lastDataVersion", 1107432374);
        setField(term58739, term58739.getClass(), "userName", "zOxseYMSdY");
        setIntField(term58739, term58739.getClass(), "point", 1623768155);
        setIntField(term58739, term58739.getClass(), "totalPoint", -919788156);
        setIntField(term58739, term58739.getClass(), "iconId", 29020862);
        setIntField(term58739, term58739.getClass(), "nameplateId", 1981104215);
        setIntField(term58739, term58739.getClass(), "frameId", 2123592941);
        setIntField(term58739, term58739.getClass(), "trophyId", 1043204008);
        setIntField(term58739, term58739.getClass(), "playCount", -2069490710);
        setIntField(term58739, term58739.getClass(), "playVsCount", -336592077);
        setIntField(term58739, term58739.getClass(), "playSyncCount", -1038346147);
        setIntField(term58739, term58739.getClass(), "winCount", -759212248);
        setIntField(term58739, term58739.getClass(), "helpCount", 710373985);
        setIntField(term58739, term58739.getClass(), "comboCount", -1098158176);
        setIntField(term58739, term58739.getClass(), "feverCount", -187070398);
        setIntField(term58739, term58739.getClass(), "totalHiScore", -1230319081);
        setIntField(term58739, term58739.getClass(), "totalEasyHighScore", -108342419);
        setIntField(term58739, term58739.getClass(), "totalBasicHighScore", -2084652820);
        setIntField(term58739, term58739.getClass(), "totalAdvancedHighScore", -1596509485);
        setIntField(term58739, term58739.getClass(), "totalExpertHighScore", 1787629634);
        setIntField(term58739, term58739.getClass(), "totalMasterHighScore", 746589330);
        setIntField(term58739, term58739.getClass(), "totalReMasterHighScore", -2087341902);
        setIntField(term58739, term58739.getClass(), "totalHighSync", -1552395095);
        setIntField(term58739, term58739.getClass(), "totalEasySync", 1119787944);
        setIntField(term58739, term58739.getClass(), "totalBasicSync", 2099414259);
        setIntField(term58739, term58739.getClass(), "totalAdvancedSync", 1080055407);
        setIntField(term58739, term58739.getClass(), "totalExpertSync", -880340280);
        setIntField(term58739, term58739.getClass(), "totalMasterSync", -1194222550);
        setIntField(term58739, term58739.getClass(), "totalReMasterSync", 566167796);
        setIntField(term58739, term58739.getClass(), "playerRating", -1082962860);
        setIntField(term58739, term58739.getClass(), "highestRating", 1200402655);
        setIntField(term58739, term58739.getClass(), "rankAuthTailId", -1500378498);
        setField(term58739, term58739.getClass(), "eventWatchedDate", "jEKlkqpHMQ");
        setField(term58739, term58739.getClass(), "webLimitDate", "QpEVWispEh");
        setIntField(term58739, term58739.getClass(), "challengeTrackPhase", -1429162976);
        setIntField(term58739, term58739.getClass(), "firstPlayBits", 1773815133);
        setField(term58739, term58739.getClass(), "lastPlayDate", "STofGrqXqL");
        setIntField(term58739, term58739.getClass(), "lastPlaceId", -1518311473);
        setField(term58739, term58739.getClass(), "lastPlaceName", "IoRhBfdSuN");
        setIntField(term58739, term58739.getClass(), "lastRegionId", 1910611561);
        setField(term58739, term58739.getClass(), "lastRegionName", "JGdxVjQzts");
        setField(term58739, term58739.getClass(), "lastClientId", "jEdjRikQtN");
        setField(term58739, term58739.getClass(), "lastCountryCode", "fSNUaokVWs");
        setIntField(term58739, term58739.getClass(), "eventPoint", -141028019);
        setIntField(term58739, term58739.getClass(), "totalLv", -2084912991);
        setIntField(term58739, term58739.getClass(), "lastLoginBonusDay", -374431639);
        setIntField(term58739, term58739.getClass(), "lastSurvivalBonusDay", -1331172307);
        setIntField(term58739, term58739.getClass(), "loginBonusLv", 2092822782);
        setField(term58737, term58737.getClass(), "user", term58739);
        setIntField(term58737, term58737.getClass(), "soudEffect", 1740023276);
        setIntField(term58737, term58737.getClass(), "mirrorMode", 412259963);
        setIntField(term58737, term58737.getClass(), "guideSpeed", 581068095);
        setIntField(term58737, term58737.getClass(), "bgInfo", 1081427463);
        setIntField(term58737, term58737.getClass(), "brightness", -276588662);
        setIntField(term58737, term58737.getClass(), "isStarRot", 41461773);
        setIntField(term58737, term58737.getClass(), "breakSe", 1130836028);
        setIntField(term58737, term58737.getClass(), "slideSe", 1084651639);
        setIntField(term58737, term58737.getClass(), "hardJudge", -5960347);
        setIntField(term58737, term58737.getClass(), "isTagJump", 1080022248);
        setIntField(term58737, term58737.getClass(), "breakSeVol", -1800860642);
        setIntField(term58737, term58737.getClass(), "slideSeVol", -1679309135);
        setIntField(term58737, term58737.getClass(), "isUpperDisp", 1736740178);
        setIntField(term58737, term58737.getClass(), "trackSkip", -202034601);
        setIntField(term58737, term58737.getClass(), "optionMode", -151407958);
        setIntField(term58737, term58737.getClass(), "simpleOptionParam", 1537567964);
        setIntField(term58737, term58737.getClass(), "adjustTiming", 1552192679);
        setIntField(term58737, term58737.getClass(), "dispTiming", -655599823);
        setIntField(term58737, term58737.getClass(), "timingPos", -1993642452);
        setIntField(term58737, term58737.getClass(), "ansVol", 1461590652);
        setIntField(term58737, term58737.getClass(), "noteVol", -1671428336);
        setIntField(term58737, term58737.getClass(), "dmgVol", -1465646058);
        setIntField(term58737, term58737.getClass(), "appealFlame", 457823846);
        setIntField(term58737, term58737.getClass(), "isFeverDisp", 1778294369);
        setIntField(term58737, term58737.getClass(), "dispJudge", -1206831454);
        setIntField(term58737, term58737.getClass(), "judgePos", 1513524215);
        setIntField(term58737, term58737.getClass(), "ratingGuard", 86829253);
        setIntField(term58737, term58737.getClass(), "selectChara", 1622273215);
        setIntField(term58737, term58737.getClass(), "sortType", 2023282992);
        setIntField(term58737, term58737.getClass(), "filterGenre", -854998820);
        setIntField(term58737, term58737.getClass(), "filterLevel", 1361637334);
        setIntField(term58737, term58737.getClass(), "filterRank", 640213918);
        setIntField(term58737, term58737.getClass(), "filterVersion", -1683063075);
        setIntField(term58737, term58737.getClass(), "filterRec", 1391093985);
        setIntField(term58737, term58737.getClass(), "filterFullCombo", -1936658953);
        setIntField(term58737, term58737.getClass(), "filterAllPerfect", 758083956);
        setIntField(term58737, term58737.getClass(), "filterDifficulty", 82402802);
        setIntField(term58737, term58737.getClass(), "filterFullSync", 83591041);
        setIntField(term58737, term58737.getClass(), "filterReMaster", 149454673);
        setIntField(term58737, term58737.getClass(), "filterMaxFever", -392494577);
        setIntField(term58737, term58737.getClass(), "finalSelectId", -1182169103);
        setIntField(term58737, term58737.getClass(), "finalSelectCategory", 75613974);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIsFeverDisp", argTypes, term58737, args);
    }

};


