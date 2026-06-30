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

public class UserData_setExt5_177744891393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291967;
     Object term292044;

    public UserData_setExt5_177744891393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291967 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term291967, term291967.getClass(), "id", 0L);
        setField(term291967, term291967.getClass(), "card", null);
        setField(term291967, term291967.getClass(), "userName", null);
        setIntField(term291967, term291967.getClass(), "level", 0);
        setIntField(term291967, term291967.getClass(), "reincarnationNum", 0);
        setField(term291967, term291967.getClass(), "exp", null);
        setLongField(term291967, term291967.getClass(), "point", 0L);
        setLongField(term291967, term291967.getClass(), "totalPoint", 0L);
        setIntField(term291967, term291967.getClass(), "playCount", 0);
        setIntField(term291967, term291967.getClass(), "multiPlayCount", 0);
        setIntField(term291967, term291967.getClass(), "playerRating", 0);
        setIntField(term291967, term291967.getClass(), "highestRating", 0);
        setIntField(term291967, term291967.getClass(), "nameplateId", 0);
        setIntField(term291967, term291967.getClass(), "frameId", 0);
        setIntField(term291967, term291967.getClass(), "characterId", 0);
        setIntField(term291967, term291967.getClass(), "trophyId", 0);
        setIntField(term291967, term291967.getClass(), "playedTutorialBit", 0);
        setIntField(term291967, term291967.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term291967, term291967.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term291967, term291967.getClass(), "totalMapNum", 0);
        setLongField(term291967, term291967.getClass(), "totalHiScore", 0L);
        setLongField(term291967, term291967.getClass(), "totalBasicHighScore", 0L);
        setLongField(term291967, term291967.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term291967, term291967.getClass(), "totalExpertHighScore", 0L);
        setLongField(term291967, term291967.getClass(), "totalMasterHighScore", 0L);
        setLongField(term291967, term291967.getClass(), "totalUltimaHighScore", 0L);
        setField(term291967, term291967.getClass(), "eventWatchedDate", null);
        setIntField(term291967, term291967.getClass(), "friendCount", 0);
        setField(term291967, term291967.getClass(), "firstGameId", null);
        setField(term291967, term291967.getClass(), "firstRomVersion", null);
        setField(term291967, term291967.getClass(), "firstDataVersion", null);
        setField(term291967, term291967.getClass(), "firstPlayDate", null);
        setField(term291967, term291967.getClass(), "lastGameId", null);
        setField(term291967, term291967.getClass(), "lastRomVersion", null);
        setField(term291967, term291967.getClass(), "lastDataVersion", null);
        setField(term291967, term291967.getClass(), "lastLoginDate", null);
        setField(term291967, term291967.getClass(), "lastPlayDate", null);
        setIntField(term291967, term291967.getClass(), "lastPlaceId", 0);
        setField(term291967, term291967.getClass(), "lastPlaceName", null);
        setField(term291967, term291967.getClass(), "lastRegionId", null);
        setField(term291967, term291967.getClass(), "lastRegionName", null);
        setField(term291967, term291967.getClass(), "lastAllNetId", null);
        setField(term291967, term291967.getClass(), "lastClientId", null);
        setField(term291967, term291967.getClass(), "lastCountryCode", null);
        setField(term291967, term291967.getClass(), "userNameEx", null);
        setField(term291967, term291967.getClass(), "compatibleCmVersion", null);
        setIntField(term291967, term291967.getClass(), "medal", 0);
        setIntField(term291967, term291967.getClass(), "mapIconId", 0);
        setIntField(term291967, term291967.getClass(), "voiceId", 0);
        setIntField(term291967, term291967.getClass(), "avatarWear", 0);
        setIntField(term291967, term291967.getClass(), "avatarHead", 0);
        setIntField(term291967, term291967.getClass(), "avatarFace", 0);
        setIntField(term291967, term291967.getClass(), "avatarSkin", 0);
        setIntField(term291967, term291967.getClass(), "avatarItem", 0);
        setIntField(term291967, term291967.getClass(), "avatarFront", 0);
        setIntField(term291967, term291967.getClass(), "avatarBack", 0);
        setIntField(term291967, term291967.getClass(), "classEmblemBase", 0);
        setIntField(term291967, term291967.getClass(), "classEmblemMedal", 0);
        setIntField(term291967, term291967.getClass(), "stockedGridCount", 0);
        setIntField(term291967, term291967.getClass(), "exMapLoopCount", 0);
        setIntField(term291967, term291967.getClass(), "netBattlePlayCount", 0);
        setIntField(term291967, term291967.getClass(), "netBattleWinCount", 0);
        setIntField(term291967, term291967.getClass(), "netBattleLoseCount", 0);
        setIntField(term291967, term291967.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term291967, term291967.getClass(), "charaIllustId", 0);
        setIntField(term291967, term291967.getClass(), "skillId", 0);
        setIntField(term291967, term291967.getClass(), "overPowerPoint", 0);
        setIntField(term291967, term291967.getClass(), "overPowerRate", 0);
        setIntField(term291967, term291967.getClass(), "overPowerLowerRank", 0);
        setIntField(term291967, term291967.getClass(), "avatarPoint", 0);
        setIntField(term291967, term291967.getClass(), "battleRankId", 0);
        setIntField(term291967, term291967.getClass(), "battleRankPoint", 0);
        setIntField(term291967, term291967.getClass(), "eliteRankPoint", 0);
        setIntField(term291967, term291967.getClass(), "netBattle1stCount", 0);
        setIntField(term291967, term291967.getClass(), "netBattle2ndCount", 0);
        setIntField(term291967, term291967.getClass(), "netBattle3rdCount", 0);
        setIntField(term291967, term291967.getClass(), "netBattle4thCount", 0);
        setIntField(term291967, term291967.getClass(), "netBattleCorrection", 0);
        setIntField(term291967, term291967.getClass(), "netBattleErrCnt", 0);
        setIntField(term291967, term291967.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term291967, term291967.getClass(), "battleRewardStatus", 0);
        setIntField(term291967, term291967.getClass(), "battleRewardIndex", 0);
        setIntField(term291967, term291967.getClass(), "battleRewardCount", 0);
        setIntField(term291967, term291967.getClass(), "ext1", 0);
        setIntField(term291967, term291967.getClass(), "ext2", 0);
        setIntField(term291967, term291967.getClass(), "ext3", 0);
        setIntField(term291967, term291967.getClass(), "ext4", 0);
        setIntField(term291967, term291967.getClass(), "ext5", 0);
        setIntField(term291967, term291967.getClass(), "ext6", 0);
        setIntField(term291967, term291967.getClass(), "ext7", 0);
        setIntField(term291967, term291967.getClass(), "ext8", 0);
        setIntField(term291967, term291967.getClass(), "ext9", 0);
        setIntField(term291967, term291967.getClass(), "ext10", 0);
        setField(term291967, term291967.getClass(), "extStr1", null);
        setField(term291967, term291967.getClass(), "extStr2", null);
        setLongField(term291967, term291967.getClass(), "extLong1", 0L);
        setLongField(term291967, term291967.getClass(), "extLong2", 0L);
        setField(term291967, term291967.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term291967, term291967.getClass(), "isNetBattleHost", false);
        setIntField(term291967, term291967.getClass(), "netBattleEndState", 0);
        term292044 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term292044;
        callMethod(klass, "setExt5", argTypes, term291967, args);
    }

};


