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

public class UserDetail_getTotalExpertDeluxscore_207758594859 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term228453;

    public UserDetail_getTotalExpertDeluxscore_207758594859() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term228457 = new Long(4012955251407483889L);
        Integer term228520 = new Integer(130567867);
        Integer term228522 = new Integer(33782620);
        Integer term228524 = new Integer(-818766632);
        Integer term228526 = new Integer(45627161);
        Integer term228528 = new Integer(-206817101);
        Integer term228530 = new Integer(1541533024);
        Integer term228532 = new Integer(-1032828989);
        Integer term228534 = new Integer(-649944911);
        ArrayList term228518 = new ArrayList();
        ((ArrayList) term228518).add(term228520);
        ((ArrayList) term228518).add(term228522);
        ((ArrayList) term228518).add(term228524);
        ((ArrayList) term228518).add(term228526);
        ((ArrayList) term228518).add(term228528);
        ((ArrayList) term228518).add(term228530);
        ((ArrayList) term228518).add(term228532);
        ((ArrayList) term228518).add(term228534);
        Integer term228540 = new Integer(-1426067073);
        Integer term228542 = new Integer(-1679645192);
        Integer term228544 = new Integer(1524285721);
        ArrayList term228538 = new ArrayList();
        ((ArrayList) term228538).add(term228540);
        ((ArrayList) term228538).add(term228542);
        ((ArrayList) term228538).add(term228544);
        term228453 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term228455 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term228471 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term228472 = newInstance(Class.forName("java.time.LocalDate"));
        Object term228476 = newInstance(Class.forName("java.time.LocalTime"));
        Object term228481 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term228482 = newInstance(Class.forName("java.time.LocalDate"));
        Object term228486 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term228453, term228453.getClass(), "id", 2285382345856240863L);
        setLongField(term228455, term228455.getClass(), "id", 6680799276613605959L);
        setField(term228455, term228455.getClass(), "extId", term228457);
        setField(term228455, term228455.getClass(), "luid", "JKBkexwJQQ");
        setIntField(term228472, term228472.getClass(), "year", 2019);
        setShortField(term228472, term228472.getClass(), "month", (short) 10);
        setShortField(term228472, term228472.getClass(), "day", (short) 19);
        setField(term228471, term228471.getClass(), "date", term228472);
        setByteField(term228476, term228476.getClass(), "hour", (byte) 13);
        setByteField(term228476, term228476.getClass(), "minute", (byte) 22);
        setByteField(term228476, term228476.getClass(), "second", (byte) 53);
        setIntField(term228476, term228476.getClass(), "nano", 628070727);
        setField(term228471, term228471.getClass(), "time", term228476);
        setField(term228455, term228455.getClass(), "registerTime", term228471);
        setIntField(term228482, term228482.getClass(), "year", 2018);
        setShortField(term228482, term228482.getClass(), "month", (short) 3);
        setShortField(term228482, term228482.getClass(), "day", (short) 4);
        setField(term228481, term228481.getClass(), "date", term228482);
        setByteField(term228486, term228486.getClass(), "hour", (byte) 20);
        setByteField(term228486, term228486.getClass(), "minute", (byte) 47);
        setByteField(term228486, term228486.getClass(), "second", (byte) 55);
        setIntField(term228486, term228486.getClass(), "nano", 479898286);
        setField(term228481, term228481.getClass(), "time", term228486);
        setField(term228455, term228455.getClass(), "accessTime", term228481);
        setField(term228453, term228453.getClass(), "card", term228455);
        setField(term228453, term228453.getClass(), "userName", "GPXGjAdtoJ");
        setIntField(term228453, term228453.getClass(), "isNetMember", -1071514936);
        setIntField(term228453, term228453.getClass(), "iconId", 948646989);
        setIntField(term228453, term228453.getClass(), "plateId", -1091739087);
        setIntField(term228453, term228453.getClass(), "titleId", -436415220);
        setIntField(term228453, term228453.getClass(), "partnerId", -733438551);
        setIntField(term228453, term228453.getClass(), "frameId", 810630955);
        setIntField(term228453, term228453.getClass(), "selectMapId", -630134606);
        setIntField(term228453, term228453.getClass(), "totalAwake", -1976364009);
        setIntField(term228453, term228453.getClass(), "gradeRating", 1488533591);
        setIntField(term228453, term228453.getClass(), "musicRating", 1777759371);
        setIntField(term228453, term228453.getClass(), "playerRating", 2046454754);
        setIntField(term228453, term228453.getClass(), "highestRating", 1782403605);
        setIntField(term228453, term228453.getClass(), "gradeRank", 796551683);
        setIntField(term228453, term228453.getClass(), "classRank", 668463794);
        setIntField(term228453, term228453.getClass(), "courseRank", 1412866641);
        setField(term228453, term228453.getClass(), "charaSlot", term228518);
        setField(term228453, term228453.getClass(), "charaLockSlot", term228538);
        setLongField(term228453, term228453.getClass(), "contentBit", 3875820802428647785L);
        setIntField(term228453, term228453.getClass(), "playCount", 1177232469);
        setField(term228453, term228453.getClass(), "eventWatchedDate", "rpotsMWMJb");
        setField(term228453, term228453.getClass(), "lastGameId", "cZzZwgyRsb");
        setField(term228453, term228453.getClass(), "lastRomVersion", "yRTLQJvUab");
        setField(term228453, term228453.getClass(), "lastDataVersion", "uSsBnPkCNa");
        setField(term228453, term228453.getClass(), "lastLoginDate", "hGeOoQaXwC");
        setField(term228453, term228453.getClass(), "lastPlayDate", "ualEpwAGnm");
        setIntField(term228453, term228453.getClass(), "lastPlayCredit", 272511309);
        setIntField(term228453, term228453.getClass(), "lastPlayMode", 1932166997);
        setIntField(term228453, term228453.getClass(), "lastPlaceId", -1020349112);
        setField(term228453, term228453.getClass(), "lastPlaceName", "xYlQMsdTSy");
        setIntField(term228453, term228453.getClass(), "lastAllNetId", 1154843160);
        setIntField(term228453, term228453.getClass(), "lastRegionId", -499856155);
        setField(term228453, term228453.getClass(), "lastRegionName", "bCuxURZPHN");
        setField(term228453, term228453.getClass(), "lastClientId", "gHeEnrQkug");
        setField(term228453, term228453.getClass(), "lastCountryCode", "hHcuunhdDN");
        setIntField(term228453, term228453.getClass(), "lastSelectEMoney", 533179759);
        setIntField(term228453, term228453.getClass(), "lastSelectTicket", 1712114698);
        setIntField(term228453, term228453.getClass(), "lastSelectCourse", -1000527737);
        setIntField(term228453, term228453.getClass(), "lastCountCourse", -862289291);
        setField(term228453, term228453.getClass(), "firstGameId", "OWXMvkMqRq");
        setField(term228453, term228453.getClass(), "firstRomVersion", "cilVUGuAzp");
        setField(term228453, term228453.getClass(), "firstDataVersion", "DEGmRHMLsx");
        setField(term228453, term228453.getClass(), "firstPlayDate", "NpRJptUmML");
        setField(term228453, term228453.getClass(), "compatibleCmVersion", "UNUfwYHgBp");
        setField(term228453, term228453.getClass(), "dailyBonusDate", "muOBCWXlnl");
        setField(term228453, term228453.getClass(), "dailyCourseBonusDate", "kDvCVaiDrD");
        setField(term228453, term228453.getClass(), "lastPairLoginDate", "dyqwIzdzpi");
        setField(term228453, term228453.getClass(), "lastTrialPlayDate", "QQNYZIaGLG");
        setIntField(term228453, term228453.getClass(), "playVsCount", 1265374293);
        setIntField(term228453, term228453.getClass(), "playSyncCount", 1518831452);
        setIntField(term228453, term228453.getClass(), "winCount", -1281963546);
        setIntField(term228453, term228453.getClass(), "helpCount", 404778942);
        setIntField(term228453, term228453.getClass(), "comboCount", -2005990393);
        setLongField(term228453, term228453.getClass(), "totalDeluxscore", 885627014332734215L);
        setLongField(term228453, term228453.getClass(), "totalBasicDeluxscore", 1053668783363456491L);
        setLongField(term228453, term228453.getClass(), "totalAdvancedDeluxscore", 816349611483004758L);
        setLongField(term228453, term228453.getClass(), "totalExpertDeluxscore", 6334449203091770209L);
        setLongField(term228453, term228453.getClass(), "totalMasterDeluxscore", -2874074023279549309L);
        setLongField(term228453, term228453.getClass(), "totalReMasterDeluxscore", -720539725628116572L);
        setIntField(term228453, term228453.getClass(), "totalSync", -2037698232);
        setIntField(term228453, term228453.getClass(), "totalBasicSync", -257000438);
        setIntField(term228453, term228453.getClass(), "totalAdvancedSync", -1162950143);
        setIntField(term228453, term228453.getClass(), "totalExpertSync", 211497672);
        setIntField(term228453, term228453.getClass(), "totalMasterSync", -1763728099);
        setIntField(term228453, term228453.getClass(), "totalReMasterSync", 535763464);
        setLongField(term228453, term228453.getClass(), "totalAchievement", -9056433761226632106L);
        setLongField(term228453, term228453.getClass(), "totalBasicAchievement", -7685679100526197453L);
        setLongField(term228453, term228453.getClass(), "totalAdvancedAchievement", 7466644310571264628L);
        setLongField(term228453, term228453.getClass(), "totalExpertAchievement", -8835499959898956491L);
        setLongField(term228453, term228453.getClass(), "totalMasterAchievement", -4986925145460708345L);
        setLongField(term228453, term228453.getClass(), "totalReMasterAchievement", 5078180932363824574L);
        setLongField(term228453, term228453.getClass(), "playerOldRating", -3984389941033634402L);
        setLongField(term228453, term228453.getClass(), "playerNewRating", 4502595137064026705L);
        setIntField(term228453, term228453.getClass(), "banState", 369176479);
        setLongField(term228453, term228453.getClass(), "dateTime", 5799864894847820625L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalExpertDeluxscore", argTypes, term228453, args);
    }

};


