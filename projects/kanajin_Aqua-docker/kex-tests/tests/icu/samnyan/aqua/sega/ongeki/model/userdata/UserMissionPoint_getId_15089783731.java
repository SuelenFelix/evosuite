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

public class UserMissionPoint_getId_15089783731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6891;

    public UserMissionPoint_getId_15089783731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6897 = new Long(-316468845751588286L);
        term6891 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMissionPoint"));
        Object term6893 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term6895 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term6911 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6912 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6916 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6921 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6922 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6926 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term6891, term6891.getClass(), "id", -1526729287349763895L);
        setLongField(term6893, term6893.getClass(), "id", 7017605765544766728L);
        setLongField(term6895, term6895.getClass(), "id", -6078481855513028760L);
        setField(term6895, term6895.getClass(), "extId", term6897);
        setField(term6895, term6895.getClass(), "luid", "lCyLIcSuom");
        setIntField(term6912, term6912.getClass(), "year", 2012);
        setShortField(term6912, term6912.getClass(), "month", (short) 3);
        setShortField(term6912, term6912.getClass(), "day", (short) 27);
        setField(term6911, term6911.getClass(), "date", term6912);
        setByteField(term6916, term6916.getClass(), "hour", (byte) 17);
        setByteField(term6916, term6916.getClass(), "minute", (byte) 49);
        setByteField(term6916, term6916.getClass(), "second", (byte) 24);
        setIntField(term6916, term6916.getClass(), "nano", 530647398);
        setField(term6911, term6911.getClass(), "time", term6916);
        setField(term6895, term6895.getClass(), "registerTime", term6911);
        setIntField(term6922, term6922.getClass(), "year", 2010);
        setShortField(term6922, term6922.getClass(), "month", (short) 6);
        setShortField(term6922, term6922.getClass(), "day", (short) 14);
        setField(term6921, term6921.getClass(), "date", term6922);
        setByteField(term6926, term6926.getClass(), "hour", (byte) 6);
        setByteField(term6926, term6926.getClass(), "minute", (byte) 22);
        setByteField(term6926, term6926.getClass(), "second", (byte) 20);
        setIntField(term6926, term6926.getClass(), "nano", 25133051);
        setField(term6921, term6921.getClass(), "time", term6926);
        setField(term6895, term6895.getClass(), "accessTime", term6921);
        setField(term6893, term6893.getClass(), "card", term6895);
        setField(term6893, term6893.getClass(), "userName", "CGOpQSZZwI");
        setIntField(term6893, term6893.getClass(), "level", -1736183862);
        setIntField(term6893, term6893.getClass(), "reincarnationNum", 897010381);
        setLongField(term6893, term6893.getClass(), "exp", -6985556670871089725L);
        setLongField(term6893, term6893.getClass(), "point", -8469818909085103606L);
        setLongField(term6893, term6893.getClass(), "totalPoint", 11315815278355083L);
        setIntField(term6893, term6893.getClass(), "playCount", -15712667);
        setIntField(term6893, term6893.getClass(), "jewelCount", 1964967720);
        setIntField(term6893, term6893.getClass(), "totalJewelCount", 1351900243);
        setIntField(term6893, term6893.getClass(), "medalCount", -330897705);
        setIntField(term6893, term6893.getClass(), "playerRating", 1065595802);
        setIntField(term6893, term6893.getClass(), "highestRating", 21031843);
        setIntField(term6893, term6893.getClass(), "battlePoint", -380787857);
        setIntField(term6893, term6893.getClass(), "bestBattlePoint", 319853052);
        setIntField(term6893, term6893.getClass(), "overDamageBattlePoint", -1097563716);
        setBooleanField(term6893, term6893.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term6893, term6893.getClass(), "nameplateId", 1572907769);
        setIntField(term6893, term6893.getClass(), "trophyId", 1608016787);
        setIntField(term6893, term6893.getClass(), "cardId", -516303035);
        setIntField(term6893, term6893.getClass(), "characterId", -2143043890);
        setIntField(term6893, term6893.getClass(), "characterVoiceNo", -2138825831);
        setIntField(term6893, term6893.getClass(), "tabSetting", 1454781562);
        setIntField(term6893, term6893.getClass(), "tabSortSetting", -27944011);
        setIntField(term6893, term6893.getClass(), "cardCategorySetting", -20614472);
        setIntField(term6893, term6893.getClass(), "cardSortSetting", 1126618861);
        setIntField(term6893, term6893.getClass(), "rivalScoreCategorySetting", 947449400);
        setIntField(term6893, term6893.getClass(), "playedTutorialBit", -763799087);
        setIntField(term6893, term6893.getClass(), "firstTutorialCancelNum", 1207142014);
        setLongField(term6893, term6893.getClass(), "sumTechHighScore", 7735460540091431012L);
        setLongField(term6893, term6893.getClass(), "sumTechBasicHighScore", 1346299551708610248L);
        setLongField(term6893, term6893.getClass(), "sumTechAdvancedHighScore", -7191625829563442696L);
        setLongField(term6893, term6893.getClass(), "sumTechExpertHighScore", 1463379874413441830L);
        setLongField(term6893, term6893.getClass(), "sumTechMasterHighScore", 7998051124369147543L);
        setLongField(term6893, term6893.getClass(), "sumTechLunaticHighScore", -1481367303699139651L);
        setLongField(term6893, term6893.getClass(), "sumBattleHighScore", -7709317346333670618L);
        setLongField(term6893, term6893.getClass(), "sumBattleBasicHighScore", -1964501434345816975L);
        setLongField(term6893, term6893.getClass(), "sumBattleAdvancedHighScore", 4689907154423223972L);
        setLongField(term6893, term6893.getClass(), "sumBattleExpertHighScore", 8512025621149521819L);
        setLongField(term6893, term6893.getClass(), "sumBattleMasterHighScore", 2022482096970820459L);
        setLongField(term6893, term6893.getClass(), "sumBattleLunaticHighScore", 6315101499811179240L);
        setField(term6893, term6893.getClass(), "eventWatchedDate", "ypEdrstygY");
        setField(term6893, term6893.getClass(), "cmEventWatchedDate", "sNQFlATEeQ");
        setField(term6893, term6893.getClass(), "firstGameId", "ZKMLioamsY");
        setField(term6893, term6893.getClass(), "firstRomVersion", "WVbxuoDBcn");
        setField(term6893, term6893.getClass(), "firstDataVersion", "pvDEABOxLt");
        setField(term6893, term6893.getClass(), "firstPlayDate", "beAMpkroCQ");
        setField(term6893, term6893.getClass(), "lastGameId", "uSUvKAyuvd");
        setField(term6893, term6893.getClass(), "lastRomVersion", "onQLVONGuf");
        setField(term6893, term6893.getClass(), "lastDataVersion", "SOrEHbcbmn");
        setField(term6893, term6893.getClass(), "compatibleCmVersion", "bnsyeQXFdu");
        setField(term6893, term6893.getClass(), "lastPlayDate", "BwtdjiefJn");
        setIntField(term6893, term6893.getClass(), "lastPlaceId", -876426634);
        setField(term6893, term6893.getClass(), "lastPlaceName", "jDmhBrIoDa");
        setIntField(term6893, term6893.getClass(), "lastRegionId", 213831054);
        setField(term6893, term6893.getClass(), "lastRegionName", "SPtPatHeOm");
        setIntField(term6893, term6893.getClass(), "lastAllNetId", 330043745);
        setField(term6893, term6893.getClass(), "lastClientId", "ywmcuThdfL");
        setIntField(term6893, term6893.getClass(), "lastUsedDeckId", -509349195);
        setIntField(term6893, term6893.getClass(), "lastPlayMusicLevel", -1639041228);
        setIntField(term6893, term6893.getClass(), "lastEmoneyBrand", 2027686272);
        setField(term6891, term6891.getClass(), "user", term6893);
        setIntField(term6891, term6891.getClass(), "eventId", -1494356104);
        setLongField(term6891, term6891.getClass(), "point", -3033337370154155851L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMissionPoint");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term6891, args);
    }

};


