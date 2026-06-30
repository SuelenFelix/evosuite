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

public class UserMusicItem_setStatus_16628622008 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3840;
     Object term4107;

    public UserMusicItem_setStatus_16628622008() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3846 = new Long(6967924379644551255L);
        term3840 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicItem"));
        Object term3842 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term3844 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term3860 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3861 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3865 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3870 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3871 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3875 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term3840, term3840.getClass(), "id", -2783999800714825789L);
        setLongField(term3842, term3842.getClass(), "id", 4266570509071948633L);
        setLongField(term3844, term3844.getClass(), "id", -7291742736502427077L);
        setField(term3844, term3844.getClass(), "extId", term3846);
        setField(term3844, term3844.getClass(), "luid", "GgZWSjxjyE");
        setIntField(term3861, term3861.getClass(), "year", 2017);
        setShortField(term3861, term3861.getClass(), "month", (short) 3);
        setShortField(term3861, term3861.getClass(), "day", (short) 5);
        setField(term3860, term3860.getClass(), "date", term3861);
        setByteField(term3865, term3865.getClass(), "hour", (byte) 20);
        setByteField(term3865, term3865.getClass(), "minute", (byte) 34);
        setByteField(term3865, term3865.getClass(), "second", (byte) 55);
        setIntField(term3865, term3865.getClass(), "nano", 78024496);
        setField(term3860, term3860.getClass(), "time", term3865);
        setField(term3844, term3844.getClass(), "registerTime", term3860);
        setIntField(term3871, term3871.getClass(), "year", 2020);
        setShortField(term3871, term3871.getClass(), "month", (short) 7);
        setShortField(term3871, term3871.getClass(), "day", (short) 24);
        setField(term3870, term3870.getClass(), "date", term3871);
        setByteField(term3875, term3875.getClass(), "hour", (byte) 0);
        setByteField(term3875, term3875.getClass(), "minute", (byte) 59);
        setByteField(term3875, term3875.getClass(), "second", (byte) 56);
        setIntField(term3875, term3875.getClass(), "nano", 320219201);
        setField(term3870, term3870.getClass(), "time", term3875);
        setField(term3844, term3844.getClass(), "accessTime", term3870);
        setField(term3842, term3842.getClass(), "card", term3844);
        setField(term3842, term3842.getClass(), "userName", "EeBVbzjcCI");
        setIntField(term3842, term3842.getClass(), "level", 2049577015);
        setIntField(term3842, term3842.getClass(), "reincarnationNum", 1236004505);
        setLongField(term3842, term3842.getClass(), "exp", -8121849829073967555L);
        setLongField(term3842, term3842.getClass(), "point", 5219030281405653303L);
        setLongField(term3842, term3842.getClass(), "totalPoint", -8471550651709805183L);
        setIntField(term3842, term3842.getClass(), "playCount", 1050765721);
        setIntField(term3842, term3842.getClass(), "jewelCount", 474518942);
        setIntField(term3842, term3842.getClass(), "totalJewelCount", -1656687479);
        setIntField(term3842, term3842.getClass(), "medalCount", -249614216);
        setIntField(term3842, term3842.getClass(), "playerRating", 1870727665);
        setIntField(term3842, term3842.getClass(), "highestRating", -519881101);
        setIntField(term3842, term3842.getClass(), "battlePoint", -680920524);
        setIntField(term3842, term3842.getClass(), "bestBattlePoint", -916335264);
        setIntField(term3842, term3842.getClass(), "overDamageBattlePoint", -919416536);
        setBooleanField(term3842, term3842.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term3842, term3842.getClass(), "nameplateId", -43417861);
        setIntField(term3842, term3842.getClass(), "trophyId", -1533843432);
        setIntField(term3842, term3842.getClass(), "cardId", -123338791);
        setIntField(term3842, term3842.getClass(), "characterId", -1467089634);
        setIntField(term3842, term3842.getClass(), "characterVoiceNo", 413548937);
        setIntField(term3842, term3842.getClass(), "tabSetting", 1901317214);
        setIntField(term3842, term3842.getClass(), "tabSortSetting", 1166710220);
        setIntField(term3842, term3842.getClass(), "cardCategorySetting", -1070592289);
        setIntField(term3842, term3842.getClass(), "cardSortSetting", -1464172784);
        setIntField(term3842, term3842.getClass(), "rivalScoreCategorySetting", 32185364);
        setIntField(term3842, term3842.getClass(), "playedTutorialBit", 1768204942);
        setIntField(term3842, term3842.getClass(), "firstTutorialCancelNum", 1252951645);
        setLongField(term3842, term3842.getClass(), "sumTechHighScore", -948292411727204525L);
        setLongField(term3842, term3842.getClass(), "sumTechBasicHighScore", -8892586408602479513L);
        setLongField(term3842, term3842.getClass(), "sumTechAdvancedHighScore", 4616440478358528406L);
        setLongField(term3842, term3842.getClass(), "sumTechExpertHighScore", 3427570961451840069L);
        setLongField(term3842, term3842.getClass(), "sumTechMasterHighScore", 4502292577098212311L);
        setLongField(term3842, term3842.getClass(), "sumTechLunaticHighScore", -3730936709704460408L);
        setLongField(term3842, term3842.getClass(), "sumBattleHighScore", -8614778293741404325L);
        setLongField(term3842, term3842.getClass(), "sumBattleBasicHighScore", -5447369594017685765L);
        setLongField(term3842, term3842.getClass(), "sumBattleAdvancedHighScore", -5724112525188606013L);
        setLongField(term3842, term3842.getClass(), "sumBattleExpertHighScore", -6100012593724108983L);
        setLongField(term3842, term3842.getClass(), "sumBattleMasterHighScore", 5465527210299101732L);
        setLongField(term3842, term3842.getClass(), "sumBattleLunaticHighScore", 4699157009689333952L);
        setField(term3842, term3842.getClass(), "eventWatchedDate", "UfQtPRyWRC");
        setField(term3842, term3842.getClass(), "cmEventWatchedDate", "FPvxVzzSvD");
        setField(term3842, term3842.getClass(), "firstGameId", "WHcwFgsGFC");
        setField(term3842, term3842.getClass(), "firstRomVersion", "HzqpegHiRq");
        setField(term3842, term3842.getClass(), "firstDataVersion", "jwsfVjMoJT");
        setField(term3842, term3842.getClass(), "firstPlayDate", "ZfdXfCCFDf");
        setField(term3842, term3842.getClass(), "lastGameId", "MwwjNtdOFT");
        setField(term3842, term3842.getClass(), "lastRomVersion", "VYkqXKVlAJ");
        setField(term3842, term3842.getClass(), "lastDataVersion", "XkIoWJRNwN");
        setField(term3842, term3842.getClass(), "compatibleCmVersion", "aNWLJdrZMq");
        setField(term3842, term3842.getClass(), "lastPlayDate", "HHmNoYxIGj");
        setIntField(term3842, term3842.getClass(), "lastPlaceId", 574481092);
        setField(term3842, term3842.getClass(), "lastPlaceName", "PtirvZmsGt");
        setIntField(term3842, term3842.getClass(), "lastRegionId", -310528004);
        setField(term3842, term3842.getClass(), "lastRegionName", "HWkpTmtlrc");
        setIntField(term3842, term3842.getClass(), "lastAllNetId", -634976996);
        setField(term3842, term3842.getClass(), "lastClientId", "hMmaoREuCK");
        setIntField(term3842, term3842.getClass(), "lastUsedDeckId", -1015274146);
        setIntField(term3842, term3842.getClass(), "lastPlayMusicLevel", -49052672);
        setIntField(term3842, term3842.getClass(), "lastEmoneyBrand", 339372704);
        setField(term3840, term3840.getClass(), "user", term3842);
        setIntField(term3840, term3840.getClass(), "musicId", -851097944);
        setIntField(term3840, term3840.getClass(), "status", 803925431);
        term4107 = new Integer(76929641);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4107;
        callMethod(klass, "setStatus", argTypes, term3840, args);
    }

};


