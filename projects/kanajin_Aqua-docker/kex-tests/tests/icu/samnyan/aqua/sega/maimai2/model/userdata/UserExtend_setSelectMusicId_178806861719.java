package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Integer;

public class UserExtend_setSelectMusicId_178806861719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153284;
     Object term153655;

    public UserExtend_setSelectMusicId_178806861719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term153290 = new Long(1860789353508856614L);
        Integer term153353 = new Integer(-1144608643);
        ArrayList term153351 = new ArrayList();
        ((ArrayList) term153351).add(term153353);
        ArrayList term153357 = new ArrayList();
        Integer term153641 = new Integer(-2020428308);
        Integer term153643 = new Integer(-226298436);
        Integer term153645 = new Integer(-1570350431);
        Integer term153647 = new Integer(-1378803474);
        ArrayList term153639 = new ArrayList();
        ((ArrayList) term153639).add(term153641);
        ((ArrayList) term153639).add(term153643);
        ((ArrayList) term153639).add(term153645);
        ((ArrayList) term153639).add(term153647);
        ArrayList term153651 = new ArrayList();
        term153284 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend"));
        Object term153286 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term153288 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term153304 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term153305 = newInstance(Class.forName("java.time.LocalDate"));
        Object term153309 = newInstance(Class.forName("java.time.LocalTime"));
        Object term153314 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term153315 = newInstance(Class.forName("java.time.LocalDate"));
        Object term153319 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term153284, term153284.getClass(), "id", 6438356254477357324L);
        setLongField(term153286, term153286.getClass(), "id", -4591574973533034786L);
        setLongField(term153288, term153288.getClass(), "id", -273744759947165027L);
        setField(term153288, term153288.getClass(), "extId", term153290);
        setField(term153288, term153288.getClass(), "luid", "MqkrVMSgoi");
        setIntField(term153305, term153305.getClass(), "year", 2015);
        setShortField(term153305, term153305.getClass(), "month", (short) 1);
        setShortField(term153305, term153305.getClass(), "day", (short) 10);
        setField(term153304, term153304.getClass(), "date", term153305);
        setByteField(term153309, term153309.getClass(), "hour", (byte) 2);
        setByteField(term153309, term153309.getClass(), "minute", (byte) 48);
        setByteField(term153309, term153309.getClass(), "second", (byte) 41);
        setIntField(term153309, term153309.getClass(), "nano", 572611941);
        setField(term153304, term153304.getClass(), "time", term153309);
        setField(term153288, term153288.getClass(), "registerTime", term153304);
        setIntField(term153315, term153315.getClass(), "year", 2013);
        setShortField(term153315, term153315.getClass(), "month", (short) 10);
        setShortField(term153315, term153315.getClass(), "day", (short) 23);
        setField(term153314, term153314.getClass(), "date", term153315);
        setByteField(term153319, term153319.getClass(), "hour", (byte) 4);
        setByteField(term153319, term153319.getClass(), "minute", (byte) 33);
        setByteField(term153319, term153319.getClass(), "second", (byte) 51);
        setIntField(term153319, term153319.getClass(), "nano", 626320293);
        setField(term153314, term153314.getClass(), "time", term153319);
        setField(term153288, term153288.getClass(), "accessTime", term153314);
        setField(term153286, term153286.getClass(), "card", term153288);
        setField(term153286, term153286.getClass(), "userName", "mBvhIZezxE");
        setIntField(term153286, term153286.getClass(), "isNetMember", -284767862);
        setIntField(term153286, term153286.getClass(), "iconId", 1346515345);
        setIntField(term153286, term153286.getClass(), "plateId", 2132293781);
        setIntField(term153286, term153286.getClass(), "titleId", 1025837124);
        setIntField(term153286, term153286.getClass(), "partnerId", -1875484532);
        setIntField(term153286, term153286.getClass(), "frameId", 2142478049);
        setIntField(term153286, term153286.getClass(), "selectMapId", 2085104036);
        setIntField(term153286, term153286.getClass(), "totalAwake", 136979507);
        setIntField(term153286, term153286.getClass(), "gradeRating", -27834494);
        setIntField(term153286, term153286.getClass(), "musicRating", -470460903);
        setIntField(term153286, term153286.getClass(), "playerRating", -1476214738);
        setIntField(term153286, term153286.getClass(), "highestRating", -1898771379);
        setIntField(term153286, term153286.getClass(), "gradeRank", -1950750332);
        setIntField(term153286, term153286.getClass(), "classRank", 98744131);
        setIntField(term153286, term153286.getClass(), "courseRank", 1076913386);
        setField(term153286, term153286.getClass(), "charaSlot", term153351);
        setField(term153286, term153286.getClass(), "charaLockSlot", term153357);
        setLongField(term153286, term153286.getClass(), "contentBit", -4080001079379795937L);
        setIntField(term153286, term153286.getClass(), "playCount", -1266016022);
        setField(term153286, term153286.getClass(), "eventWatchedDate", "sswCagQpqo");
        setField(term153286, term153286.getClass(), "lastGameId", "LrwYiZGGQg");
        setField(term153286, term153286.getClass(), "lastRomVersion", "ugFOXAltBR");
        setField(term153286, term153286.getClass(), "lastDataVersion", "PviulmdPhA");
        setField(term153286, term153286.getClass(), "lastLoginDate", "NAUDTajaNN");
        setField(term153286, term153286.getClass(), "lastPlayDate", "BgJwVzSZYi");
        setIntField(term153286, term153286.getClass(), "lastPlayCredit", -1417549926);
        setIntField(term153286, term153286.getClass(), "lastPlayMode", -1109645729);
        setIntField(term153286, term153286.getClass(), "lastPlaceId", -137499193);
        setField(term153286, term153286.getClass(), "lastPlaceName", "ecRYXrSwPc");
        setIntField(term153286, term153286.getClass(), "lastAllNetId", 1206373587);
        setIntField(term153286, term153286.getClass(), "lastRegionId", 613409117);
        setField(term153286, term153286.getClass(), "lastRegionName", "EgUbHeKEEX");
        setField(term153286, term153286.getClass(), "lastClientId", "qdXkDdgkzv");
        setField(term153286, term153286.getClass(), "lastCountryCode", "bwXWpCUaun");
        setIntField(term153286, term153286.getClass(), "lastSelectEMoney", 449106222);
        setIntField(term153286, term153286.getClass(), "lastSelectTicket", -2010754765);
        setIntField(term153286, term153286.getClass(), "lastSelectCourse", -368905928);
        setIntField(term153286, term153286.getClass(), "lastCountCourse", -324230177);
        setField(term153286, term153286.getClass(), "firstGameId", "bNhvwOrXoC");
        setField(term153286, term153286.getClass(), "firstRomVersion", "QHwFfYSCNm");
        setField(term153286, term153286.getClass(), "firstDataVersion", "TDpWaJHRZc");
        setField(term153286, term153286.getClass(), "firstPlayDate", "nsydNohggs");
        setField(term153286, term153286.getClass(), "compatibleCmVersion", "NwQXMulIlF");
        setField(term153286, term153286.getClass(), "dailyBonusDate", "lEtoSVazWN");
        setField(term153286, term153286.getClass(), "dailyCourseBonusDate", "ddDDOEjMuN");
        setField(term153286, term153286.getClass(), "lastPairLoginDate", "tHBufRenNj");
        setField(term153286, term153286.getClass(), "lastTrialPlayDate", "wtWSSbxhjb");
        setIntField(term153286, term153286.getClass(), "playVsCount", 1907785292);
        setIntField(term153286, term153286.getClass(), "playSyncCount", 719178137);
        setIntField(term153286, term153286.getClass(), "winCount", 1019714790);
        setIntField(term153286, term153286.getClass(), "helpCount", -939662649);
        setIntField(term153286, term153286.getClass(), "comboCount", 104511876);
        setLongField(term153286, term153286.getClass(), "totalDeluxscore", 2897796040564769178L);
        setLongField(term153286, term153286.getClass(), "totalBasicDeluxscore", -5732675511571223411L);
        setLongField(term153286, term153286.getClass(), "totalAdvancedDeluxscore", 8256783771016183024L);
        setLongField(term153286, term153286.getClass(), "totalExpertDeluxscore", 1072500001399572896L);
        setLongField(term153286, term153286.getClass(), "totalMasterDeluxscore", 6988058642797646641L);
        setLongField(term153286, term153286.getClass(), "totalReMasterDeluxscore", 7471787611611364992L);
        setIntField(term153286, term153286.getClass(), "totalSync", 1301097770);
        setIntField(term153286, term153286.getClass(), "totalBasicSync", -844791112);
        setIntField(term153286, term153286.getClass(), "totalAdvancedSync", -1096097856);
        setIntField(term153286, term153286.getClass(), "totalExpertSync", 402256223);
        setIntField(term153286, term153286.getClass(), "totalMasterSync", 1448377823);
        setIntField(term153286, term153286.getClass(), "totalReMasterSync", -1324686514);
        setLongField(term153286, term153286.getClass(), "totalAchievement", -7535007912999518533L);
        setLongField(term153286, term153286.getClass(), "totalBasicAchievement", -1557774302244970809L);
        setLongField(term153286, term153286.getClass(), "totalAdvancedAchievement", 8311133892224081946L);
        setLongField(term153286, term153286.getClass(), "totalExpertAchievement", -9001085857985006197L);
        setLongField(term153286, term153286.getClass(), "totalMasterAchievement", 3386460060474051242L);
        setLongField(term153286, term153286.getClass(), "totalReMasterAchievement", -8266266746969170790L);
        setLongField(term153286, term153286.getClass(), "playerOldRating", 4621171198026233729L);
        setLongField(term153286, term153286.getClass(), "playerNewRating", -6259344762310867961L);
        setIntField(term153286, term153286.getClass(), "banState", 1209639956);
        setLongField(term153286, term153286.getClass(), "dateTime", 6643877704908948107L);
        setField(term153284, term153284.getClass(), "user", term153286);
        setIntField(term153284, term153284.getClass(), "selectMusicId", -1463395842);
        setIntField(term153284, term153284.getClass(), "selectDifficultyId", -1313344065);
        setIntField(term153284, term153284.getClass(), "categoryIndex", 1228398077);
        setIntField(term153284, term153284.getClass(), "musicIndex", 110342291);
        setIntField(term153284, term153284.getClass(), "extraFlag", 905029929);
        setIntField(term153284, term153284.getClass(), "selectScoreType", 2106266461);
        setLongField(term153284, term153284.getClass(), "extendContentBit", 1597528360278273509L);
        setBooleanField(term153284, term153284.getClass(), "isPhotoAgree", true);
        setBooleanField(term153284, term153284.getClass(), "isGotoCodeRead", true);
        setBooleanField(term153284, term153284.getClass(), "selectResultDetails", false);
        setIntField(term153284, term153284.getClass(), "sortCategorySetting", 994139397);
        setIntField(term153284, term153284.getClass(), "sortMusicSetting", -1851045959);
        setField(term153284, term153284.getClass(), "selectedCardList", term153639);
        setField(term153284, term153284.getClass(), "encountMapNpcList", term153651);
        term153655 = new Integer(2000289703);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term153655;
        callMethod(klass, "setSelectMusicId", argTypes, term153284, args);
    }

};


