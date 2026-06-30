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

public class UserOption_getTrackSkip_170280638616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55657;

    public UserOption_getTrackSkip_170280638616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term55663 = new Long(6698455537431331246L);
        term55657 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term55659 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term55661 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term55677 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term55678 = newInstance(Class.forName("java.time.LocalDate"));
        Object term55682 = newInstance(Class.forName("java.time.LocalTime"));
        Object term55687 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term55688 = newInstance(Class.forName("java.time.LocalDate"));
        Object term55692 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term55657, term55657.getClass(), "id", -6423955170741487890L);
        setLongField(term55659, term55659.getClass(), "id", -4663904610228258188L);
        setLongField(term55661, term55661.getClass(), "id", 3824691451696451167L);
        setField(term55661, term55661.getClass(), "extId", term55663);
        setField(term55661, term55661.getClass(), "luid", "JiSIFtJnYv");
        setIntField(term55678, term55678.getClass(), "year", 2021);
        setShortField(term55678, term55678.getClass(), "month", (short) 5);
        setShortField(term55678, term55678.getClass(), "day", (short) 13);
        setField(term55677, term55677.getClass(), "date", term55678);
        setByteField(term55682, term55682.getClass(), "hour", (byte) 15);
        setByteField(term55682, term55682.getClass(), "minute", (byte) 40);
        setByteField(term55682, term55682.getClass(), "second", (byte) 27);
        setIntField(term55682, term55682.getClass(), "nano", 319035378);
        setField(term55677, term55677.getClass(), "time", term55682);
        setField(term55661, term55661.getClass(), "registerTime", term55677);
        setIntField(term55688, term55688.getClass(), "year", 2012);
        setShortField(term55688, term55688.getClass(), "month", (short) 5);
        setShortField(term55688, term55688.getClass(), "day", (short) 21);
        setField(term55687, term55687.getClass(), "date", term55688);
        setByteField(term55692, term55692.getClass(), "hour", (byte) 19);
        setByteField(term55692, term55692.getClass(), "minute", (byte) 56);
        setByteField(term55692, term55692.getClass(), "second", (byte) 3);
        setIntField(term55692, term55692.getClass(), "nano", 266247153);
        setField(term55687, term55687.getClass(), "time", term55692);
        setField(term55661, term55661.getClass(), "accessTime", term55687);
        setField(term55659, term55659.getClass(), "card", term55661);
        setIntField(term55659, term55659.getClass(), "lastDataVersion", 482962990);
        setField(term55659, term55659.getClass(), "userName", "wxAHQRVgKc");
        setIntField(term55659, term55659.getClass(), "point", 694510512);
        setIntField(term55659, term55659.getClass(), "totalPoint", 1668115404);
        setIntField(term55659, term55659.getClass(), "iconId", -1244092546);
        setIntField(term55659, term55659.getClass(), "nameplateId", -939472836);
        setIntField(term55659, term55659.getClass(), "frameId", 924950442);
        setIntField(term55659, term55659.getClass(), "trophyId", 154444104);
        setIntField(term55659, term55659.getClass(), "playCount", 1812340862);
        setIntField(term55659, term55659.getClass(), "playVsCount", 1048628494);
        setIntField(term55659, term55659.getClass(), "playSyncCount", -1259863856);
        setIntField(term55659, term55659.getClass(), "winCount", 259620797);
        setIntField(term55659, term55659.getClass(), "helpCount", 592523230);
        setIntField(term55659, term55659.getClass(), "comboCount", 729128701);
        setIntField(term55659, term55659.getClass(), "feverCount", -1990251566);
        setIntField(term55659, term55659.getClass(), "totalHiScore", 234165066);
        setIntField(term55659, term55659.getClass(), "totalEasyHighScore", 1223931792);
        setIntField(term55659, term55659.getClass(), "totalBasicHighScore", 1032967382);
        setIntField(term55659, term55659.getClass(), "totalAdvancedHighScore", 832942795);
        setIntField(term55659, term55659.getClass(), "totalExpertHighScore", 1812644002);
        setIntField(term55659, term55659.getClass(), "totalMasterHighScore", -701090454);
        setIntField(term55659, term55659.getClass(), "totalReMasterHighScore", -1986771984);
        setIntField(term55659, term55659.getClass(), "totalHighSync", -1975052346);
        setIntField(term55659, term55659.getClass(), "totalEasySync", -619909309);
        setIntField(term55659, term55659.getClass(), "totalBasicSync", 277279565);
        setIntField(term55659, term55659.getClass(), "totalAdvancedSync", -1030236289);
        setIntField(term55659, term55659.getClass(), "totalExpertSync", -568331388);
        setIntField(term55659, term55659.getClass(), "totalMasterSync", 1558553325);
        setIntField(term55659, term55659.getClass(), "totalReMasterSync", -401500792);
        setIntField(term55659, term55659.getClass(), "playerRating", -1497822933);
        setIntField(term55659, term55659.getClass(), "highestRating", 1402422395);
        setIntField(term55659, term55659.getClass(), "rankAuthTailId", -1842694062);
        setField(term55659, term55659.getClass(), "eventWatchedDate", "bYsZEHeoeV");
        setField(term55659, term55659.getClass(), "webLimitDate", "IwvwrQylib");
        setIntField(term55659, term55659.getClass(), "challengeTrackPhase", 1926671230);
        setIntField(term55659, term55659.getClass(), "firstPlayBits", 591515356);
        setField(term55659, term55659.getClass(), "lastPlayDate", "ZWJgSttNjg");
        setIntField(term55659, term55659.getClass(), "lastPlaceId", -496031198);
        setField(term55659, term55659.getClass(), "lastPlaceName", "LQTIjJLkXH");
        setIntField(term55659, term55659.getClass(), "lastRegionId", -2031306487);
        setField(term55659, term55659.getClass(), "lastRegionName", "RvkBwedFKx");
        setField(term55659, term55659.getClass(), "lastClientId", "DYzWJljbaE");
        setField(term55659, term55659.getClass(), "lastCountryCode", "idwbHVHUcz");
        setIntField(term55659, term55659.getClass(), "eventPoint", -266787195);
        setIntField(term55659, term55659.getClass(), "totalLv", 1967526359);
        setIntField(term55659, term55659.getClass(), "lastLoginBonusDay", -405827477);
        setIntField(term55659, term55659.getClass(), "lastSurvivalBonusDay", -418743608);
        setIntField(term55659, term55659.getClass(), "loginBonusLv", 217176849);
        setField(term55657, term55657.getClass(), "user", term55659);
        setIntField(term55657, term55657.getClass(), "soudEffect", 665322254);
        setIntField(term55657, term55657.getClass(), "mirrorMode", -950956143);
        setIntField(term55657, term55657.getClass(), "guideSpeed", 146996690);
        setIntField(term55657, term55657.getClass(), "bgInfo", 490172433);
        setIntField(term55657, term55657.getClass(), "brightness", 387768499);
        setIntField(term55657, term55657.getClass(), "isStarRot", 1727693843);
        setIntField(term55657, term55657.getClass(), "breakSe", -371048786);
        setIntField(term55657, term55657.getClass(), "slideSe", -1779736424);
        setIntField(term55657, term55657.getClass(), "hardJudge", 1027604749);
        setIntField(term55657, term55657.getClass(), "isTagJump", -1786633473);
        setIntField(term55657, term55657.getClass(), "breakSeVol", 1484582681);
        setIntField(term55657, term55657.getClass(), "slideSeVol", 641921984);
        setIntField(term55657, term55657.getClass(), "isUpperDisp", -1505020273);
        setIntField(term55657, term55657.getClass(), "trackSkip", -298905997);
        setIntField(term55657, term55657.getClass(), "optionMode", -2030417348);
        setIntField(term55657, term55657.getClass(), "simpleOptionParam", 1282232010);
        setIntField(term55657, term55657.getClass(), "adjustTiming", -1360469722);
        setIntField(term55657, term55657.getClass(), "dispTiming", -1203130784);
        setIntField(term55657, term55657.getClass(), "timingPos", 728397857);
        setIntField(term55657, term55657.getClass(), "ansVol", -1851390582);
        setIntField(term55657, term55657.getClass(), "noteVol", 436551890);
        setIntField(term55657, term55657.getClass(), "dmgVol", -1176677999);
        setIntField(term55657, term55657.getClass(), "appealFlame", -1491389341);
        setIntField(term55657, term55657.getClass(), "isFeverDisp", -1204433663);
        setIntField(term55657, term55657.getClass(), "dispJudge", 784981368);
        setIntField(term55657, term55657.getClass(), "judgePos", 1786501867);
        setIntField(term55657, term55657.getClass(), "ratingGuard", 608414757);
        setIntField(term55657, term55657.getClass(), "selectChara", -67554229);
        setIntField(term55657, term55657.getClass(), "sortType", 1715935221);
        setIntField(term55657, term55657.getClass(), "filterGenre", 1396211446);
        setIntField(term55657, term55657.getClass(), "filterLevel", -407124155);
        setIntField(term55657, term55657.getClass(), "filterRank", 488605627);
        setIntField(term55657, term55657.getClass(), "filterVersion", 469579894);
        setIntField(term55657, term55657.getClass(), "filterRec", 1767003547);
        setIntField(term55657, term55657.getClass(), "filterFullCombo", -2092805936);
        setIntField(term55657, term55657.getClass(), "filterAllPerfect", -1286454716);
        setIntField(term55657, term55657.getClass(), "filterDifficulty", -1514697210);
        setIntField(term55657, term55657.getClass(), "filterFullSync", -1991261137);
        setIntField(term55657, term55657.getClass(), "filterReMaster", 353940151);
        setIntField(term55657, term55657.getClass(), "filterMaxFever", 1335341338);
        setIntField(term55657, term55657.getClass(), "finalSelectId", 1933669224);
        setIntField(term55657, term55657.getClass(), "finalSelectCategory", -455605328);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTrackSkip", argTypes, term55657, args);
    }

};


