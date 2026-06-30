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

public class UserCharacter_setIntimateLevel_56948333818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176332;
     Object term176617;

    public UserCharacter_setIntimateLevel_56948333818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term176338 = new Long(-2691996476200751382L);
        term176332 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter"));
        Object term176334 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term176336 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term176352 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term176353 = newInstance(Class.forName("java.time.LocalDate"));
        Object term176357 = newInstance(Class.forName("java.time.LocalTime"));
        Object term176362 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term176363 = newInstance(Class.forName("java.time.LocalDate"));
        Object term176367 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term176332, term176332.getClass(), "id", -2781983210471273168L);
        setLongField(term176334, term176334.getClass(), "id", -3906523385150190041L);
        setLongField(term176336, term176336.getClass(), "id", 5260599369554276149L);
        setField(term176336, term176336.getClass(), "extId", term176338);
        setField(term176336, term176336.getClass(), "luid", "MvFuIySpGS");
        setIntField(term176353, term176353.getClass(), "year", 2010);
        setShortField(term176353, term176353.getClass(), "month", (short) 5);
        setShortField(term176353, term176353.getClass(), "day", (short) 27);
        setField(term176352, term176352.getClass(), "date", term176353);
        setByteField(term176357, term176357.getClass(), "hour", (byte) 20);
        setByteField(term176357, term176357.getClass(), "minute", (byte) 55);
        setByteField(term176357, term176357.getClass(), "second", (byte) 13);
        setIntField(term176357, term176357.getClass(), "nano", 375773979);
        setField(term176352, term176352.getClass(), "time", term176357);
        setField(term176336, term176336.getClass(), "registerTime", term176352);
        setIntField(term176363, term176363.getClass(), "year", 2023);
        setShortField(term176363, term176363.getClass(), "month", (short) 5);
        setShortField(term176363, term176363.getClass(), "day", (short) 21);
        setField(term176362, term176362.getClass(), "date", term176363);
        setByteField(term176367, term176367.getClass(), "hour", (byte) 7);
        setByteField(term176367, term176367.getClass(), "minute", (byte) 54);
        setByteField(term176367, term176367.getClass(), "second", (byte) 55);
        setIntField(term176367, term176367.getClass(), "nano", 241590130);
        setField(term176362, term176362.getClass(), "time", term176367);
        setField(term176336, term176336.getClass(), "accessTime", term176362);
        setField(term176334, term176334.getClass(), "card", term176336);
        setField(term176334, term176334.getClass(), "userName", "srIGzXCBof");
        setIntField(term176334, term176334.getClass(), "level", -1820864777);
        setIntField(term176334, term176334.getClass(), "reincarnationNum", 417281189);
        setLongField(term176334, term176334.getClass(), "exp", 8512409455428516754L);
        setLongField(term176334, term176334.getClass(), "point", -156417672044938044L);
        setLongField(term176334, term176334.getClass(), "totalPoint", 1518829869108528527L);
        setIntField(term176334, term176334.getClass(), "playCount", 1929634576);
        setIntField(term176334, term176334.getClass(), "jewelCount", -405127258);
        setIntField(term176334, term176334.getClass(), "totalJewelCount", 647360332);
        setIntField(term176334, term176334.getClass(), "medalCount", 1501751336);
        setIntField(term176334, term176334.getClass(), "playerRating", 1460802763);
        setIntField(term176334, term176334.getClass(), "highestRating", 1587708420);
        setIntField(term176334, term176334.getClass(), "battlePoint", -1895182227);
        setIntField(term176334, term176334.getClass(), "bestBattlePoint", 958523148);
        setIntField(term176334, term176334.getClass(), "overDamageBattlePoint", -16365866);
        setBooleanField(term176334, term176334.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term176334, term176334.getClass(), "nameplateId", 394594696);
        setIntField(term176334, term176334.getClass(), "trophyId", 1325767520);
        setIntField(term176334, term176334.getClass(), "cardId", -1016128601);
        setIntField(term176334, term176334.getClass(), "characterId", -1791687615);
        setIntField(term176334, term176334.getClass(), "characterVoiceNo", 534570101);
        setIntField(term176334, term176334.getClass(), "tabSetting", 702057326);
        setIntField(term176334, term176334.getClass(), "tabSortSetting", 20934480);
        setIntField(term176334, term176334.getClass(), "cardCategorySetting", -1500640507);
        setIntField(term176334, term176334.getClass(), "cardSortSetting", -1484484351);
        setIntField(term176334, term176334.getClass(), "rivalScoreCategorySetting", 338609469);
        setIntField(term176334, term176334.getClass(), "playedTutorialBit", 1029985753);
        setIntField(term176334, term176334.getClass(), "firstTutorialCancelNum", -491631818);
        setLongField(term176334, term176334.getClass(), "sumTechHighScore", 4613871478217348324L);
        setLongField(term176334, term176334.getClass(), "sumTechBasicHighScore", 87727912509233981L);
        setLongField(term176334, term176334.getClass(), "sumTechAdvancedHighScore", -6654481035819419893L);
        setLongField(term176334, term176334.getClass(), "sumTechExpertHighScore", -1400699043856699114L);
        setLongField(term176334, term176334.getClass(), "sumTechMasterHighScore", 3788155517212733447L);
        setLongField(term176334, term176334.getClass(), "sumTechLunaticHighScore", -2801739313642089867L);
        setLongField(term176334, term176334.getClass(), "sumBattleHighScore", 4733832587986907425L);
        setLongField(term176334, term176334.getClass(), "sumBattleBasicHighScore", -4323196132938348713L);
        setLongField(term176334, term176334.getClass(), "sumBattleAdvancedHighScore", -7899334444959009409L);
        setLongField(term176334, term176334.getClass(), "sumBattleExpertHighScore", 1416784594638459493L);
        setLongField(term176334, term176334.getClass(), "sumBattleMasterHighScore", 3864377246512683466L);
        setLongField(term176334, term176334.getClass(), "sumBattleLunaticHighScore", 3755340473882774321L);
        setField(term176334, term176334.getClass(), "eventWatchedDate", "ifBiFZQlWC");
        setField(term176334, term176334.getClass(), "cmEventWatchedDate", "HQKkaNKyIG");
        setField(term176334, term176334.getClass(), "firstGameId", "OgjHGtEkHS");
        setField(term176334, term176334.getClass(), "firstRomVersion", "kBvfWdWmdw");
        setField(term176334, term176334.getClass(), "firstDataVersion", "aBlTeZjrLS");
        setField(term176334, term176334.getClass(), "firstPlayDate", "WmfidvgdtK");
        setField(term176334, term176334.getClass(), "lastGameId", "yAHnlRtcKn");
        setField(term176334, term176334.getClass(), "lastRomVersion", "XuTvLpSGoD");
        setField(term176334, term176334.getClass(), "lastDataVersion", "XfbirBMzyy");
        setField(term176334, term176334.getClass(), "compatibleCmVersion", "LQQzlHcJFt");
        setField(term176334, term176334.getClass(), "lastPlayDate", "FBJxHcmMCN");
        setIntField(term176334, term176334.getClass(), "lastPlaceId", -378773888);
        setField(term176334, term176334.getClass(), "lastPlaceName", "LDyHrRkwpP");
        setIntField(term176334, term176334.getClass(), "lastRegionId", 479136541);
        setField(term176334, term176334.getClass(), "lastRegionName", "kUeOAtybVm");
        setIntField(term176334, term176334.getClass(), "lastAllNetId", 128257372);
        setField(term176334, term176334.getClass(), "lastClientId", "nLYfHaxYQe");
        setIntField(term176334, term176334.getClass(), "lastUsedDeckId", 269362552);
        setIntField(term176334, term176334.getClass(), "lastPlayMusicLevel", -640467775);
        setIntField(term176334, term176334.getClass(), "lastEmoneyBrand", -1945181535);
        setField(term176332, term176332.getClass(), "user", term176334);
        setIntField(term176332, term176332.getClass(), "characterId", -140143046);
        setIntField(term176332, term176332.getClass(), "costumeId", -1498112846);
        setIntField(term176332, term176332.getClass(), "attachmentId", -298672713);
        setIntField(term176332, term176332.getClass(), "playCount", 766181234);
        setIntField(term176332, term176332.getClass(), "intimateLevel", -789141664);
        setIntField(term176332, term176332.getClass(), "intimateCount", -1487966462);
        setIntField(term176332, term176332.getClass(), "intimateCountRewarded", -254522021);
        setField(term176332, term176332.getClass(), "intimateCountDate", "kVDxJDfbmc");
        setBooleanField(term176332, term176332.getClass(), "isNew", false);
        term176617 = new Integer(-1019541665);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term176617;
        callMethod(klass, "setIntimateLevel", argTypes, term176332, args);
    }

};


