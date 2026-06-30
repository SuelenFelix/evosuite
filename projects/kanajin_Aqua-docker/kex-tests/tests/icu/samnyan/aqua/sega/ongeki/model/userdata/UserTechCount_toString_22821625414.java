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

public class UserTechCount_toString_22821625414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term368110;

    public UserTechCount_toString_22821625414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term368116 = new Long(-4726601557653351735L);
        term368110 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechCount"));
        Object term368112 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term368114 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term368130 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term368131 = newInstance(Class.forName("java.time.LocalDate"));
        Object term368135 = newInstance(Class.forName("java.time.LocalTime"));
        Object term368140 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term368141 = newInstance(Class.forName("java.time.LocalDate"));
        Object term368145 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term368110, term368110.getClass(), "id", -6023248985793013791L);
        setLongField(term368112, term368112.getClass(), "id", -7835606949304734321L);
        setLongField(term368114, term368114.getClass(), "id", -7604273117807837917L);
        setField(term368114, term368114.getClass(), "extId", term368116);
        setField(term368114, term368114.getClass(), "luid", "YduVFSJBxN");
        setIntField(term368131, term368131.getClass(), "year", 2024);
        setShortField(term368131, term368131.getClass(), "month", (short) 9);
        setShortField(term368131, term368131.getClass(), "day", (short) 16);
        setField(term368130, term368130.getClass(), "date", term368131);
        setByteField(term368135, term368135.getClass(), "hour", (byte) 14);
        setByteField(term368135, term368135.getClass(), "minute", (byte) 51);
        setByteField(term368135, term368135.getClass(), "second", (byte) 42);
        setIntField(term368135, term368135.getClass(), "nano", 31111921);
        setField(term368130, term368130.getClass(), "time", term368135);
        setField(term368114, term368114.getClass(), "registerTime", term368130);
        setIntField(term368141, term368141.getClass(), "year", 2019);
        setShortField(term368141, term368141.getClass(), "month", (short) 2);
        setShortField(term368141, term368141.getClass(), "day", (short) 18);
        setField(term368140, term368140.getClass(), "date", term368141);
        setByteField(term368145, term368145.getClass(), "hour", (byte) 13);
        setByteField(term368145, term368145.getClass(), "minute", (byte) 19);
        setByteField(term368145, term368145.getClass(), "second", (byte) 17);
        setIntField(term368145, term368145.getClass(), "nano", 484820456);
        setField(term368140, term368140.getClass(), "time", term368145);
        setField(term368114, term368114.getClass(), "accessTime", term368140);
        setField(term368112, term368112.getClass(), "card", term368114);
        setField(term368112, term368112.getClass(), "userName", "IJoWrLUoeM");
        setIntField(term368112, term368112.getClass(), "level", -555882723);
        setIntField(term368112, term368112.getClass(), "reincarnationNum", -1538377684);
        setLongField(term368112, term368112.getClass(), "exp", -411147001714293507L);
        setLongField(term368112, term368112.getClass(), "point", -9210368800316031180L);
        setLongField(term368112, term368112.getClass(), "totalPoint", 3081243583728080667L);
        setIntField(term368112, term368112.getClass(), "playCount", -505497567);
        setIntField(term368112, term368112.getClass(), "jewelCount", -900669445);
        setIntField(term368112, term368112.getClass(), "totalJewelCount", -1448786844);
        setIntField(term368112, term368112.getClass(), "medalCount", -1042574660);
        setIntField(term368112, term368112.getClass(), "playerRating", -1485475859);
        setIntField(term368112, term368112.getClass(), "highestRating", 25715146);
        setIntField(term368112, term368112.getClass(), "battlePoint", -1999398105);
        setIntField(term368112, term368112.getClass(), "bestBattlePoint", 1403516315);
        setIntField(term368112, term368112.getClass(), "overDamageBattlePoint", 317900231);
        setBooleanField(term368112, term368112.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term368112, term368112.getClass(), "nameplateId", -1677756652);
        setIntField(term368112, term368112.getClass(), "trophyId", -1307997917);
        setIntField(term368112, term368112.getClass(), "cardId", -1448704236);
        setIntField(term368112, term368112.getClass(), "characterId", -1985980717);
        setIntField(term368112, term368112.getClass(), "characterVoiceNo", -1409727134);
        setIntField(term368112, term368112.getClass(), "tabSetting", 1168599455);
        setIntField(term368112, term368112.getClass(), "tabSortSetting", 1270771810);
        setIntField(term368112, term368112.getClass(), "cardCategorySetting", -884221440);
        setIntField(term368112, term368112.getClass(), "cardSortSetting", -972846781);
        setIntField(term368112, term368112.getClass(), "rivalScoreCategorySetting", 1115036863);
        setIntField(term368112, term368112.getClass(), "playedTutorialBit", -181586826);
        setIntField(term368112, term368112.getClass(), "firstTutorialCancelNum", 1237985660);
        setLongField(term368112, term368112.getClass(), "sumTechHighScore", 2572311845498536061L);
        setLongField(term368112, term368112.getClass(), "sumTechBasicHighScore", 5980185593054633404L);
        setLongField(term368112, term368112.getClass(), "sumTechAdvancedHighScore", -8294927664305042889L);
        setLongField(term368112, term368112.getClass(), "sumTechExpertHighScore", 1284703757542383776L);
        setLongField(term368112, term368112.getClass(), "sumTechMasterHighScore", 9083081868309119280L);
        setLongField(term368112, term368112.getClass(), "sumTechLunaticHighScore", 4802144369434329557L);
        setLongField(term368112, term368112.getClass(), "sumBattleHighScore", -6042442751001058610L);
        setLongField(term368112, term368112.getClass(), "sumBattleBasicHighScore", -119415823904658343L);
        setLongField(term368112, term368112.getClass(), "sumBattleAdvancedHighScore", -3400444313743241644L);
        setLongField(term368112, term368112.getClass(), "sumBattleExpertHighScore", 6080854350979188996L);
        setLongField(term368112, term368112.getClass(), "sumBattleMasterHighScore", 68784891605556836L);
        setLongField(term368112, term368112.getClass(), "sumBattleLunaticHighScore", 3869094859097824676L);
        setField(term368112, term368112.getClass(), "eventWatchedDate", "xGCxVibNhv");
        setField(term368112, term368112.getClass(), "cmEventWatchedDate", "xNAvYNENIY");
        setField(term368112, term368112.getClass(), "firstGameId", "gmBThrkbST");
        setField(term368112, term368112.getClass(), "firstRomVersion", "nEvNkKgEaE");
        setField(term368112, term368112.getClass(), "firstDataVersion", "HFTZIfyiOH");
        setField(term368112, term368112.getClass(), "firstPlayDate", "FtUKzMSHFT");
        setField(term368112, term368112.getClass(), "lastGameId", "VZyEZzGNCU");
        setField(term368112, term368112.getClass(), "lastRomVersion", "DvjdMhkqjR");
        setField(term368112, term368112.getClass(), "lastDataVersion", "FQpFdeajFj");
        setField(term368112, term368112.getClass(), "compatibleCmVersion", "dJytwXzlEH");
        setField(term368112, term368112.getClass(), "lastPlayDate", "TtsbLLJTLL");
        setIntField(term368112, term368112.getClass(), "lastPlaceId", 1294980280);
        setField(term368112, term368112.getClass(), "lastPlaceName", "VmrszXaVVZ");
        setIntField(term368112, term368112.getClass(), "lastRegionId", -1539018726);
        setField(term368112, term368112.getClass(), "lastRegionName", "fUhMttzXBY");
        setIntField(term368112, term368112.getClass(), "lastAllNetId", -906940681);
        setField(term368112, term368112.getClass(), "lastClientId", "bCyMogVDUD");
        setIntField(term368112, term368112.getClass(), "lastUsedDeckId", 622653290);
        setIntField(term368112, term368112.getClass(), "lastPlayMusicLevel", -164114478);
        setIntField(term368112, term368112.getClass(), "lastEmoneyBrand", -1684407157);
        setField(term368110, term368110.getClass(), "user", term368112);
        setIntField(term368110, term368110.getClass(), "levelId", 414089098);
        setIntField(term368110, term368110.getClass(), "allBreakCount", 1073342930);
        setIntField(term368110, term368110.getClass(), "allBreakPlusCount", 1225940889);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechCount");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term368110, args);
    }

};


