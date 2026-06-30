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

public class UserData_getEventWatchedDate_95993681142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39684;

    public UserData_getEventWatchedDate_95993681142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term39688 = new Long(5836128569274066678L);
        term39684 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term39686 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term39702 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term39703 = newInstance(Class.forName("java.time.LocalDate"));
        Object term39707 = newInstance(Class.forName("java.time.LocalTime"));
        Object term39712 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term39713 = newInstance(Class.forName("java.time.LocalDate"));
        Object term39717 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term39684, term39684.getClass(), "id", 475216242691154379L);
        setLongField(term39686, term39686.getClass(), "id", 7397884986768994824L);
        setField(term39686, term39686.getClass(), "extId", term39688);
        setField(term39686, term39686.getClass(), "luid", "mhRVADhaKm");
        setIntField(term39703, term39703.getClass(), "year", 2022);
        setShortField(term39703, term39703.getClass(), "month", (short) 5);
        setShortField(term39703, term39703.getClass(), "day", (short) 29);
        setField(term39702, term39702.getClass(), "date", term39703);
        setByteField(term39707, term39707.getClass(), "hour", (byte) 11);
        setByteField(term39707, term39707.getClass(), "minute", (byte) 41);
        setByteField(term39707, term39707.getClass(), "second", (byte) 43);
        setIntField(term39707, term39707.getClass(), "nano", 984890757);
        setField(term39702, term39702.getClass(), "time", term39707);
        setField(term39686, term39686.getClass(), "registerTime", term39702);
        setIntField(term39713, term39713.getClass(), "year", 2029);
        setShortField(term39713, term39713.getClass(), "month", (short) 4);
        setShortField(term39713, term39713.getClass(), "day", (short) 27);
        setField(term39712, term39712.getClass(), "date", term39713);
        setByteField(term39717, term39717.getClass(), "hour", (byte) 16);
        setByteField(term39717, term39717.getClass(), "minute", (byte) 25);
        setByteField(term39717, term39717.getClass(), "second", (byte) 10);
        setIntField(term39717, term39717.getClass(), "nano", 699018782);
        setField(term39712, term39712.getClass(), "time", term39717);
        setField(term39686, term39686.getClass(), "accessTime", term39712);
        setField(term39684, term39684.getClass(), "card", term39686);
        setField(term39684, term39684.getClass(), "userName", "rLldJrTAay");
        setIntField(term39684, term39684.getClass(), "level", -1605518502);
        setIntField(term39684, term39684.getClass(), "reincarnationNum", -499081946);
        setLongField(term39684, term39684.getClass(), "exp", -4644072102027655025L);
        setLongField(term39684, term39684.getClass(), "point", 2739809214146796829L);
        setLongField(term39684, term39684.getClass(), "totalPoint", -7518786238963096989L);
        setIntField(term39684, term39684.getClass(), "playCount", 1834067063);
        setIntField(term39684, term39684.getClass(), "jewelCount", -1578513908);
        setIntField(term39684, term39684.getClass(), "totalJewelCount", 312330930);
        setIntField(term39684, term39684.getClass(), "medalCount", 1635910980);
        setIntField(term39684, term39684.getClass(), "playerRating", 1560346640);
        setIntField(term39684, term39684.getClass(), "highestRating", 100626332);
        setIntField(term39684, term39684.getClass(), "battlePoint", 763794722);
        setIntField(term39684, term39684.getClass(), "bestBattlePoint", -696403395);
        setIntField(term39684, term39684.getClass(), "overDamageBattlePoint", 227321148);
        setBooleanField(term39684, term39684.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term39684, term39684.getClass(), "nameplateId", -266870537);
        setIntField(term39684, term39684.getClass(), "trophyId", -453010858);
        setIntField(term39684, term39684.getClass(), "cardId", -1855427206);
        setIntField(term39684, term39684.getClass(), "characterId", -647618746);
        setIntField(term39684, term39684.getClass(), "characterVoiceNo", -91129577);
        setIntField(term39684, term39684.getClass(), "tabSetting", 1629059877);
        setIntField(term39684, term39684.getClass(), "tabSortSetting", -649940550);
        setIntField(term39684, term39684.getClass(), "cardCategorySetting", 36785954);
        setIntField(term39684, term39684.getClass(), "cardSortSetting", -907057089);
        setIntField(term39684, term39684.getClass(), "rivalScoreCategorySetting", -1740998635);
        setIntField(term39684, term39684.getClass(), "playedTutorialBit", 183857482);
        setIntField(term39684, term39684.getClass(), "firstTutorialCancelNum", -1845135476);
        setLongField(term39684, term39684.getClass(), "sumTechHighScore", 4080207137910567677L);
        setLongField(term39684, term39684.getClass(), "sumTechBasicHighScore", -4510075168255947133L);
        setLongField(term39684, term39684.getClass(), "sumTechAdvancedHighScore", -8013089718329780345L);
        setLongField(term39684, term39684.getClass(), "sumTechExpertHighScore", -3786581600529665600L);
        setLongField(term39684, term39684.getClass(), "sumTechMasterHighScore", -8600923187723020360L);
        setLongField(term39684, term39684.getClass(), "sumTechLunaticHighScore", 5010786103545221543L);
        setLongField(term39684, term39684.getClass(), "sumBattleHighScore", 7842681756773659507L);
        setLongField(term39684, term39684.getClass(), "sumBattleBasicHighScore", 4491201672462106083L);
        setLongField(term39684, term39684.getClass(), "sumBattleAdvancedHighScore", 9035414347228692356L);
        setLongField(term39684, term39684.getClass(), "sumBattleExpertHighScore", -6860884095299687457L);
        setLongField(term39684, term39684.getClass(), "sumBattleMasterHighScore", 7536418221491626978L);
        setLongField(term39684, term39684.getClass(), "sumBattleLunaticHighScore", 8852560867977898159L);
        setField(term39684, term39684.getClass(), "eventWatchedDate", "HvSKssbEES");
        setField(term39684, term39684.getClass(), "cmEventWatchedDate", "UjIAQAHhul");
        setField(term39684, term39684.getClass(), "firstGameId", "oWBXOvjPUT");
        setField(term39684, term39684.getClass(), "firstRomVersion", "DcKqrrTdId");
        setField(term39684, term39684.getClass(), "firstDataVersion", "fwtOJhjXbW");
        setField(term39684, term39684.getClass(), "firstPlayDate", "ltWBKZaXwJ");
        setField(term39684, term39684.getClass(), "lastGameId", "FSQpgxQnsH");
        setField(term39684, term39684.getClass(), "lastRomVersion", "LBPwnVMEpP");
        setField(term39684, term39684.getClass(), "lastDataVersion", "cwALzyQVjH");
        setField(term39684, term39684.getClass(), "compatibleCmVersion", "jlYNjpdkoz");
        setField(term39684, term39684.getClass(), "lastPlayDate", "DZAGnhJkeU");
        setIntField(term39684, term39684.getClass(), "lastPlaceId", -811321521);
        setField(term39684, term39684.getClass(), "lastPlaceName", "xQuVexkiVz");
        setIntField(term39684, term39684.getClass(), "lastRegionId", 449172516);
        setField(term39684, term39684.getClass(), "lastRegionName", "LqNgPziYtv");
        setIntField(term39684, term39684.getClass(), "lastAllNetId", -1224535182);
        setField(term39684, term39684.getClass(), "lastClientId", "wiDfuaXnrP");
        setIntField(term39684, term39684.getClass(), "lastUsedDeckId", 1181771633);
        setIntField(term39684, term39684.getClass(), "lastPlayMusicLevel", -21975974);
        setIntField(term39684, term39684.getClass(), "lastEmoneyBrand", -862969915);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEventWatchedDate", argTypes, term39684, args);
    }

};


