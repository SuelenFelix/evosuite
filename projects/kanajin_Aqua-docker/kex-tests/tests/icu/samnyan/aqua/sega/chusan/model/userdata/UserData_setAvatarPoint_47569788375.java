package icu.samnyan.aqua.sega.chusan.model.userdata;

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
import static icu.samnyan.aqua.sega.chusan.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class UserData_setAvatarPoint_47569788375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290545;
     Object term290622;

    public UserData_setAvatarPoint_47569788375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term290545 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term290545, term290545.getClass(), "id", 0L);
        setField(term290545, term290545.getClass(), "card", null);
        setField(term290545, term290545.getClass(), "userName", null);
        setIntField(term290545, term290545.getClass(), "level", 0);
        setIntField(term290545, term290545.getClass(), "reincarnationNum", 0);
        setField(term290545, term290545.getClass(), "exp", null);
        setLongField(term290545, term290545.getClass(), "point", 0L);
        setLongField(term290545, term290545.getClass(), "totalPoint", 0L);
        setIntField(term290545, term290545.getClass(), "playCount", 0);
        setIntField(term290545, term290545.getClass(), "multiPlayCount", 0);
        setIntField(term290545, term290545.getClass(), "playerRating", 0);
        setIntField(term290545, term290545.getClass(), "highestRating", 0);
        setIntField(term290545, term290545.getClass(), "nameplateId", 0);
        setIntField(term290545, term290545.getClass(), "frameId", 0);
        setIntField(term290545, term290545.getClass(), "characterId", 0);
        setIntField(term290545, term290545.getClass(), "trophyId", 0);
        setIntField(term290545, term290545.getClass(), "playedTutorialBit", 0);
        setIntField(term290545, term290545.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term290545, term290545.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term290545, term290545.getClass(), "totalMapNum", 0);
        setLongField(term290545, term290545.getClass(), "totalHiScore", 0L);
        setLongField(term290545, term290545.getClass(), "totalBasicHighScore", 0L);
        setLongField(term290545, term290545.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term290545, term290545.getClass(), "totalExpertHighScore", 0L);
        setLongField(term290545, term290545.getClass(), "totalMasterHighScore", 0L);
        setLongField(term290545, term290545.getClass(), "totalUltimaHighScore", 0L);
        setField(term290545, term290545.getClass(), "eventWatchedDate", null);
        setIntField(term290545, term290545.getClass(), "friendCount", 0);
        setField(term290545, term290545.getClass(), "firstGameId", null);
        setField(term290545, term290545.getClass(), "firstRomVersion", null);
        setField(term290545, term290545.getClass(), "firstDataVersion", null);
        setField(term290545, term290545.getClass(), "firstPlayDate", null);
        setField(term290545, term290545.getClass(), "lastGameId", null);
        setField(term290545, term290545.getClass(), "lastRomVersion", null);
        setField(term290545, term290545.getClass(), "lastDataVersion", null);
        setField(term290545, term290545.getClass(), "lastLoginDate", null);
        setField(term290545, term290545.getClass(), "lastPlayDate", null);
        setIntField(term290545, term290545.getClass(), "lastPlaceId", 0);
        setField(term290545, term290545.getClass(), "lastPlaceName", null);
        setField(term290545, term290545.getClass(), "lastRegionId", null);
        setField(term290545, term290545.getClass(), "lastRegionName", null);
        setField(term290545, term290545.getClass(), "lastAllNetId", null);
        setField(term290545, term290545.getClass(), "lastClientId", null);
        setField(term290545, term290545.getClass(), "lastCountryCode", null);
        setField(term290545, term290545.getClass(), "userNameEx", null);
        setField(term290545, term290545.getClass(), "compatibleCmVersion", null);
        setIntField(term290545, term290545.getClass(), "medal", 0);
        setIntField(term290545, term290545.getClass(), "mapIconId", 0);
        setIntField(term290545, term290545.getClass(), "voiceId", 0);
        setIntField(term290545, term290545.getClass(), "avatarWear", 0);
        setIntField(term290545, term290545.getClass(), "avatarHead", 0);
        setIntField(term290545, term290545.getClass(), "avatarFace", 0);
        setIntField(term290545, term290545.getClass(), "avatarSkin", 0);
        setIntField(term290545, term290545.getClass(), "avatarItem", 0);
        setIntField(term290545, term290545.getClass(), "avatarFront", 0);
        setIntField(term290545, term290545.getClass(), "avatarBack", 0);
        setIntField(term290545, term290545.getClass(), "classEmblemBase", 0);
        setIntField(term290545, term290545.getClass(), "classEmblemMedal", 0);
        setIntField(term290545, term290545.getClass(), "stockedGridCount", 0);
        setIntField(term290545, term290545.getClass(), "exMapLoopCount", 0);
        setIntField(term290545, term290545.getClass(), "netBattlePlayCount", 0);
        setIntField(term290545, term290545.getClass(), "netBattleWinCount", 0);
        setIntField(term290545, term290545.getClass(), "netBattleLoseCount", 0);
        setIntField(term290545, term290545.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term290545, term290545.getClass(), "charaIllustId", 0);
        setIntField(term290545, term290545.getClass(), "skillId", 0);
        setIntField(term290545, term290545.getClass(), "overPowerPoint", 0);
        setIntField(term290545, term290545.getClass(), "overPowerRate", 0);
        setIntField(term290545, term290545.getClass(), "overPowerLowerRank", 0);
        setIntField(term290545, term290545.getClass(), "avatarPoint", 0);
        setIntField(term290545, term290545.getClass(), "battleRankId", 0);
        setIntField(term290545, term290545.getClass(), "battleRankPoint", 0);
        setIntField(term290545, term290545.getClass(), "eliteRankPoint", 0);
        setIntField(term290545, term290545.getClass(), "netBattle1stCount", 0);
        setIntField(term290545, term290545.getClass(), "netBattle2ndCount", 0);
        setIntField(term290545, term290545.getClass(), "netBattle3rdCount", 0);
        setIntField(term290545, term290545.getClass(), "netBattle4thCount", 0);
        setIntField(term290545, term290545.getClass(), "netBattleCorrection", 0);
        setIntField(term290545, term290545.getClass(), "netBattleErrCnt", 0);
        setIntField(term290545, term290545.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term290545, term290545.getClass(), "battleRewardStatus", 0);
        setIntField(term290545, term290545.getClass(), "battleRewardIndex", 0);
        setIntField(term290545, term290545.getClass(), "battleRewardCount", 0);
        setIntField(term290545, term290545.getClass(), "ext1", 0);
        setIntField(term290545, term290545.getClass(), "ext2", 0);
        setIntField(term290545, term290545.getClass(), "ext3", 0);
        setIntField(term290545, term290545.getClass(), "ext4", 0);
        setIntField(term290545, term290545.getClass(), "ext5", 0);
        setIntField(term290545, term290545.getClass(), "ext6", 0);
        setIntField(term290545, term290545.getClass(), "ext7", 0);
        setIntField(term290545, term290545.getClass(), "ext8", 0);
        setIntField(term290545, term290545.getClass(), "ext9", 0);
        setIntField(term290545, term290545.getClass(), "ext10", 0);
        setField(term290545, term290545.getClass(), "extStr1", null);
        setField(term290545, term290545.getClass(), "extStr2", null);
        setLongField(term290545, term290545.getClass(), "extLong1", 0L);
        setLongField(term290545, term290545.getClass(), "extLong2", 0L);
        setField(term290545, term290545.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term290545, term290545.getClass(), "isNetBattleHost", false);
        setIntField(term290545, term290545.getClass(), "netBattleEndState", 0);
        term290622 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term290622;
        callMethod(klass, "setAvatarPoint", argTypes, term290545, args);
    }

};


