/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/. */

package pt.webdetails.cdf.dd.model.inst;

import pt.webdetails.cdf.dd.model.core.validation.ValidationException;
import pt.webdetails.cdf.dd.model.meta.MetaModel;
import pt.webdetails.cdf.dd.model.meta.NonVisualComponentType;

/**
 * @author dcleao
 */
public abstract class NonVisualComponent<TM extends NonVisualComponentType> extends Component<TM>
{
  protected NonVisualComponent(Builder builder, MetaModel metaModel) throws ValidationException
  {
    super(builder, metaModel);
  }

  @Override
  public TM getMeta()
  {
    return super.getMeta();
  }
  
  /**
   * Class to create and modify NonVisualComponent instances.
   */
  public static abstract class Builder extends Component.Builder
  {
    @Override
    public abstract NonVisualComponent build(MetaModel metaModel) 
            throws ValidationException;
  }
}
