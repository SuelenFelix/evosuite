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

public class UserMissionPoint_hashCode_178701239911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11592;

    public UserMissionPoint_hashCode_178701239911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11598 = new Long(-4502405999831680926L);
        term11592 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMissionPoint"));
        Object term11594 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term11596 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term11612 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11613 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11617 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11622 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11623 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11627 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term11592, term11592.getClass(), "id", 2018084438165711668L);
        setLongField(term11594, term11594.getClass(), "id", -8705953038984862378L);
        setLongField(term11596, term11596.getClass(), "id", -7589547201844161961L);
        setField(term11596, term11596.getClass(), "extId", term11598);
        setField(term11596, term11596.getClass(), "luid", "KtuuNAqGCQ");
        setIntField(term11613, term11613.getClass(), "year", 2025);
        setShortField(term11613, term11613.getClass(), "month", (short) 9);
        setShortField(term11613, term11613.getClass(), "day", (short) 25);
        setField(term11612, term11612.getClass(), "date", term11613);
        setByteField(term11617, term11617.getClass(), "hour", (byte) 20);
        setByteField(term11617, term11617.getClass(), "minute", (byte) 0);
        setByteField(term11617, term11617.getClass(), "second", (byte) 25);
        setIntField(term11617, term11617.getClass(), "nano", 65871584);
        setField(term11612, term11612.getClass(), "time", term11617);
        setField(term11596, term11596.getClass(), "registerTime", term11612);
        setIntField(term11623, term11623.getClass(), "year", 2011);
        setShortField(term11623, term11623.getClass(), "month", (short) 9);
        setShortField(term11623, term11623.getClass(), "day", (short) 25);
        setField(term11622, term11622.getClass(), "date", term11623);
        setByteField(term11627, term11627.getClass(), "hour", (byte) 16);
        setByteField(term11627, term11627.getClass(), "minute", (byte) 45);
        setByteField(term11627, term11627.getClass(), "second", (byte) 19);
        setIntField(term11627, term11627.getClass(), "nano", 962864785);
        setField(term11622, term11622.getClass(), "time", term11627);
        setField(term11596, term11596.getClass(), "accessTime", term11622);
        setField(term11594, term11594.getClass(), "card", term11596);
        setField(term11594, term11594.getClass(), "userName", "OGQsfjmReM");
        setIntField(term11594, term11594.getClass(), "level", 1632177303);
        setIntField(term11594, term11594.getClass(), "reincarnationNum", -802592348);
        setLongField(term11594, term11594.getClass(), "exp", 8847748922379375307L);
        setLongField(term11594, term11594.getClass(), "point", 1350676497718116574L);
        setLongField(term11594, term11594.getClass(), "totalPoint", -4477377284889705897L);
        setIntField(term11594, term11594.getClass(), "playCount", -1576584269);
        setIntField(term11594, term11594.getClass(), "jewelCount", 1474899591);
        setIntField(term11594, term11594.getClass(), "totalJewelCount", 297582552);
        setIntField(term11594, term11594.getClass(), "medalCount", -1485916498);
        setIntField(term11594, term11594.getClass(), "playerRating", 722787672);
        setIntField(term11594, term11594.getClass(), "highestRating", 2077491675);
        setIntField(term11594, term11594.getClass(), "battlePoint", -1728316609);
        setIntField(term11594, term11594.getClass(), "bestBattlePoint", 47118909);
        setIntField(term11594, term11594.getClass(), "overDamageBattlePoint", -2093707412);
        setBooleanField(term11594, term11594.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term11594, term11594.getClass(), "nameplateId", -680627153);
        setIntField(term11594, term11594.getClass(), "trophyId", 722519669);
        setIntField(term11594, term11594.getClass(), "cardId", -40335961);
        setIntField(term11594, term11594.getClass(), "characterId", 175343605);
        setIntField(term11594, term11594.getClass(), "characterVoiceNo", 1050853183);
        setIntField(term11594, term11594.getClass(), "tabSetting", 848428785);
        setIntField(term11594, term11594.getClass(), "tabSortSetting", -1984436481);
        setIntField(term11594, term11594.getClass(), "cardCategorySetting", -407582855);
        setIntField(term11594, term11594.getClass(), "cardSortSetting", 1190753616);
        setIntField(term11594, term11594.getClass(), "rivalScoreCategorySetting", -752378450);
        setIntField(term11594, term11594.getClass(), "playedTutorialBit", 848907965);
        setIntField(term11594, term11594.getClass(), "firstTutorialCancelNum", 1865070548);
        setLongField(term11594, term11594.getClass(), "sumTechHighScore", 6323132402520425961L);
        setLongField(term11594, term11594.getClass(), "sumTechBasicHighScore", -354905832180781372L);
        setLongField(term11594, term11594.getClass(), "sumTechAdvancedHighScore", -5967061076297699457L);
        setLongField(term11594, term11594.getClass(), "sumTechExpertHighScore", 1550364590565203407L);
        setLongField(term11594, term11594.getClass(), "sumTechMasterHighScore", 4530705892517898929L);
        setLongField(term11594, term11594.getClass(), "sumTechLunaticHighScore", 7450734758126089960L);
        setLongField(term11594, term11594.getClass(), "sumBattleHighScore", 1377567570761089535L);
        setLongField(term11594, term11594.getClass(), "sumBattleBasicHighScore", -8531377551015443915L);
        setLongField(term11594, term11594.getClass(), "sumBattleAdvancedHighScore", -3048863932438585863L);
        setLongField(term11594, term11594.getClass(), "sumBattleExpertHighScore", -7155106718297861156L);
        setLongField(term11594, term11594.getClass(), "sumBattleMasterHighScore", -4191270658895729623L);
        setLongField(term11594, term11594.getClass(), "sumBattleLunaticHighScore", 349726685019432833L);
        setField(term11594, term11594.getClass(), "eventWatchedDate", "YsUtbngnRO");
        setField(term11594, term11594.getClass(), "cmEventWatchedDate", "JisaWUxcNb");
        setField(term11594, term11594.getClass(), "firstGameId", "NxgmYPzWCI");
        setField(term11594, term11594.getClass(), "firstRomVersion", "SqjyKmayBx");
        setField(term11594, term11594.getClass(), "firstDataVersion", "XjDhvToxJy");
        setField(term11594, term11594.getClass(), "firstPlayDate", "nxSTJflLQy");
        setField(term11594, term11594.getClass(), "lastGameId", "FlHzxEfFzI");
        setField(term11594, term11594.getClass(), "lastRomVersion", "aSATgQUpoe");
        setField(term11594, term11594.getClass(), "lastDataVersion", "VkPSXewZfB");
        setField(term11594, term11594.getClass(), "compatibleCmVersion", "ubodzJoMGW");
        setField(term11594, term11594.getClass(), "lastPlayDate", "weddIktxOA");
        setIntField(term11594, term11594.getClass(), "lastPlaceId", 1904515443);
        setField(term11594, term11594.getClass(), "lastPlaceName", "uSlMeISsDD");
        setIntField(term11594, term11594.getClass(), "lastRegionId", 1361126430);
        setField(term11594, term11594.getClass(), "lastRegionName", "WdCiTDUKqn");
        setIntField(term11594, term11594.getClass(), "lastAllNetId", 1728588701);
        setField(term11594, term11594.getClass(), "lastClientId", "PSizQDoxxe");
        setIntField(term11594, term11594.getClass(), "lastUsedDeckId", -355769268);
        setIntField(term11594, term11594.getClass(), "lastPlayMusicLevel", -114460662);
        setIntField(term11594, term11594.getClass(), "lastEmoneyBrand", -355376034);
        setField(term11592, term11592.getClass(), "user", term11594);
        setIntField(term11592, term11592.getClass(), "eventId", 588390599);
        setLongField(term11592, term11592.getClass(), "point", 5047215164896153648L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMissionPoint");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term11592, args);
    }

};


