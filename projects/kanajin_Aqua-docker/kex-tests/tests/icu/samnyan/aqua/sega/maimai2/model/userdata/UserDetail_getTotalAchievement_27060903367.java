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

public class UserDetail_getTotalAchievement_27060903367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4267485;

    public UserDetail_getTotalAchievement_27060903367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4267489 = new Long(-925747124046021405L);
        Integer term4267552 = new Integer(2139003917);
        Integer term4267554 = new Integer(-88880251);
        Integer term4267556 = new Integer(-1157773436);
        Integer term4267558 = new Integer(237998332);
        Integer term4267560 = new Integer(1398526783);
        Integer term4267562 = new Integer(-1335367347);
        ArrayList term4267550 = new ArrayList();
        ((ArrayList) term4267550).add(term4267552);
        ((ArrayList) term4267550).add(term4267554);
        ((ArrayList) term4267550).add(term4267556);
        ((ArrayList) term4267550).add(term4267558);
        ((ArrayList) term4267550).add(term4267560);
        ((ArrayList) term4267550).add(term4267562);
        Integer term4267568 = new Integer(378431284);
        Integer term4267570 = new Integer(1775630559);
        Integer term4267572 = new Integer(1511551801);
        Integer term4267574 = new Integer(910313590);
        Integer term4267576 = new Integer(-877418986);
        Integer term4267578 = new Integer(-336009454);
        ArrayList term4267566 = new ArrayList();
        ((ArrayList) term4267566).add(term4267568);
        ((ArrayList) term4267566).add(term4267570);
        ((ArrayList) term4267566).add(term4267572);
        ((ArrayList) term4267566).add(term4267574);
        ((ArrayList) term4267566).add(term4267576);
        ((ArrayList) term4267566).add(term4267578);
        term4267485 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4267487 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4267503 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4267504 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4267508 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4267513 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4267514 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4267518 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4267485, term4267485.getClass(), "id", -3658223705469075373L);
        setLongField(term4267487, term4267487.getClass(), "id", -8232080990433297009L);
        setField(term4267487, term4267487.getClass(), "extId", term4267489);
        setField(term4267487, term4267487.getClass(), "luid", "pglZSLEYIf");
        setIntField(term4267504, term4267504.getClass(), "year", 2018);
        setShortField(term4267504, term4267504.getClass(), "month", (short) 3);
        setShortField(term4267504, term4267504.getClass(), "day", (short) 12);
        setField(term4267503, term4267503.getClass(), "date", term4267504);
        setByteField(term4267508, term4267508.getClass(), "hour", (byte) 7);
        setByteField(term4267508, term4267508.getClass(), "minute", (byte) 28);
        setByteField(term4267508, term4267508.getClass(), "second", (byte) 49);
        setIntField(term4267508, term4267508.getClass(), "nano", 964827195);
        setField(term4267503, term4267503.getClass(), "time", term4267508);
        setField(term4267487, term4267487.getClass(), "registerTime", term4267503);
        setIntField(term4267514, term4267514.getClass(), "year", 2021);
        setShortField(term4267514, term4267514.getClass(), "month", (short) 5);
        setShortField(term4267514, term4267514.getClass(), "day", (short) 4);
        setField(term4267513, term4267513.getClass(), "date", term4267514);
        setByteField(term4267518, term4267518.getClass(), "hour", (byte) 14);
        setByteField(term4267518, term4267518.getClass(), "minute", (byte) 28);
        setByteField(term4267518, term4267518.getClass(), "second", (byte) 32);
        setIntField(term4267518, term4267518.getClass(), "nano", 620074073);
        setField(term4267513, term4267513.getClass(), "time", term4267518);
        setField(term4267487, term4267487.getClass(), "accessTime", term4267513);
        setField(term4267485, term4267485.getClass(), "card", term4267487);
        setField(term4267485, term4267485.getClass(), "userName", "elWUFYBTNX");
        setIntField(term4267485, term4267485.getClass(), "isNetMember", -1572908623);
        setIntField(term4267485, term4267485.getClass(), "iconId", -1383144989);
        setIntField(term4267485, term4267485.getClass(), "plateId", 1806635860);
        setIntField(term4267485, term4267485.getClass(), "titleId", -950796356);
        setIntField(term4267485, term4267485.getClass(), "partnerId", 1867679419);
        setIntField(term4267485, term4267485.getClass(), "frameId", 1060019298);
        setIntField(term4267485, term4267485.getClass(), "selectMapId", 781586724);
        setIntField(term4267485, term4267485.getClass(), "totalAwake", 422177194);
        setIntField(term4267485, term4267485.getClass(), "gradeRating", -1919759136);
        setIntField(term4267485, term4267485.getClass(), "musicRating", -2021191649);
        setIntField(term4267485, term4267485.getClass(), "playerRating", 391536888);
        setIntField(term4267485, term4267485.getClass(), "highestRating", 1764888119);
        setIntField(term4267485, term4267485.getClass(), "gradeRank", 1567806035);
        setIntField(term4267485, term4267485.getClass(), "classRank", 1822774057);
        setIntField(term4267485, term4267485.getClass(), "courseRank", 1840438892);
        setField(term4267485, term4267485.getClass(), "charaSlot", term4267550);
        setField(term4267485, term4267485.getClass(), "charaLockSlot", term4267566);
        setLongField(term4267485, term4267485.getClass(), "contentBit", -3508692601970806911L);
        setIntField(term4267485, term4267485.getClass(), "playCount", -2014537522);
        setField(term4267485, term4267485.getClass(), "eventWatchedDate", "CbVmuFkVVK");
        setField(term4267485, term4267485.getClass(), "lastGameId", "mmAjZdiYoM");
        setField(term4267485, term4267485.getClass(), "lastRomVersion", "bmLERcVbTx");
        setField(term4267485, term4267485.getClass(), "lastDataVersion", "HSnjijjzNf");
        setField(term4267485, term4267485.getClass(), "lastLoginDate", "fZdhnNWjdU");
        setField(term4267485, term4267485.getClass(), "lastPlayDate", "rrztRDbTQp");
        setIntField(term4267485, term4267485.getClass(), "lastPlayCredit", -2096479522);
        setIntField(term4267485, term4267485.getClass(), "lastPlayMode", -1974537685);
        setIntField(term4267485, term4267485.getClass(), "lastPlaceId", -314934712);
        setField(term4267485, term4267485.getClass(), "lastPlaceName", "XkwVkEkQyD");
        setIntField(term4267485, term4267485.getClass(), "lastAllNetId", -235118432);
        setIntField(term4267485, term4267485.getClass(), "lastRegionId", -604946851);
        setField(term4267485, term4267485.getClass(), "lastRegionName", "hbDWtelRLD");
        setField(term4267485, term4267485.getClass(), "lastClientId", "GTYcDvocBX");
        setField(term4267485, term4267485.getClass(), "lastCountryCode", "DyczmXhKBG");
        setIntField(term4267485, term4267485.getClass(), "lastSelectEMoney", -674261043);
        setIntField(term4267485, term4267485.getClass(), "lastSelectTicket", 711743513);
        setIntField(term4267485, term4267485.getClass(), "lastSelectCourse", -276137817);
        setIntField(term4267485, term4267485.getClass(), "lastCountCourse", -1950858640);
        setField(term4267485, term4267485.getClass(), "firstGameId", "wpALjBbtbo");
        setField(term4267485, term4267485.getClass(), "firstRomVersion", "TRtNPTEZnY");
        setField(term4267485, term4267485.getClass(), "firstDataVersion", "VqlnvKWBnl");
        setField(term4267485, term4267485.getClass(), "firstPlayDate", "vEBEdnpWPg");
        setField(term4267485, term4267485.getClass(), "compatibleCmVersion", "ANQJuexJlP");
        setField(term4267485, term4267485.getClass(), "dailyBonusDate", "cqtuqKYmEL");
        setField(term4267485, term4267485.getClass(), "dailyCourseBonusDate", "dReGMZWFEl");
        setField(term4267485, term4267485.getClass(), "lastPairLoginDate", "XlqxoihXtc");
        setField(term4267485, term4267485.getClass(), "lastTrialPlayDate", "kIRQANjRfj");
        setIntField(term4267485, term4267485.getClass(), "playVsCount", 1022314073);
        setIntField(term4267485, term4267485.getClass(), "playSyncCount", -1836601092);
        setIntField(term4267485, term4267485.getClass(), "winCount", 956578791);
        setIntField(term4267485, term4267485.getClass(), "helpCount", 646478699);
        setIntField(term4267485, term4267485.getClass(), "comboCount", -102758494);
        setLongField(term4267485, term4267485.getClass(), "totalDeluxscore", 1596796146673791883L);
        setLongField(term4267485, term4267485.getClass(), "totalBasicDeluxscore", 4608440516006321056L);
        setLongField(term4267485, term4267485.getClass(), "totalAdvancedDeluxscore", 5460399007905410592L);
        setLongField(term4267485, term4267485.getClass(), "totalExpertDeluxscore", -7396936351166824446L);
        setLongField(term4267485, term4267485.getClass(), "totalMasterDeluxscore", -3507592451131166490L);
        setLongField(term4267485, term4267485.getClass(), "totalReMasterDeluxscore", 499020388820679949L);
        setIntField(term4267485, term4267485.getClass(), "totalSync", 368480188);
        setIntField(term4267485, term4267485.getClass(), "totalBasicSync", 636967414);
        setIntField(term4267485, term4267485.getClass(), "totalAdvancedSync", 1505996945);
        setIntField(term4267485, term4267485.getClass(), "totalExpertSync", -109299935);
        setIntField(term4267485, term4267485.getClass(), "totalMasterSync", -1264600545);
        setIntField(term4267485, term4267485.getClass(), "totalReMasterSync", -184309826);
        setLongField(term4267485, term4267485.getClass(), "totalAchievement", 7259592485523504962L);
        setLongField(term4267485, term4267485.getClass(), "totalBasicAchievement", -4735065837027414722L);
        setLongField(term4267485, term4267485.getClass(), "totalAdvancedAchievement", -4109648814438391028L);
        setLongField(term4267485, term4267485.getClass(), "totalExpertAchievement", -7941945481052699024L);
        setLongField(term4267485, term4267485.getClass(), "totalMasterAchievement", 4517185302952262001L);
        setLongField(term4267485, term4267485.getClass(), "totalReMasterAchievement", 7555447701064190814L);
        setLongField(term4267485, term4267485.getClass(), "playerOldRating", 6661651431262546457L);
        setLongField(term4267485, term4267485.getClass(), "playerNewRating", 8796150862051332454L);
        setIntField(term4267485, term4267485.getClass(), "banState", 1010450306);
        setLongField(term4267485, term4267485.getClass(), "dateTime", 2505632369525894283L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalAchievement", argTypes, term4267485, args);
    }

};


