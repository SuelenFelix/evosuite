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

public class UserItem_setItemId_152122126810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39220;
     Object term39577;

    public UserItem_setItemId_152122126810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term39226 = new Long(3892018155439224435L);
        Integer term39289 = new Integer(1467356494);
        Integer term39291 = new Integer(-26316536);
        Integer term39293 = new Integer(1716165145);
        ArrayList term39287 = new ArrayList();
        ((ArrayList) term39287).add(term39289);
        ((ArrayList) term39287).add(term39291);
        ((ArrayList) term39287).add(term39293);
        Integer term39299 = new Integer(1692937831);
        Integer term39301 = new Integer(-1539747985);
        Integer term39303 = new Integer(-1982489643);
        ArrayList term39297 = new ArrayList();
        ((ArrayList) term39297).add(term39299);
        ((ArrayList) term39297).add(term39301);
        ((ArrayList) term39297).add(term39303);
        term39220 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserItem"));
        Object term39222 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term39224 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term39240 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term39241 = newInstance(Class.forName("java.time.LocalDate"));
        Object term39245 = newInstance(Class.forName("java.time.LocalTime"));
        Object term39250 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term39251 = newInstance(Class.forName("java.time.LocalDate"));
        Object term39255 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term39220, term39220.getClass(), "id", -7229609748965405580L);
        setLongField(term39222, term39222.getClass(), "id", 7507072654888524944L);
        setLongField(term39224, term39224.getClass(), "id", 8778744391146217826L);
        setField(term39224, term39224.getClass(), "extId", term39226);
        setField(term39224, term39224.getClass(), "luid", "XKMXfDZajw");
        setIntField(term39241, term39241.getClass(), "year", 2024);
        setShortField(term39241, term39241.getClass(), "month", (short) 9);
        setShortField(term39241, term39241.getClass(), "day", (short) 22);
        setField(term39240, term39240.getClass(), "date", term39241);
        setByteField(term39245, term39245.getClass(), "hour", (byte) 0);
        setByteField(term39245, term39245.getClass(), "minute", (byte) 11);
        setByteField(term39245, term39245.getClass(), "second", (byte) 7);
        setIntField(term39245, term39245.getClass(), "nano", 56643259);
        setField(term39240, term39240.getClass(), "time", term39245);
        setField(term39224, term39224.getClass(), "registerTime", term39240);
        setIntField(term39251, term39251.getClass(), "year", 2021);
        setShortField(term39251, term39251.getClass(), "month", (short) 12);
        setShortField(term39251, term39251.getClass(), "day", (short) 21);
        setField(term39250, term39250.getClass(), "date", term39251);
        setByteField(term39255, term39255.getClass(), "hour", (byte) 12);
        setByteField(term39255, term39255.getClass(), "minute", (byte) 59);
        setByteField(term39255, term39255.getClass(), "second", (byte) 52);
        setIntField(term39255, term39255.getClass(), "nano", 47081639);
        setField(term39250, term39250.getClass(), "time", term39255);
        setField(term39224, term39224.getClass(), "accessTime", term39250);
        setField(term39222, term39222.getClass(), "card", term39224);
        setField(term39222, term39222.getClass(), "userName", "avZoBQSrBy");
        setIntField(term39222, term39222.getClass(), "isNetMember", 1036231784);
        setIntField(term39222, term39222.getClass(), "iconId", 732187274);
        setIntField(term39222, term39222.getClass(), "plateId", 1495500544);
        setIntField(term39222, term39222.getClass(), "titleId", -610532968);
        setIntField(term39222, term39222.getClass(), "partnerId", -1034929475);
        setIntField(term39222, term39222.getClass(), "frameId", 2125774573);
        setIntField(term39222, term39222.getClass(), "selectMapId", -1338560431);
        setIntField(term39222, term39222.getClass(), "totalAwake", 1768827963);
        setIntField(term39222, term39222.getClass(), "gradeRating", -456155591);
        setIntField(term39222, term39222.getClass(), "musicRating", -678946365);
        setIntField(term39222, term39222.getClass(), "playerRating", 2121147631);
        setIntField(term39222, term39222.getClass(), "highestRating", 878122723);
        setIntField(term39222, term39222.getClass(), "gradeRank", 1612267814);
        setIntField(term39222, term39222.getClass(), "classRank", 634968709);
        setIntField(term39222, term39222.getClass(), "courseRank", 681482688);
        setField(term39222, term39222.getClass(), "charaSlot", term39287);
        setField(term39222, term39222.getClass(), "charaLockSlot", term39297);
        setLongField(term39222, term39222.getClass(), "contentBit", 7377514870475587049L);
        setIntField(term39222, term39222.getClass(), "playCount", -1435288604);
        setField(term39222, term39222.getClass(), "eventWatchedDate", "KIXGeHXdwi");
        setField(term39222, term39222.getClass(), "lastGameId", "tTfdvLMwEE");
        setField(term39222, term39222.getClass(), "lastRomVersion", "DiSkERzqOE");
        setField(term39222, term39222.getClass(), "lastDataVersion", "hPSZZeYqHQ");
        setField(term39222, term39222.getClass(), "lastLoginDate", "scReMUKyGq");
        setField(term39222, term39222.getClass(), "lastPlayDate", "FmIpnxjRxA");
        setIntField(term39222, term39222.getClass(), "lastPlayCredit", 364335952);
        setIntField(term39222, term39222.getClass(), "lastPlayMode", 254542714);
        setIntField(term39222, term39222.getClass(), "lastPlaceId", -51533463);
        setField(term39222, term39222.getClass(), "lastPlaceName", "FTjxxGvyun");
        setIntField(term39222, term39222.getClass(), "lastAllNetId", 2042811670);
        setIntField(term39222, term39222.getClass(), "lastRegionId", -1713263092);
        setField(term39222, term39222.getClass(), "lastRegionName", "qsjXSwKloH");
        setField(term39222, term39222.getClass(), "lastClientId", "DDZHUPglvb");
        setField(term39222, term39222.getClass(), "lastCountryCode", "rWoaXvNyVg");
        setIntField(term39222, term39222.getClass(), "lastSelectEMoney", 73609068);
        setIntField(term39222, term39222.getClass(), "lastSelectTicket", -1150137872);
        setIntField(term39222, term39222.getClass(), "lastSelectCourse", -781333853);
        setIntField(term39222, term39222.getClass(), "lastCountCourse", 158137467);
        setField(term39222, term39222.getClass(), "firstGameId", "FLzaBCFjGv");
        setField(term39222, term39222.getClass(), "firstRomVersion", "OLYhTSqTqJ");
        setField(term39222, term39222.getClass(), "firstDataVersion", "AIHoadcpQz");
        setField(term39222, term39222.getClass(), "firstPlayDate", "fWMsLtuOEV");
        setField(term39222, term39222.getClass(), "compatibleCmVersion", "fvgZQBalnd");
        setField(term39222, term39222.getClass(), "dailyBonusDate", "tViQSKUCLE");
        setField(term39222, term39222.getClass(), "dailyCourseBonusDate", "QbaeHheqiP");
        setField(term39222, term39222.getClass(), "lastPairLoginDate", "gASHxChKwn");
        setField(term39222, term39222.getClass(), "lastTrialPlayDate", "iasolXlEEn");
        setIntField(term39222, term39222.getClass(), "playVsCount", 1299041951);
        setIntField(term39222, term39222.getClass(), "playSyncCount", -1772128093);
        setIntField(term39222, term39222.getClass(), "winCount", -2057880798);
        setIntField(term39222, term39222.getClass(), "helpCount", -2041732081);
        setIntField(term39222, term39222.getClass(), "comboCount", 2073870078);
        setLongField(term39222, term39222.getClass(), "totalDeluxscore", 3437866678450547130L);
        setLongField(term39222, term39222.getClass(), "totalBasicDeluxscore", -2375099996964834173L);
        setLongField(term39222, term39222.getClass(), "totalAdvancedDeluxscore", 3058795643782579829L);
        setLongField(term39222, term39222.getClass(), "totalExpertDeluxscore", 3729905560436815423L);
        setLongField(term39222, term39222.getClass(), "totalMasterDeluxscore", 27732590148100485L);
        setLongField(term39222, term39222.getClass(), "totalReMasterDeluxscore", -963498294796483851L);
        setIntField(term39222, term39222.getClass(), "totalSync", 1649066040);
        setIntField(term39222, term39222.getClass(), "totalBasicSync", -640093979);
        setIntField(term39222, term39222.getClass(), "totalAdvancedSync", 1665282382);
        setIntField(term39222, term39222.getClass(), "totalExpertSync", 1536865175);
        setIntField(term39222, term39222.getClass(), "totalMasterSync", -1059947211);
        setIntField(term39222, term39222.getClass(), "totalReMasterSync", -768583538);
        setLongField(term39222, term39222.getClass(), "totalAchievement", -8667643757273196191L);
        setLongField(term39222, term39222.getClass(), "totalBasicAchievement", 8259341710509598103L);
        setLongField(term39222, term39222.getClass(), "totalAdvancedAchievement", -3542890656778018623L);
        setLongField(term39222, term39222.getClass(), "totalExpertAchievement", -2892042709653134442L);
        setLongField(term39222, term39222.getClass(), "totalMasterAchievement", 1980274010918360742L);
        setLongField(term39222, term39222.getClass(), "totalReMasterAchievement", 3205645145047776900L);
        setLongField(term39222, term39222.getClass(), "playerOldRating", -706258405349500259L);
        setLongField(term39222, term39222.getClass(), "playerNewRating", -2336486223565755398L);
        setIntField(term39222, term39222.getClass(), "banState", 372329686);
        setLongField(term39222, term39222.getClass(), "dateTime", -5604785092434648765L);
        setField(term39220, term39220.getClass(), "user", term39222);
        setIntField(term39220, term39220.getClass(), "itemKind", -381739191);
        setIntField(term39220, term39220.getClass(), "itemId", -432438127);
        setIntField(term39220, term39220.getClass(), "stock", 44813544);
        setBooleanField(term39220, term39220.getClass(), "isValid", true);
        term39577 = new Integer(654539936);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term39577;
        callMethod(klass, "setItemId", argTypes, term39220, args);
    }

};


