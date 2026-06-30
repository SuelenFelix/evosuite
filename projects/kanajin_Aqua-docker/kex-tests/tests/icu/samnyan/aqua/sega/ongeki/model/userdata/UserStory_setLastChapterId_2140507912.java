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

public class UserStory_setLastChapterId_2140507912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163225;
     Object term163496;

    public UserStory_setLastChapterId_2140507912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term163231 = new Long(3077284143733577490L);
        term163225 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserStory"));
        Object term163227 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term163229 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term163245 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term163246 = newInstance(Class.forName("java.time.LocalDate"));
        Object term163250 = newInstance(Class.forName("java.time.LocalTime"));
        Object term163255 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term163256 = newInstance(Class.forName("java.time.LocalDate"));
        Object term163260 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term163225, term163225.getClass(), "id", 9222262582388375995L);
        setLongField(term163227, term163227.getClass(), "id", 8250412309269183811L);
        setLongField(term163229, term163229.getClass(), "id", 523809613551935576L);
        setField(term163229, term163229.getClass(), "extId", term163231);
        setField(term163229, term163229.getClass(), "luid", "ifINvZYshC");
        setIntField(term163246, term163246.getClass(), "year", 2017);
        setShortField(term163246, term163246.getClass(), "month", (short) 10);
        setShortField(term163246, term163246.getClass(), "day", (short) 2);
        setField(term163245, term163245.getClass(), "date", term163246);
        setByteField(term163250, term163250.getClass(), "hour", (byte) 4);
        setByteField(term163250, term163250.getClass(), "minute", (byte) 40);
        setByteField(term163250, term163250.getClass(), "second", (byte) 56);
        setIntField(term163250, term163250.getClass(), "nano", 701221907);
        setField(term163245, term163245.getClass(), "time", term163250);
        setField(term163229, term163229.getClass(), "registerTime", term163245);
        setIntField(term163256, term163256.getClass(), "year", 2017);
        setShortField(term163256, term163256.getClass(), "month", (short) 8);
        setShortField(term163256, term163256.getClass(), "day", (short) 6);
        setField(term163255, term163255.getClass(), "date", term163256);
        setByteField(term163260, term163260.getClass(), "hour", (byte) 8);
        setByteField(term163260, term163260.getClass(), "minute", (byte) 40);
        setByteField(term163260, term163260.getClass(), "second", (byte) 43);
        setIntField(term163260, term163260.getClass(), "nano", 384847912);
        setField(term163255, term163255.getClass(), "time", term163260);
        setField(term163229, term163229.getClass(), "accessTime", term163255);
        setField(term163227, term163227.getClass(), "card", term163229);
        setField(term163227, term163227.getClass(), "userName", "acUFFUizDE");
        setIntField(term163227, term163227.getClass(), "level", -129239539);
        setIntField(term163227, term163227.getClass(), "reincarnationNum", 1898041134);
        setLongField(term163227, term163227.getClass(), "exp", 3364500466458211483L);
        setLongField(term163227, term163227.getClass(), "point", 4835770363194402857L);
        setLongField(term163227, term163227.getClass(), "totalPoint", -349694407234210422L);
        setIntField(term163227, term163227.getClass(), "playCount", -849607758);
        setIntField(term163227, term163227.getClass(), "jewelCount", 2104460972);
        setIntField(term163227, term163227.getClass(), "totalJewelCount", -8337895);
        setIntField(term163227, term163227.getClass(), "medalCount", 1708375901);
        setIntField(term163227, term163227.getClass(), "playerRating", -1947090409);
        setIntField(term163227, term163227.getClass(), "highestRating", 318897815);
        setIntField(term163227, term163227.getClass(), "battlePoint", 1078408023);
        setIntField(term163227, term163227.getClass(), "bestBattlePoint", -1113914353);
        setIntField(term163227, term163227.getClass(), "overDamageBattlePoint", 860243352);
        setBooleanField(term163227, term163227.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term163227, term163227.getClass(), "nameplateId", 363051486);
        setIntField(term163227, term163227.getClass(), "trophyId", 668773961);
        setIntField(term163227, term163227.getClass(), "cardId", -1762018663);
        setIntField(term163227, term163227.getClass(), "characterId", 1974419093);
        setIntField(term163227, term163227.getClass(), "characterVoiceNo", -393770145);
        setIntField(term163227, term163227.getClass(), "tabSetting", 772000733);
        setIntField(term163227, term163227.getClass(), "tabSortSetting", -1694461759);
        setIntField(term163227, term163227.getClass(), "cardCategorySetting", -1209885402);
        setIntField(term163227, term163227.getClass(), "cardSortSetting", 544600300);
        setIntField(term163227, term163227.getClass(), "rivalScoreCategorySetting", 680424981);
        setIntField(term163227, term163227.getClass(), "playedTutorialBit", -972500336);
        setIntField(term163227, term163227.getClass(), "firstTutorialCancelNum", 1208675424);
        setLongField(term163227, term163227.getClass(), "sumTechHighScore", -7611198919242899141L);
        setLongField(term163227, term163227.getClass(), "sumTechBasicHighScore", -1697005893366100747L);
        setLongField(term163227, term163227.getClass(), "sumTechAdvancedHighScore", 8921915975148421411L);
        setLongField(term163227, term163227.getClass(), "sumTechExpertHighScore", -1674803133573527773L);
        setLongField(term163227, term163227.getClass(), "sumTechMasterHighScore", -6412349450749439165L);
        setLongField(term163227, term163227.getClass(), "sumTechLunaticHighScore", 3776816024579840928L);
        setLongField(term163227, term163227.getClass(), "sumBattleHighScore", -3393252029393706677L);
        setLongField(term163227, term163227.getClass(), "sumBattleBasicHighScore", -1106562206887234717L);
        setLongField(term163227, term163227.getClass(), "sumBattleAdvancedHighScore", -5249747777828118526L);
        setLongField(term163227, term163227.getClass(), "sumBattleExpertHighScore", -821553075008672462L);
        setLongField(term163227, term163227.getClass(), "sumBattleMasterHighScore", -4766329145709812666L);
        setLongField(term163227, term163227.getClass(), "sumBattleLunaticHighScore", -1858184347421260731L);
        setField(term163227, term163227.getClass(), "eventWatchedDate", "VRnGGrsjgH");
        setField(term163227, term163227.getClass(), "cmEventWatchedDate", "rYzEwQHkaO");
        setField(term163227, term163227.getClass(), "firstGameId", "kVqQcPdrWQ");
        setField(term163227, term163227.getClass(), "firstRomVersion", "jmaWVrOPqd");
        setField(term163227, term163227.getClass(), "firstDataVersion", "ELKzlCkmvl");
        setField(term163227, term163227.getClass(), "firstPlayDate", "eauSDrBART");
        setField(term163227, term163227.getClass(), "lastGameId", "wQkVWnwEaO");
        setField(term163227, term163227.getClass(), "lastRomVersion", "LKHBXQFtrr");
        setField(term163227, term163227.getClass(), "lastDataVersion", "CjcpiNwKbz");
        setField(term163227, term163227.getClass(), "compatibleCmVersion", "nvWozUjsOS");
        setField(term163227, term163227.getClass(), "lastPlayDate", "vauQxLhXGi");
        setIntField(term163227, term163227.getClass(), "lastPlaceId", 1546061631);
        setField(term163227, term163227.getClass(), "lastPlaceName", "GGajMblmCM");
        setIntField(term163227, term163227.getClass(), "lastRegionId", -1211628823);
        setField(term163227, term163227.getClass(), "lastRegionName", "upFSnPbYis");
        setIntField(term163227, term163227.getClass(), "lastAllNetId", -1281293973);
        setField(term163227, term163227.getClass(), "lastClientId", "lFtqkraCAA");
        setIntField(term163227, term163227.getClass(), "lastUsedDeckId", -542138921);
        setIntField(term163227, term163227.getClass(), "lastPlayMusicLevel", 1572030763);
        setIntField(term163227, term163227.getClass(), "lastEmoneyBrand", -1020308117);
        setField(term163225, term163225.getClass(), "user", term163227);
        setIntField(term163225, term163225.getClass(), "storyId", -1195161500);
        setIntField(term163225, term163225.getClass(), "lastChapterId", -824702620);
        setIntField(term163225, term163225.getClass(), "jewelCount", -1695248876);
        setIntField(term163225, term163225.getClass(), "lastPlayMusicId", 1112501548);
        setIntField(term163225, term163225.getClass(), "lastPlayMusicCategory", -519151155);
        setIntField(term163225, term163225.getClass(), "lastPlayMusicLevel", -403167960);
        term163496 = new Integer(2052324257);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserStory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term163496;
        callMethod(klass, "setLastChapterId", argTypes, term163225, args);
    }

};


