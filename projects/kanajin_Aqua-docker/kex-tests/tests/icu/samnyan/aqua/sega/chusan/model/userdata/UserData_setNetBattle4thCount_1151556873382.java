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

public class UserData_setNetBattle4thCount_1151556873382 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291098;
     Object term291175;

    public UserData_setNetBattle4thCount_1151556873382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291098 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term291098, term291098.getClass(), "id", 0L);
        setField(term291098, term291098.getClass(), "card", null);
        setField(term291098, term291098.getClass(), "userName", null);
        setIntField(term291098, term291098.getClass(), "level", 0);
        setIntField(term291098, term291098.getClass(), "reincarnationNum", 0);
        setField(term291098, term291098.getClass(), "exp", null);
        setLongField(term291098, term291098.getClass(), "point", 0L);
        setLongField(term291098, term291098.getClass(), "totalPoint", 0L);
        setIntField(term291098, term291098.getClass(), "playCount", 0);
        setIntField(term291098, term291098.getClass(), "multiPlayCount", 0);
        setIntField(term291098, term291098.getClass(), "playerRating", 0);
        setIntField(term291098, term291098.getClass(), "highestRating", 0);
        setIntField(term291098, term291098.getClass(), "nameplateId", 0);
        setIntField(term291098, term291098.getClass(), "frameId", 0);
        setIntField(term291098, term291098.getClass(), "characterId", 0);
        setIntField(term291098, term291098.getClass(), "trophyId", 0);
        setIntField(term291098, term291098.getClass(), "playedTutorialBit", 0);
        setIntField(term291098, term291098.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term291098, term291098.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term291098, term291098.getClass(), "totalMapNum", 0);
        setLongField(term291098, term291098.getClass(), "totalHiScore", 0L);
        setLongField(term291098, term291098.getClass(), "totalBasicHighScore", 0L);
        setLongField(term291098, term291098.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term291098, term291098.getClass(), "totalExpertHighScore", 0L);
        setLongField(term291098, term291098.getClass(), "totalMasterHighScore", 0L);
        setLongField(term291098, term291098.getClass(), "totalUltimaHighScore", 0L);
        setField(term291098, term291098.getClass(), "eventWatchedDate", null);
        setIntField(term291098, term291098.getClass(), "friendCount", 0);
        setField(term291098, term291098.getClass(), "firstGameId", null);
        setField(term291098, term291098.getClass(), "firstRomVersion", null);
        setField(term291098, term291098.getClass(), "firstDataVersion", null);
        setField(term291098, term291098.getClass(), "firstPlayDate", null);
        setField(term291098, term291098.getClass(), "lastGameId", null);
        setField(term291098, term291098.getClass(), "lastRomVersion", null);
        setField(term291098, term291098.getClass(), "lastDataVersion", null);
        setField(term291098, term291098.getClass(), "lastLoginDate", null);
        setField(term291098, term291098.getClass(), "lastPlayDate", null);
        setIntField(term291098, term291098.getClass(), "lastPlaceId", 0);
        setField(term291098, term291098.getClass(), "lastPlaceName", null);
        setField(term291098, term291098.getClass(), "lastRegionId", null);
        setField(term291098, term291098.getClass(), "lastRegionName", null);
        setField(term291098, term291098.getClass(), "lastAllNetId", null);
        setField(term291098, term291098.getClass(), "lastClientId", null);
        setField(term291098, term291098.getClass(), "lastCountryCode", null);
        setField(term291098, term291098.getClass(), "userNameEx", null);
        setField(term291098, term291098.getClass(), "compatibleCmVersion", null);
        setIntField(term291098, term291098.getClass(), "medal", 0);
        setIntField(term291098, term291098.getClass(), "mapIconId", 0);
        setIntField(term291098, term291098.getClass(), "voiceId", 0);
        setIntField(term291098, term291098.getClass(), "avatarWear", 0);
        setIntField(term291098, term291098.getClass(), "avatarHead", 0);
        setIntField(term291098, term291098.getClass(), "avatarFace", 0);
        setIntField(term291098, term291098.getClass(), "avatarSkin", 0);
        setIntField(term291098, term291098.getClass(), "avatarItem", 0);
        setIntField(term291098, term291098.getClass(), "avatarFront", 0);
        setIntField(term291098, term291098.getClass(), "avatarBack", 0);
        setIntField(term291098, term291098.getClass(), "classEmblemBase", 0);
        setIntField(term291098, term291098.getClass(), "classEmblemMedal", 0);
        setIntField(term291098, term291098.getClass(), "stockedGridCount", 0);
        setIntField(term291098, term291098.getClass(), "exMapLoopCount", 0);
        setIntField(term291098, term291098.getClass(), "netBattlePlayCount", 0);
        setIntField(term291098, term291098.getClass(), "netBattleWinCount", 0);
        setIntField(term291098, term291098.getClass(), "netBattleLoseCount", 0);
        setIntField(term291098, term291098.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term291098, term291098.getClass(), "charaIllustId", 0);
        setIntField(term291098, term291098.getClass(), "skillId", 0);
        setIntField(term291098, term291098.getClass(), "overPowerPoint", 0);
        setIntField(term291098, term291098.getClass(), "overPowerRate", 0);
        setIntField(term291098, term291098.getClass(), "overPowerLowerRank", 0);
        setIntField(term291098, term291098.getClass(), "avatarPoint", 0);
        setIntField(term291098, term291098.getClass(), "battleRankId", 0);
        setIntField(term291098, term291098.getClass(), "battleRankPoint", 0);
        setIntField(term291098, term291098.getClass(), "eliteRankPoint", 0);
        setIntField(term291098, term291098.getClass(), "netBattle1stCount", 0);
        setIntField(term291098, term291098.getClass(), "netBattle2ndCount", 0);
        setIntField(term291098, term291098.getClass(), "netBattle3rdCount", 0);
        setIntField(term291098, term291098.getClass(), "netBattle4thCount", 0);
        setIntField(term291098, term291098.getClass(), "netBattleCorrection", 0);
        setIntField(term291098, term291098.getClass(), "netBattleErrCnt", 0);
        setIntField(term291098, term291098.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term291098, term291098.getClass(), "battleRewardStatus", 0);
        setIntField(term291098, term291098.getClass(), "battleRewardIndex", 0);
        setIntField(term291098, term291098.getClass(), "battleRewardCount", 0);
        setIntField(term291098, term291098.getClass(), "ext1", 0);
        setIntField(term291098, term291098.getClass(), "ext2", 0);
        setIntField(term291098, term291098.getClass(), "ext3", 0);
        setIntField(term291098, term291098.getClass(), "ext4", 0);
        setIntField(term291098, term291098.getClass(), "ext5", 0);
        setIntField(term291098, term291098.getClass(), "ext6", 0);
        setIntField(term291098, term291098.getClass(), "ext7", 0);
        setIntField(term291098, term291098.getClass(), "ext8", 0);
        setIntField(term291098, term291098.getClass(), "ext9", 0);
        setIntField(term291098, term291098.getClass(), "ext10", 0);
        setField(term291098, term291098.getClass(), "extStr1", null);
        setField(term291098, term291098.getClass(), "extStr2", null);
        setLongField(term291098, term291098.getClass(), "extLong1", 0L);
        setLongField(term291098, term291098.getClass(), "extLong2", 0L);
        setField(term291098, term291098.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term291098, term291098.getClass(), "isNetBattleHost", false);
        setIntField(term291098, term291098.getClass(), "netBattleEndState", 0);
        term291175 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term291175;
        callMethod(klass, "setNetBattle4thCount", argTypes, term291098, args);
    }

};


