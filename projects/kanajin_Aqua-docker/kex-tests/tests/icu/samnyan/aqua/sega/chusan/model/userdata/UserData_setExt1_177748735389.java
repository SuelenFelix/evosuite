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

public class UserData_setExt1_177748735389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291651;
     Object term291728;

    public UserData_setExt1_177748735389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291651 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term291651, term291651.getClass(), "id", 0L);
        setField(term291651, term291651.getClass(), "card", null);
        setField(term291651, term291651.getClass(), "userName", null);
        setIntField(term291651, term291651.getClass(), "level", 0);
        setIntField(term291651, term291651.getClass(), "reincarnationNum", 0);
        setField(term291651, term291651.getClass(), "exp", null);
        setLongField(term291651, term291651.getClass(), "point", 0L);
        setLongField(term291651, term291651.getClass(), "totalPoint", 0L);
        setIntField(term291651, term291651.getClass(), "playCount", 0);
        setIntField(term291651, term291651.getClass(), "multiPlayCount", 0);
        setIntField(term291651, term291651.getClass(), "playerRating", 0);
        setIntField(term291651, term291651.getClass(), "highestRating", 0);
        setIntField(term291651, term291651.getClass(), "nameplateId", 0);
        setIntField(term291651, term291651.getClass(), "frameId", 0);
        setIntField(term291651, term291651.getClass(), "characterId", 0);
        setIntField(term291651, term291651.getClass(), "trophyId", 0);
        setIntField(term291651, term291651.getClass(), "playedTutorialBit", 0);
        setIntField(term291651, term291651.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term291651, term291651.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term291651, term291651.getClass(), "totalMapNum", 0);
        setLongField(term291651, term291651.getClass(), "totalHiScore", 0L);
        setLongField(term291651, term291651.getClass(), "totalBasicHighScore", 0L);
        setLongField(term291651, term291651.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term291651, term291651.getClass(), "totalExpertHighScore", 0L);
        setLongField(term291651, term291651.getClass(), "totalMasterHighScore", 0L);
        setLongField(term291651, term291651.getClass(), "totalUltimaHighScore", 0L);
        setField(term291651, term291651.getClass(), "eventWatchedDate", null);
        setIntField(term291651, term291651.getClass(), "friendCount", 0);
        setField(term291651, term291651.getClass(), "firstGameId", null);
        setField(term291651, term291651.getClass(), "firstRomVersion", null);
        setField(term291651, term291651.getClass(), "firstDataVersion", null);
        setField(term291651, term291651.getClass(), "firstPlayDate", null);
        setField(term291651, term291651.getClass(), "lastGameId", null);
        setField(term291651, term291651.getClass(), "lastRomVersion", null);
        setField(term291651, term291651.getClass(), "lastDataVersion", null);
        setField(term291651, term291651.getClass(), "lastLoginDate", null);
        setField(term291651, term291651.getClass(), "lastPlayDate", null);
        setIntField(term291651, term291651.getClass(), "lastPlaceId", 0);
        setField(term291651, term291651.getClass(), "lastPlaceName", null);
        setField(term291651, term291651.getClass(), "lastRegionId", null);
        setField(term291651, term291651.getClass(), "lastRegionName", null);
        setField(term291651, term291651.getClass(), "lastAllNetId", null);
        setField(term291651, term291651.getClass(), "lastClientId", null);
        setField(term291651, term291651.getClass(), "lastCountryCode", null);
        setField(term291651, term291651.getClass(), "userNameEx", null);
        setField(term291651, term291651.getClass(), "compatibleCmVersion", null);
        setIntField(term291651, term291651.getClass(), "medal", 0);
        setIntField(term291651, term291651.getClass(), "mapIconId", 0);
        setIntField(term291651, term291651.getClass(), "voiceId", 0);
        setIntField(term291651, term291651.getClass(), "avatarWear", 0);
        setIntField(term291651, term291651.getClass(), "avatarHead", 0);
        setIntField(term291651, term291651.getClass(), "avatarFace", 0);
        setIntField(term291651, term291651.getClass(), "avatarSkin", 0);
        setIntField(term291651, term291651.getClass(), "avatarItem", 0);
        setIntField(term291651, term291651.getClass(), "avatarFront", 0);
        setIntField(term291651, term291651.getClass(), "avatarBack", 0);
        setIntField(term291651, term291651.getClass(), "classEmblemBase", 0);
        setIntField(term291651, term291651.getClass(), "classEmblemMedal", 0);
        setIntField(term291651, term291651.getClass(), "stockedGridCount", 0);
        setIntField(term291651, term291651.getClass(), "exMapLoopCount", 0);
        setIntField(term291651, term291651.getClass(), "netBattlePlayCount", 0);
        setIntField(term291651, term291651.getClass(), "netBattleWinCount", 0);
        setIntField(term291651, term291651.getClass(), "netBattleLoseCount", 0);
        setIntField(term291651, term291651.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term291651, term291651.getClass(), "charaIllustId", 0);
        setIntField(term291651, term291651.getClass(), "skillId", 0);
        setIntField(term291651, term291651.getClass(), "overPowerPoint", 0);
        setIntField(term291651, term291651.getClass(), "overPowerRate", 0);
        setIntField(term291651, term291651.getClass(), "overPowerLowerRank", 0);
        setIntField(term291651, term291651.getClass(), "avatarPoint", 0);
        setIntField(term291651, term291651.getClass(), "battleRankId", 0);
        setIntField(term291651, term291651.getClass(), "battleRankPoint", 0);
        setIntField(term291651, term291651.getClass(), "eliteRankPoint", 0);
        setIntField(term291651, term291651.getClass(), "netBattle1stCount", 0);
        setIntField(term291651, term291651.getClass(), "netBattle2ndCount", 0);
        setIntField(term291651, term291651.getClass(), "netBattle3rdCount", 0);
        setIntField(term291651, term291651.getClass(), "netBattle4thCount", 0);
        setIntField(term291651, term291651.getClass(), "netBattleCorrection", 0);
        setIntField(term291651, term291651.getClass(), "netBattleErrCnt", 0);
        setIntField(term291651, term291651.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term291651, term291651.getClass(), "battleRewardStatus", 0);
        setIntField(term291651, term291651.getClass(), "battleRewardIndex", 0);
        setIntField(term291651, term291651.getClass(), "battleRewardCount", 0);
        setIntField(term291651, term291651.getClass(), "ext1", 0);
        setIntField(term291651, term291651.getClass(), "ext2", 0);
        setIntField(term291651, term291651.getClass(), "ext3", 0);
        setIntField(term291651, term291651.getClass(), "ext4", 0);
        setIntField(term291651, term291651.getClass(), "ext5", 0);
        setIntField(term291651, term291651.getClass(), "ext6", 0);
        setIntField(term291651, term291651.getClass(), "ext7", 0);
        setIntField(term291651, term291651.getClass(), "ext8", 0);
        setIntField(term291651, term291651.getClass(), "ext9", 0);
        setIntField(term291651, term291651.getClass(), "ext10", 0);
        setField(term291651, term291651.getClass(), "extStr1", null);
        setField(term291651, term291651.getClass(), "extStr2", null);
        setLongField(term291651, term291651.getClass(), "extLong1", 0L);
        setLongField(term291651, term291651.getClass(), "extLong2", 0L);
        setField(term291651, term291651.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term291651, term291651.getClass(), "isNetBattleHost", false);
        setIntField(term291651, term291651.getClass(), "netBattleEndState", 0);
        term291728 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term291728;
        callMethod(klass, "setExt1", argTypes, term291651, args);
    }

};


