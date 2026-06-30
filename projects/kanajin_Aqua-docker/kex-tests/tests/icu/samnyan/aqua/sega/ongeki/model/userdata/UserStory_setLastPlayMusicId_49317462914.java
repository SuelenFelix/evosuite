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
import java.lang.Integer;

public class UserStory_setLastPlayMusicId_49317462914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164091;
     Object term164362;

    public UserStory_setLastPlayMusicId_49317462914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term164097 = new Long(-432424084523104253L);
        term164091 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserStory"));
        Object term164093 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term164095 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term164111 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term164112 = newInstance(Class.forName("java.time.LocalDate"));
        Object term164116 = newInstance(Class.forName("java.time.LocalTime"));
        Object term164121 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term164122 = newInstance(Class.forName("java.time.LocalDate"));
        Object term164126 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term164091, term164091.getClass(), "id", -551639182102677710L);
        setLongField(term164093, term164093.getClass(), "id", 7220537567889807156L);
        setLongField(term164095, term164095.getClass(), "id", 6406723091716352058L);
        setField(term164095, term164095.getClass(), "extId", term164097);
        setField(term164095, term164095.getClass(), "luid", "jomJrYDlDE");
        setIntField(term164112, term164112.getClass(), "year", 2029);
        setShortField(term164112, term164112.getClass(), "month", (short) 11);
        setShortField(term164112, term164112.getClass(), "day", (short) 6);
        setField(term164111, term164111.getClass(), "date", term164112);
        setByteField(term164116, term164116.getClass(), "hour", (byte) 10);
        setByteField(term164116, term164116.getClass(), "minute", (byte) 49);
        setByteField(term164116, term164116.getClass(), "second", (byte) 58);
        setIntField(term164116, term164116.getClass(), "nano", 611097210);
        setField(term164111, term164111.getClass(), "time", term164116);
        setField(term164095, term164095.getClass(), "registerTime", term164111);
        setIntField(term164122, term164122.getClass(), "year", 2024);
        setShortField(term164122, term164122.getClass(), "month", (short) 1);
        setShortField(term164122, term164122.getClass(), "day", (short) 6);
        setField(term164121, term164121.getClass(), "date", term164122);
        setByteField(term164126, term164126.getClass(), "hour", (byte) 6);
        setByteField(term164126, term164126.getClass(), "minute", (byte) 55);
        setByteField(term164126, term164126.getClass(), "second", (byte) 13);
        setIntField(term164126, term164126.getClass(), "nano", 533001418);
        setField(term164121, term164121.getClass(), "time", term164126);
        setField(term164095, term164095.getClass(), "accessTime", term164121);
        setField(term164093, term164093.getClass(), "card", term164095);
        setField(term164093, term164093.getClass(), "userName", "BQmwDtrgti");
        setIntField(term164093, term164093.getClass(), "level", 333645088);
        setIntField(term164093, term164093.getClass(), "reincarnationNum", 154374104);
        setLongField(term164093, term164093.getClass(), "exp", 2769255640086837293L);
        setLongField(term164093, term164093.getClass(), "point", 6021882431858851722L);
        setLongField(term164093, term164093.getClass(), "totalPoint", -837980592406874043L);
        setIntField(term164093, term164093.getClass(), "playCount", 852769097);
        setIntField(term164093, term164093.getClass(), "jewelCount", -1958995134);
        setIntField(term164093, term164093.getClass(), "totalJewelCount", -2134940262);
        setIntField(term164093, term164093.getClass(), "medalCount", 1543999925);
        setIntField(term164093, term164093.getClass(), "playerRating", -1587400954);
        setIntField(term164093, term164093.getClass(), "highestRating", 822645894);
        setIntField(term164093, term164093.getClass(), "battlePoint", -1570295297);
        setIntField(term164093, term164093.getClass(), "bestBattlePoint", 823152755);
        setIntField(term164093, term164093.getClass(), "overDamageBattlePoint", 929229690);
        setBooleanField(term164093, term164093.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term164093, term164093.getClass(), "nameplateId", -454507797);
        setIntField(term164093, term164093.getClass(), "trophyId", 304461972);
        setIntField(term164093, term164093.getClass(), "cardId", 907796752);
        setIntField(term164093, term164093.getClass(), "characterId", -1758084707);
        setIntField(term164093, term164093.getClass(), "characterVoiceNo", -1982548161);
        setIntField(term164093, term164093.getClass(), "tabSetting", 1329279958);
        setIntField(term164093, term164093.getClass(), "tabSortSetting", 469543205);
        setIntField(term164093, term164093.getClass(), "cardCategorySetting", -12516056);
        setIntField(term164093, term164093.getClass(), "cardSortSetting", 1697090986);
        setIntField(term164093, term164093.getClass(), "rivalScoreCategorySetting", -1830375526);
        setIntField(term164093, term164093.getClass(), "playedTutorialBit", 936265526);
        setIntField(term164093, term164093.getClass(), "firstTutorialCancelNum", -495686058);
        setLongField(term164093, term164093.getClass(), "sumTechHighScore", 5250197542785557863L);
        setLongField(term164093, term164093.getClass(), "sumTechBasicHighScore", -1217059836107042676L);
        setLongField(term164093, term164093.getClass(), "sumTechAdvancedHighScore", -3510925584197260632L);
        setLongField(term164093, term164093.getClass(), "sumTechExpertHighScore", 249605792719798206L);
        setLongField(term164093, term164093.getClass(), "sumTechMasterHighScore", 6361128850334161269L);
        setLongField(term164093, term164093.getClass(), "sumTechLunaticHighScore", 5894188070569251493L);
        setLongField(term164093, term164093.getClass(), "sumBattleHighScore", -2929024140026737070L);
        setLongField(term164093, term164093.getClass(), "sumBattleBasicHighScore", 4250631141623631547L);
        setLongField(term164093, term164093.getClass(), "sumBattleAdvancedHighScore", -4442651502268555941L);
        setLongField(term164093, term164093.getClass(), "sumBattleExpertHighScore", -488792094823193838L);
        setLongField(term164093, term164093.getClass(), "sumBattleMasterHighScore", 8303052489803253713L);
        setLongField(term164093, term164093.getClass(), "sumBattleLunaticHighScore", -5700978725283773576L);
        setField(term164093, term164093.getClass(), "eventWatchedDate", "iqVbRxUtcE");
        setField(term164093, term164093.getClass(), "cmEventWatchedDate", "CXKmGqWZmZ");
        setField(term164093, term164093.getClass(), "firstGameId", "LZcrISHdty");
        setField(term164093, term164093.getClass(), "firstRomVersion", "ttStZmuDMP");
        setField(term164093, term164093.getClass(), "firstDataVersion", "tdVGOsPdFX");
        setField(term164093, term164093.getClass(), "firstPlayDate", "gzpBjJSCCd");
        setField(term164093, term164093.getClass(), "lastGameId", "xfbZhodhmq");
        setField(term164093, term164093.getClass(), "lastRomVersion", "DjJOlQgBbP");
        setField(term164093, term164093.getClass(), "lastDataVersion", "ITgJRrDzJt");
        setField(term164093, term164093.getClass(), "compatibleCmVersion", "oBFbmCpapG");
        setField(term164093, term164093.getClass(), "lastPlayDate", "XdVoIkavja");
        setIntField(term164093, term164093.getClass(), "lastPlaceId", 611713058);
        setField(term164093, term164093.getClass(), "lastPlaceName", "CDXBhicnsV");
        setIntField(term164093, term164093.getClass(), "lastRegionId", -1354326923);
        setField(term164093, term164093.getClass(), "lastRegionName", "BzaFlqnXjh");
        setIntField(term164093, term164093.getClass(), "lastAllNetId", -986698677);
        setField(term164093, term164093.getClass(), "lastClientId", "GkpQCrijZx");
        setIntField(term164093, term164093.getClass(), "lastUsedDeckId", -1381534227);
        setIntField(term164093, term164093.getClass(), "lastPlayMusicLevel", -115921884);
        setIntField(term164093, term164093.getClass(), "lastEmoneyBrand", 69514589);
        setField(term164091, term164091.getClass(), "user", term164093);
        setIntField(term164091, term164091.getClass(), "storyId", 1016576703);
        setIntField(term164091, term164091.getClass(), "lastChapterId", -1816990337);
        setIntField(term164091, term164091.getClass(), "jewelCount", -729317472);
        setIntField(term164091, term164091.getClass(), "lastPlayMusicId", 518527887);
        setIntField(term164091, term164091.getClass(), "lastPlayMusicCategory", 1621425751);
        setIntField(term164091, term164091.getClass(), "lastPlayMusicLevel", 1649760237);
        term164362 = new Integer(1188626740);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserStory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term164362;
        callMethod(klass, "setLastPlayMusicId", argTypes, term164091, args);
    }

};


