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

public class UserMissionPoint_equals_20592682229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10736;
     Object term11003;

    public UserMissionPoint_equals_20592682229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10742 = new Long(7009926388951271268L);
        term10736 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMissionPoint"));
        Object term10738 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term10740 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term10756 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10757 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10761 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10766 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10767 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10771 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term10736, term10736.getClass(), "id", -599981502351912419L);
        setLongField(term10738, term10738.getClass(), "id", 8171709541116491249L);
        setLongField(term10740, term10740.getClass(), "id", 1867943942587005261L);
        setField(term10740, term10740.getClass(), "extId", term10742);
        setField(term10740, term10740.getClass(), "luid", "zjZYTddemL");
        setIntField(term10757, term10757.getClass(), "year", 2024);
        setShortField(term10757, term10757.getClass(), "month", (short) 5);
        setShortField(term10757, term10757.getClass(), "day", (short) 6);
        setField(term10756, term10756.getClass(), "date", term10757);
        setByteField(term10761, term10761.getClass(), "hour", (byte) 20);
        setByteField(term10761, term10761.getClass(), "minute", (byte) 14);
        setByteField(term10761, term10761.getClass(), "second", (byte) 27);
        setIntField(term10761, term10761.getClass(), "nano", 900636101);
        setField(term10756, term10756.getClass(), "time", term10761);
        setField(term10740, term10740.getClass(), "registerTime", term10756);
        setIntField(term10767, term10767.getClass(), "year", 2021);
        setShortField(term10767, term10767.getClass(), "month", (short) 4);
        setShortField(term10767, term10767.getClass(), "day", (short) 17);
        setField(term10766, term10766.getClass(), "date", term10767);
        setByteField(term10771, term10771.getClass(), "hour", (byte) 4);
        setByteField(term10771, term10771.getClass(), "minute", (byte) 11);
        setByteField(term10771, term10771.getClass(), "second", (byte) 16);
        setIntField(term10771, term10771.getClass(), "nano", 509895858);
        setField(term10766, term10766.getClass(), "time", term10771);
        setField(term10740, term10740.getClass(), "accessTime", term10766);
        setField(term10738, term10738.getClass(), "card", term10740);
        setField(term10738, term10738.getClass(), "userName", "QtrylgCLiF");
        setIntField(term10738, term10738.getClass(), "level", -1288536479);
        setIntField(term10738, term10738.getClass(), "reincarnationNum", 1092038167);
        setLongField(term10738, term10738.getClass(), "exp", -9168517519350392654L);
        setLongField(term10738, term10738.getClass(), "point", 4828755228445882127L);
        setLongField(term10738, term10738.getClass(), "totalPoint", 970120292495348028L);
        setIntField(term10738, term10738.getClass(), "playCount", 1879729823);
        setIntField(term10738, term10738.getClass(), "jewelCount", 1443855558);
        setIntField(term10738, term10738.getClass(), "totalJewelCount", -1933419449);
        setIntField(term10738, term10738.getClass(), "medalCount", -1804322375);
        setIntField(term10738, term10738.getClass(), "playerRating", 1595814906);
        setIntField(term10738, term10738.getClass(), "highestRating", -834193529);
        setIntField(term10738, term10738.getClass(), "battlePoint", 335780735);
        setIntField(term10738, term10738.getClass(), "bestBattlePoint", -1541981599);
        setIntField(term10738, term10738.getClass(), "overDamageBattlePoint", 1605456363);
        setBooleanField(term10738, term10738.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term10738, term10738.getClass(), "nameplateId", 2059896693);
        setIntField(term10738, term10738.getClass(), "trophyId", 2109912812);
        setIntField(term10738, term10738.getClass(), "cardId", 1841286431);
        setIntField(term10738, term10738.getClass(), "characterId", -1723168189);
        setIntField(term10738, term10738.getClass(), "characterVoiceNo", -675283917);
        setIntField(term10738, term10738.getClass(), "tabSetting", -2093862988);
        setIntField(term10738, term10738.getClass(), "tabSortSetting", 1337828646);
        setIntField(term10738, term10738.getClass(), "cardCategorySetting", 532666604);
        setIntField(term10738, term10738.getClass(), "cardSortSetting", -13725716);
        setIntField(term10738, term10738.getClass(), "rivalScoreCategorySetting", -1695750603);
        setIntField(term10738, term10738.getClass(), "playedTutorialBit", 63677360);
        setIntField(term10738, term10738.getClass(), "firstTutorialCancelNum", 1478914037);
        setLongField(term10738, term10738.getClass(), "sumTechHighScore", 77619432202128806L);
        setLongField(term10738, term10738.getClass(), "sumTechBasicHighScore", -1647156882669215876L);
        setLongField(term10738, term10738.getClass(), "sumTechAdvancedHighScore", 4115148503664117517L);
        setLongField(term10738, term10738.getClass(), "sumTechExpertHighScore", 8527367353497875781L);
        setLongField(term10738, term10738.getClass(), "sumTechMasterHighScore", -6489405551733780896L);
        setLongField(term10738, term10738.getClass(), "sumTechLunaticHighScore", 5818741986224130131L);
        setLongField(term10738, term10738.getClass(), "sumBattleHighScore", 370847120687610747L);
        setLongField(term10738, term10738.getClass(), "sumBattleBasicHighScore", -6399462725251497844L);
        setLongField(term10738, term10738.getClass(), "sumBattleAdvancedHighScore", -4855037955202452256L);
        setLongField(term10738, term10738.getClass(), "sumBattleExpertHighScore", -5903549884298836343L);
        setLongField(term10738, term10738.getClass(), "sumBattleMasterHighScore", -3058119213533262883L);
        setLongField(term10738, term10738.getClass(), "sumBattleLunaticHighScore", 1950957495500453461L);
        setField(term10738, term10738.getClass(), "eventWatchedDate", "orEuhCStGM");
        setField(term10738, term10738.getClass(), "cmEventWatchedDate", "HhEaSXWvrY");
        setField(term10738, term10738.getClass(), "firstGameId", "CVRGEomOth");
        setField(term10738, term10738.getClass(), "firstRomVersion", "vSeruUyNWX");
        setField(term10738, term10738.getClass(), "firstDataVersion", "UkKvaeJfEC");
        setField(term10738, term10738.getClass(), "firstPlayDate", "WPxXsahPRq");
        setField(term10738, term10738.getClass(), "lastGameId", "IENRuqmwUU");
        setField(term10738, term10738.getClass(), "lastRomVersion", "GsWxOwXvSu");
        setField(term10738, term10738.getClass(), "lastDataVersion", "bKBSncrMEZ");
        setField(term10738, term10738.getClass(), "compatibleCmVersion", "yeSXGqQExb");
        setField(term10738, term10738.getClass(), "lastPlayDate", "uXYcXVYJZM");
        setIntField(term10738, term10738.getClass(), "lastPlaceId", 1630231519);
        setField(term10738, term10738.getClass(), "lastPlaceName", "BJhjdJUhkz");
        setIntField(term10738, term10738.getClass(), "lastRegionId", 1460702778);
        setField(term10738, term10738.getClass(), "lastRegionName", "cdHYQDgUZR");
        setIntField(term10738, term10738.getClass(), "lastAllNetId", -1398142433);
        setField(term10738, term10738.getClass(), "lastClientId", "KAORSSPSeV");
        setIntField(term10738, term10738.getClass(), "lastUsedDeckId", -1112119058);
        setIntField(term10738, term10738.getClass(), "lastPlayMusicLevel", 2073858334);
        setIntField(term10738, term10738.getClass(), "lastEmoneyBrand", -1693535639);
        setField(term10736, term10736.getClass(), "user", term10738);
        setIntField(term10736, term10736.getClass(), "eventId", 1344744036);
        setLongField(term10736, term10736.getClass(), "point", -6423955170741487890L);
        term11003 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMissionPoint");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term11003;
        callMethod(klass, "equals", argTypes, term10736, args);
    }

};


