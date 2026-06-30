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

public class UserDetail_setPlayerRating_60485638290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4280608;
     Object term4280975;

    public UserDetail_setPlayerRating_60485638290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4280612 = new Long(-2138139617859519044L);
        Integer term4280675 = new Integer(214091895);
        Integer term4280677 = new Integer(-1653301256);
        Integer term4280679 = new Integer(1107780347);
        Integer term4280681 = new Integer(1162865727);
        Integer term4280683 = new Integer(46557287);
        Integer term4280685 = new Integer(1977860945);
        Integer term4280687 = new Integer(-449467173);
        ArrayList term4280673 = new ArrayList();
        ((ArrayList) term4280673).add(term4280675);
        ((ArrayList) term4280673).add(term4280677);
        ((ArrayList) term4280673).add(term4280679);
        ((ArrayList) term4280673).add(term4280681);
        ((ArrayList) term4280673).add(term4280683);
        ((ArrayList) term4280673).add(term4280685);
        ((ArrayList) term4280673).add(term4280687);
        Integer term4280693 = new Integer(-1896252900);
        Integer term4280695 = new Integer(-1530087856);
        Integer term4280697 = new Integer(-1430480374);
        Integer term4280699 = new Integer(-294990025);
        Integer term4280701 = new Integer(-1062556648);
        Integer term4280703 = new Integer(-1323622538);
        Integer term4280705 = new Integer(-975694837);
        ArrayList term4280691 = new ArrayList();
        ((ArrayList) term4280691).add(term4280693);
        ((ArrayList) term4280691).add(term4280695);
        ((ArrayList) term4280691).add(term4280697);
        ((ArrayList) term4280691).add(term4280699);
        ((ArrayList) term4280691).add(term4280701);
        ((ArrayList) term4280691).add(term4280703);
        ((ArrayList) term4280691).add(term4280705);
        term4280608 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4280610 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4280626 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4280627 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4280631 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4280636 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4280637 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4280641 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4280608, term4280608.getClass(), "id", 1046643504290421258L);
        setLongField(term4280610, term4280610.getClass(), "id", 8634236761491596644L);
        setField(term4280610, term4280610.getClass(), "extId", term4280612);
        setField(term4280610, term4280610.getClass(), "luid", "JygQdrUuCP");
        setIntField(term4280627, term4280627.getClass(), "year", 2029);
        setShortField(term4280627, term4280627.getClass(), "month", (short) 12);
        setShortField(term4280627, term4280627.getClass(), "day", (short) 3);
        setField(term4280626, term4280626.getClass(), "date", term4280627);
        setByteField(term4280631, term4280631.getClass(), "hour", (byte) 23);
        setByteField(term4280631, term4280631.getClass(), "minute", (byte) 13);
        setByteField(term4280631, term4280631.getClass(), "second", (byte) 52);
        setIntField(term4280631, term4280631.getClass(), "nano", 977585053);
        setField(term4280626, term4280626.getClass(), "time", term4280631);
        setField(term4280610, term4280610.getClass(), "registerTime", term4280626);
        setIntField(term4280637, term4280637.getClass(), "year", 2019);
        setShortField(term4280637, term4280637.getClass(), "month", (short) 12);
        setShortField(term4280637, term4280637.getClass(), "day", (short) 1);
        setField(term4280636, term4280636.getClass(), "date", term4280637);
        setByteField(term4280641, term4280641.getClass(), "hour", (byte) 0);
        setByteField(term4280641, term4280641.getClass(), "minute", (byte) 58);
        setByteField(term4280641, term4280641.getClass(), "second", (byte) 11);
        setIntField(term4280641, term4280641.getClass(), "nano", 681255500);
        setField(term4280636, term4280636.getClass(), "time", term4280641);
        setField(term4280610, term4280610.getClass(), "accessTime", term4280636);
        setField(term4280608, term4280608.getClass(), "card", term4280610);
        setField(term4280608, term4280608.getClass(), "userName", "swSHuIlJNy");
        setIntField(term4280608, term4280608.getClass(), "isNetMember", 766347844);
        setIntField(term4280608, term4280608.getClass(), "iconId", 1439228275);
        setIntField(term4280608, term4280608.getClass(), "plateId", -900694248);
        setIntField(term4280608, term4280608.getClass(), "titleId", -914084310);
        setIntField(term4280608, term4280608.getClass(), "partnerId", -254100561);
        setIntField(term4280608, term4280608.getClass(), "frameId", -1475949947);
        setIntField(term4280608, term4280608.getClass(), "selectMapId", -1711976913);
        setIntField(term4280608, term4280608.getClass(), "totalAwake", 492128190);
        setIntField(term4280608, term4280608.getClass(), "gradeRating", -1580404955);
        setIntField(term4280608, term4280608.getClass(), "musicRating", -864867301);
        setIntField(term4280608, term4280608.getClass(), "playerRating", -335233633);
        setIntField(term4280608, term4280608.getClass(), "highestRating", -771197436);
        setIntField(term4280608, term4280608.getClass(), "gradeRank", -535138218);
        setIntField(term4280608, term4280608.getClass(), "classRank", 137313623);
        setIntField(term4280608, term4280608.getClass(), "courseRank", 1967535321);
        setField(term4280608, term4280608.getClass(), "charaSlot", term4280673);
        setField(term4280608, term4280608.getClass(), "charaLockSlot", term4280691);
        setLongField(term4280608, term4280608.getClass(), "contentBit", -38883696720605101L);
        setIntField(term4280608, term4280608.getClass(), "playCount", -809230915);
        setField(term4280608, term4280608.getClass(), "eventWatchedDate", "rradbAiBKR");
        setField(term4280608, term4280608.getClass(), "lastGameId", "fPTflgvGaI");
        setField(term4280608, term4280608.getClass(), "lastRomVersion", "WwhlmUIwcQ");
        setField(term4280608, term4280608.getClass(), "lastDataVersion", "ZLpGdFdjdR");
        setField(term4280608, term4280608.getClass(), "lastLoginDate", "wzperhWpSS");
        setField(term4280608, term4280608.getClass(), "lastPlayDate", "mHQNbdvCXi");
        setIntField(term4280608, term4280608.getClass(), "lastPlayCredit", 1044423625);
        setIntField(term4280608, term4280608.getClass(), "lastPlayMode", -1642772974);
        setIntField(term4280608, term4280608.getClass(), "lastPlaceId", -2019907152);
        setField(term4280608, term4280608.getClass(), "lastPlaceName", "adIIBkoZds");
        setIntField(term4280608, term4280608.getClass(), "lastAllNetId", -793396191);
        setIntField(term4280608, term4280608.getClass(), "lastRegionId", -824175108);
        setField(term4280608, term4280608.getClass(), "lastRegionName", "TBJXopFunC");
        setField(term4280608, term4280608.getClass(), "lastClientId", "VSNQirXvBW");
        setField(term4280608, term4280608.getClass(), "lastCountryCode", "cvBkYkkPoc");
        setIntField(term4280608, term4280608.getClass(), "lastSelectEMoney", 336947509);
        setIntField(term4280608, term4280608.getClass(), "lastSelectTicket", 1438006810);
        setIntField(term4280608, term4280608.getClass(), "lastSelectCourse", 1669868378);
        setIntField(term4280608, term4280608.getClass(), "lastCountCourse", 629659854);
        setField(term4280608, term4280608.getClass(), "firstGameId", "JPEqZnattY");
        setField(term4280608, term4280608.getClass(), "firstRomVersion", "clErfzCKba");
        setField(term4280608, term4280608.getClass(), "firstDataVersion", "ZvSKbhrTdh");
        setField(term4280608, term4280608.getClass(), "firstPlayDate", "ZTjudeRbxZ");
        setField(term4280608, term4280608.getClass(), "compatibleCmVersion", "OwJtQDALtV");
        setField(term4280608, term4280608.getClass(), "dailyBonusDate", "EQuePxZfYB");
        setField(term4280608, term4280608.getClass(), "dailyCourseBonusDate", "gGCxxzoKoV");
        setField(term4280608, term4280608.getClass(), "lastPairLoginDate", "NCSVXqYEzA");
        setField(term4280608, term4280608.getClass(), "lastTrialPlayDate", "EtnQIFkFDT");
        setIntField(term4280608, term4280608.getClass(), "playVsCount", 266616902);
        setIntField(term4280608, term4280608.getClass(), "playSyncCount", -1917880777);
        setIntField(term4280608, term4280608.getClass(), "winCount", -1466615243);
        setIntField(term4280608, term4280608.getClass(), "helpCount", 1695470369);
        setIntField(term4280608, term4280608.getClass(), "comboCount", 1405033541);
        setLongField(term4280608, term4280608.getClass(), "totalDeluxscore", 6724415618612762333L);
        setLongField(term4280608, term4280608.getClass(), "totalBasicDeluxscore", 7520360123910441327L);
        setLongField(term4280608, term4280608.getClass(), "totalAdvancedDeluxscore", -6557285893569527084L);
        setLongField(term4280608, term4280608.getClass(), "totalExpertDeluxscore", 1624423895437899139L);
        setLongField(term4280608, term4280608.getClass(), "totalMasterDeluxscore", 216838743015448530L);
        setLongField(term4280608, term4280608.getClass(), "totalReMasterDeluxscore", -5413380866511232248L);
        setIntField(term4280608, term4280608.getClass(), "totalSync", -432190829);
        setIntField(term4280608, term4280608.getClass(), "totalBasicSync", 141331222);
        setIntField(term4280608, term4280608.getClass(), "totalAdvancedSync", 1145038523);
        setIntField(term4280608, term4280608.getClass(), "totalExpertSync", 200474553);
        setIntField(term4280608, term4280608.getClass(), "totalMasterSync", 1213045415);
        setIntField(term4280608, term4280608.getClass(), "totalReMasterSync", 494202413);
        setLongField(term4280608, term4280608.getClass(), "totalAchievement", -1581819314675310735L);
        setLongField(term4280608, term4280608.getClass(), "totalBasicAchievement", -3033346499485849646L);
        setLongField(term4280608, term4280608.getClass(), "totalAdvancedAchievement", -8325353264840120067L);
        setLongField(term4280608, term4280608.getClass(), "totalExpertAchievement", 8444666455783102030L);
        setLongField(term4280608, term4280608.getClass(), "totalMasterAchievement", 7948482298765269591L);
        setLongField(term4280608, term4280608.getClass(), "totalReMasterAchievement", 4511607059965952779L);
        setLongField(term4280608, term4280608.getClass(), "playerOldRating", 412238410742100764L);
        setLongField(term4280608, term4280608.getClass(), "playerNewRating", 2335704891793464955L);
        setIntField(term4280608, term4280608.getClass(), "banState", -1098379155);
        setLongField(term4280608, term4280608.getClass(), "dateTime", -2014451958341612025L);
        term4280975 = new Integer(1393600005);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4280975;
        callMethod(klass, "setPlayerRating", argTypes, term4280608, args);
    }

};


