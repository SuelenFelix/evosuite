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

public class UserOption_getTimingPos_25585569421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57197;

    public UserOption_getTimingPos_25585569421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term57203 = new Long(5973526439563541711L);
        term57197 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term57199 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term57201 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term57217 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term57218 = newInstance(Class.forName("java.time.LocalDate"));
        Object term57222 = newInstance(Class.forName("java.time.LocalTime"));
        Object term57227 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term57228 = newInstance(Class.forName("java.time.LocalDate"));
        Object term57232 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term57197, term57197.getClass(), "id", 3831994970480278159L);
        setLongField(term57199, term57199.getClass(), "id", -5714578622746827780L);
        setLongField(term57201, term57201.getClass(), "id", 8918129626022907229L);
        setField(term57201, term57201.getClass(), "extId", term57203);
        setField(term57201, term57201.getClass(), "luid", "TDQIAXaJru");
        setIntField(term57218, term57218.getClass(), "year", 2017);
        setShortField(term57218, term57218.getClass(), "month", (short) 2);
        setShortField(term57218, term57218.getClass(), "day", (short) 28);
        setField(term57217, term57217.getClass(), "date", term57218);
        setByteField(term57222, term57222.getClass(), "hour", (byte) 16);
        setByteField(term57222, term57222.getClass(), "minute", (byte) 54);
        setByteField(term57222, term57222.getClass(), "second", (byte) 4);
        setIntField(term57222, term57222.getClass(), "nano", 721722853);
        setField(term57217, term57217.getClass(), "time", term57222);
        setField(term57201, term57201.getClass(), "registerTime", term57217);
        setIntField(term57228, term57228.getClass(), "year", 2018);
        setShortField(term57228, term57228.getClass(), "month", (short) 8);
        setShortField(term57228, term57228.getClass(), "day", (short) 4);
        setField(term57227, term57227.getClass(), "date", term57228);
        setByteField(term57232, term57232.getClass(), "hour", (byte) 8);
        setByteField(term57232, term57232.getClass(), "minute", (byte) 15);
        setByteField(term57232, term57232.getClass(), "second", (byte) 15);
        setIntField(term57232, term57232.getClass(), "nano", 116834692);
        setField(term57227, term57227.getClass(), "time", term57232);
        setField(term57201, term57201.getClass(), "accessTime", term57227);
        setField(term57199, term57199.getClass(), "card", term57201);
        setIntField(term57199, term57199.getClass(), "lastDataVersion", -1574668692);
        setField(term57199, term57199.getClass(), "userName", "frPMFqGmrE");
        setIntField(term57199, term57199.getClass(), "point", -657503703);
        setIntField(term57199, term57199.getClass(), "totalPoint", -1456107555);
        setIntField(term57199, term57199.getClass(), "iconId", -99536224);
        setIntField(term57199, term57199.getClass(), "nameplateId", 864697708);
        setIntField(term57199, term57199.getClass(), "frameId", -218244630);
        setIntField(term57199, term57199.getClass(), "trophyId", -963363890);
        setIntField(term57199, term57199.getClass(), "playCount", 1294401720);
        setIntField(term57199, term57199.getClass(), "playVsCount", -1605686410);
        setIntField(term57199, term57199.getClass(), "playSyncCount", 890902750);
        setIntField(term57199, term57199.getClass(), "winCount", 1085935180);
        setIntField(term57199, term57199.getClass(), "helpCount", -1085733328);
        setIntField(term57199, term57199.getClass(), "comboCount", -631444937);
        setIntField(term57199, term57199.getClass(), "feverCount", 520481809);
        setIntField(term57199, term57199.getClass(), "totalHiScore", 590207234);
        setIntField(term57199, term57199.getClass(), "totalEasyHighScore", 472783258);
        setIntField(term57199, term57199.getClass(), "totalBasicHighScore", 248223082);
        setIntField(term57199, term57199.getClass(), "totalAdvancedHighScore", 591035529);
        setIntField(term57199, term57199.getClass(), "totalExpertHighScore", 349687385);
        setIntField(term57199, term57199.getClass(), "totalMasterHighScore", -594025650);
        setIntField(term57199, term57199.getClass(), "totalReMasterHighScore", 483624079);
        setIntField(term57199, term57199.getClass(), "totalHighSync", -1846882062);
        setIntField(term57199, term57199.getClass(), "totalEasySync", 1727415377);
        setIntField(term57199, term57199.getClass(), "totalBasicSync", -553367118);
        setIntField(term57199, term57199.getClass(), "totalAdvancedSync", 1734441946);
        setIntField(term57199, term57199.getClass(), "totalExpertSync", -1316758147);
        setIntField(term57199, term57199.getClass(), "totalMasterSync", -266645356);
        setIntField(term57199, term57199.getClass(), "totalReMasterSync", -1168974406);
        setIntField(term57199, term57199.getClass(), "playerRating", 649099374);
        setIntField(term57199, term57199.getClass(), "highestRating", -1673318908);
        setIntField(term57199, term57199.getClass(), "rankAuthTailId", -748711480);
        setField(term57199, term57199.getClass(), "eventWatchedDate", "DvfOYWcNBN");
        setField(term57199, term57199.getClass(), "webLimitDate", "cvbvwpPlNk");
        setIntField(term57199, term57199.getClass(), "challengeTrackPhase", -1598682190);
        setIntField(term57199, term57199.getClass(), "firstPlayBits", -1485075510);
        setField(term57199, term57199.getClass(), "lastPlayDate", "uCdLbhvYeG");
        setIntField(term57199, term57199.getClass(), "lastPlaceId", -628388239);
        setField(term57199, term57199.getClass(), "lastPlaceName", "ipoyEHBfoG");
        setIntField(term57199, term57199.getClass(), "lastRegionId", 971487780);
        setField(term57199, term57199.getClass(), "lastRegionName", "iSBTpbiteU");
        setField(term57199, term57199.getClass(), "lastClientId", "MTwFbEoMZj");
        setField(term57199, term57199.getClass(), "lastCountryCode", "uEQbnHbyAn");
        setIntField(term57199, term57199.getClass(), "eventPoint", 1887441979);
        setIntField(term57199, term57199.getClass(), "totalLv", -1582466429);
        setIntField(term57199, term57199.getClass(), "lastLoginBonusDay", 2050053472);
        setIntField(term57199, term57199.getClass(), "lastSurvivalBonusDay", -794841275);
        setIntField(term57199, term57199.getClass(), "loginBonusLv", -1965551214);
        setField(term57197, term57197.getClass(), "user", term57199);
        setIntField(term57197, term57197.getClass(), "soudEffect", 417272371);
        setIntField(term57197, term57197.getClass(), "mirrorMode", -93440765);
        setIntField(term57197, term57197.getClass(), "guideSpeed", -1763224766);
        setIntField(term57197, term57197.getClass(), "bgInfo", -966554344);
        setIntField(term57197, term57197.getClass(), "brightness", 1485859505);
        setIntField(term57197, term57197.getClass(), "isStarRot", 1422308934);
        setIntField(term57197, term57197.getClass(), "breakSe", -1843770627);
        setIntField(term57197, term57197.getClass(), "slideSe", -1984599794);
        setIntField(term57197, term57197.getClass(), "hardJudge", 1410893442);
        setIntField(term57197, term57197.getClass(), "isTagJump", -1557544397);
        setIntField(term57197, term57197.getClass(), "breakSeVol", 1050498492);
        setIntField(term57197, term57197.getClass(), "slideSeVol", -14998881);
        setIntField(term57197, term57197.getClass(), "isUpperDisp", 1913259662);
        setIntField(term57197, term57197.getClass(), "trackSkip", -181084778);
        setIntField(term57197, term57197.getClass(), "optionMode", -558822921);
        setIntField(term57197, term57197.getClass(), "simpleOptionParam", -445796317);
        setIntField(term57197, term57197.getClass(), "adjustTiming", -75307754);
        setIntField(term57197, term57197.getClass(), "dispTiming", 1208875748);
        setIntField(term57197, term57197.getClass(), "timingPos", -353170573);
        setIntField(term57197, term57197.getClass(), "ansVol", -1071939679);
        setIntField(term57197, term57197.getClass(), "noteVol", -1530369051);
        setIntField(term57197, term57197.getClass(), "dmgVol", -538048936);
        setIntField(term57197, term57197.getClass(), "appealFlame", 359927439);
        setIntField(term57197, term57197.getClass(), "isFeverDisp", -671786602);
        setIntField(term57197, term57197.getClass(), "dispJudge", -51390011);
        setIntField(term57197, term57197.getClass(), "judgePos", 1988464734);
        setIntField(term57197, term57197.getClass(), "ratingGuard", 1205484765);
        setIntField(term57197, term57197.getClass(), "selectChara", 1721773044);
        setIntField(term57197, term57197.getClass(), "sortType", -915969228);
        setIntField(term57197, term57197.getClass(), "filterGenre", 1880570421);
        setIntField(term57197, term57197.getClass(), "filterLevel", 1550634740);
        setIntField(term57197, term57197.getClass(), "filterRank", 1948909933);
        setIntField(term57197, term57197.getClass(), "filterVersion", 523942487);
        setIntField(term57197, term57197.getClass(), "filterRec", 414828751);
        setIntField(term57197, term57197.getClass(), "filterFullCombo", -1302401149);
        setIntField(term57197, term57197.getClass(), "filterAllPerfect", -245323536);
        setIntField(term57197, term57197.getClass(), "filterDifficulty", 1512614447);
        setIntField(term57197, term57197.getClass(), "filterFullSync", 1978532347);
        setIntField(term57197, term57197.getClass(), "filterReMaster", 612187049);
        setIntField(term57197, term57197.getClass(), "filterMaxFever", -965947021);
        setIntField(term57197, term57197.getClass(), "finalSelectId", 1079005450);
        setIntField(term57197, term57197.getClass(), "finalSelectCategory", -1932347451);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTimingPos", argTypes, term57197, args);
    }

};


