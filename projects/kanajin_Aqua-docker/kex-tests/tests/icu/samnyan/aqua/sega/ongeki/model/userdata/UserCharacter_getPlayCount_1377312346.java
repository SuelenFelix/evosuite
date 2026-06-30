package icu.samnyan.aqua.sega.ongeki.model.userdata;

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
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserCharacter_getPlayCount_1377312346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170439;

    public UserCharacter_getPlayCount_1377312346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term170445 = new Long(-629491722907628764L);
        term170439 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter"));
        Object term170441 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term170443 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term170459 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term170460 = newInstance(Class.forName("java.time.LocalDate"));
        Object term170464 = newInstance(Class.forName("java.time.LocalTime"));
        Object term170469 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term170470 = newInstance(Class.forName("java.time.LocalDate"));
        Object term170474 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term170439, term170439.getClass(), "id", -6578012856501009609L);
        setLongField(term170441, term170441.getClass(), "id", -629451464740461051L);
        setLongField(term170443, term170443.getClass(), "id", 733656404089314249L);
        setField(term170443, term170443.getClass(), "extId", term170445);
        setField(term170443, term170443.getClass(), "luid", "ANCcbJNtSR");
        setIntField(term170460, term170460.getClass(), "year", 2024);
        setShortField(term170460, term170460.getClass(), "month", (short) 12);
        setShortField(term170460, term170460.getClass(), "day", (short) 29);
        setField(term170459, term170459.getClass(), "date", term170460);
        setByteField(term170464, term170464.getClass(), "hour", (byte) 22);
        setByteField(term170464, term170464.getClass(), "minute", (byte) 7);
        setByteField(term170464, term170464.getClass(), "second", (byte) 1);
        setIntField(term170464, term170464.getClass(), "nano", 924286363);
        setField(term170459, term170459.getClass(), "time", term170464);
        setField(term170443, term170443.getClass(), "registerTime", term170459);
        setIntField(term170470, term170470.getClass(), "year", 2011);
        setShortField(term170470, term170470.getClass(), "month", (short) 12);
        setShortField(term170470, term170470.getClass(), "day", (short) 13);
        setField(term170469, term170469.getClass(), "date", term170470);
        setByteField(term170474, term170474.getClass(), "hour", (byte) 4);
        setByteField(term170474, term170474.getClass(), "minute", (byte) 19);
        setByteField(term170474, term170474.getClass(), "second", (byte) 3);
        setIntField(term170474, term170474.getClass(), "nano", 325415099);
        setField(term170469, term170469.getClass(), "time", term170474);
        setField(term170443, term170443.getClass(), "accessTime", term170469);
        setField(term170441, term170441.getClass(), "card", term170443);
        setField(term170441, term170441.getClass(), "userName", "EXhULLeGjO");
        setIntField(term170441, term170441.getClass(), "level", 69607831);
        setIntField(term170441, term170441.getClass(), "reincarnationNum", 1571165009);
        setLongField(term170441, term170441.getClass(), "exp", 1801000213877603286L);
        setLongField(term170441, term170441.getClass(), "point", 6616955996274687903L);
        setLongField(term170441, term170441.getClass(), "totalPoint", -3290833408389403753L);
        setIntField(term170441, term170441.getClass(), "playCount", 617144608);
        setIntField(term170441, term170441.getClass(), "jewelCount", 2095235044);
        setIntField(term170441, term170441.getClass(), "totalJewelCount", -363902615);
        setIntField(term170441, term170441.getClass(), "medalCount", -100522872);
        setIntField(term170441, term170441.getClass(), "playerRating", -49359679);
        setIntField(term170441, term170441.getClass(), "highestRating", 1959538355);
        setIntField(term170441, term170441.getClass(), "battlePoint", 2137728302);
        setIntField(term170441, term170441.getClass(), "bestBattlePoint", -1805617761);
        setIntField(term170441, term170441.getClass(), "overDamageBattlePoint", -252123735);
        setBooleanField(term170441, term170441.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term170441, term170441.getClass(), "nameplateId", -295928022);
        setIntField(term170441, term170441.getClass(), "trophyId", -95133545);
        setIntField(term170441, term170441.getClass(), "cardId", -313878687);
        setIntField(term170441, term170441.getClass(), "characterId", 1545730027);
        setIntField(term170441, term170441.getClass(), "characterVoiceNo", -428895495);
        setIntField(term170441, term170441.getClass(), "tabSetting", 1617741210);
        setIntField(term170441, term170441.getClass(), "tabSortSetting", -1298890160);
        setIntField(term170441, term170441.getClass(), "cardCategorySetting", -2070483129);
        setIntField(term170441, term170441.getClass(), "cardSortSetting", -362092120);
        setIntField(term170441, term170441.getClass(), "rivalScoreCategorySetting", 1366079057);
        setIntField(term170441, term170441.getClass(), "playedTutorialBit", -999926600);
        setIntField(term170441, term170441.getClass(), "firstTutorialCancelNum", 1395824043);
        setLongField(term170441, term170441.getClass(), "sumTechHighScore", 3827140775468483778L);
        setLongField(term170441, term170441.getClass(), "sumTechBasicHighScore", -7886523375925893926L);
        setLongField(term170441, term170441.getClass(), "sumTechAdvancedHighScore", 1196966682262295867L);
        setLongField(term170441, term170441.getClass(), "sumTechExpertHighScore", -82669485577258761L);
        setLongField(term170441, term170441.getClass(), "sumTechMasterHighScore", -3074499818274191179L);
        setLongField(term170441, term170441.getClass(), "sumTechLunaticHighScore", 3389102477696255827L);
        setLongField(term170441, term170441.getClass(), "sumBattleHighScore", -3694252398964886431L);
        setLongField(term170441, term170441.getClass(), "sumBattleBasicHighScore", -5400952784234386971L);
        setLongField(term170441, term170441.getClass(), "sumBattleAdvancedHighScore", -4888336420869614311L);
        setLongField(term170441, term170441.getClass(), "sumBattleExpertHighScore", -6012619825906588170L);
        setLongField(term170441, term170441.getClass(), "sumBattleMasterHighScore", 8373579218386204615L);
        setLongField(term170441, term170441.getClass(), "sumBattleLunaticHighScore", -4205123824650197721L);
        setField(term170441, term170441.getClass(), "eventWatchedDate", "ipiLtEOSGh");
        setField(term170441, term170441.getClass(), "cmEventWatchedDate", "mBJiiQCxaL");
        setField(term170441, term170441.getClass(), "firstGameId", "DsIfGQndOB");
        setField(term170441, term170441.getClass(), "firstRomVersion", "bKVDCtrRgI");
        setField(term170441, term170441.getClass(), "firstDataVersion", "ZbxzwEYXdm");
        setField(term170441, term170441.getClass(), "firstPlayDate", "kJPYWHclZM");
        setField(term170441, term170441.getClass(), "lastGameId", "azYtVoulhq");
        setField(term170441, term170441.getClass(), "lastRomVersion", "kVLqWlFysu");
        setField(term170441, term170441.getClass(), "lastDataVersion", "cHmwpyPdAp");
        setField(term170441, term170441.getClass(), "compatibleCmVersion", "oNFTwxUIzz");
        setField(term170441, term170441.getClass(), "lastPlayDate", "VGsYNwQhEZ");
        setIntField(term170441, term170441.getClass(), "lastPlaceId", 573136587);
        setField(term170441, term170441.getClass(), "lastPlaceName", "SsgaArGuEz");
        setIntField(term170441, term170441.getClass(), "lastRegionId", 2106974497);
        setField(term170441, term170441.getClass(), "lastRegionName", "dHsWwhojpf");
        setIntField(term170441, term170441.getClass(), "lastAllNetId", 1608211969);
        setField(term170441, term170441.getClass(), "lastClientId", "ncpWpGyCgp");
        setIntField(term170441, term170441.getClass(), "lastUsedDeckId", -1494030852);
        setIntField(term170441, term170441.getClass(), "lastPlayMusicLevel", 1361581940);
        setIntField(term170441, term170441.getClass(), "lastEmoneyBrand", 35296030);
        setField(term170439, term170439.getClass(), "user", term170441);
        setIntField(term170439, term170439.getClass(), "characterId", -147453115);
        setIntField(term170439, term170439.getClass(), "costumeId", 2047983381);
        setIntField(term170439, term170439.getClass(), "attachmentId", 1385190120);
        setIntField(term170439, term170439.getClass(), "playCount", -2000859986);
        setIntField(term170439, term170439.getClass(), "intimateLevel", 1200458018);
        setIntField(term170439, term170439.getClass(), "intimateCount", 600261391);
        setIntField(term170439, term170439.getClass(), "intimateCountRewarded", -2059332972);
        setField(term170439, term170439.getClass(), "intimateCountDate", "AENfrCHOWz");
        setBooleanField(term170439, term170439.getClass(), "isNew", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayCount", argTypes, term170439, args);
    }

};


