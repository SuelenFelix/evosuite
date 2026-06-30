package icu.samnyan.aqua.sega.diva.model.common.attend;

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
import static icu.samnyan.aqua.sega.diva.model.common.attend.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GameBalanceParameter_setHardtrials_167514627210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1719;
     Object term1786;

    public GameBalanceParameter_setHardtrials_167514627210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1719 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceParameter"));
        Object term1721 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet"));
        Object term1722 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1725 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1728 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1731 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1734 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet"));
        Object term1735 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1738 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1741 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1744 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1747 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet"));
        Object term1748 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1751 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1754 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1757 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1760 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet"));
        Object term1761 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1764 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1767 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1770 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1773 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet"));
        Object term1774 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1777 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1780 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1783 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        setIntField(term1719, term1719.getClass(), "name_change_price", 100);
        setIntField(term1722, term1722.getClass(), "pay", 5);
        setIntField(term1722, term1722.getClass(), "win", 10);
        setField(term1721, term1721.getClass(), "clear", term1722);
        setIntField(term1725, term1725.getClass(), "pay", 10);
        setIntField(term1725, term1725.getClass(), "win", 25);
        setField(term1721, term1721.getClass(), "great", term1725);
        setIntField(term1728, term1728.getClass(), "pay", 20);
        setIntField(term1728, term1728.getClass(), "win", 50);
        setField(term1721, term1721.getClass(), "excellent", term1728);
        setIntField(term1731, term1731.getClass(), "pay", 30);
        setIntField(term1731, term1731.getClass(), "win", 90);
        setField(term1721, term1721.getClass(), "perfect", term1731);
        setField(term1719, term1719.getClass(), "easy_trials", term1721);
        setIntField(term1735, term1735.getClass(), "pay", 5);
        setIntField(term1735, term1735.getClass(), "win", 10);
        setField(term1734, term1734.getClass(), "clear", term1735);
        setIntField(term1738, term1738.getClass(), "pay", 10);
        setIntField(term1738, term1738.getClass(), "win", 25);
        setField(term1734, term1734.getClass(), "great", term1738);
        setIntField(term1741, term1741.getClass(), "pay", 20);
        setIntField(term1741, term1741.getClass(), "win", 50);
        setField(term1734, term1734.getClass(), "excellent", term1741);
        setIntField(term1744, term1744.getClass(), "pay", 30);
        setIntField(term1744, term1744.getClass(), "win", 90);
        setField(term1734, term1734.getClass(), "perfect", term1744);
        setField(term1719, term1719.getClass(), "normal_trials", term1734);
        setIntField(term1748, term1748.getClass(), "pay", 5);
        setIntField(term1748, term1748.getClass(), "win", 10);
        setField(term1747, term1747.getClass(), "clear", term1748);
        setIntField(term1751, term1751.getClass(), "pay", 10);
        setIntField(term1751, term1751.getClass(), "win", 25);
        setField(term1747, term1747.getClass(), "great", term1751);
        setIntField(term1754, term1754.getClass(), "pay", 20);
        setIntField(term1754, term1754.getClass(), "win", 50);
        setField(term1747, term1747.getClass(), "excellent", term1754);
        setIntField(term1757, term1757.getClass(), "pay", 30);
        setIntField(term1757, term1757.getClass(), "win", 90);
        setField(term1747, term1747.getClass(), "perfect", term1757);
        setField(term1719, term1719.getClass(), "hard_trials", term1747);
        setIntField(term1761, term1761.getClass(), "pay", 5);
        setIntField(term1761, term1761.getClass(), "win", 10);
        setField(term1760, term1760.getClass(), "clear", term1761);
        setIntField(term1764, term1764.getClass(), "pay", 10);
        setIntField(term1764, term1764.getClass(), "win", 25);
        setField(term1760, term1760.getClass(), "great", term1764);
        setIntField(term1767, term1767.getClass(), "pay", 20);
        setIntField(term1767, term1767.getClass(), "win", 50);
        setField(term1760, term1760.getClass(), "excellent", term1767);
        setIntField(term1770, term1770.getClass(), "pay", 30);
        setIntField(term1770, term1770.getClass(), "win", 90);
        setField(term1760, term1760.getClass(), "perfect", term1770);
        setField(term1719, term1719.getClass(), "extreme_trials", term1760);
        setIntField(term1774, term1774.getClass(), "pay", 5);
        setIntField(term1774, term1774.getClass(), "win", 10);
        setField(term1773, term1773.getClass(), "clear", term1774);
        setIntField(term1777, term1777.getClass(), "pay", 10);
        setIntField(term1777, term1777.getClass(), "win", 25);
        setField(term1773, term1773.getClass(), "great", term1777);
        setIntField(term1780, term1780.getClass(), "pay", 20);
        setIntField(term1780, term1780.getClass(), "win", 50);
        setField(term1773, term1773.getClass(), "excellent", term1780);
        setIntField(term1783, term1783.getClass(), "pay", 30);
        setIntField(term1783, term1783.getClass(), "win", 90);
        setField(term1773, term1773.getClass(), "perfect", term1783);
        setField(term1719, term1719.getClass(), "extra_extreme_trials", term1773);
        term1786 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet"));
        Object term1787 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1790 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1793 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1796 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        setIntField(term1787, term1787.getClass(), "pay", -1456670397);
        setIntField(term1787, term1787.getClass(), "win", 1622346318);
        setField(term1786, term1786.getClass(), "clear", term1787);
        setIntField(term1790, term1790.getClass(), "pay", 1048535127);
        setIntField(term1790, term1790.getClass(), "win", -655067527);
        setField(term1786, term1786.getClass(), "great", term1790);
        setIntField(term1793, term1793.getClass(), "pay", -6029667);
        setIntField(term1793, term1793.getClass(), "win", -2068769794);
        setField(term1786, term1786.getClass(), "excellent", term1793);
        setIntField(term1796, term1796.getClass(), "pay", -117576464);
        setIntField(term1796, term1796.getClass(), "win", -1007160944);
        setField(term1786, term1786.getClass(), "perfect", term1796);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceParameter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet");
        Object[] args = new Object[1];
        args[0] = term1786;
        callMethod(klass, "setHard_trials", argTypes, term1719, args);
    }

};


