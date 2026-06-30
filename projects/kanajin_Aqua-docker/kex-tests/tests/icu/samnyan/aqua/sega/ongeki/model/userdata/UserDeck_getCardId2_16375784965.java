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

public class UserDeck_getCardId2_16375784965 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144137;

    public UserDeck_getCardId2_16375784965() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term144143 = new Long(-5344598381371854750L);
        term144137 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserDeck"));
        Object term144139 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term144141 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term144157 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term144158 = newInstance(Class.forName("java.time.LocalDate"));
        Object term144162 = newInstance(Class.forName("java.time.LocalTime"));
        Object term144167 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term144168 = newInstance(Class.forName("java.time.LocalDate"));
        Object term144172 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term144137, term144137.getClass(), "id", -3313382521567902730L);
        setLongField(term144139, term144139.getClass(), "id", 8230876269805518284L);
        setLongField(term144141, term144141.getClass(), "id", 2054507156946896983L);
        setField(term144141, term144141.getClass(), "extId", term144143);
        setField(term144141, term144141.getClass(), "luid", "YpqweHjjwu");
        setIntField(term144158, term144158.getClass(), "year", 2014);
        setShortField(term144158, term144158.getClass(), "month", (short) 3);
        setShortField(term144158, term144158.getClass(), "day", (short) 18);
        setField(term144157, term144157.getClass(), "date", term144158);
        setByteField(term144162, term144162.getClass(), "hour", (byte) 9);
        setByteField(term144162, term144162.getClass(), "minute", (byte) 35);
        setByteField(term144162, term144162.getClass(), "second", (byte) 23);
        setIntField(term144162, term144162.getClass(), "nano", 260496752);
        setField(term144157, term144157.getClass(), "time", term144162);
        setField(term144141, term144141.getClass(), "registerTime", term144157);
        setIntField(term144168, term144168.getClass(), "year", 2021);
        setShortField(term144168, term144168.getClass(), "month", (short) 7);
        setShortField(term144168, term144168.getClass(), "day", (short) 28);
        setField(term144167, term144167.getClass(), "date", term144168);
        setByteField(term144172, term144172.getClass(), "hour", (byte) 23);
        setByteField(term144172, term144172.getClass(), "minute", (byte) 12);
        setByteField(term144172, term144172.getClass(), "second", (byte) 32);
        setIntField(term144172, term144172.getClass(), "nano", 773887991);
        setField(term144167, term144167.getClass(), "time", term144172);
        setField(term144141, term144141.getClass(), "accessTime", term144167);
        setField(term144139, term144139.getClass(), "card", term144141);
        setField(term144139, term144139.getClass(), "userName", "RMDWjokXpG");
        setIntField(term144139, term144139.getClass(), "level", 1364855812);
        setIntField(term144139, term144139.getClass(), "reincarnationNum", -1011747145);
        setLongField(term144139, term144139.getClass(), "exp", -6651844343111330638L);
        setLongField(term144139, term144139.getClass(), "point", -5817879048746989326L);
        setLongField(term144139, term144139.getClass(), "totalPoint", 2228896102662979446L);
        setIntField(term144139, term144139.getClass(), "playCount", 1581553091);
        setIntField(term144139, term144139.getClass(), "jewelCount", 1367678685);
        setIntField(term144139, term144139.getClass(), "totalJewelCount", -317170853);
        setIntField(term144139, term144139.getClass(), "medalCount", -1016433388);
        setIntField(term144139, term144139.getClass(), "playerRating", -385847082);
        setIntField(term144139, term144139.getClass(), "highestRating", 222989848);
        setIntField(term144139, term144139.getClass(), "battlePoint", -927191833);
        setIntField(term144139, term144139.getClass(), "bestBattlePoint", 112439844);
        setIntField(term144139, term144139.getClass(), "overDamageBattlePoint", -652984076);
        setBooleanField(term144139, term144139.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term144139, term144139.getClass(), "nameplateId", 1595362234);
        setIntField(term144139, term144139.getClass(), "trophyId", 1302209572);
        setIntField(term144139, term144139.getClass(), "cardId", 1194064409);
        setIntField(term144139, term144139.getClass(), "characterId", -1178768850);
        setIntField(term144139, term144139.getClass(), "characterVoiceNo", 1310459040);
        setIntField(term144139, term144139.getClass(), "tabSetting", -1541373961);
        setIntField(term144139, term144139.getClass(), "tabSortSetting", 28333171);
        setIntField(term144139, term144139.getClass(), "cardCategorySetting", 431237954);
        setIntField(term144139, term144139.getClass(), "cardSortSetting", 346905618);
        setIntField(term144139, term144139.getClass(), "rivalScoreCategorySetting", -1748246525);
        setIntField(term144139, term144139.getClass(), "playedTutorialBit", 827719881);
        setIntField(term144139, term144139.getClass(), "firstTutorialCancelNum", 1244517645);
        setLongField(term144139, term144139.getClass(), "sumTechHighScore", -5214714474055061598L);
        setLongField(term144139, term144139.getClass(), "sumTechBasicHighScore", -7017519796291507029L);
        setLongField(term144139, term144139.getClass(), "sumTechAdvancedHighScore", 664732352318462812L);
        setLongField(term144139, term144139.getClass(), "sumTechExpertHighScore", 7557299615872134652L);
        setLongField(term144139, term144139.getClass(), "sumTechMasterHighScore", 4237129916833213880L);
        setLongField(term144139, term144139.getClass(), "sumTechLunaticHighScore", -1957706870498645173L);
        setLongField(term144139, term144139.getClass(), "sumBattleHighScore", 8428872930913184944L);
        setLongField(term144139, term144139.getClass(), "sumBattleBasicHighScore", -4723076625782479844L);
        setLongField(term144139, term144139.getClass(), "sumBattleAdvancedHighScore", 4642343821367966886L);
        setLongField(term144139, term144139.getClass(), "sumBattleExpertHighScore", -7521402482298985676L);
        setLongField(term144139, term144139.getClass(), "sumBattleMasterHighScore", 2486237442163013291L);
        setLongField(term144139, term144139.getClass(), "sumBattleLunaticHighScore", 790648851972327549L);
        setField(term144139, term144139.getClass(), "eventWatchedDate", "INiyuixgdb");
        setField(term144139, term144139.getClass(), "cmEventWatchedDate", "AbQcJaPuyu");
        setField(term144139, term144139.getClass(), "firstGameId", "SDJXoYNVym");
        setField(term144139, term144139.getClass(), "firstRomVersion", "ownnefVcXK");
        setField(term144139, term144139.getClass(), "firstDataVersion", "KAtvRoxPvL");
        setField(term144139, term144139.getClass(), "firstPlayDate", "DfiGFdKcma");
        setField(term144139, term144139.getClass(), "lastGameId", "rUpZXYuqUO");
        setField(term144139, term144139.getClass(), "lastRomVersion", "PyCZLyLBQT");
        setField(term144139, term144139.getClass(), "lastDataVersion", "IVHMBjnDQQ");
        setField(term144139, term144139.getClass(), "compatibleCmVersion", "CjQVEkBwOV");
        setField(term144139, term144139.getClass(), "lastPlayDate", "IMmDkISmvo");
        setIntField(term144139, term144139.getClass(), "lastPlaceId", 687325220);
        setField(term144139, term144139.getClass(), "lastPlaceName", "LBkNRvzfMR");
        setIntField(term144139, term144139.getClass(), "lastRegionId", 1625459515);
        setField(term144139, term144139.getClass(), "lastRegionName", "AGyEIGYbwx");
        setIntField(term144139, term144139.getClass(), "lastAllNetId", -587695160);
        setField(term144139, term144139.getClass(), "lastClientId", "nOkegthvTo");
        setIntField(term144139, term144139.getClass(), "lastUsedDeckId", 1418102078);
        setIntField(term144139, term144139.getClass(), "lastPlayMusicLevel", -1980653473);
        setIntField(term144139, term144139.getClass(), "lastEmoneyBrand", -1681323081);
        setField(term144137, term144137.getClass(), "user", term144139);
        setIntField(term144137, term144137.getClass(), "deckId", -365670276);
        setIntField(term144137, term144137.getClass(), "cardId1", 163534924);
        setIntField(term144137, term144137.getClass(), "cardId2", 1575479969);
        setIntField(term144137, term144137.getClass(), "cardId3", -583257141);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserDeck");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCardId2", argTypes, term144137, args);
    }

};


