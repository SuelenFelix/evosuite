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

public class UserOption_setTrackSkip_6530256460 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69501;
     Object term69719;

    public UserOption_setTrackSkip_6530256460() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term69507 = new Long(-6602460430714339690L);
        term69501 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term69503 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term69505 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term69521 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term69522 = newInstance(Class.forName("java.time.LocalDate"));
        Object term69526 = newInstance(Class.forName("java.time.LocalTime"));
        Object term69531 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term69532 = newInstance(Class.forName("java.time.LocalDate"));
        Object term69536 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term69501, term69501.getClass(), "id", 7848004402682338886L);
        setLongField(term69503, term69503.getClass(), "id", 8931772176819893873L);
        setLongField(term69505, term69505.getClass(), "id", -4370635295110591519L);
        setField(term69505, term69505.getClass(), "extId", term69507);
        setField(term69505, term69505.getClass(), "luid", "XETimBHIKG");
        setIntField(term69522, term69522.getClass(), "year", 2019);
        setShortField(term69522, term69522.getClass(), "month", (short) 11);
        setShortField(term69522, term69522.getClass(), "day", (short) 22);
        setField(term69521, term69521.getClass(), "date", term69522);
        setByteField(term69526, term69526.getClass(), "hour", (byte) 12);
        setByteField(term69526, term69526.getClass(), "minute", (byte) 32);
        setByteField(term69526, term69526.getClass(), "second", (byte) 48);
        setIntField(term69526, term69526.getClass(), "nano", 850810582);
        setField(term69521, term69521.getClass(), "time", term69526);
        setField(term69505, term69505.getClass(), "registerTime", term69521);
        setIntField(term69532, term69532.getClass(), "year", 2024);
        setShortField(term69532, term69532.getClass(), "month", (short) 11);
        setShortField(term69532, term69532.getClass(), "day", (short) 18);
        setField(term69531, term69531.getClass(), "date", term69532);
        setByteField(term69536, term69536.getClass(), "hour", (byte) 9);
        setByteField(term69536, term69536.getClass(), "minute", (byte) 40);
        setByteField(term69536, term69536.getClass(), "second", (byte) 54);
        setIntField(term69536, term69536.getClass(), "nano", 533273343);
        setField(term69531, term69531.getClass(), "time", term69536);
        setField(term69505, term69505.getClass(), "accessTime", term69531);
        setField(term69503, term69503.getClass(), "card", term69505);
        setIntField(term69503, term69503.getClass(), "lastDataVersion", 954901997);
        setField(term69503, term69503.getClass(), "userName", "nOKVZSyfbZ");
        setIntField(term69503, term69503.getClass(), "point", -1011081721);
        setIntField(term69503, term69503.getClass(), "totalPoint", -1158219481);
        setIntField(term69503, term69503.getClass(), "iconId", 1963971471);
        setIntField(term69503, term69503.getClass(), "nameplateId", 188111384);
        setIntField(term69503, term69503.getClass(), "frameId", 1383690151);
        setIntField(term69503, term69503.getClass(), "trophyId", 680948243);
        setIntField(term69503, term69503.getClass(), "playCount", 1325070569);
        setIntField(term69503, term69503.getClass(), "playVsCount", -325130467);
        setIntField(term69503, term69503.getClass(), "playSyncCount", -1728816604);
        setIntField(term69503, term69503.getClass(), "winCount", -759660487);
        setIntField(term69503, term69503.getClass(), "helpCount", 214806173);
        setIntField(term69503, term69503.getClass(), "comboCount", 1931596545);
        setIntField(term69503, term69503.getClass(), "feverCount", -571015375);
        setIntField(term69503, term69503.getClass(), "totalHiScore", -1932607282);
        setIntField(term69503, term69503.getClass(), "totalEasyHighScore", 960249702);
        setIntField(term69503, term69503.getClass(), "totalBasicHighScore", 1578244544);
        setIntField(term69503, term69503.getClass(), "totalAdvancedHighScore", 302433460);
        setIntField(term69503, term69503.getClass(), "totalExpertHighScore", 1057744472);
        setIntField(term69503, term69503.getClass(), "totalMasterHighScore", -374607997);
        setIntField(term69503, term69503.getClass(), "totalReMasterHighScore", 1319218321);
        setIntField(term69503, term69503.getClass(), "totalHighSync", 888577209);
        setIntField(term69503, term69503.getClass(), "totalEasySync", 2135004050);
        setIntField(term69503, term69503.getClass(), "totalBasicSync", -1451096117);
        setIntField(term69503, term69503.getClass(), "totalAdvancedSync", -1964170899);
        setIntField(term69503, term69503.getClass(), "totalExpertSync", 658593960);
        setIntField(term69503, term69503.getClass(), "totalMasterSync", -1492746094);
        setIntField(term69503, term69503.getClass(), "totalReMasterSync", -1561330173);
        setIntField(term69503, term69503.getClass(), "playerRating", -829139246);
        setIntField(term69503, term69503.getClass(), "highestRating", -1898349638);
        setIntField(term69503, term69503.getClass(), "rankAuthTailId", -1841869267);
        setField(term69503, term69503.getClass(), "eventWatchedDate", "adHZFgDoEH");
        setField(term69503, term69503.getClass(), "webLimitDate", "vjNETNMDhQ");
        setIntField(term69503, term69503.getClass(), "challengeTrackPhase", 300502643);
        setIntField(term69503, term69503.getClass(), "firstPlayBits", 189992900);
        setField(term69503, term69503.getClass(), "lastPlayDate", "pexqQqwSNj");
        setIntField(term69503, term69503.getClass(), "lastPlaceId", 1073692841);
        setField(term69503, term69503.getClass(), "lastPlaceName", "myfXkIEBSV");
        setIntField(term69503, term69503.getClass(), "lastRegionId", -450450534);
        setField(term69503, term69503.getClass(), "lastRegionName", "LSrqDVjzEP");
        setField(term69503, term69503.getClass(), "lastClientId", "CPZCLJxTuA");
        setField(term69503, term69503.getClass(), "lastCountryCode", "ivAOXnVjmg");
        setIntField(term69503, term69503.getClass(), "eventPoint", 1403312822);
        setIntField(term69503, term69503.getClass(), "totalLv", -2118595564);
        setIntField(term69503, term69503.getClass(), "lastLoginBonusDay", 1183106727);
        setIntField(term69503, term69503.getClass(), "lastSurvivalBonusDay", 1207415380);
        setIntField(term69503, term69503.getClass(), "loginBonusLv", -925572654);
        setField(term69501, term69501.getClass(), "user", term69503);
        setIntField(term69501, term69501.getClass(), "soudEffect", 1716478180);
        setIntField(term69501, term69501.getClass(), "mirrorMode", -168584816);
        setIntField(term69501, term69501.getClass(), "guideSpeed", -1494770619);
        setIntField(term69501, term69501.getClass(), "bgInfo", -1881283192);
        setIntField(term69501, term69501.getClass(), "brightness", -1099688599);
        setIntField(term69501, term69501.getClass(), "isStarRot", 2122713442);
        setIntField(term69501, term69501.getClass(), "breakSe", -604358624);
        setIntField(term69501, term69501.getClass(), "slideSe", -1207562004);
        setIntField(term69501, term69501.getClass(), "hardJudge", -1440790542);
        setIntField(term69501, term69501.getClass(), "isTagJump", 1293550828);
        setIntField(term69501, term69501.getClass(), "breakSeVol", 1875820558);
        setIntField(term69501, term69501.getClass(), "slideSeVol", -1407454153);
        setIntField(term69501, term69501.getClass(), "isUpperDisp", -1726816471);
        setIntField(term69501, term69501.getClass(), "trackSkip", -865440827);
        setIntField(term69501, term69501.getClass(), "optionMode", -2087127412);
        setIntField(term69501, term69501.getClass(), "simpleOptionParam", -72570405);
        setIntField(term69501, term69501.getClass(), "adjustTiming", 581438361);
        setIntField(term69501, term69501.getClass(), "dispTiming", 20384639);
        setIntField(term69501, term69501.getClass(), "timingPos", -1080775278);
        setIntField(term69501, term69501.getClass(), "ansVol", 2060368087);
        setIntField(term69501, term69501.getClass(), "noteVol", 1408834928);
        setIntField(term69501, term69501.getClass(), "dmgVol", 1892858909);
        setIntField(term69501, term69501.getClass(), "appealFlame", -33022984);
        setIntField(term69501, term69501.getClass(), "isFeverDisp", -1693956020);
        setIntField(term69501, term69501.getClass(), "dispJudge", 1085043333);
        setIntField(term69501, term69501.getClass(), "judgePos", -49131583);
        setIntField(term69501, term69501.getClass(), "ratingGuard", -1387551467);
        setIntField(term69501, term69501.getClass(), "selectChara", 1764522064);
        setIntField(term69501, term69501.getClass(), "sortType", -1284390757);
        setIntField(term69501, term69501.getClass(), "filterGenre", 151931305);
        setIntField(term69501, term69501.getClass(), "filterLevel", -1047267671);
        setIntField(term69501, term69501.getClass(), "filterRank", 1567945730);
        setIntField(term69501, term69501.getClass(), "filterVersion", -996982809);
        setIntField(term69501, term69501.getClass(), "filterRec", -1428909988);
        setIntField(term69501, term69501.getClass(), "filterFullCombo", -475684612);
        setIntField(term69501, term69501.getClass(), "filterAllPerfect", 299503838);
        setIntField(term69501, term69501.getClass(), "filterDifficulty", 1662024143);
        setIntField(term69501, term69501.getClass(), "filterFullSync", -1236889825);
        setIntField(term69501, term69501.getClass(), "filterReMaster", 308776262);
        setIntField(term69501, term69501.getClass(), "filterMaxFever", 2147290962);
        setIntField(term69501, term69501.getClass(), "finalSelectId", 131121140);
        setIntField(term69501, term69501.getClass(), "finalSelectCategory", -1875674450);
        term69719 = new Integer(-1933838767);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term69719;
        callMethod(klass, "setTrackSkip", argTypes, term69501, args);
    }

};


