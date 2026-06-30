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

public class UserData_getReincarnationNum_17664037194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23610;

    public UserData_getReincarnationNum_17664037194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term23614 = new Long(-2850532706972744550L);
        term23610 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term23612 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term23628 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23629 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23633 = newInstance(Class.forName("java.time.LocalTime"));
        Object term23638 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23639 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23643 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term23610, term23610.getClass(), "id", -2213998544405629464L);
        setLongField(term23612, term23612.getClass(), "id", 226516165063797489L);
        setField(term23612, term23612.getClass(), "extId", term23614);
        setField(term23612, term23612.getClass(), "luid", "kTbFMpVWqx");
        setIntField(term23629, term23629.getClass(), "year", 2021);
        setShortField(term23629, term23629.getClass(), "month", (short) 8);
        setShortField(term23629, term23629.getClass(), "day", (short) 27);
        setField(term23628, term23628.getClass(), "date", term23629);
        setByteField(term23633, term23633.getClass(), "hour", (byte) 20);
        setByteField(term23633, term23633.getClass(), "minute", (byte) 11);
        setByteField(term23633, term23633.getClass(), "second", (byte) 47);
        setIntField(term23633, term23633.getClass(), "nano", 116303493);
        setField(term23628, term23628.getClass(), "time", term23633);
        setField(term23612, term23612.getClass(), "registerTime", term23628);
        setIntField(term23639, term23639.getClass(), "year", 2012);
        setShortField(term23639, term23639.getClass(), "month", (short) 5);
        setShortField(term23639, term23639.getClass(), "day", (short) 17);
        setField(term23638, term23638.getClass(), "date", term23639);
        setByteField(term23643, term23643.getClass(), "hour", (byte) 19);
        setByteField(term23643, term23643.getClass(), "minute", (byte) 36);
        setByteField(term23643, term23643.getClass(), "second", (byte) 33);
        setIntField(term23643, term23643.getClass(), "nano", 46625011);
        setField(term23638, term23638.getClass(), "time", term23643);
        setField(term23612, term23612.getClass(), "accessTime", term23638);
        setField(term23610, term23610.getClass(), "card", term23612);
        setField(term23610, term23610.getClass(), "userName", "HegRNsidFg");
        setIntField(term23610, term23610.getClass(), "level", 338342107);
        setIntField(term23610, term23610.getClass(), "reincarnationNum", -650288950);
        setLongField(term23610, term23610.getClass(), "exp", -5055043026089632641L);
        setLongField(term23610, term23610.getClass(), "point", -3602145915631274444L);
        setLongField(term23610, term23610.getClass(), "totalPoint", 1978286377020745883L);
        setIntField(term23610, term23610.getClass(), "playCount", 433039357);
        setIntField(term23610, term23610.getClass(), "jewelCount", 1469939797);
        setIntField(term23610, term23610.getClass(), "totalJewelCount", 252799294);
        setIntField(term23610, term23610.getClass(), "medalCount", -2072618022);
        setIntField(term23610, term23610.getClass(), "playerRating", -269909549);
        setIntField(term23610, term23610.getClass(), "highestRating", 686286032);
        setIntField(term23610, term23610.getClass(), "battlePoint", -1277201854);
        setIntField(term23610, term23610.getClass(), "bestBattlePoint", 1691516034);
        setIntField(term23610, term23610.getClass(), "overDamageBattlePoint", 335681723);
        setBooleanField(term23610, term23610.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term23610, term23610.getClass(), "nameplateId", -773707674);
        setIntField(term23610, term23610.getClass(), "trophyId", 383244929);
        setIntField(term23610, term23610.getClass(), "cardId", -2114034003);
        setIntField(term23610, term23610.getClass(), "characterId", 207213904);
        setIntField(term23610, term23610.getClass(), "characterVoiceNo", -484303394);
        setIntField(term23610, term23610.getClass(), "tabSetting", -31125530);
        setIntField(term23610, term23610.getClass(), "tabSortSetting", 1909773180);
        setIntField(term23610, term23610.getClass(), "cardCategorySetting", -970417907);
        setIntField(term23610, term23610.getClass(), "cardSortSetting", 1097894139);
        setIntField(term23610, term23610.getClass(), "rivalScoreCategorySetting", 390256347);
        setIntField(term23610, term23610.getClass(), "playedTutorialBit", 1471619998);
        setIntField(term23610, term23610.getClass(), "firstTutorialCancelNum", -1623489521);
        setLongField(term23610, term23610.getClass(), "sumTechHighScore", 2957284484642534979L);
        setLongField(term23610, term23610.getClass(), "sumTechBasicHighScore", -4645802432501468482L);
        setLongField(term23610, term23610.getClass(), "sumTechAdvancedHighScore", 797348855178248421L);
        setLongField(term23610, term23610.getClass(), "sumTechExpertHighScore", 4140938707845767186L);
        setLongField(term23610, term23610.getClass(), "sumTechMasterHighScore", -6049958218605558734L);
        setLongField(term23610, term23610.getClass(), "sumTechLunaticHighScore", -2217438327452869934L);
        setLongField(term23610, term23610.getClass(), "sumBattleHighScore", 6427987239762071453L);
        setLongField(term23610, term23610.getClass(), "sumBattleBasicHighScore", 9216691136820489449L);
        setLongField(term23610, term23610.getClass(), "sumBattleAdvancedHighScore", 6460434640369527093L);
        setLongField(term23610, term23610.getClass(), "sumBattleExpertHighScore", -5745335841303453480L);
        setLongField(term23610, term23610.getClass(), "sumBattleMasterHighScore", 7068447368781427495L);
        setLongField(term23610, term23610.getClass(), "sumBattleLunaticHighScore", 7899092949241236700L);
        setField(term23610, term23610.getClass(), "eventWatchedDate", "udRdJkgXmH");
        setField(term23610, term23610.getClass(), "cmEventWatchedDate", "FBCXbjHVXO");
        setField(term23610, term23610.getClass(), "firstGameId", "dIWAnvmLiC");
        setField(term23610, term23610.getClass(), "firstRomVersion", "CuWebzZQjZ");
        setField(term23610, term23610.getClass(), "firstDataVersion", "wRVaaJxKYI");
        setField(term23610, term23610.getClass(), "firstPlayDate", "yOQuJXRvOo");
        setField(term23610, term23610.getClass(), "lastGameId", "XmLHcnVsch");
        setField(term23610, term23610.getClass(), "lastRomVersion", "Yrvtdcltri");
        setField(term23610, term23610.getClass(), "lastDataVersion", "RxrsjXRVcT");
        setField(term23610, term23610.getClass(), "compatibleCmVersion", "cfRimmJxqA");
        setField(term23610, term23610.getClass(), "lastPlayDate", "oOnRVGqFmy");
        setIntField(term23610, term23610.getClass(), "lastPlaceId", 1179937517);
        setField(term23610, term23610.getClass(), "lastPlaceName", "LaXzFIlWMk");
        setIntField(term23610, term23610.getClass(), "lastRegionId", 200150950);
        setField(term23610, term23610.getClass(), "lastRegionName", "GuVQjhBxma");
        setIntField(term23610, term23610.getClass(), "lastAllNetId", -366198044);
        setField(term23610, term23610.getClass(), "lastClientId", "WAVMPPbIfL");
        setIntField(term23610, term23610.getClass(), "lastUsedDeckId", -1350380769);
        setIntField(term23610, term23610.getClass(), "lastPlayMusicLevel", -1432215030);
        setIntField(term23610, term23610.getClass(), "lastEmoneyBrand", 1233186320);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReincarnationNum", argTypes, term23610, args);
    }

};


