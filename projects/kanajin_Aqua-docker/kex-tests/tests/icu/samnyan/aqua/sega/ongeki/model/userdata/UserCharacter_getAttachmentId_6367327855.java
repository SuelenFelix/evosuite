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

public class UserCharacter_getAttachmentId_6367327855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169984;

    public UserCharacter_getAttachmentId_6367327855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term169990 = new Long(-278716491237139968L);
        term169984 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter"));
        Object term169986 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term169988 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term170004 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term170005 = newInstance(Class.forName("java.time.LocalDate"));
        Object term170009 = newInstance(Class.forName("java.time.LocalTime"));
        Object term170014 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term170015 = newInstance(Class.forName("java.time.LocalDate"));
        Object term170019 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term169984, term169984.getClass(), "id", -865131657054854580L);
        setLongField(term169986, term169986.getClass(), "id", 1011331685296452545L);
        setLongField(term169988, term169988.getClass(), "id", 5146027058171164355L);
        setField(term169988, term169988.getClass(), "extId", term169990);
        setField(term169988, term169988.getClass(), "luid", "ksazOmFJDf");
        setIntField(term170005, term170005.getClass(), "year", 2021);
        setShortField(term170005, term170005.getClass(), "month", (short) 9);
        setShortField(term170005, term170005.getClass(), "day", (short) 27);
        setField(term170004, term170004.getClass(), "date", term170005);
        setByteField(term170009, term170009.getClass(), "hour", (byte) 20);
        setByteField(term170009, term170009.getClass(), "minute", (byte) 43);
        setByteField(term170009, term170009.getClass(), "second", (byte) 41);
        setIntField(term170009, term170009.getClass(), "nano", 5544728);
        setField(term170004, term170004.getClass(), "time", term170009);
        setField(term169988, term169988.getClass(), "registerTime", term170004);
        setIntField(term170015, term170015.getClass(), "year", 2028);
        setShortField(term170015, term170015.getClass(), "month", (short) 1);
        setShortField(term170015, term170015.getClass(), "day", (short) 21);
        setField(term170014, term170014.getClass(), "date", term170015);
        setByteField(term170019, term170019.getClass(), "hour", (byte) 22);
        setByteField(term170019, term170019.getClass(), "minute", (byte) 51);
        setByteField(term170019, term170019.getClass(), "second", (byte) 58);
        setIntField(term170019, term170019.getClass(), "nano", 921867240);
        setField(term170014, term170014.getClass(), "time", term170019);
        setField(term169988, term169988.getClass(), "accessTime", term170014);
        setField(term169986, term169986.getClass(), "card", term169988);
        setField(term169986, term169986.getClass(), "userName", "YTQAyFGSot");
        setIntField(term169986, term169986.getClass(), "level", -1277195157);
        setIntField(term169986, term169986.getClass(), "reincarnationNum", 1132183912);
        setLongField(term169986, term169986.getClass(), "exp", -2692218180683745222L);
        setLongField(term169986, term169986.getClass(), "point", -1619797161891252512L);
        setLongField(term169986, term169986.getClass(), "totalPoint", 6115895261247894187L);
        setIntField(term169986, term169986.getClass(), "playCount", 1444602079);
        setIntField(term169986, term169986.getClass(), "jewelCount", 1644507567);
        setIntField(term169986, term169986.getClass(), "totalJewelCount", -1406782851);
        setIntField(term169986, term169986.getClass(), "medalCount", 1353299927);
        setIntField(term169986, term169986.getClass(), "playerRating", 545259984);
        setIntField(term169986, term169986.getClass(), "highestRating", -795371078);
        setIntField(term169986, term169986.getClass(), "battlePoint", -441521491);
        setIntField(term169986, term169986.getClass(), "bestBattlePoint", 1603903916);
        setIntField(term169986, term169986.getClass(), "overDamageBattlePoint", -1285876400);
        setBooleanField(term169986, term169986.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term169986, term169986.getClass(), "nameplateId", -1903604663);
        setIntField(term169986, term169986.getClass(), "trophyId", 1210371629);
        setIntField(term169986, term169986.getClass(), "cardId", 909735321);
        setIntField(term169986, term169986.getClass(), "characterId", -151853480);
        setIntField(term169986, term169986.getClass(), "characterVoiceNo", -945363618);
        setIntField(term169986, term169986.getClass(), "tabSetting", 1670927534);
        setIntField(term169986, term169986.getClass(), "tabSortSetting", 946393999);
        setIntField(term169986, term169986.getClass(), "cardCategorySetting", 254472233);
        setIntField(term169986, term169986.getClass(), "cardSortSetting", 972028226);
        setIntField(term169986, term169986.getClass(), "rivalScoreCategorySetting", 1113134594);
        setIntField(term169986, term169986.getClass(), "playedTutorialBit", 551145368);
        setIntField(term169986, term169986.getClass(), "firstTutorialCancelNum", -589024624);
        setLongField(term169986, term169986.getClass(), "sumTechHighScore", 7095337677763783504L);
        setLongField(term169986, term169986.getClass(), "sumTechBasicHighScore", 9169174050186427729L);
        setLongField(term169986, term169986.getClass(), "sumTechAdvancedHighScore", 531403575031340860L);
        setLongField(term169986, term169986.getClass(), "sumTechExpertHighScore", -8005402419576701688L);
        setLongField(term169986, term169986.getClass(), "sumTechMasterHighScore", -2417443285364775510L);
        setLongField(term169986, term169986.getClass(), "sumTechLunaticHighScore", 949202874215055193L);
        setLongField(term169986, term169986.getClass(), "sumBattleHighScore", 1783419213507924258L);
        setLongField(term169986, term169986.getClass(), "sumBattleBasicHighScore", -5770029271908830026L);
        setLongField(term169986, term169986.getClass(), "sumBattleAdvancedHighScore", -2743414055159250540L);
        setLongField(term169986, term169986.getClass(), "sumBattleExpertHighScore", 2480072034623900419L);
        setLongField(term169986, term169986.getClass(), "sumBattleMasterHighScore", -3021838392534799239L);
        setLongField(term169986, term169986.getClass(), "sumBattleLunaticHighScore", 5341137410137975896L);
        setField(term169986, term169986.getClass(), "eventWatchedDate", "GrdIHGdREZ");
        setField(term169986, term169986.getClass(), "cmEventWatchedDate", "lWuIErfrpX");
        setField(term169986, term169986.getClass(), "firstGameId", "lNaxalwwFL");
        setField(term169986, term169986.getClass(), "firstRomVersion", "IgfnslgZTI");
        setField(term169986, term169986.getClass(), "firstDataVersion", "RMVwTznaVb");
        setField(term169986, term169986.getClass(), "firstPlayDate", "YZyWVYutLo");
        setField(term169986, term169986.getClass(), "lastGameId", "pMmBjkkFKu");
        setField(term169986, term169986.getClass(), "lastRomVersion", "QMFqneinXp");
        setField(term169986, term169986.getClass(), "lastDataVersion", "UlPbzrpQIx");
        setField(term169986, term169986.getClass(), "compatibleCmVersion", "FMZNzLOxGT");
        setField(term169986, term169986.getClass(), "lastPlayDate", "bIZUmZXLHa");
        setIntField(term169986, term169986.getClass(), "lastPlaceId", -248083088);
        setField(term169986, term169986.getClass(), "lastPlaceName", "TEwHZNjLIs");
        setIntField(term169986, term169986.getClass(), "lastRegionId", -1418231293);
        setField(term169986, term169986.getClass(), "lastRegionName", "kRMGFXXrsP");
        setIntField(term169986, term169986.getClass(), "lastAllNetId", 464721379);
        setField(term169986, term169986.getClass(), "lastClientId", "FuwXaCGDKr");
        setIntField(term169986, term169986.getClass(), "lastUsedDeckId", -1679784341);
        setIntField(term169986, term169986.getClass(), "lastPlayMusicLevel", 545828052);
        setIntField(term169986, term169986.getClass(), "lastEmoneyBrand", 1204794034);
        setField(term169984, term169984.getClass(), "user", term169986);
        setIntField(term169984, term169984.getClass(), "characterId", 908573728);
        setIntField(term169984, term169984.getClass(), "costumeId", -1645726101);
        setIntField(term169984, term169984.getClass(), "attachmentId", 1696762677);
        setIntField(term169984, term169984.getClass(), "playCount", -169034590);
        setIntField(term169984, term169984.getClass(), "intimateLevel", 615142414);
        setIntField(term169984, term169984.getClass(), "intimateCount", 162127898);
        setIntField(term169984, term169984.getClass(), "intimateCountRewarded", 396028910);
        setField(term169984, term169984.getClass(), "intimateCountDate", "nYbOYHyjHP");
        setBooleanField(term169984, term169984.getClass(), "isNew", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAttachmentId", argTypes, term169984, args);
    }

};


